package telas;

import telas.RenderizadorPaisLista;
import telas.RenderizadorItemTime;
import telas.ListenerAdicionarTecnicoHumano;
import telas.OuvinteTimeAleatorioNovoJogo;
import telas.ListenerSelecionarDivisao0;
import telas.ListenerSelecionarDivisao1;
import telas.ListenerSelecionarDivisao2;
import telas.ListenerSelecionarDivisao3;
import telas.OuvinteIniciarJogoNovoJogo;
import telas.OuvinteAdicionarOutroTecnicoNovoJogo;
import nucleo.LigaNacional;
import nucleo.EnumPaises;
import nucleo.ItemSelecaoPais;
import nucleo.DadosPais;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.UtilitariosTexto;
import nucleo.IniciadorCarreira;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import comparadores.ColecaoComparadoresSorteio;
import components.TemaBetfoot;
import components.TemaBetfoot.Estilo;
import components.TemaBetfoot.Simbolo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Collections;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelConfiguracaoNovoJogo
extends JPanel {
    private JFrame Br;
    private LigaNacional Bs;
    private ModeloTime zu;
    private ModeloTime Bt;
    private JComboBox[] Bu = null;
    private JLabel[] Bv = null;
    private static int count = 1;
    private JButton Bw;
    private JButton Bx;
    private JCheckBox By;
    private JComboBox Bz;
    private JComboBox BA;
    private JComboBox BB;
    private JComboBox BC;
    private JComboBox BD;
    private JComboBox ue;
    private JTextField uf;
    private JLabel ug;
    private JLabel BH;
    private JLabel BI;
    private JLabel BJ;
    private JLabel BK;
    private JLabel vf;
    private JLabel BN;
    private int divisao = 0;
    private final Previa previa = new Previa();
    private final Adicionados adicionados = new Adicionados();

    public PainelConfiguracaoNovoJogo(JFrame jFrame) {
        this.Br = jFrame;
        this.mJ();
        JComboBox[] jComboBoxArray = new JComboBox[]{this.Bz, this.BA, this.BB, this.BC};
        this.Bu = jComboBoxArray;
        JLabel[] jLabelArray = new JLabel[]{this.BH, this.BI, this.BJ, this.BK};
        this.Bv = jLabelArray;
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.N().size()) {
            this.ue.addItem(((LigaNacional)GerenciadorJogo.SR.N().get(n2)).jp());
            ++n2;
        }
        RenderizadorPaisLista aJ2 = new RenderizadorPaisLista();
        aJ2.setPreferredSize(new Dimension(10, 25));
        this.ue.setRenderer(aJ2);
        this.ue.setMaximumRowCount(12);
        this.Bs = (LigaNacional)GerenciadorJogo.SR.N().get(0);
        int n3 = 0;
        while (n3 < EnumPaises.jz()) {
            this.BD.addItem(((DadosPais)UtilitariosTexto.cY().get(n3)).getNome());
            ++n3;
        }
        RenderizadorPaisLista aJ3 = new RenderizadorPaisLista();
        aJ3.setPreferredSize(new Dimension(10, 25));
        this.BD.setRenderer(aJ3);
        this.BD.setMaximumRowCount(12);
        this.BD.setSelectedIndex(UtilitariosTexto.G(29));
        this.ue.addActionListener(new ListenerAdicionarTecnicoHumano(this));
        int n4 = 0;
        while (n4 < this.Bu.length) {
            RenderizadorItemTime ak_02 = new RenderizadorItemTime();
            ak_02.setPreferredSize(new Dimension(10, 25));
            this.Bu[n4].setRenderer(ak_02);
            this.Bu[n4].setMaximumRowCount(24);
            ++n4;
        }
        this.ot();
        this.By.addActionListener(new OuvinteTimeAleatorioNovoJogo(this));
        this.Bu[0].addActionListener(new ListenerSelecionarDivisao0(this));
        this.Bu[1].addActionListener(new ListenerSelecionarDivisao1(this));
        this.Bu[2].addActionListener(new ListenerSelecionarDivisao2(this));
        this.Bu[3].addActionListener(new ListenerSelecionarDivisao3(this));
        this.Bw.addActionListener(new OuvinteIniciarJogoNovoJogo(this));
        this.Bx.addActionListener(new OuvinteAdicionarOutroTecnicoNovoJogo(this));
        this.ug.setText("");
        this.tema();
    }

    private void ol() {
        if (this.By.isSelected()) {
            this.BN.setText("Aleat\u00f3rio");
            this.BN.setIcon(null);
            this.previa.repaint();
            this.Bt = null;
            int n2 = 0;
            if (this.Bu[0].getItemCount() > 0) {
                n2 = 1;
            }
            if (this.Bu[1].getItemCount() > 0) {
                n2 = 2;
            }
            if (this.Bu[2].getItemCount() > 0) {
                n2 = 3;
            }
            if (this.Bu[3].getItemCount() > 0) {
                n2 = 4;
            }
            int n3 = new Random().nextInt(n2);
            int n4 = new Random().nextInt(this.Bu[n3].getItemCount());
            this.Bt = (ModeloTime)this.Bu[n3].getItemAt(n4);
        } else {
            this.ou();
        }
    }

    private void om() {
        String string = this.oo();
        if (string == null) {
            this.or();
            ModeloTime time = this.By.isSelected() && this.Bt != null ? this.Bt : this.zu;
            this.adicionados.adicionar(count, this.uf.getText().trim(), time, UtilitariosTexto.H(this.BD.getSelectedIndex()));
            this.vf.setText("T\u00c9CNICO " + Integer.toString(++count));
            this.uf.setText("");
            this.ot();
        } else {
            TemaBetfoot.aviso(this, "Falta pouco", string);
        }
    }

    public void on() {
        this.uf.requestFocusInWindow();
    }

    public String oo() {
        String string = null;
        if (this.uf.getText().toString().isEmpty()) {
            string = "Digite um nome para o t\u00e9cnico";
        } else if (this.uf.getText().toString().length() < 2) {
            string = "Nome do t\u00e9cnico muito curto";
        } else if (this.uf.getText().toString().length() > 35) {
            string = "Nome do t\u00e9cnico muito longo";
        } else if (this.zu == null) {
            string = "Selecione um time";
        }
        return string;
    }

    public void pl() {
        int n2 = -1;
        JLabel texto = new JLabel("<html><div style='width:360px'>Antes da temporada, d\u00e1 para montar um torneio amistoso com os times que voc\u00ea escolher.</div></html>");
        texto.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        texto.setForeground(TemaBetfoot.TEXTO_SUAVE);
        n2 = TemaBetfoot.escolher(this, "Torneio amistoso", null, texto, new String[]{"Agora n\u00e3o", "Criar torneio"}, 1);
        if (n2 == 1) {
            GerenciadorTelas.aY(10);
        } else {
            this.AB();
        }
    }

    public void AB() {
        this.Bw.setCursor(new Cursor(3));
        GerenciadorJogo.SR.az();
        GerenciadorJogo.SR.V();
    }

    public void oq() {
        String string = this.oo();
        GerenciadorJogo.SR.i(true);
        if (count >= 100000) {
            if (string == null) {
                this.or();
            }
            if (GerenciadorJogo.SR.isJogaRegionais()) {
                IniciadorCarreira.dh();
            }
            this.pl();
        } else if (string == null) {
            this.or();
            this.Bw.setCursor(new Cursor(3));
            if (GerenciadorJogo.SR.isJogaRegionais()) {
                IniciadorCarreira.dh();
            }
            this.pl();
        } else {
            TemaBetfoot.aviso(this, "Falta pouco", string);
        }
    }

    public void or() {
        if (!this.By.isSelected() || this.Bt == null) {
            this.zu.b(this.uf.getText().toString(), UtilitariosTexto.H(this.BD.getSelectedIndex()));
        } else {
            this.Bt.b(this.uf.getText().toString(), UtilitariosTexto.H(this.BD.getSelectedIndex()));
        }
    }

    public void os() {
        this.Bs = (LigaNacional)GerenciadorJogo.SR.N().get(this.ue.getSelectedIndex());
        this.ot();
    }

    public void cW(int n2) {
        this.zu = (ModeloTime)this.Bu[n2].getSelectedItem();
        this.ou();
        this.Bu[n2].setEnabled(true);
        this.marcarDivisao(n2);
        this.on();
    }

    private void ot() {
        this.zu = null;
        int n2 = 0;
        while (n2 < this.Bv.length) {
            this.Bv[n2].setVisible(false);
            this.Bu[n2].setVisible(false);
            this.Bu[n2].removeAllItems();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.Bs.eb().size()) {
            this.cX(n2);
            ++n2;
        }
        if (this.Bu[0].getItemCount() > 0) {
            this.cW(0);
        } else if (this.Bu[1].getItemCount() > 0) {
            this.cW(1);
        } else if (this.Bu[2].getItemCount() > 0) {
            this.cW(2);
        } else if (this.Bu[3].getItemCount() > 0) {
            this.cW(3);
        }
        if (this.zu == null) {
            this.BN.setText("");
            this.BN.setIcon(null);
        }
        this.previa.repaint();
        this.on();
    }

    public void ou() {
        this.By.setSelected(false);
        if (this.zu != null) {
            this.BN.setText(this.zu.getNome());
            this.BN.setIcon(this.zu.x(25, 25));
        }
        this.previa.repaint();
    }

    private void cX(int n2) {
        this.Bv[n2].setVisible(true);
        this.Bu[n2].setVisible(true);
        this.Bu[n2].setEnabled(true);
        Collections.sort(((CompeticaoLigaNacional)this.Bs.eb().get(n2)).yi().yK(), ColecaoComparadoresSorteio.VS);
        int n3 = 0;
        boolean bl = true;
        if (n2 == 3 && this.Bs.jc() == 29 && GerenciadorJogo.SR.isJogaEstadual() && GerenciadorJogo.SR.bk()) {
            bl = false;
        }
        if (bl) {
            int n4 = 0;
            while (n4 < ((CompeticaoLigaNacional)this.Bs.eb().get(n2)).yi().yK().size()) {
                if (!((ModeloTime)((CompeticaoLigaNacional)this.Bs.eb().get(n2)).yi().yK().get(n4)).jZ().booleanValue()) {
                    this.Bu[n2].addItem(((CompeticaoLigaNacional)this.Bs.eb().get(n2)).yi().yK().get(n4));
                    ++n3;
                }
                ++n4;
            }
            if (n2 == 3) {
                this.Bv[3].setText("4\u00aa divis\u00e3o");
            }
        } else {
            this.Bv[3].setText("S\u00f3 estaduais");
            this.Bv[3].setToolTipText("Clubes fora das quatro divis\u00f5es que jogam s\u00f3 o estadual");
            Collections.sort(this.Bs.jg(), ColecaoComparadoresSorteio.VS);
            int n5 = 0;
            while (n5 < this.Bs.jg().size()) {
                if (!((ModeloTime)this.Bs.jg().get(n5)).jZ().booleanValue() && ((ModeloTime)this.Bs.jg().get(n5)).getDivisao() == 0 && ((ModeloTime)this.Bs.jg().get(n5)).kg()) {
                    this.Bu[n2].addItem(this.Bs.jg().get(n5));
                    ++n3;
                }
                ++n5;
            }
        }
        if (n3 == 0) {
            this.Bv[n2].setVisible(false);
            this.Bu[n2].setVisible(false);
        }
    }

    /** Ocupa a janela toda (com o fundo do estádio); em janelas pequenas a rolagem do jogo assume. */
    @Override
    public Dimension getPreferredSize() {
        return TemaBetfoot.Tela.tamanho(this, 1100, 680);
    }

    /**
     * Volta para as competições. Passar para esta tela já montou o calendário, então recomeça o novo jogo do zero
     * (como a tela inicial faz) e devolve as escolhas da tela anterior: ligas marcadas e as configurações de ligas
     * e estaduais. As demais opções (estaduais, regionais, salários…) já ficam gravadas nas preferências.
     */
    private void voltar() {
        if (count > 1 && !TemaBetfoot.confirmar(this, "Voltar \u00e0s competi\u00e7\u00f5es?", "Os t\u00e9cnicos j\u00e1 adicionados ser\u00e3o descartados.", "Voltar", true)) {
            return;
        }
        java.util.Set<Integer> ligas = new java.util.HashSet<Integer>();
        for (Object object : GerenciadorJogo.SR.bF) {
            if (((ItemSelecaoPais)object).iC()) {
                ligas.add(((ItemSelecaoPais)object).getPais());
            }
        }
        int[] estaduais = GerenciadorJogo.SR.bE;
        java.util.ArrayList configLigas = GerenciadorJogo.SR.bG;
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        new GerenciadorJogo();
        IniciadorCarreira.dd();
        for (Object object : GerenciadorJogo.SR.bF) {
            ((ItemSelecaoPais)object).v(ligas.contains(((ItemSelecaoPais)object).getPais()));
        }
        if (estaduais != null && estaduais.length == GerenciadorJogo.SR.bE.length) {
            GerenciadorJogo.SR.bE = estaduais;
        }
        if (configLigas != null) {
            GerenciadorJogo.SR.bG = configLigas;
        }
        count = 1;
        GerenciadorTelas.aY(0);
    }

    /** Combos no tema; chamado depois que o construtor põe os renderizadores de país e de time. */
    private void tema() {
        TemaBetfoot.combo(this.ue);
        TemaBetfoot.combo(this.BD);
        for (JComboBox jComboBox : this.Bu) {
            TemaBetfoot.combo(jComboBox);
        }
    }

    /** Divisão escolhida em destaque (verde), as outras apagadas. */
    private void marcarDivisao(int n) {
        this.divisao = n;
        for (int i = 0; i < this.Bv.length; ++i) {
            this.Bv[i].setForeground(i == n ? TemaBetfoot.VERDE : TemaBetfoot.TEXTO_SUAVE);
        }
        this.previa.repaint();
    }

    private static JPanel campo(String rotulo, Component component) {
        JPanel jPanel = new JPanel(new BorderLayout(0, 8));
        jPanel.setOpaque(false);
        jPanel.add((Component)TemaBetfoot.rotulo(rotulo), "North");
        jPanel.add(component, "Center");
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, jPanel.getPreferredSize().height));
        return jPanel;
    }

    /** Linha de uma divisão: nome à esquerda, combo dos times à direita. */
    private static JPanel linhaDivisao(JLabel jLabel, JComboBox jComboBox) {
        final JPanel jPanel = new JPanel(new BorderLayout(14, 0));
        jPanel.setOpaque(false);
        jLabel.setFont(TemaBetfoot.espacada(TemaBetfoot.display(16.0f), 0.04f));
        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel.setPreferredSize(new Dimension(150, 40));
        jPanel.add((Component)jLabel, "West");
        jComboBox.setPreferredSize(new Dimension(240, 42));
        jPanel.add((Component)jComboBox, "Center");
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 42));
        // A linha some junto com o combo (divisão sem times).
        jComboBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent componentEvent) {
                jPanel.setVisible(true);
            }

            @Override
            public void componentHidden(java.awt.event.ComponentEvent componentEvent) {
                jPanel.setVisible(false);
            }
        });
        return jPanel;
    }

    /**
     * Faixa com os técnicos já adicionados (aparece depois do primeiro "Adicionar outro técnico"): número, escudo,
     * nome do técnico com a bandeira e o time de cada um.
     */
    private static class Adicionados
    extends JPanel {
        Adicionados() {
            super(new BorderLayout(0, 10));
            this.setOpaque(false);
            this.setVisible(false);
        }

        private final JPanel fila = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        void adicionar(int numero, String nome, ModeloTime time, int pais) {
            if (this.getComponentCount() == 0) {
                this.fila.setOpaque(false);
                this.add((Component)TemaBetfoot.rotulo("T\u00e9cnicos na carreira"), "North");
                this.add((Component)this.fila, "Center");
            }
            if (this.fila.getComponentCount() > 0) {
                this.fila.add(javax.swing.Box.createHorizontalStrut(12));
            }
            this.fila.add(new Ficha(numero, nome, time, pais));
            this.setVisible(true);
            this.revalidate();
            this.repaint();
        }
    }

    /** Uma ficha da faixa de técnicos adicionados. */
    private static class Ficha
    extends JComponent {
        private final int numero;
        private final String nome;
        private final String time;
        private final javax.swing.Icon escudo;
        private final javax.swing.Icon bandeira;

        Ficha(int n, String string, ModeloTime modeloTime, int pais) {
            this.numero = n;
            this.nome = string;
            this.time = modeloTime == null ? "Time aleat\u00f3rio" : modeloTime.getNome();
            this.escudo = modeloTime == null ? null : modeloTime.x(34, 34);
            this.bandeira = TemaBetfoot.bandeira(pais, 11);
            FontMetrics fn = this.getFontMetrics(TemaBetfoot.fonte(Font.BOLD, 15.0f));
            FontMetrics ft = this.getFontMetrics(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
            int texto = Math.max(fn.stringWidth(this.nome) + this.bandeira.getIconWidth() + 8, ft.stringWidth(this.time));
            this.setPreferredSize(new Dimension(Math.min(360, 32 + 34 + 12 + texto + 20 + 18), 58));
            this.setToolTipText("T\u00e9cnico " + n + ": " + string + " \u00b7 " + this.time);
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            int h = this.getHeight();
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, w - 1, h - 1, 18.0, 18.0);
            g.setColor(TemaBetfoot.CARTAO);
            g.fill(forma);
            g.setColor(TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.35));
            g.draw(forma);
            // Número do técnico num círculo verde.
            g.setColor(TemaBetfoot.VERDE_BOTAO);
            g.fill(new Ellipse2D.Double(14, (h - 24) / 2.0, 24, 24));
            g.setFont(TemaBetfoot.display(15.0f));
            FontMetrics fm = g.getFontMetrics();
            String n = Integer.toString(this.numero);
            g.setColor(Color.WHITE);
            g.drawString(n, 14 + (24 - fm.stringWidth(n)) / 2, h / 2 + (fm.getAscent() - fm.getDescent()) / 2);
            int x = 48;
            if (this.escudo != null) {
                this.escudo.paintIcon(this, g, x, (h - 34) / 2);
            }
            x += 34 + 12;
            int max = w - x - 16;
            g.setFont(TemaBetfoot.fonte(Font.BOLD, 15.0f));
            fm = g.getFontMetrics();
            String nome = this.nome;
            while (nome.length() > 1 && fm.stringWidth(nome) > max - this.bandeira.getIconWidth() - 8) {
                nome = nome.substring(0, nome.length() - 2) + "\u2026";
            }
            g.setColor(TemaBetfoot.TEXTO);
            g.drawString(nome, x, h / 2 - 4);
            this.bandeira.paintIcon(this, g, x + fm.stringWidth(nome) + 8, h / 2 - 4 - this.bandeira.getIconHeight());
            g.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
            fm = g.getFontMetrics();
            String time = this.time;
            while (time.length() > 1 && fm.stringWidth(time) > max) {
                time = time.substring(0, time.length() - 2) + "\u2026";
            }
            g.setColor(TemaBetfoot.TEXTO_SUAVE);
            g.drawString(time, x, h / 2 + 14);
            g.dispose();
        }
    }

    /** Cartão do clube escolhido: escudo grande, nome e divisão (ou o sorteio, no modo aleatório). */
    private class Previa
    extends JComponent {
        private ModeloTime time;
        private javax.swing.Icon escudo;

        Previa() {
            this.setPreferredSize(new Dimension(300, 230));
        }

        @Override
        protected void paintComponent(Graphics graphics) {
            Graphics2D g = TemaBetfoot.suave(graphics);
            int w = this.getWidth();
            int h = this.getHeight();
            RoundRectangle2D.Double forma = new RoundRectangle2D.Double(0.5, 0.5, w - 1, h - 1, 22.0, 22.0);
            g.setPaint(new GradientPaint(0.0f, 0.0f, TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.12), 0.0f, h, TemaBetfoot.alfa(TemaBetfoot.VERDE, 0.0)));
            g.fill(forma);
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.08));
            g.draw(forma);
            boolean aleatorio = PainelConfiguracaoNovoJogo.this.By.isSelected();
            ModeloTime atual = aleatorio ? null : PainelConfiguracaoNovoJogo.this.zu;
            if (atual != this.time) {
                this.time = atual;
                this.escudo = atual == null ? null : atual.x(112, 112);
            }
            int lado = 112;
            int y = 22;
            if (this.escudo != null) {
                this.escudo.paintIcon(this, g, (w - lado) / 2, y);
            } else {
                g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.06));
                g.fill(new Ellipse2D.Double((w - lado) / 2.0, y, lado, lado));
                g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.14));
                g.draw(new Ellipse2D.Double((w - lado) / 2.0 + 0.5, y + 0.5, lado - 1, lado - 1));
                g.setFont(TemaBetfoot.display(54.0f));
                FontMetrics fm = g.getFontMetrics();
                String s = aleatorio || atual == null ? "?" : atual.getNome().substring(0, 1).toUpperCase();
                g.setColor(TemaBetfoot.TEXTO_SUAVE);
                g.drawString(s, (w - fm.stringWidth(s)) / 2, y + (lado + fm.getAscent() - fm.getDescent()) / 2);
            }
            y += lado + 34;
            String nome = aleatorio ? "TIME ALEATÓRIO" : (atual == null ? "ESCOLHA UM TIME" : atual.getNome().toUpperCase());
            g.setFont(TemaBetfoot.espacada(TemaBetfoot.display(26.0f), 0.02f));
            FontMetrics fm = g.getFontMetrics();
            while (nome.length() > 1 && fm.stringWidth(nome) > w - 32) {
                nome = nome.substring(0, nome.length() - 2) + "…";
            }
            g.setColor(TemaBetfoot.TEXTO);
            g.drawString(nome, (w - fm.stringWidth(nome)) / 2, y);
            String apoio;
            if (aleatorio) {
                apoio = "Sorteado ao iniciar, entre as divisões do país";
            } else if (atual == null) {
                apoio = "";
            } else {
                String div = PainelConfiguracaoNovoJogo.this.Bv[PainelConfiguracaoNovoJogo.this.divisao].getText().replace(":", "").trim();
                apoio = String.valueOf(PainelConfiguracaoNovoJogo.this.ue.getSelectedItem() == null ? "" : ((DadosPais)UtilitariosTexto.cY().get(UtilitariosTexto.G(PainelConfiguracaoNovoJogo.this.Bs.jc()))).getNome()) + "  ·  " + div;
            }
            g.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
            fm = g.getFontMetrics();
            g.setColor(TemaBetfoot.TEXTO_SUAVE);
            g.drawString(apoio, (w - fm.stringWidth(apoio)) / 2, y + 24);
            g.dispose();
        }
    }

    private void mJ() {
        this.ue = new JComboBox();
        this.Bz = new JComboBox();
        this.BA = new JComboBox();
        this.BB = new JComboBox();
        this.BC = new JComboBox();
        this.BH = new JLabel("1ª divisão");
        this.BI = new JLabel("2ª divisão");
        this.BJ = new JLabel("3ª divisão");
        this.BK = new JLabel("4ª divisão");
        this.uf = new JTextField();
        this.BD = new JComboBox();
        this.Bw = new JButton();
        this.Bx = new JButton();
        this.ug = new JLabel();
        this.BN = new JLabel();
        this.By = new JCheckBox("Escolher um time aleatório");
        this.vf = new JLabel("TÉCNICO 1");
        this.setLayout(new BorderLayout());
        this.setOpaque(false);

        // ---- Clube ----
        TemaBetfoot.Cartao clube = new TemaBetfoot.Cartao(new BorderLayout(0, 18));
        clube.setBorder(BorderFactory.createEmptyBorder(22, 24, 22, 24));
        clube.add((Component)TemaBetfoot.cabecalho("Escolha o clube", "País da liga e o time que você vai treinar", null), "North");
        JPanel opcoesClube = new JPanel();
        opcoesClube.setOpaque(false);
        opcoesClube.setLayout(new javax.swing.BoxLayout(opcoesClube, 1));
        this.ue.setPreferredSize(new Dimension(240, 42));
        this.ue.setToolTipText("País da liga em que o técnico começa");
        opcoesClube.add(PainelConfiguracaoNovoJogo.campo("País", this.ue));
        opcoesClube.add(TemaBetfoot.divisor());
        opcoesClube.add(javax.swing.Box.createVerticalStrut(4));
        JLabel[] rotulos = new JLabel[]{this.BH, this.BI, this.BJ, this.BK};
        JComboBox[] combos = new JComboBox[]{this.Bz, this.BA, this.BB, this.BC};
        for (int i = 0; i < rotulos.length; ++i) {
            if (i > 0) {
                opcoesClube.add(javax.swing.Box.createVerticalStrut(10));
            }
            opcoesClube.add(PainelConfiguracaoNovoJogo.linhaDivisao(rotulos[i], combos[i]));
            combos[i].setToolTipText("Times da divisão (escolher aqui seleciona o time)");
        }
        opcoesClube.add(javax.swing.Box.createVerticalStrut(6));
        opcoesClube.add(TemaBetfoot.divisor());
        JPanel aleatorio = new JPanel(new BorderLayout(0, 2));
        aleatorio.setOpaque(false);
        aleatorio.add((Component)this.By, "North");
        JLabel dica = new JLabel("Sorteia um clube entre as divisões do país");
        dica.setFont(TemaBetfoot.fonte(Font.PLAIN, 12.0f));
        dica.setForeground(TemaBetfoot.TEXTO_FRACO);
        dica.setBorder(BorderFactory.createEmptyBorder(0, 26, 0, 0));
        dica.putClientProperty("tema.ok", Boolean.TRUE);
        aleatorio.add((Component)dica, "Center");
        TemaBetfoot.aplicarTema(aleatorio);
        this.By.addActionListener(actionEvent -> this.previa.repaint());
        aleatorio.setAlignmentX(0.0f);
        aleatorio.setMaximumSize(new Dimension(Integer.MAX_VALUE, aleatorio.getPreferredSize().height));
        opcoesClube.add(aleatorio);
        clube.add((Component)opcoesClube, "Center");

        // ---- Técnico ----
        TemaBetfoot.Cartao tecnico = new TemaBetfoot.Cartao(new BorderLayout(0, 18));
        tecnico.setBorder(BorderFactory.createEmptyBorder(22, 24, 22, 24));
        this.vf.setFont(TemaBetfoot.espacada(TemaBetfoot.display(14.0f), 0.06f));
        this.vf.setForeground(TemaBetfoot.VERDE);
        this.vf.setToolTipText("Com \"Adicionar outro técnico\", mais gente joga na mesma carreira");
        tecnico.add((Component)TemaBetfoot.cabecalho("Seu técnico", "Quem comanda o time", this.vf), "North");
        JPanel opcoesTecnico = new JPanel();
        opcoesTecnico.setOpaque(false);
        opcoesTecnico.setLayout(new javax.swing.BoxLayout(opcoesTecnico, 1));
        this.previa.setAlignmentX(0.0f);
        this.previa.setMaximumSize(new Dimension(Integer.MAX_VALUE, 230));
        opcoesTecnico.add(this.previa);
        opcoesTecnico.add(javax.swing.Box.createVerticalStrut(20));
        JPanel caixaNome = new JPanel(new BorderLayout());
        caixaNome.setOpaque(false);
        caixaNome.add((Component)this.uf, "Center");
        TemaBetfoot.aplicarTema(caixaNome);
        this.uf.setFont(TemaBetfoot.fonte(Font.PLAIN, 15.0f));
        this.uf.setToolTipText("De 2 a 35 letras");
        opcoesTecnico.add(PainelConfiguracaoNovoJogo.campo("Nome do técnico", caixaNome));
        opcoesTecnico.add(javax.swing.Box.createVerticalStrut(16));
        this.BD.setPreferredSize(new Dimension(240, 42));
        opcoesTecnico.add(PainelConfiguracaoNovoJogo.campo("Nacionalidade", this.BD));
        tecnico.add((Component)opcoesTecnico, "Center");

        JPanel colunas = new JPanel(new java.awt.GridLayout(1, 2, 20, 0));
        colunas.setOpaque(false);
        colunas.add(clube);
        colunas.add(tecnico);

        // ---- Rodapé ----
        TemaBetfoot.botao(this.Bx, Estilo.SECUNDARIO, "Adicionar outro técnico", Simbolo.JOGADOR_MAIS);
        this.Bx.setToolTipText("Salva este técnico e cadastra mais um para jogar junto");
        TemaBetfoot.botao(this.Bw, Estilo.PRIMARIO, "Iniciar jogo", null);
        this.Bw.setIcon(new TemaBetfoot.IconeVetor(Simbolo.APITO, 16, Color.WHITE));
        this.Bw.setToolTipText("Começar a carreira (Enter)");
        this.ug.setFont(TemaBetfoot.fonte(Font.BOLD, 13.0f));
        this.ug.setForeground(TemaBetfoot.VERMELHO);
        JPanel direita = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 12, 0));
        direita.setOpaque(false);
        direita.add(this.ug);
        direita.add(this.Bx);
        direita.add(this.Bw);
        JPanel rodape = new JPanel(new BorderLayout(16, 0));
        rodape.setOpaque(false);
        rodape.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, TemaBetfoot.alfa(Color.WHITE, 0.08)), BorderFactory.createEmptyBorder(16, 0, 0, 0)));
        rodape.add((Component)direita, "East");
        JButton voltar = TemaBetfoot.botao(new JButton(), Estilo.FANTASMA, "Voltar", Simbolo.VOLTAR);
        voltar.setToolTipText("Voltar \u00e0s competi\u00e7\u00f5es (as escolhas ficam guardadas)");
        voltar.addActionListener(actionEvent -> this.voltar());
        rodape.add((Component)voltar, "West");

        JPanel corpo = new JPanel(new BorderLayout(0, 18));
        corpo.setOpaque(false);
        corpo.add((Component)this.adicionados, "North");
        corpo.add((Component)colunas, "Center");
        corpo.add((Component)rodape, "South");

        JPanel topo = new JPanel(new BorderLayout(24, 0));
        topo.setOpaque(false);
        topo.add((Component)new TemaBetfoot.Marca("Novo jogo", "Escolha o clube e crie o seu técnico"), "West");
        JPanel passos = new JPanel(new java.awt.GridBagLayout());
        passos.setOpaque(false);
        passos.add(new TemaBetfoot.Passos(1, "Competições", "Técnico e time"));
        topo.add((Component)passos, "East");

        TemaBetfoot.Fundo fundo = new TemaBetfoot.Fundo(new BorderLayout(0, 22));
        fundo.setBorder(BorderFactory.createEmptyBorder(20, 28, 24, 28));
        fundo.add((Component)topo, "North");
        // Cartões no tamanho do conteúdo, centralizados na vertical.
        JPanel meio = new JPanel(new java.awt.GridBagLayout());
        meio.setOpaque(false);
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.fill = java.awt.GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        meio.add((Component)corpo, c);
        fundo.add((Component)TemaBetfoot.centralizar(meio, 1160), "Center");
        this.add((Component)fundo, "Center");

        // Enter no nome inicia o jogo.
        this.uf.addActionListener(actionEvent -> this.Bw.doClick());
    }

    static /* synthetic */ void a(PainelConfiguracaoNovoJogo bv_02) {
        bv_02.ol();
    }

    static /* synthetic */ void b(PainelConfiguracaoNovoJogo bv_02) {
        bv_02.om();
    }
}

