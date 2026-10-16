package telas;

import components.TemaBetfoot;
import components.TemaBetfoot.Estilo;
import components.TemaBetfoot.Simbolo;
import est.InfoArquivoSalvoType;
import modelos.ModeloTime2;
import motor.GerenciadorJogo;
import nucleo.UtilitariosTexto;
import persistencia.EntradaObjetosCompativel;
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
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * Carregar jogo salvo, no padrão do editor: lista das carreiras (mais recente primeiro) com escudo, técnico e
 * temporada; à direita o resumo da carreira escolhida (próximo jogo, data do save). Clique duplo ou Enter carrega,
 * Delete exclui (com confirmação), Esc fecha.
 */
public class DialogoCarregarJogoSalvo
extends JPanel {
    private static final Map<String, Image> ESCUDOS = new HashMap<String, Image>();
    private static final Set<String> SEM_ESCUDO = new HashSet<String>();

    private JDialog dialogo;
    private final DefaultListModel<Salvo> modelo = new DefaultListModel<Salvo>();
    private final JList<Salvo> lista = new JList<Salvo>(this.modelo);
    private final Detalhe detalhe = new Detalhe();
    private final JPanel centro = new JPanel(new BorderLayout(18, 0));
    private final JPanel caixaLista = new Bloco(new BorderLayout());
    private final JButton carregar = TemaBetfoot.botao(new JButton(), Estilo.PRIMARIO, "Carregar", null);
    private final JButton cancelar = TemaBetfoot.botao(new JButton(), Estilo.FANTASMA, "Cancelar", null);
    private final JButton excluir = TemaBetfoot.botao(new JButton(), Estilo.PERIGO, "Excluir", Simbolo.LIXEIRA);
    private final JLabel contagem = new JLabel();
    private boolean carregando = false;

    /** Uma carreira salva: o arquivo .s22 e o resumo gravado ao lado (.info). */
    private static class Salvo {
        final String nome;
        final long data;
        final InfoArquivoSalvoType info;

        Salvo(String string, long l, InfoArquivoSalvoType infoArquivoSalvoType) {
            this.nome = string;
            this.data = l;
            this.info = infoArquivoSalvoType;
        }

        String time() {
            return this.info != null && this.info.getN() != null && !this.info.getN().isEmpty() ? this.info.getN() : this.nome;
        }

        String tecnico() {
            return this.info == null ? null : this.info.getTc();
        }

        String temporada() {
            return this.info == null || this.info.getA() == null ? null : Integer.toString(this.info.getA());
        }
    }

    public DialogoCarregarJogoSalvo() {
        super(new BorderLayout(0, 20));
        this.setOpaque(false);
        this.montar();
        this.ler();
    }

    /** Abre a tela como modal sobre a janela ativa (bloqueia até fechar). */
    public static void abrir() {
        DialogoCarregarJogoSalvo painel = new DialogoCarregarJogoSalvo();
        painel.dialogo = TemaBetfoot.janela(java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager().getActiveWindow(), painel);
        painel.dialogo.getRootPane().setDefaultButton(painel.carregar);
        painel.lista.requestFocusInWindow();
        painel.dialogo.setVisible(true);
    }

    private void montar() {
        // Topo: título, subtítulo e X.
        JPanel topo = new JPanel(new BorderLayout(16, 0));
        topo.setOpaque(false);
        JPanel textos = new JPanel();
        textos.setOpaque(false);
        textos.setLayout(new javax.swing.BoxLayout(textos, 1));
        JLabel titulo = new JLabel("CARREGAR JOGO");
        titulo.setFont(TemaBetfoot.espacada(TemaBetfoot.display(30.0f), 0.02f));
        titulo.setForeground(TemaBetfoot.TEXTO);
        JLabel sub = new JLabel("Escolha uma carreira salva para continuar");
        sub.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        sub.setForeground(TemaBetfoot.TEXTO_SUAVE);
        textos.add(titulo);
        textos.add(sub);
        topo.add((Component)textos, "Center");
        JButton fechar = TemaBetfoot.fechar();
        fechar.addActionListener(actionEvent -> this.fechar());
        JPanel canto = new JPanel(new BorderLayout());
        canto.setOpaque(false);
        canto.add((Component)fechar, "North");
        topo.add((Component)canto, "East");
        this.add((Component)topo, "North");

        // Centro: lista à esquerda, resumo à direita.
        this.lista.setOpaque(true);
        this.lista.setBackground(TemaBetfoot.LINHA_IMPAR);
        this.lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.lista.setFixedCellHeight(68);
        this.lista.setCellRenderer(new Linha());
        this.lista.addListSelectionListener(evento -> {
            if (!evento.getValueIsAdjusting()) {
                this.atualizar();
            }
        });
        this.lista.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(mouseEvent) && DialogoCarregarJogoSalvo.this.lista.getSelectedValue() != null) {
                    DialogoCarregarJogoSalvo.this.carregar();
                }
            }
        });
        Linha.hover(this.lista);
        this.lista.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "excluir");
        this.lista.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "excluir");
        this.lista.getActionMap().put("excluir", new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
                DialogoCarregarJogoSalvo.this.excluir();
            }
        });
        JScrollPane rolagem = new JScrollPane(this.lista);
        TemaBetfoot.rolagem(rolagem);
        this.caixaLista.add((Component)rolagem, "Center");
        this.caixaLista.setPreferredSize(new Dimension(430, 380));
        this.centro.setOpaque(false);
        this.centro.setPreferredSize(new Dimension(738, 380));
        this.detalhe.setPreferredSize(new Dimension(290, 380));
        this.add((Component)this.centro, "Center");

        // Rodapé: total + excluir à esquerda; cancelar e carregar à direita.
        JPanel rodape = new JPanel(new BorderLayout(16, 0));
        rodape.setOpaque(false);
        rodape.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, TemaBetfoot.alfa(Color.WHITE, 0.08)), BorderFactory.createEmptyBorder(18, 0, 0, 0)));
        JPanel esquerda = new JPanel(new FlowLayout(FlowLayout.LEFT, 14, 0));
        esquerda.setOpaque(false);
        this.excluir.setToolTipText("Excluir o jogo salvo (Delete)");
        this.excluir.addActionListener(actionEvent -> this.excluir());
        esquerda.add(this.excluir);
        this.contagem.setFont(TemaBetfoot.espacada(TemaBetfoot.display(13.0f), 0.08f));
        this.contagem.setForeground(TemaBetfoot.TEXTO_FRACO);
        esquerda.add(this.contagem);
        rodape.add((Component)esquerda, "West");
        JPanel direita = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        direita.setOpaque(false);
        this.cancelar.addActionListener(actionEvent -> this.fechar());
        this.carregar.setToolTipText("Carregar a carreira (Enter ou clique duplo)");
        this.carregar.addActionListener(actionEvent -> this.carregar());
        direita.add(this.cancelar);
        direita.add(this.carregar);
        rodape.add((Component)direita, "East");
        this.add((Component)rodape, "South");
    }

    /** Lê a pasta sav/: arquivos .s22 com o resumo .info, do mais recente para o mais antigo. */
    private void ler() {
        String selecionado = this.lista.getSelectedValue() == null ? null : this.lista.getSelectedValue().nome;
        this.modelo.clear();
        File[] arquivos = new File(System.getProperty("user.dir") + "/sav").listFiles((pasta, nome) -> nome.toLowerCase().endsWith(".s22"));
        List<Salvo> salvos = new ArrayList<Salvo>();
        if (arquivos != null) {
            for (File arquivo : arquivos) {
                if (arquivo.isFile()) {
                    String nome = arquivo.getName().substring(0, arquivo.getName().lastIndexOf("."));
                    salvos.add(new Salvo(nome, arquivo.lastModified(), GerenciadorJogo.af(nome)));
                }
            }
        }
        salvos.sort((a, b) -> Long.compare(b.data, a.data));
        int indice = 0;
        for (int i = 0; i < salvos.size(); ++i) {
            this.modelo.addElement(salvos.get(i));
            if (salvos.get(i).nome.equals(selecionado)) {
                indice = i;
            }
        }
        this.contagem.setText(salvos.isEmpty() ? "" : salvos.size() + (salvos.size() == 1 ? " JOGO SALVO" : " JOGOS SALVOS"));
        // Sem saves, o aviso ocupa o lugar da lista.
        this.centro.removeAll();
        if (salvos.isEmpty()) {
            this.centro.add((Component)this.detalhe, "Center");
        } else {
            this.centro.add((Component)this.caixaLista, "Center");
            this.centro.add((Component)this.detalhe, "East");
        }
        this.centro.revalidate();
        this.centro.repaint();
        if (salvos.isEmpty()) {
            this.lista.clearSelection();
        } else {
            this.lista.setSelectedIndex(Math.min(indice, salvos.size() - 1));
            this.lista.ensureIndexIsVisible(this.lista.getSelectedIndex());
        }
        this.atualizar();
        this.buscarEscudos(salvos);
    }

    private void atualizar() {
        Salvo salvo = this.lista.getSelectedValue();
        this.detalhe.salvo = salvo;
        this.detalhe.vazio = this.modelo.isEmpty();
        this.detalhe.repaint();
        this.carregar.setEnabled(salvo != null && !this.carregando);
        this.excluir.setEnabled(salvo != null && !this.carregando);
        this.excluir.setVisible(!this.modelo.isEmpty());
        this.carregar.setVisible(!this.modelo.isEmpty());
        this.cancelar.setText(this.modelo.isEmpty() ? "Voltar" : "Cancelar");
    }

    private void carregar() {
        final Salvo salvo = this.lista.getSelectedValue();
        if (salvo == null || this.carregando) {
            return;
        }
        this.carregando = true;
        this.carregar.setText("Carregando…");
        this.detalhe.carregando = true;
        this.detalhe.repaint();
        this.atualizar();
        this.cancelar.setEnabled(false);
        this.dialogo.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        // Deixa a tela pintar o "carregando" antes de travar lendo o save.
        Timer timer = new Timer(30, actionEvent -> {
            GerenciadorJogo.c(salvo.nome, false);
            this.dialogo.dispose();
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void excluir() {
        Salvo salvo = this.lista.getSelectedValue();
        if (salvo == null || this.carregando) {
            return;
        }
        String quem = salvo.time() + (salvo.temporada() == null ? "" : " (" + salvo.temporada() + ")");
        if (!TemaBetfoot.confirmar(this, "Excluir jogo salvo?", "A carreira \"" + quem + "\" será apagada de vez. Não dá para desfazer.", "Excluir", true)) {
            return;
        }
        // Save, resumo e cópia de segurança.
        for (String extensao : new String[]{".s22", ".info", ".sbck"}) {
            new File(System.getProperty("user.dir") + "/sav/" + salvo.nome + extensao).delete();
        }
        int indice = this.lista.getSelectedIndex();
        this.ler();
        if (!this.modelo.isEmpty()) {
            this.lista.setSelectedIndex(Math.min(indice, this.modelo.size() - 1));
        }
        this.lista.requestFocusInWindow();
    }

    private void fechar() {
        if (!this.carregando && this.dialogo != null) {
            this.dialogo.dispose();
        }
    }

    // ----- Escudos -----

    /**
     * O resumo do save guarda só o nome do time; o escudo fica em teams/escudos/<arquivo>.png. Procura os nomes nos
     * .ban em segundo plano (para assim que achar todos) e repinta quando chegar.
     */
    private void buscarEscudos(List<Salvo> salvos) {
        final Set<String> faltam = new HashSet<String>();
        synchronized (ESCUDOS) {
            for (Salvo salvo : salvos) {
                if (!ESCUDOS.containsKey(salvo.time()) && !SEM_ESCUDO.contains(salvo.time())) {
                    faltam.add(salvo.time());
                }
            }
        }
        if (faltam.isEmpty()) {
            return;
        }
        Thread thread = new Thread(() -> {
            File[] bans = new File(UtilitariosTexto.cK + "/teams").listFiles((pasta, nome) -> nome.toLowerCase().endsWith(".ban"));
            if (bans != null) {
                for (File ban : bans) {
                    if (faltam.isEmpty()) {
                        break;
                    }
                    try (FileInputStream in = new FileInputStream(ban); ObjectInputStream objetos = new EntradaObjetosCompativel(in)) {
                        ModeloTime2 time = (ModeloTime2)objetos.readObject();
                        if (time != null && faltam.remove(time.getNome())) {
                            String ref = ban.getName().substring(0, ban.getName().lastIndexOf("."));
                            File png = new File(UtilitariosTexto.cK + "/teams/escudos/" + ref + ".png");
                            Image image = png.isFile() ? javax.imageio.ImageIO.read(png) : null;
                            synchronized (ESCUDOS) {
                                if (image != null) {
                                    ESCUDOS.put(time.getNome(), image);
                                } else {
                                    SEM_ESCUDO.add(time.getNome());
                                }
                            }
                        }
                    }
                    catch (Exception exception) {
                        // arquivo de time ilegível: segue para o próximo
                    }
                }
            }
            synchronized (ESCUDOS) {
                SEM_ESCUDO.addAll(faltam);
            }
            SwingUtilities.invokeLater(() -> {
                this.lista.repaint();
                this.detalhe.repaint();
            });
        }, "escudos-saves");
        thread.setDaemon(true);
        thread.start();
    }

    private static Image escudo(String string) {
        synchronized (ESCUDOS) {
            return ESCUDOS.get(string);
        }
    }

    /** Escudo encaixado num quadrado; sem escudo, círculo com a inicial (como na lista de times do editor). */
    private static void desenharEscudo(Graphics2D g, String time, int x, int y, int lado) {
        Image img = DialogoCarregarJogoSalvo.escudo(time);
        if (img != null && img.getWidth(null) > 0) {
            int iw = img.getWidth(null);
            int ih = img.getHeight(null);
            double esc = Math.min((double)lado / iw, (double)lado / ih);
            int dw = (int)Math.round(iw * esc);
            int dh = (int)Math.round(ih * esc);
            g.drawImage(img, x + (lado - dw) / 2, y + (lado - dh) / 2, dw, dh, null);
            return;
        }
        g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
        g.fill(new Ellipse2D.Double(x + 1, y + 1, lado - 2, lado - 2));
        Font antes = g.getFont();
        g.setFont(TemaBetfoot.display(lado * 0.5f));
        FontMetrics fm = g.getFontMetrics();
        String ini = time == null || time.isEmpty() ? "?" : time.substring(0, 1).toUpperCase();
        g.setColor(TemaBetfoot.TEXTO_SUAVE);
        g.drawString(ini, x + (lado - fm.stringWidth(ini)) / 2, y + (lado + fm.getAscent() - fm.getDescent()) / 2);
        g.setFont(antes);
    }

    // ----- Textos -----

    /** "Hoje, 14:32", "Ontem, 09:10" ou "12/10/2026". */
    private static String quando(long l) {
        Calendar agora = Calendar.getInstance();
        Calendar dia = Calendar.getInstance();
        dia.setTimeInMillis(l);
        String hora = new SimpleDateFormat("HH:mm").format(new Date(l));
        if (agora.get(Calendar.YEAR) == dia.get(Calendar.YEAR) && agora.get(Calendar.DAY_OF_YEAR) == dia.get(Calendar.DAY_OF_YEAR)) {
            return "Hoje, " + hora;
        }
        agora.add(Calendar.DAY_OF_YEAR, -1);
        if (agora.get(Calendar.YEAR) == dia.get(Calendar.YEAR) && agora.get(Calendar.DAY_OF_YEAR) == dia.get(Calendar.DAY_OF_YEAR)) {
            return "Ontem, " + hora;
        }
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date(l));
    }

    /** Próximo jogo gravado como "C - Adversário - Competição" (C casa, F fora): devolve {local, adversário, competição}. */
    private static String[] proximo(String string) {
        if (string == null || string.trim().isEmpty()) {
            return null;
        }
        String local = null;
        String resto = string.trim();
        if (resto.startsWith("C - ")) {
            local = "EM CASA";
            resto = resto.substring(4);
        } else if (resto.startsWith("F - ")) {
            local = "FORA";
            resto = resto.substring(4);
        }
        int corte = resto.indexOf(" - ");
        String adversario = corte < 0 ? resto : resto.substring(0, corte);
        String competicao = corte < 0 ? null : resto.substring(corte + 3).trim();
        return new String[]{local, adversario.trim(), competicao == null || competicao.isEmpty() ? null : competicao};
    }

    private static String cortar(FontMetrics fm, String string, int max) {
        if (string == null || fm.stringWidth(string) <= max) {
            return string;
        }
        String s = string;
        while (s.length() > 1 && fm.stringWidth(s + "…") > max) {
            s = s.substring(0, s.length() - 1);
        }
        return s + "…";
    }

    // ----- Componentes -----

    /** Fundo arredondado da lista (mesmo tom das tabelas do editor). */
    private static class Bloco
    extends JPanel {
        Bloco(java.awt.LayoutManager layoutManager) {
            super(layoutManager);
            this.setOpaque(false);
            this.setBorder(BorderFactory.createEmptyBorder(6, 0, 6, 0));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, this.getWidth() - 1, this.getHeight() - 1, 24.0, 24.0);
            g.setColor(TemaBetfoot.LINHA_IMPAR);
            g.fill(forma);
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
            g.draw(forma);
            g.dispose();
        }
    }

    /** Linha da lista: escudo, time, técnico · temporada e, à direita, quando foi salvo. */
    private static class Linha
    extends JComponent
    implements ListCellRenderer<Salvo> {
        private Salvo salvo;
        private boolean selecionado;
        private boolean emCima;

        static void hover(final JList<Salvo> jList) {
            MouseAdapter mouseAdapter = new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent mouseEvent) {
                    int i = jList.locationToIndex(mouseEvent.getPoint());
                    if (i >= 0 && !jList.getCellBounds(i, i).contains(mouseEvent.getPoint())) {
                        i = -1;
                    }
                    if (!Integer.valueOf(i).equals(jList.getClientProperty("hover"))) {
                        jList.putClientProperty("hover", i);
                        jList.repaint();
                    }
                    jList.setCursor(new Cursor(i >= 0 ? Cursor.HAND_CURSOR : Cursor.DEFAULT_CURSOR));
                }

                @Override
                public void mouseExited(MouseEvent mouseEvent) {
                    jList.putClientProperty("hover", -1);
                    jList.repaint();
                }
            };
            jList.addMouseListener(mouseAdapter);
            jList.addMouseMotionListener(mouseAdapter);
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Salvo> jList, Salvo salvo, int n, boolean bl, boolean bl2) {
            this.salvo = salvo;
            this.selecionado = bl;
            this.emCima = Integer.valueOf(n).equals(jList.getClientProperty("hover"));
            return this;
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            int h = this.getHeight();
            if (this.selecionado || this.emCima) {
                g.setColor(this.selecionado ? new Color(18, 72, 40) : TemaBetfoot.alfa(Color.WHITE, 0.04));
                g.fill(new RoundRectangle2D.Double(8, 3, w - 16, h - 6, 16, 16));
            }
            if (this.selecionado) {
                // Barra verde inclinada à esquerda, como nos menus de jogo.
                g.setColor(TemaBetfoot.VERDE);
                Path2D.Double barra = new Path2D.Double();
                barra.moveTo(13, 16);
                barra.lineTo(17, 16);
                barra.lineTo(14, h - 16);
                barra.lineTo(10, h - 16);
                barra.closePath();
                g.fill(barra);
            }
            int x = 26;
            int lado = 38;
            DialogoCarregarJogoSalvo.desenharEscudo(g, this.salvo.time(), x, (h - lado) / 2, lado);
            x += lado + 14;
            // Quando foi salvo (direita).
            g.setFont(TemaBetfoot.display(14.0f));
            FontMetrics fq = g.getFontMetrics();
            String quando = DialogoCarregarJogoSalvo.quando(this.salvo.data).toUpperCase();
            int qx = w - 22 - fq.stringWidth(quando);
            g.setColor(this.selecionado ? TemaBetfoot.alfa(Color.WHITE, 0.75) : TemaBetfoot.TEXTO_FRACO);
            g.drawString(quando, qx, h / 2 - 3);
            String temporada = this.salvo.temporada();
            if (temporada != null) {
                g.setFont(TemaBetfoot.display(15.0f));
                FontMetrics ft = g.getFontMetrics();
                int pw = ft.stringWidth(temporada) + 16;
                int px = w - 22 - pw;
                int py = h / 2 + 3;
                g.setColor(TemaBetfoot.alfa(Color.WHITE, this.selecionado ? 0.16 : 0.07));
                g.fill(new RoundRectangle2D.Double(px, py, pw, 20, 20, 20));
                g.setColor(this.selecionado ? Color.WHITE : TemaBetfoot.TEXTO_SUAVE);
                g.drawString(temporada, px + 8, py + (20 + ft.getAscent() - ft.getDescent()) / 2);
            }
            int max = qx - x - 16;
            // Time em cima, técnico e nome do arquivo embaixo.
            g.setFont(TemaBetfoot.fonte(Font.BOLD, 16.0f));
            g.setColor(this.selecionado ? Color.WHITE : TemaBetfoot.TEXTO);
            g.drawString(DialogoCarregarJogoSalvo.cortar(g.getFontMetrics(), this.salvo.time(), max), x, h / 2 - 3);
            g.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
            g.setColor(this.selecionado ? TemaBetfoot.alfa(Color.WHITE, 0.8) : TemaBetfoot.TEXTO_SUAVE);
            String tecnico = this.salvo.tecnico();
            String linha2 = tecnico == null || tecnico.isEmpty() ? this.salvo.nome : tecnico + "  ·  " + this.salvo.nome;
            g.drawString(DialogoCarregarJogoSalvo.cortar(g.getFontMetrics(), linha2, max), x, h / 2 + 15);
            g.dispose();
        }
    }

    /** Resumo da carreira escolhida (ou o aviso de que não há saves). */
    private static class Detalhe
    extends JComponent {
        Salvo salvo;
        boolean vazio;
        boolean carregando;

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            int h = this.getHeight();
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, w - 1, h - 1, 24.0, 24.0);
            g.setPaint(new java.awt.GradientPaint(0.0f, 0.0f, TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.1), 0.0f, h * 0.6f, TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.0)));
            g.fill(forma);
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
            g.draw(forma);
            if (this.vazio) {
                this.vazio(g, w, h);
            } else if (this.salvo != null) {
                this.resumo(g, w, h);
            }
            g.dispose();
        }

        private void vazio(Graphics2D g, int w, int h) {
            new TemaBetfoot.IconeVetor(Simbolo.TROFEU, 40, TemaBetfoot.TEXTO_FRACO).paintIcon(this, g, (w - 40) / 2, h / 2 - 70);
            g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(20.0f), 0.04f));
            FontMetrics fm = g.getFontMetrics();
            String t = "NENHUM JOGO SALVO";
            g.setColor(TemaBetfoot.TEXTO);
            g.drawString(t, (w - fm.stringWidth(t)) / 2, h / 2 + 4);
            g.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
            fm = g.getFontMetrics();
            g.setColor(TemaBetfoot.TEXTO_SUAVE);
            String[] linhas = new String[]{"Comece um Novo jogo na tela inicial.", "Para salvar a carreira, use Salvar jogo."};
            for (int i = 0; i < linhas.length; ++i) {
                g.drawString(linhas[i], (w - fm.stringWidth(linhas[i])) / 2, h / 2 + 30 + i * 20);
            }
        }

        private void resumo(Graphics2D g, int w, int h) {
            int pad = 22;
            int y = 26;
            // Escudo grande numa moldura.
            int lado = 84;
            int mx = (w - lado - 24) / 2;
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.06));
            g.fill(new RoundRectangle2D.Double(mx, y, lado + 24, lado + 24, 22, 22));
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.1));
            g.draw(new RoundRectangle2D.Double(mx + 0.5, y + 0.5, lado + 23, lado + 23, 22, 22));
            DialogoCarregarJogoSalvo.desenharEscudo(g, this.salvo.time(), mx + 12, y + 12, lado);
            y += lado + 24 + 34;
            g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(24.0f), 0.02f));
            FontMetrics fm = g.getFontMetrics();
            String time = DialogoCarregarJogoSalvo.cortar(fm, this.salvo.time().toUpperCase(), w - pad * 2);
            g.setColor(TemaBetfoot.TEXTO);
            g.drawString(time, (w - fm.stringWidth(time)) / 2, y);
            String tecnico = this.salvo.tecnico();
            if (tecnico != null && !tecnico.isEmpty()) {
                y += 22;
                g.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
                fm = g.getFontMetrics();
                String t = DialogoCarregarJogoSalvo.cortar(fm, "Técnico: " + tecnico, w - pad * 2);
                g.setColor(TemaBetfoot.TEXTO_SUAVE);
                g.drawString(t, (w - fm.stringWidth(t)) / 2, y);
            }
            y += 24;
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
            g.drawLine(pad, y, w - pad, y);
            y += 26;
            // Próximo jogo.
            String[] prox = DialogoCarregarJogoSalvo.proximo(this.salvo.info == null ? null : this.salvo.info.getI());
            y = this.campo(g, pad, y, w, "Próximo jogo", prox == null ? "—" : prox[1], prox == null ? null : prox[0]);
            if (prox != null && prox[2] != null) {
                g.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
                g.setColor(TemaBetfoot.TEXTO_SUAVE);
                g.drawString(DialogoCarregarJogoSalvo.cortar(g.getFontMetrics(), prox[2], w - pad * 2), pad, y - 2);
                y += 30;
            }
            // Temporada e data do save lado a lado.
            int meio = w / 2;
            String temporada = this.salvo.temporada();
            this.campo(g, pad, y, meio, "Temporada", temporada == null ? "—" : temporada, null);
            this.campo(g, meio, y, w, "Salvo", DialogoCarregarJogoSalvo.quando(this.salvo.data), null);
            if (this.carregando) {
                g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(14.0f), 0.08f));
                fm = g.getFontMetrics();
                String t = "CARREGANDO A CARREIRA…";
                g.setColor(TemaBetfoot.VERDE);
                g.drawString(t, (w - fm.stringWidth(t)) / 2, h - 20);
            }
        }

        /** Rótulo pequeno em caixa alta e valor embaixo; "selo" opcional (EM CASA / FORA) ao lado do rótulo. */
        private int campo(Graphics2D g, int x, int y, int fim, String rotulo, String valor, String selo) {
            g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(13.0f), 0.08f));
            FontMetrics fr = g.getFontMetrics();
            g.setColor(TemaBetfoot.TEXTO_FRACO);
            g.drawString(rotulo.toUpperCase(), x, y);
            if (selo != null) {
                int sx = x + fr.stringWidth(rotulo.toUpperCase()) + 10;
                int sw = fr.stringWidth(selo) + 14;
                boolean casa = selo.startsWith("EM");
                Color cor = casa ? TemaBetfoot.VERDE : TemaBetfoot.TEXTO_SUAVE;
                g.setColor(TemaBetfoot.alfa(cor, 0.14));
                g.fill(new RoundRectangle2D.Double(sx, y - fr.getAscent() - 2, sw, fr.getAscent() + 6, 10, 10));
                g.setColor(cor);
                g.drawString(selo, sx + 7, y);
            }
            g.setFont(TemaBetfoot.fonte(Font.BOLD, 15.0f));
            g.setColor(TemaBetfoot.TEXTO);
            g.drawString(DialogoCarregarJogoSalvo.cortar(g.getFontMetrics(), valor, fim - x - 22), x, y + 22);
            return y + 46;
        }
    }
}
