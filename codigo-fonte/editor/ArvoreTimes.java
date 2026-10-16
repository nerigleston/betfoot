package editor;

import components.TemaBetfoot;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import modelos.ModeloTime2;

/**
 * Lista de times do editor em páginas: Países > Ligas do país > Times da liga, tudo em ordem alfabética, com o
 * caminho clicável no topo (Países / Brasil / Série A) e botão de voltar.
 * Ligas: no Brasil, Séries A a D (conf_ligas_nacionais/divisoes.txt) e depois os demais por estadual (UF); nos outros
 * países, divisões pela mesma regra do início de carreira (times ordenados pelo nível, em blocos de 20/18/16…, até 4).
 */
public class ArvoreTimes
extends JPanel {
    private static final Collator COLLATOR = Collator.getInstance(new Locale("pt", "BR"));
    private final DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(new Grupo("Países", -1, false));
    private final Map<ModeloTime2, DefaultMutableTreeNode> folhas = new HashMap<ModeloTime2, DefaultMutableTreeNode>();
    private final DefaultListModel<DefaultMutableTreeNode> itens = new DefaultListModel<DefaultMutableTreeNode>();
    private final JList<DefaultMutableTreeNode> lista = new JList<DefaultMutableTreeNode>(this.itens) {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            if (this.getModel().getSize() == 0 && ArvoreTimes.this.busca != null) {
                Graphics2D g = TemaBetfoot.suave(graphics);
                g.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
                g.setColor(TemaBetfoot.TEXTO_SUAVE);
                String s = "Nenhum time encontrado";
                FontMetrics fm = g.getFontMetrics();
                g.drawString(s, (this.getWidth() - fm.stringWidth(s)) / 2, 48);
                g.dispose();
            }
        }
    };
    /** Texto da busca em andamento (null = navegando por páginas). */
    private String busca;
    private Runnable aoLimparBusca;
    private final JPanel caminho = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
    private final JButton voltar;
    private DefaultMutableTreeNode atual = this.raiz;
    private Consumer<ModeloTime2> aoSelecionar;
    private Runnable aoAbrir;
    private boolean sincronizando;
    private int sobre = -1;

    private static final Map<String, java.awt.Image> ESCUDOS = new HashMap<String, java.awt.Image>();

    static {
        COLLATOR.setStrength(Collator.PRIMARY);
    }

    /** Escudo do time (teams/escudos/<arquivo>.png), carregado na primeira vez que aparece; null se não houver. */
    private static java.awt.Image escudo(ModeloTime2 t2) {
        String ref = t2.getFileRef();
        if (!ESCUDOS.containsKey(ref)) {
            java.awt.Image image = null;
            java.io.File f = new java.io.File(nucleo.UtilitariosTexto.cK + "/teams/escudos/" + ref + ".png");
            if (f.isFile()) {
                try {
                    image = javax.imageio.ImageIO.read(f);
                }
                catch (java.io.IOException iOException) {
                    image = null;
                }
            }
            ESCUDOS.put(ref, image);
        }
        return ESCUDOS.get(ref);
    }

    /** Escudo trocado no editor: esquece a imagem guardada para ler de novo. */
    public static void esquecerEscudo(ModeloTime2 t2) {
        ESCUDOS.remove(t2.getFileRef());
    }

    /** Página de grupo (país ou liga): nome, bandeira (país) e os times abaixo dele. */
    static class Grupo {
        final String nome;
        final int pais;
        final boolean ehPais;
        int times;
        int marcados;

        Grupo(String string, int n, boolean bl) {
            this.nome = string;
            this.pais = n;
            this.ehPais = bl;
        }

        public String toString() {
            return this.nome;
        }
    }

    public ArvoreTimes() {
        super(new BorderLayout(0, 10));
        this.setOpaque(false);
        // Topo: voltar + caminho.
        this.voltar = TemaBetfoot.botao(new JButton(), TemaBetfoot.Estilo.ICONE, null, null);
        this.voltar.setIcon(new Seta(Seta.ESQUERDA, TemaBetfoot.TEXTO));
        this.voltar.setToolTipText("Voltar (Backspace)");
        this.voltar.addActionListener(actionEvent -> this.subir());
        JPanel topo = new JPanel(new BorderLayout(10, 0));
        topo.setOpaque(false);
        topo.add((Component)this.voltar, "West");
        this.caminho.setOpaque(false);
        JPanel caminhoCentro = new JPanel(new java.awt.GridBagLayout());
        caminhoCentro.setOpaque(false);
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.weightx = 1.0;
        c.anchor = java.awt.GridBagConstraints.WEST;
        caminhoCentro.add((Component)this.caminho, c);
        topo.add((Component)caminhoCentro, "Center");
        this.add((Component)topo, "North");
        // Lista da página atual.
        this.lista.setOpaque(true);
        this.lista.setBackground(TemaBetfoot.LINHA_IMPAR);
        this.lista.setFixedCellHeight(42);
        this.lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.lista.setCellRenderer(new Renderizador());
        this.lista.addListSelectionListener(evento -> {
            if (evento.getValueIsAdjusting() || this.sincronizando || this.aoSelecionar == null) {
                return;
            }
            DefaultMutableTreeNode no = this.lista.getSelectedValue();
            if (no != null && no.getUserObject() instanceof ModeloTime2) {
                this.aoSelecionar.accept((ModeloTime2)no.getUserObject());
            }
        });
        MouseAdapter mouse = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int i = ArvoreTimes.this.lista.locationToIndex(mouseEvent.getPoint());
                if (i < 0 || !ArvoreTimes.this.lista.getCellBounds(i, i).contains(mouseEvent.getPoint())) {
                    return;
                }
                DefaultMutableTreeNode no = ArvoreTimes.this.itens.get(i);
                if (no.getUserObject() instanceof Grupo) {
                    ArvoreTimes.this.entrar(no);
                } else if (mouseEvent.getClickCount() == 2 && ArvoreTimes.this.aoAbrir != null) {
                    ArvoreTimes.this.aoAbrir.run();
                }
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                int i = ArvoreTimes.this.lista.locationToIndex(mouseEvent.getPoint());
                if (i != ArvoreTimes.this.sobre) {
                    ArvoreTimes.this.sobre = i;
                    ArvoreTimes.this.lista.repaint();
                }
                boolean grupo = i >= 0 && ArvoreTimes.this.itens.get(i).getUserObject() instanceof Grupo;
                ArvoreTimes.this.lista.setCursor(new Cursor(grupo ? Cursor.HAND_CURSOR : Cursor.DEFAULT_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                ArvoreTimes.this.sobre = -1;
                ArvoreTimes.this.lista.repaint();
            }
        };
        this.lista.addMouseListener(mouse);
        this.lista.addMouseMotionListener(mouse);
        // Teclado: Enter/→ entra; Backspace/← volta.
        this.lista.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "entrar");
        this.lista.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "entrar");
        this.lista.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "voltar");
        this.lista.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "voltar");
        this.lista.getActionMap().put("entrar", new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                DefaultMutableTreeNode no = ArvoreTimes.this.lista.getSelectedValue();
                if (no != null && no.getUserObject() instanceof Grupo) {
                    ArvoreTimes.this.entrar(no);
                } else if (no != null && ArvoreTimes.this.aoAbrir != null) {
                    ArvoreTimes.this.aoAbrir.run();
                }
            }
        });
        this.lista.getActionMap().put("voltar", new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                ArvoreTimes.this.subir();
            }
        });
        JScrollPane rolagem = new JScrollPane(this.lista);
        TemaBetfoot.rolagem(rolagem);
        rolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add((Component)rolagem, "Center");
        this.mostrar(this.raiz, null);
    }

    public void aoSelecionar(Consumer<ModeloTime2> consumer) {
        this.aoSelecionar = consumer;
    }

    public void aoAbrir(Runnable runnable) {
        this.aoAbrir = runnable;
    }

    /** Chamado quando o usuário sai da busca pelo botão voltar ou pelo caminho (para limpar o campo). */
    public void aoLimparBusca(Runnable runnable) {
        this.aoLimparBusca = runnable;
    }

    private static String normalizar(String string) {
        return java.text.Normalizer.normalize(string == null ? "" : string, java.text.Normalizer.Form.NFD).replaceAll("\\p{M}", "").toLowerCase(Locale.ROOT).trim();
    }

    /**
     * Busca: a lista passa a mostrar só os times cujo nome contém o texto (sem acento/maiúscula), de todos os
     * países, começando pelos que começam com o texto. Texto vazio volta para as páginas.
     */
    public void buscar(String string) {
        String q = ArvoreTimes.normalizar(string);
        if (q.isEmpty()) {
            if (this.busca != null) {
                this.busca = null;
                this.mostrar(this.atual, null);
            }
            return;
        }
        this.busca = string.trim();
        List<DefaultMutableTreeNode> achados = new ArrayList<DefaultMutableTreeNode>();
        for (Map.Entry<ModeloTime2, DefaultMutableTreeNode> e : this.folhas.entrySet()) {
            if (ArvoreTimes.normalizar(e.getKey().getNome()).contains(q)) {
                achados.add(e.getValue());
            }
        }
        achados.sort((a, b) -> {
            ModeloTime2 x = (ModeloTime2)a.getUserObject();
            ModeloTime2 y = (ModeloTime2)b.getUserObject();
            boolean px = ArvoreTimes.normalizar(x.getNome()).startsWith(q);
            boolean py = ArvoreTimes.normalizar(y.getNome()).startsWith(q);
            if (px != py) {
                return px ? -1 : 1;
            }
            return ArvoreTimes.compararNomes(x, y);
        });
        ModeloTime2 marcado = this.lista.getSelectedValue() != null && this.lista.getSelectedValue().getUserObject() instanceof ModeloTime2 ? (ModeloTime2)this.lista.getSelectedValue().getUserObject() : null;
        this.sincronizando = true;
        try {
            this.itens.clear();
            for (DefaultMutableTreeNode no : achados) {
                this.itens.addElement(no);
            }
            int i = marcado == null ? -1 : this.itens.indexOf(this.folhas.get(marcado));
            if (i >= 0) {
                this.lista.setSelectedIndex(i);
            } else {
                this.lista.clearSelection();
            }
            if (!this.itens.isEmpty()) {
                this.lista.ensureIndexIsVisible(Math.max(0, i));
            }
        }
        finally {
            this.sincronizando = false;
        }
        this.lista.setFixedCellHeight(54);
        this.sobre = -1;
        this.voltar.setEnabled(true);
        this.montarCaminho();
        this.lista.repaint();
    }

    private void sairDaBusca() {
        this.busca = null;
        if (this.aoLimparBusca != null) {
            this.aoLimparBusca.run();
        }
        this.mostrar(this.atual, null);
    }

    private static String nomePais(int n) {
        try {
            return nucleo.EnumPaises.valueOf("P" + n).getNome().trim();
        }
        catch (Exception exception) {
            return "?";
        }
    }

    private static int compararNomes(ModeloTime2 a, ModeloTime2 b) {
        return COLLATOR.compare(a.getNome(), b.getNome());
    }

    // ----- Navegação -----

    private void entrar(DefaultMutableTreeNode no) {
        this.mostrar(no, null);
        this.lista.requestFocusInWindow();
    }

    private void subir() {
        if (this.busca != null) {
            this.sairDaBusca();
            return;
        }
        DefaultMutableTreeNode pai = (DefaultMutableTreeNode)this.atual.getParent();
        if (pai != null) {
            DefaultMutableTreeNode de = this.atual;
            this.mostrar(pai, de);
        }
    }

    /** Mostra a página do nó (filhos dele); "marcar" fica selecionado e visível. */
    private void mostrar(DefaultMutableTreeNode no, DefaultMutableTreeNode marcar) {
        this.atual = no;
        this.busca = null;
        this.lista.setFixedCellHeight(42);
        this.sincronizando = true;
        try {
            this.itens.clear();
            Enumeration<?> e = no.children();
            while (e.hasMoreElements()) {
                this.itens.addElement((DefaultMutableTreeNode)e.nextElement());
            }
            if (marcar != null) {
                int i = this.itens.indexOf(marcar);
                if (i >= 0) {
                    this.lista.setSelectedIndex(i);
                    this.lista.ensureIndexIsVisible(i);
                }
            } else {
                this.lista.clearSelection();
                if (!this.itens.isEmpty()) {
                    this.lista.ensureIndexIsVisible(0);
                }
            }
        }
        finally {
            this.sincronizando = false;
        }
        this.sobre = -1;
        this.voltar.setEnabled(no != this.raiz);
        this.montarCaminho();
    }

    /** Caminho no topo: Países / Brasil / Série A; os anteriores ao atual são clicáveis. */
    private void montarCaminho() {
        this.caminho.removeAll();
        if (this.busca != null) {
            final JLabel paises = new JLabel("PA\u00cdSES");
            paises.setFont(TemaBetfoot.espacada(TemaBetfoot.display(17.0f), 0.04f));
            paises.setForeground(TemaBetfoot.VERDE);
            paises.setCursor(new Cursor(Cursor.HAND_CURSOR));
            paises.setToolTipText("Sair da busca");
            paises.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                    ArvoreTimes.this.atual = ArvoreTimes.this.raiz;
                    ArvoreTimes.this.sairDaBusca();
                }
            });
            this.caminho.add(paises);
            JLabel barra = new JLabel("/");
            barra.setFont(TemaBetfoot.display(16.0f));
            barra.setForeground(TemaBetfoot.TEXTO_FRACO);
            barra.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
            this.caminho.add(barra);
            String termo = this.busca.length() > 14 ? this.busca.substring(0, 13) + "\u2026" : this.busca;
            JLabel rotulo = new JLabel("BUSCA \u201c" + termo + "\u201d \u00b7 " + this.itens.size());
            rotulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(17.0f), 0.04f));
            rotulo.setForeground(TemaBetfoot.TEXTO);
            rotulo.setIcon(new components.TemaBetfoot.IconeVetor(components.TemaBetfoot.Simbolo.LUPA, 14, TemaBetfoot.TEXTO));
            rotulo.setIconTextGap(8);
            this.caminho.add(rotulo);
            this.caminho.revalidate();
            this.caminho.repaint();
            return;
        }
        Object[] nos = this.atual.getPath();
        for (int i = 0; i < nos.length; ++i) {
            final DefaultMutableTreeNode no = (DefaultMutableTreeNode)nos[i];
            Grupo g = (Grupo)no.getUserObject();
            boolean ultimo = i == nos.length - 1;
            if (i > 0) {
                JLabel barra = new JLabel("/");
                barra.setFont(TemaBetfoot.display(16.0f));
                barra.setForeground(TemaBetfoot.TEXTO_FRACO);
                barra.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
                this.caminho.add(barra);
            }
            String texto = g.nome.toUpperCase();
            if (ultimo) {
                JLabel atualRotulo = new JLabel(texto);
                atualRotulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(17.0f), 0.04f));
                atualRotulo.setForeground(TemaBetfoot.TEXTO);
                if (g.ehPais) {
                    atualRotulo.setIcon(TemaBetfoot.bandeira(g.pais, 13));
                    atualRotulo.setIconTextGap(8);
                }
                this.caminho.add(atualRotulo);
            } else {
                final JLabel link = new JLabel(texto);
                link.setFont(TemaBetfoot.espacada(TemaBetfoot.display(17.0f), 0.04f));
                link.setForeground(TemaBetfoot.VERDE);
                link.setCursor(new Cursor(Cursor.HAND_CURSOR));
                link.setToolTipText("Voltar para " + g.nome);
                final DefaultMutableTreeNode filho = (DefaultMutableTreeNode)nos[i + 1];
                link.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent mouseEvent) {
                        ArvoreTimes.this.mostrar(no, filho);
                    }

                    @Override
                    public void mouseEntered(MouseEvent mouseEvent) {
                        link.setForeground(Color.WHITE);
                    }

                    @Override
                    public void mouseExited(MouseEvent mouseEvent) {
                        link.setForeground(TemaBetfoot.VERDE);
                    }
                });
                this.caminho.add(link);
            }
        }
        this.caminho.revalidate();
        this.caminho.repaint();
    }

    // ----- Dados -----

    /** Monta as páginas a partir da lista de times; tenta ficar na mesma página em que o usuário estava. */
    public void construir(List<?> lista, ModeloTime2 selecionado) {
        String paisAtual = null;
        String ligaAtual = null;
        Object[] antes = this.atual.getPath();
        if (antes.length > 1) {
            paisAtual = ((Grupo)((DefaultMutableTreeNode)antes[1]).getUserObject()).nome;
        }
        if (antes.length > 2) {
            ligaAtual = ((Grupo)((DefaultMutableTreeNode)antes[2]).getUserObject()).nome;
        }
        this.raiz.removeAllChildren();
        this.folhas.clear();
        ((Grupo)this.raiz.getUserObject()).times = 0;
        Map<Integer, List<ModeloTime2>> porPais = new HashMap<Integer, List<ModeloTime2>>();
        for (Object o : lista) {
            ModeloTime2 t = (ModeloTime2)o;
            porPais.computeIfAbsent(t.getPais(), k -> new ArrayList<ModeloTime2>()).add(t);
        }
        List<Integer> paises = new ArrayList<Integer>(porPais.keySet());
        paises.sort((a, b) -> COLLATOR.compare(ArvoreTimes.nomePais(a), ArvoreTimes.nomePais(b)));
        DefaultMutableTreeNode voltarPara = this.raiz;
        for (int pais : paises) {
            List<ModeloTime2> times = porPais.get(pais);
            Grupo gp = new Grupo(ArvoreTimes.nomePais(pais), pais, true);
            DefaultMutableTreeNode noPais = new DefaultMutableTreeNode(gp);
            if (gp.nome.equals(paisAtual) && ligaAtual == null) {
                voltarPara = noPais;
            }
            Map<String, List<ModeloTime2>> ligas = pais == 29 ? ArvoreTimes.ligasBrasil(times) : ArvoreTimes.ligasPorNivel(times);
            for (Map.Entry<String, List<ModeloTime2>> liga : ligas.entrySet()) {
                List<ModeloTime2> ts = liga.getValue();
                ts.sort(ArvoreTimes::compararNomes);
                Grupo gl = new Grupo(liga.getKey(), pais, false);
                DefaultMutableTreeNode noLiga = new DefaultMutableTreeNode(gl);
                if (gp.nome.equals(paisAtual) && gl.nome.equals(ligaAtual)) {
                    voltarPara = noLiga;
                }
                for (ModeloTime2 t : ts) {
                    DefaultMutableTreeNode folha = new DefaultMutableTreeNode(t, false);
                    noLiga.add(folha);
                    this.folhas.put(t, folha);
                    gl.times++;
                    gp.times++;
                }
                noPais.add(noLiga);
            }
            ((Grupo)this.raiz.getUserObject()).times += gp.times;
            this.raiz.add(noPais);
        }
        this.contarMarcas();
        String buscaAtiva = this.busca;
        this.mostrar(voltarPara, null);
        if (buscaAtiva != null) {
            this.buscar(buscaAtiva);
            if (selecionado != null) {
                this.selecionar(selecionado);
            }
            return;
        }
        if (selecionado != null && voltarPara.getLevel() == 2) {
            this.selecionar(selecionado);
        }
    }

    /** Brasil: Séries A–D e depois os demais por estado (estadual), em ordem alfabética de estado. */
    private static Map<String, List<ModeloTime2>> ligasBrasil(List<ModeloTime2> times) {
        Map<String, List<ModeloTime2>> ligas = new java.util.LinkedHashMap<String, List<ModeloTime2>>();
        String[] series = new String[]{"Série A", "Série B", "Série C", "Série D"};
        for (String s : series) {
            ligas.put(s, new ArrayList<ModeloTime2>());
        }
        Map<String, List<ModeloTime2>> estaduais = new java.util.TreeMap<String, List<ModeloTime2>>(COLLATOR);
        for (ModeloTime2 t : times) {
            int serie = nucleo.DivisoesIniciais.serieNacional(t.getFileRef());
            if (serie >= 1 && serie <= 4) {
                ligas.get(series[serie - 1]).add(t);
            } else {
                String uf;
                try {
                    uf = nucleo.ConstantesJogo.rY[t.getEstado()];
                }
                catch (Exception exception) {
                    uf = "Sem estado";
                }
                estaduais.computeIfAbsent("Estadual · " + uf, k -> new ArrayList<ModeloTime2>()).add(t);
            }
        }
        ligas.values().removeIf(List::isEmpty);
        ligas.putAll(estaduais);
        return ligas;
    }

    /** Outros países: como no início da carreira, times pelo nível e cortados em divisões de até 20. */
    private static Map<String, List<ModeloTime2>> ligasPorNivel(List<ModeloTime2> times) {
        List<ModeloTime2> restantes = new ArrayList<ModeloTime2>(times);
        restantes.sort((a, b) -> {
            int c = Integer.compare(b.getNivel(), a.getNivel());
            return c != 0 ? c : ArvoreTimes.compararNomes(a, b);
        });
        Map<String, List<ModeloTime2>> ligas = new java.util.LinkedHashMap<String, List<ModeloTime2>>();
        int divisao = 1;
        while (divisao <= 4 && restantes.size() >= 10) {
            int n = restantes.size() >= 20 ? 20 : restantes.size() >= 18 ? 18 : restantes.size() >= 16 ? 16 : restantes.size() >= 14 ? 14 : restantes.size() >= 12 ? 12 : 10;
            ligas.put(divisao + "ª divisão", new ArrayList<ModeloTime2>(restantes.subList(0, n)));
            restantes = new ArrayList<ModeloTime2>(restantes.subList(n, restantes.size()));
            ++divisao;
        }
        if (!restantes.isEmpty()) {
            ligas.put(ligas.isEmpty() ? "Todos os times" : "Sem divisão", restantes);
        }
        return ligas;
    }

    private void contarMarcas() {
        Enumeration<?> e = this.raiz.depthFirstEnumeration();
        while (e.hasMoreElements()) {
            DefaultMutableTreeNode no = (DefaultMutableTreeNode)e.nextElement();
            if (no.getUserObject() instanceof Grupo) {
                Grupo g = (Grupo)no.getUserObject();
                g.marcados = 0;
                Enumeration<?> f = no.depthFirstEnumeration();
                while (f.hasMoreElements()) {
                    Object v = ((DefaultMutableTreeNode)f.nextElement()).getUserObject();
                    if (v instanceof ModeloTime2 && ((ModeloTime2)v).isMark()) {
                        g.marcados++;
                    }
                }
            }
        }
    }

    /** Recalcula quantos times marcados (em vermelho) há em cada país/liga e repinta. */
    public void atualizarMarcas() {
        this.contarMarcas();
        this.lista.repaint();
    }

    /**
     * Leva até a liga do time e o deixa selecionado (busca, time novo…), sem avisar o editor de novo. Se o usuário
     * já está nessa página, só marca a linha.
     */
    public void selecionar(ModeloTime2 t2) {
        DefaultMutableTreeNode folha = this.folhas.get(t2);
        if (folha == null) {
            return;
        }
        DefaultMutableTreeNode liga = (DefaultMutableTreeNode)folha.getParent();
        if (this.busca != null) {
            int i = this.itens.indexOf(folha);
            if (i >= 0) {
                this.sincronizando = true;
                try {
                    this.lista.setSelectedIndex(i);
                    this.lista.ensureIndexIsVisible(i);
                }
                finally {
                    this.sincronizando = false;
                }
            }
            return;
        }
        if (this.atual != liga) {
            this.mostrar(liga, null);
        }
        this.sincronizando = true;
        try {
            int i = this.itens.indexOf(folha);
            if (i >= 0) {
                this.lista.setSelectedIndex(i);
                this.lista.ensureIndexIsVisible(i);
            }
        }
        finally {
            this.sincronizando = false;
        }
    }

    /** Setas desenhadas (voltar e "entrar"). */
    private static class Seta
    implements Icon {
        static final int ESQUERDA = 0;
        static final int DIREITA = 1;
        private final int lado;
        private final Color cor;

        Seta(int n, Color color) {
            this.lado = n;
            this.cor = color;
        }

        @Override
        public void paintIcon(Component component, Graphics graphics, int x, int y) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            Color color = this.cor;
            if (component instanceof JButton) {
                JButton b = (JButton)component;
                color = !b.isEnabled() ? TemaBetfoot.TEXTO_FRACO : (b.getModel().isRollover() ? TemaBetfoot.VERDE : this.cor);
            }
            g.setColor(color);
            g.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            GeneralPath p = new GeneralPath();
            if (this.lado == ESQUERDA) {
                p.moveTo(x + 9, y + 3);
                p.lineTo(x + 4, y + 8);
                p.lineTo(x + 9, y + 13);
            } else {
                p.moveTo(x + 6, y + 3);
                p.lineTo(x + 11, y + 8);
                p.lineTo(x + 6, y + 13);
            }
            g.draw(p);
            g.dispose();
        }

        @Override
        public int getIconWidth() {
            return 16;
        }

        @Override
        public int getIconHeight() {
            return 16;
        }
    }

    /** Linha da lista: país (bandeira + nome + total), liga (nome + total) ou time (nome + nível). */
    private class Renderizador
    extends JComponent
    implements ListCellRenderer<DefaultMutableTreeNode> {
        private Object valor;
        private DefaultMutableTreeNode no;
        private boolean selecionado;
        private boolean emCima;

        Renderizador() {
            this.setOpaque(false);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends DefaultMutableTreeNode> jList, DefaultMutableTreeNode no, int n, boolean bl, boolean bl2) {
            this.valor = no.getUserObject();
            this.no = no;
            this.selecionado = bl;
            this.emCima = n == ArvoreTimes.this.sobre;
            this.setPreferredSize(new Dimension(100, jList.getFixedCellHeight()));
            return this;
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            int h = this.getHeight();
            if (this.selecionado) {
                g.setColor(new Color(18, 72, 40));
                g.fillRect(0, 0, w, h);
                g.setColor(TemaBetfoot.VERDE);
                g.fillRect(0, 0, 3, h);
            } else if (this.emCima) {
                g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.05));
                g.fillRect(0, 0, w, h);
            }
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.05));
            g.fillRect(14, h - 1, w - 28, 1);
            int x = 16;
            if (this.valor instanceof Grupo) {
                Grupo grupo = (Grupo)this.valor;
                if (grupo.ehPais) {
                    Icon bandeira = TemaBetfoot.bandeira(grupo.pais, 16);
                    bandeira.paintIcon(this, g, x + (26 - bandeira.getIconWidth()) / 2, (h - bandeira.getIconHeight()) / 2);
                    x += 26 + 12;
                    g.setFont(TemaBetfoot.fonte(Font.BOLD, 15.0f));
                    g.setColor(TemaBetfoot.TEXTO);
                } else {
                    g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(17.0f), 0.04f));
                    g.setColor(TemaBetfoot.TEXTO);
                }
                FontMetrics fm = g.getFontMetrics();
                String nome = grupo.ehPais ? grupo.nome : grupo.nome.toUpperCase();
                g.drawString(nome, x, (h + fm.getAscent() - fm.getDescent()) / 2);
                // Seta "entrar" e, antes dela, o total de times (e marcados em vermelho, se houver).
                new Seta(Seta.DIREITA, this.emCima ? TemaBetfoot.VERDE : TemaBetfoot.TEXTO_FRACO).paintIcon(this, g, w - 30, (h - 16) / 2);
                g.setFont(TemaBetfoot.display(15.0f));
                FontMetrics fm2 = g.getFontMetrics();
                String total = grupo.times + (grupo.times == 1 ? " time" : " times");
                int tx = w - 38 - fm2.stringWidth(total);
                g.setColor(TemaBetfoot.TEXTO_FRACO);
                g.drawString(total, tx, (h + fm2.getAscent() - fm2.getDescent()) / 2);
                if (grupo.marcados > 0) {
                    String m = grupo.marcados + " ●";
                    g.setColor(TemaBetfoot.VERMELHO);
                    g.drawString(m, tx - fm2.stringWidth(m) - 12, (h + fm2.getAscent() - fm2.getDescent()) / 2);
                }
            } else if (this.valor instanceof ModeloTime2) {
                ModeloTime2 t = (ModeloTime2)this.valor;
                String nivel = Integer.toString(t.getNivel());
                g.setFont(TemaBetfoot.display(15.0f));
                FontMetrics fmN = g.getFontMetrics();
                int nw = Math.max(26, fmN.stringWidth(nivel) + 14);
                g.setFont(TemaBetfoot.fonte(this.selecionado ? Font.BOLD : Font.PLAIN, 15.0f));
                FontMetrics fm = g.getFontMetrics();
                String nome = t.getNome();
                int max = w - x - nw - 24;
                if (fm.stringWidth(nome) > max) {
                    while (nome.length() > 1 && fm.stringWidth(nome + "…") > max) {
                        nome = nome.substring(0, nome.length() - 1);
                    }
                    nome = nome + "…";
                }
                // Escudo à esquerda (ou um círculo com a inicial, se o time não tiver escudo).
                int lado = 26;
                int ey = (h - lado) / 2;
                java.awt.Image img = ArvoreTimes.escudo(t);
                if (img != null) {
                    int iw = img.getWidth(null);
                    int ih = img.getHeight(null);
                    double esc = Math.min((double)lado / iw, (double)lado / ih);
                    int dw = (int)Math.round(iw * esc);
                    int dh = (int)Math.round(ih * esc);
                    g.drawImage(img, x + (lado - dw) / 2, ey + (lado - dh) / 2, dw, dh, null);
                } else {
                    g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
                    g.fill(new java.awt.geom.Ellipse2D.Double(x + 1, ey + 1, lado - 2, lado - 2));
                    g.setFont(TemaBetfoot.display(14.0f));
                    FontMetrics fi = g.getFontMetrics();
                    String ini = t.getNome().isEmpty() ? "?" : t.getNome().substring(0, 1).toUpperCase();
                    g.setColor(TemaBetfoot.TEXTO_SUAVE);
                    g.drawString(ini, x + (lado - fi.stringWidth(ini)) / 2, ey + (lado + fi.getAscent() - fi.getDescent()) / 2);
                    g.setFont(TemaBetfoot.fonte(this.selecionado ? Font.BOLD : Font.PLAIN, 15.0f));
                }
                x += lado + 12;
                if (fm.stringWidth(t.getNome()) > w - x - nw - 24) {
                    nome = t.getNome();
                    while (nome.length() > 1 && fm.stringWidth(nome + "\u2026") > w - x - nw - 24) {
                        nome = nome.substring(0, nome.length() - 1);
                    }
                    nome = nome + "\u2026";
                }
                g.setColor(t.isMark() ? TemaBetfoot.VERMELHO : (this.selecionado ? Color.WHITE : TemaBetfoot.TEXTO));
                if (ArvoreTimes.this.busca != null && this.no != null && this.no.getParent() != null) {
                    // Na busca: nome em cima e, embaixo, bandeira + país · liga.
                    g.drawString(nome, x, h / 2 - 3);
                    DefaultMutableTreeNode liga = (DefaultMutableTreeNode)this.no.getParent();
                    Grupo gl = (Grupo)liga.getUserObject();
                    Grupo gp = (Grupo)((DefaultMutableTreeNode)liga.getParent()).getUserObject();
                    Icon band = TemaBetfoot.bandeira(gp.pais, 10);
                    band.paintIcon(this, g, x, h / 2 + 5);
                    g.setFont(TemaBetfoot.fonte(Font.PLAIN, 12.0f));
                    g.setColor(this.selecionado ? TemaBetfoot.alfa(Color.WHITE, 0.8) : TemaBetfoot.TEXTO_SUAVE);
                    g.drawString(gp.nome + "  \u00b7  " + gl.nome, x + band.getIconWidth() + 6, h / 2 + 14);
                } else {
                    g.drawString(nome, x, (h + fm.getAscent() - fm.getDescent()) / 2);
                }
                // Nível numa pílula à direita.
                int px = w - nw - 14;
                int py = (h - 22) / 2;
                g.setColor(TemaBetfoot.alfa(Color.WHITE, this.selecionado ? 0.16 : 0.07));
                g.fill(new java.awt.geom.RoundRectangle2D.Double(px, py, nw, 22, 22, 22));
                g.setFont(TemaBetfoot.display(15.0f));
                g.setColor(this.selecionado ? Color.WHITE : TemaBetfoot.TEXTO_SUAVE);
                g.drawString(nivel, px + (nw - fmN.stringWidth(nivel)) / 2, py + (22 + fmN.getAscent() - fmN.getDescent()) / 2);
            }
            g.dispose();
        }
    }
}
