package telas;

import telas.TelaEscalacaoPadrao;
import telas.ListenerFecharOpcoes;
import telas.ListenerSelecionarCorPlacar;
import telas.ListenerSelecionarTemaCor0;
import telas.ListenerSelecionarTemaCor1;
import telas.ListenerSelecionarTemaCor2;
import telas.ListenerSelecionarTemaCor3;
import telas.ListenerSelecionarTemaCor4;
import telas.ListenerVerLeiloesJogadores;
import telas.ListenerRenovacaoAutomaticaContrato;
import telas.ListenerUsarCorPlacar;
import telas.ListenerSonsEventos;
import telas.ListenerAbrirSeletorCores;
import telas.ListenerOpcaoNegritoCasa;
import telas.ListenerOpcaoUsaCoresLista;
import telas.ListenerOpcaoVerEstaduaisAgrupados;
import telas.ListenerOpcaoIgnoraLigas;
import telas.ListenerOpcaoRegionaisSemHumanos;
import telas.ListenerMoverCompeticaoEsquerda;
import telas.ListenerMoverCompeticaoDireita;
import telas.ListenerCliqueTabelaLigas;
import telas.ListenerMudancaComboOpcoes;
import telas.ListenerEscolhaCorPlacar0;
import telas.ListenerEscolhaCorPlacar1;
import telas.ListenerIgnorarEstadual;
import tabelas.ModeloTabelaPaises;
import tabelas.ModeloTabelaCompeticoesVisiveis;
import tabelas.RendererCompeticaoVisivel;
import tabelas.RenderizadorTabelaSelecaoPaises;
import nucleo.LigaNacional;
import nucleo.ConstantesJogo;
import motor.GerenciadorJogo;
import components.OpcaoTipoCompeticao;
import components.TemaBetfoot;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DialogoOpcoes
extends JPanel {
    private JDialog ub;
    private JTable IG = null;
    private String[] IH = new String[]{"Resultados", "Partidas"};
    private String[][] II = new String[][]{{"N\u00e3o usar auto-save", "A cada 3 jogos", "A cada jogo", "In\u00edcio do ano"}, {"Lento", "Normal", "R\u00e1pido", "Bem r\u00e1pido", "Super r\u00e1pido", "Ultra r\u00e1pido"}, {"Lento", "Normal", "R\u00e1pido", "Bem r\u00e1pido", "Super r\u00e1pido", "Ultra r\u00e1pido"}, {"N\u00e3o", "Sim"}, {"N\u00e3o", "Sim"}, {"N\u00e3o", "Sim"}, {"N\u00e3o", "Ap\u00f3s t\u00e9rmino", "Faltando 1 m\u00eas"}};
    private int IJ = 4;
    private int IK = 4;
    private ArrayList afm = new ArrayList();
    private ArrayList afn = new ArrayList();
    private JButton yV;
    private JButton IM;
    private JButton vm;
    private JButton yZ;
    private JCheckBox IN;
    private JCheckBox IO;
    private JCheckBox IP;
    private JCheckBox IQ;
    private JCheckBox IR;
    private JCheckBox IS;
    private JCheckBox IL;
    private JCheckBox IT;
    private JCheckBox IU;
    private JCheckBox IV;
    private JComboBox IW;
    private JComboBox Ji;
    private JComboBox Jk;
    private JComboBox Jm;
    private JComboBox Jo;
    private JComboBox Jp;
    private JComboBox Jq;
    private JLabel Jr;
    private JLabel Js;
    private JLabel Jt;
    private JLabel Ju;
    private JLabel Jv;
    private JLabel ug;
    private JLabel Bj;
    private JLabel vw;
    private JLabel Ef;
    private JLabel Eg;
    private JLabel Eh;
    private JLabel JD;
    private JLabel a_;
    private JLabel afo;
    private JLabel afp;
    private JLabel ur;
    private JLabel us;
    private JLabel vx;
    private JLabel vy;
    private JLabel vz;
    private JLabel vA;
    private JPanel vd;
    private JPanel we;
    private JScrollPane ut;
    private JScrollPane wi;
    private JScrollPane zf;
    private JTable JG;
    private JTable afq;
    private JTable afr;

    public DialogoOpcoes(JDialog jDialog, JTable jTable) {
        this.ub = jDialog;
        this.IG = jTable;
        this.IJ = 5;
        this.IK = 5;
        this.mJ();
        this.mK();
        this.nc();
        this.AO();
        this.b(this.afq, this.afm);
        this.b(this.afr, this.afn);
        this.mH();
        this.mG();
        this.temaTabelas();
    }

    private void AO() {
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.getVerJint().length) {
            if (GerenciadorJogo.SR.getVerJint()[n2]) {
                this.afm.add(this.fy(n2));
            } else {
                this.afn.add(this.fy(n2));
            }
            ++n2;
        }
    }

    private void fx(int n2) {
        OpcaoTipoCompeticao ae_02 = null;
        if (n2 == 0) {
            if (this.afq.getSelectedRowCount() > 0) {
                int n3 = this.afq.convertRowIndexToModel(this.afq.getSelectedRow());
                ae_02 = (OpcaoTipoCompeticao)this.afm.get(n3);
            }
        } else if (this.afr.getSelectedRowCount() > 0) {
            int n4 = this.afr.convertRowIndexToModel(this.afr.getSelectedRow());
            ae_02 = (OpcaoTipoCompeticao)this.afn.get(n4);
        }
        if (ae_02 != null && n2 == 0) {
            this.afm.remove(ae_02);
            this.afn.add(ae_02);
            GerenciadorJogo.vM().setVerJint(false, ae_02.getIndex());
        } else if (ae_02 != null) {
            this.afm.add(ae_02);
            this.afn.remove(ae_02);
            GerenciadorJogo.vM().setVerJint(true, ae_02.getIndex());
        }
        // Avisa as tabelas que as linhas mudaram (addNotify não avisa e deixava linhas "fantasmas" na tela)
        // e deixa selecionado o item que acabou de mudar de lado.
        for (JTable jTable : new JTable[]{this.afq, this.afr}) {
            ((javax.swing.table.AbstractTableModel)jTable.getModel()).fireTableDataChanged();
            jTable.clearSelection();
            jTable.revalidate();
            jTable.repaint();
        }
        if (ae_02 != null) {
            JTable destino = n2 == 0 ? this.afr : this.afq;
            int linha = (n2 == 0 ? this.afn : this.afm).indexOf(ae_02);
            if (linha >= 0) {
                destino.setRowSelectionInterval(linha, linha);
                destino.scrollRectToVisible(destino.getCellRect(linha, 0, true));
            }
        }
        GerenciadorJogo.vJ();
    }

    public OpcaoTipoCompeticao fy(int n2) {
        int n3 = 0;
        int n4 = -1;
        String string = "";
        if (n2 == 11) {
            n3 = 7;
            n4 = 7;
            string = "Copa do Mundo";
        } else if (n2 == 16) {
            n3 = 7;
            n4 = -1;
            string = "Copa de Sele\u00e7\u00f5es";
        } else if (n2 == 17) {
            n3 = 9;
            string = "Eliminat\u00f3rias";
        } else if (n2 == 18) {
            n3 = 14;
            string = "Liga de Na\u00e7\u00f5es";
        } else if (n2 == 20) {
            n3 = 13;
            string = "Final\u00edssima";
        } else if (n2 == 0) {
            n3 = 4;
            n4 = 0;
            string = "Liga Camp. Europa";
        } else if (n2 == 1) {
            n3 = 4;
            n4 = 1;
            string = "Libertadores";
        } else if (n2 == 2) {
            n3 = 4;
            n4 = 2;
            string = "Liga Camp. \u00c1frica";
        } else if (n2 == 3) {
            n3 = 4;
            n4 = 3;
            string = "Liga Camp. \u00c1sia";
        } else if (n2 == 4) {
            n3 = 4;
            n4 = 4;
            string = "Liga Camp. Concacaf";
        } else if (n2 == 5) {
            n3 = 4;
            n4 = 5;
            string = "Liga Camp. Oceania";
        } else if (n2 == 6) {
            n3 = 6;
            n4 = 0;
            string = "Liga Europa";
        } else if (n2 == 7) {
            n3 = 6;
            n4 = 1;
            string = "Copa Sul-Americana";
        } else if (n2 == 14) {
            n3 = 12;
            n4 = 0;
            string = "Conference League";
        } else if (n2 == 19) {
            n3 = 5;
            string = "Mundial clubes";
        } else if (n2 == 12) {
            n3 = 8;
            string = "Recopa";
        } else if (n2 == 8) {
            n3 = 2;
            string = "Copa Nacional";
        } else if (n2 == 9) {
            n3 = 3;
            string = "Estadual";
        } else if (n2 == 10) {
            n3 = 10;
            string = "Regional";
        } else if (n2 == 13) {
            n3 = 11;
            string = "Super Copa";
        } else if (n2 == 15) {
            n3 = 15;
            string = "Torneio amistoso";
        }
        return new OpcaoTipoCompeticao(n3, n4, string, n2);
    }

    public void mH() {
        this.vm.addActionListener(new ListenerFecharOpcoes(this));
        this.IM.addActionListener(new ListenerAbrirSeletorCores(this));
        this.IS.addActionListener(new ListenerOpcaoRegionaisSemHumanos(this));
        this.yV.addActionListener(new ListenerMoverCompeticaoEsquerda(this));
        this.yZ.addActionListener(new ListenerMoverCompeticaoDireita(this));
    }

    private void rG() {
        if (this.IS.isSelected()) {
            GerenciadorJogo.vM().setRegionaisSemHumanos(0);
        } else {
            GerenciadorJogo.vM().setRegionaisSemHumanos(1);
        }
    }

    private void b(JTable jTable, ArrayList arrayList) {
        ModeloTabelaCompeticoesVisiveis aU2 = new ModeloTabelaCompeticoesVisiveis(arrayList);
        jTable.setModel(aU2);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(0).setMaxWidth(200);
        jTable.setAutoResizeMode(3);
        jTable.setRowHeight(20);
        jTable.setShowGrid(false);
        jTable.setDefaultRenderer(OpcaoTipoCompeticao.class, new RendererCompeticaoVisivel());
        jTable.setAutoCreateRowSorter(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.setIntercellSpacing(new Dimension(0, 0));
        jTable.setCellSelectionEnabled(false);
        jTable.setSelectionMode(0);
        jTable.setRowSelectionAllowed(true);
        jTable.setSelectionBackground(Color.YELLOW);
        jTable.setFillsViewportHeight(true);
        jTable.setTableHeader(null);
    }

    private void nc() {
        ModeloTabelaPaises a2 = new ModeloTabelaPaises();
        this.JG.setModel(a2);
        this.JG.getColumnModel().getColumn(0).setPreferredWidth(25);
        this.JG.getColumnModel().getColumn(1).setPreferredWidth(120);
        this.JG.getColumnModel().getColumn(2).setPreferredWidth(70);
        this.JG.setAutoResizeMode(3);
        this.JG.setRowHeight(20);
        this.JG.setShowGrid(false);
        this.JG.setDefaultRenderer(LigaNacional.class, new RenderizadorTabelaSelecaoPaises());
        this.JG.setAutoCreateRowSorter(false);
        this.JG.setCellSelectionEnabled(false);
        this.JG.setSelectionMode(0);
        this.JG.setRowSelectionAllowed(true);
        this.JG.setSelectionBackground(Color.YELLOW);
        this.JG.setFillsViewportHeight(true);
        this.JG.addMouseListener(new ListenerCliqueTabelaLigas(this));
    }

    private void qQ() {
        JDialog jDialog = new JDialog(this.ub);
        TelaEscalacaoPadrao ax_02 = new TelaEscalacaoPadrao(jDialog);
        jDialog.add(ax_02);
        jDialog.setSize(229, 363);
        jDialog.setPreferredSize(new Dimension(229, 363));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        if (this.IG != null) {
            this.IG.addNotify();
        }
    }

    private void mK() {
        int n2;
        JComboBox[] jComboBoxArray = new JComboBox[]{this.Jk, this.Jp, this.Jq, this.Ji, this.Jo, this.Jm, this.IW};
        boolean[] blArray = GerenciadorJogo.SR.getVerJint();
        if (GerenciadorJogo.vM().getRegionaisSemHumanos() == 0) {
            this.IS.setSelected(true);
        } else {
            this.IS.setSelected(false);
        }
        int n3 = 0;
        while (n3 < jComboBoxArray.length) {
            n2 = 0;
            while (n2 < this.II[n3].length) {
                jComboBoxArray[n3].setName("comb" + Integer.toString(n3));
                if (n3 == 1 && n2 <= this.IJ) {
                    jComboBoxArray[n3].addItem(this.II[n3][n2]);
                } else if (n3 == 2 && n2 <= this.IK) {
                    jComboBoxArray[n3].addItem(this.II[n3][n2]);
                } else if (n3 == 0 || n3 > 2) {
                    jComboBoxArray[n3].addItem(this.II[n3][n2]);
                }
                ++n2;
            }
            jComboBoxArray[n3].addActionListener(new ListenerMudancaComboOpcoes(this));
            ++n3;
        }
        jComboBoxArray[0].setSelectedIndex(GerenciadorJogo.SR.getAutoSalvar());
        n3 = GerenciadorJogo.SR.getVelocidade();
        n2 = GerenciadorJogo.SR.getVelocidadeNH();
        if (n3 > this.IJ) {
            n3 = this.IJ;
        }
        if (n2 >= this.IK) {
            n2 = this.IK;
        }
        jComboBoxArray[1].setSelectedIndex(n3);
        jComboBoxArray[2].setSelectedIndex(n2);
        jComboBoxArray[3].setSelectedIndex(GerenciadorJogo.SR.getVerDecisaoPenNaoHumano());
        jComboBoxArray[4].setSelectedIndex(GerenciadorJogo.SR.getVerMudancaTecnicos());
        jComboBoxArray[5].setSelectedIndex(GerenciadorJogo.SR.getVerJanelaSubs());
        jComboBoxArray[6].setSelectedIndex(GerenciadorJogo.SR.getAvisoTerminoContrato());
        this.IL.setSelected(GerenciadorJogo.SR.isVerLeiloes());
        this.IN.setSelected(GerenciadorJogo.SR.isAutoRenovaContrato());
        this.IO.setSelected(GerenciadorJogo.SR.isUsaCorPlacar());
        this.IV.setSelected(GerenciadorJogo.SR.isUsaSons());
        this.IU.setSelected(GerenciadorJogo.SR.isNegritoCasa());
        this.IP.setSelected(GerenciadorJogo.SR.isUsaCoresLista());
        this.IQ.setSelected(GerenciadorJogo.SR.isVerEstaduaisAgrupados());
        this.IT.setSelected(GerenciadorJogo.SR.isIgnoraLigas());
        this.IR.setSelected(GerenciadorJogo.SR.isIgnoraEstadual());
        this.du(GerenciadorJogo.SR.getCorPlacar());
        this.setCorTema(GerenciadorJogo.vM().getCorTema());
        this.Ef.addMouseListener(new ListenerEscolhaCorPlacar0(this));
        this.Eg.addMouseListener(new ListenerEscolhaCorPlacar1(this));
        this.Eh.addMouseListener(new ListenerSelecionarCorPlacar(this));
        this.Jr.addMouseListener(new ListenerSelecionarTemaCor0(this));
        this.Js.addMouseListener(new ListenerSelecionarTemaCor1(this));
        this.Jt.addMouseListener(new ListenerSelecionarTemaCor2(this));
        this.Ju.addMouseListener(new ListenerSelecionarTemaCor3(this));
        this.Jv.addMouseListener(new ListenerSelecionarTemaCor4(this));
        this.IL.addActionListener(new ListenerVerLeiloesJogadores(this));
        this.IN.addActionListener(new ListenerRenovacaoAutomaticaContrato(this));
        this.IO.addActionListener(new ListenerUsarCorPlacar(this));
        this.IV.addActionListener(new ListenerSonsEventos(this));
        this.IU.addActionListener(new ListenerOpcaoNegritoCasa(this));
        this.IP.addActionListener(new ListenerOpcaoUsaCoresLista(this));
        this.IQ.addActionListener(new ListenerOpcaoVerEstaduaisAgrupados(this));
        this.IT.addActionListener(new ListenerOpcaoIgnoraLigas(this));
        this.IR.addActionListener(new ListenerIgnorarEstadual(this));
    }

    private void db(int n2) {
        GerenciadorJogo.vM().setCorPlacar(n2);
        GerenciadorJogo.vJ();
        this.du(n2);
    }

    private void dt(int n2) {
        GerenciadorJogo.vM().setCorTema(n2);
        GerenciadorJogo.vJ();
        this.setCorTema(n2);
        this.mG();
    }

    private void mG() {
        // O modal novo tem o fundo do tema; a cor escolhida vale para as telas clássicas.
    }

    private void rH() {
        this.amostras(new JLabel[]{this.Ef, this.Eg, this.Eh}, new Color[]{DialogoOpcoes.corDaImagem(CORES_PLACAR[0]), DialogoOpcoes.corDaImagem(CORES_PLACAR[1]), DialogoOpcoes.corDaImagem(CORES_PLACAR[2])}, -1);
    }

    private void rI() {
        this.amostras(new JLabel[]{this.Jr, this.Js, this.Jt, this.Ju, this.Jv}, new Color[]{ConstantesJogo.E(0, 1), ConstantesJogo.E(1, 1), ConstantesJogo.E(2, 1), ConstantesJogo.E(3, 1), ConstantesJogo.E(4, 1)}, -1);
    }

    private void du(int n2) {
        this.amostras(new JLabel[]{this.Ef, this.Eg, this.Eh}, new Color[]{DialogoOpcoes.corDaImagem(CORES_PLACAR[0]), DialogoOpcoes.corDaImagem(CORES_PLACAR[1]), DialogoOpcoes.corDaImagem(CORES_PLACAR[2])}, n2);
    }

    private void setCorTema(int n2) {
        this.amostras(new JLabel[]{this.Jr, this.Js, this.Jt, this.Ju, this.Jv}, new Color[]{ConstantesJogo.E(0, 1), ConstantesJogo.E(1, 1), ConstantesJogo.E(2, 1), ConstantesJogo.E(3, 1), ConstantesJogo.E(4, 1)}, n2);
    }

    private void c(Object object) {
        JComboBox jComboBox = (JComboBox)object;
        if ("comb0".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setAutoSalvar(jComboBox.getSelectedIndex());
        } else if ("comb1".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setVelocidade(jComboBox.getSelectedIndex());
        } else if ("comb2".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setVelocidadeNH(jComboBox.getSelectedIndex());
        } else if ("comb3".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setVerDecisaoPenNaoHumano(jComboBox.getSelectedIndex());
        } else if ("comb4".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setVerMudancaTecnicos(jComboBox.getSelectedIndex());
        } else if ("comb5".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setVerJanelaSubs(jComboBox.getSelectedIndex());
        } else if ("comb6".equals(jComboBox.getName())) {
            GerenciadorJogo.vM().setAvisoTerminoContrato(jComboBox.getSelectedIndex());
        }
        GerenciadorJogo.vJ();
    }

    private void nH() {
        JComboBox[] jComboBoxArray = new JComboBox[]{this.Jk, this.Jp, this.Jq, this.Ji, this.Jo, this.Jm, this.IW};
        GerenciadorJogo.vJ();
    }

    // ----- Visual no tema -----

    /** Amostra de cor clicável: quadrado arredondado; a escolhida ganha anel verde. */
    private static class Amostra
    implements javax.swing.Icon {
        private final Color cor;
        private final boolean escolhida;

        Amostra(Color color, boolean bl) {
            this.cor = color;
            this.escolhida = bl;
        }

        @Override
        public void paintIcon(Component component, java.awt.Graphics graphics, int x, int y) {
            java.awt.Graphics2D g = TemaBetfoot.suave(graphics);
            if (this.escolhida) {
                g.setColor(TemaBetfoot.VERDE);
                g.setStroke(new java.awt.BasicStroke(2.0f));
                g.draw(new java.awt.geom.RoundRectangle2D.Double(x + 1, y + 1, 28, 28, 12, 12));
            }
            g.setColor(this.cor);
            g.fill(new java.awt.geom.RoundRectangle2D.Double(x + 5, y + 5, 20, 20, 8, 8));
            g.setColor(TemaBetfoot.alfa(Color.WHITE, 0.25));
            g.setStroke(new java.awt.BasicStroke(1.0f));
            g.draw(new java.awt.geom.RoundRectangle2D.Double(x + 5.5, y + 5.5, 19, 19, 8, 8));
            g.dispose();
        }

        @Override
        public int getIconWidth() {
            return 30;
        }

        @Override
        public int getIconHeight() {
            return 30;
        }
    }

    /** Cor do centro de uma imagem antiga de amostra (aiconsc/), para desenhar a amostra nova. */
    private static Color corDaImagem(String string) {
        try {
            java.awt.image.BufferedImage imagem = javax.imageio.ImageIO.read(DialogoOpcoes.class.getResource("/aiconsc/" + string + ".png"));
            return new Color(imagem.getRGB(imagem.getWidth() / 2, imagem.getHeight() / 2));
        }
        catch (Exception exception) {
            return Color.GRAY;
        }
    }

    private static final String[] CORES_PLACAR = new String[]{"cor0", "cor2", "cor3"};

    private void amostras(JLabel[] jLabelArray, Color[] colorArray, int escolhida) {
        for (int i = 0; i < jLabelArray.length; ++i) {
            jLabelArray[i].setIcon(new Amostra(colorArray[i], i == escolhida));
            jLabelArray[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
    }

    private static JLabel rotuloLinha(JLabel jLabel, String string) {
        jLabel.setText(string);
        jLabel.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
        jLabel.setForeground(TemaBetfoot.TEXTO_SUAVE);
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel.putClientProperty("tema.ok", Boolean.TRUE);
        return jLabel;
    }

    /** Linha "rótulo .... combo" das preferências. */
    private static JPanel linha(JLabel jLabel, String string, JComboBox jComboBox) {
        JPanel jPanel = new JPanel(new java.awt.BorderLayout(16, 0));
        jPanel.setOpaque(false);
        jPanel.add((Component)DialogoOpcoes.rotuloLinha(jLabel, string), "Center");
        jComboBox.setPreferredSize(new Dimension(180, 38));
        jPanel.add((Component)jComboBox, "East");
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        return jPanel;
    }

    private static JPanel fila(Component ... componentArray) {
        JPanel jPanel = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        jPanel.setOpaque(false);
        for (int i = 0; i < componentArray.length; ++i) {
            if (i > 1) {
                jPanel.add(javax.swing.Box.createHorizontalStrut(6));
            }
            jPanel.add(componentArray[i]);
        }
        jPanel.setAlignmentX(0.0f);
        jPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, jPanel.getPreferredSize().height));
        return jPanel;
    }

    private static Component em(Component component) {
        if (component instanceof javax.swing.JComponent) {
            ((javax.swing.JComponent)component).setAlignmentX(0.0f);
        }
        return component;
    }

    /** Tabelas no tema (chamado no fim do construtor, depois que o jogo configura modelos e renderizadores). */
    private void temaTabelas() {
        this.JG.setDefaultRenderer(LigaNacional.class, new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
                super.getTableCellRendererComponent(jTable, object, bl, false, n, n2);
                LigaNacional liga = (LigaNacional)object;
                this.setIcon(null);
                this.setText("");
                this.setIconTextGap(10);
                this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
                if (n2 == 0) {
                    this.setIcon(TemaBetfoot.marcador(liga.jr()));
                    this.setHorizontalAlignment(CENTER);
                } else if (n2 == 1) {
                    this.setText(nucleo.EnumPaises.valueOf("P" + liga.jc()).getNome());
                    this.setIcon(TemaBetfoot.bandeira(liga.jc(), 14));
                    this.setHorizontalAlignment(LEFT);
                }
                return this;
            }
        });
        this.JG.getColumnModel().getColumn(0).setMaxWidth(56);
        this.JG.getColumnModel().getColumn(2).setMaxWidth(10);
        TemaBetfoot.tabela(this.JG, this.wi);
        this.JG.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                javax.swing.SwingUtilities.invokeLater(() -> DialogoOpcoes.this.JG.repaint());
            }
        });
        // Clique duplo também passa a competição para a outra lista.
        this.afq.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 2) {
                    DialogoOpcoes.this.fx(0);
                }
            }
        });
        this.afr.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 2) {
                    DialogoOpcoes.this.fx(1);
                }
            }
        });
        if (this.JG.getRowCount() == 0) {
            // Na tela de novo jogo as ligas ainda não existem: explica em vez de mostrar a tabela vazia.
            JLabel vazio = new JLabel("<html><div style='text-align:center'>As ligas aparecem aqui depois que a carreira come\u00e7a.</div></html>", javax.swing.SwingConstants.CENTER);
            vazio.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
            vazio.setForeground(TemaBetfoot.TEXTO_FRACO);
            this.wi.setColumnHeaderView(null);
            this.wi.setViewportView(vazio);
            this.wi.getViewport().setBackground(TemaBetfoot.LINHA_IMPAR);
            this.wi.setPreferredSize(new Dimension(380, 80));
        }
        this.JG.setToolTipText("Marque para ver as rodadas dessa liga mesmo sem técnico humano nela");
        for (JTable jTable : new JTable[]{this.afq, this.afr}) {
            jTable.setDefaultRenderer(OpcaoTipoCompeticao.class, new javax.swing.table.DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
                    super.getTableCellRendererComponent(jTable, object, bl, false, n, n2);
                    this.setText(object == null ? "" : ((OpcaoTipoCompeticao)object).sT());
                    this.setFont(TemaBetfoot.fonte(Font.PLAIN, 14.0f));
                    return this;
                }
            });
            JScrollPane rolagem = jTable == this.afq ? this.zf : this.ut;
            jTable.setTableHeader(new javax.swing.table.JTableHeader(jTable.getColumnModel()));
            TemaBetfoot.tabela(jTable, rolagem);
            jTable.setRowHeight(32);
            jTable.setTableHeader(null);
        }
    }

    private void mJ() {
        this.vd = new JPanel();
        this.a_ = new JLabel();
        this.Jk = new JComboBox();
        this.ur = new JLabel();
        this.Jp = new JComboBox();
        this.us = new JLabel();
        this.Jq = new JComboBox();
        this.vx = new JLabel();
        this.Ji = new JComboBox();
        this.vy = new JLabel();
        this.Jo = new JComboBox();
        this.vz = new JLabel();
        this.Jm = new JComboBox();
        this.vA = new JLabel();
        this.IW = new JComboBox();
        this.IN = new JCheckBox("Renovar sozinho os contratos que terminam");
        this.IO = new JCheckBox("Cor nos placares humanos");
        this.IV = new JCheckBox("Sons nos eventos dos jogos");
        this.IU = new JCheckBox("Destaque nos eventos do time da casa");
        this.IP = new JCheckBox("Usar cores na lista de jogadores");
        this.IM = new JButton();
        this.Ef = new JLabel();
        this.Eg = new JLabel();
        this.Eh = new JLabel();
        this.JD = new JLabel();
        this.Jr = new JLabel();
        this.Js = new JLabel();
        this.Jt = new JLabel();
        this.Ju = new JLabel();
        this.Jv = new JLabel();
        this.IL = new JCheckBox("Ver leilão de jogadores");
        this.vm = new JButton();
        this.we = new JPanel();
        this.Bj = new JLabel();
        this.ut = new JScrollPane();
        this.afr = new JTable() {
            @Override
            public boolean isCellEditable(int n, int n2) {
                return false;
            }
        };
        this.vw = new JLabel();
        this.IQ = new JCheckBox("Ver todos os estaduais agrupados");
        this.IR = new JCheckBox("Fora do Brasil, não mostrar estaduais e regionais");
        this.IT = new JCheckBox("Não mostrar rodadas das ligas sem humanos");
        this.IS = new JCheckBox("Não mostrar regionais que não tiveram humanos");
        this.wi = new JScrollPane();
        this.JG = new JTable() {
            @Override
            public Component prepareRenderer(javax.swing.table.TableCellRenderer tableCellRenderer, int n, int n2) {
                return TemaBetfoot.linha(this, super.prepareRenderer(tableCellRenderer, n, n2), n, n2);
            }

            @Override
            public boolean isCellEditable(int n, int n2) {
                return false;
            }
        };
        this.afo = new JLabel();
        this.zf = new JScrollPane();
        this.afq = new JTable() {
            @Override
            public boolean isCellEditable(int n, int n2) {
                return false;
            }
        };
        this.afp = new JLabel();
        this.yZ = new JButton();
        this.yV = new JButton();
        this.ug = new JLabel();
        this.IT.setSelected(true);
        this.wi.setViewportView(this.JG);
        this.zf.setViewportView(this.afq);
        this.ut.setViewportView(this.afr);
        this.setOpaque(false);
        this.setLayout(new java.awt.BorderLayout(0, 20));

        // ---- Jogo ----
        TemaBetfoot.Cartao jogo = new TemaBetfoot.Cartao(null);
        jogo.setLayout(new javax.swing.BoxLayout(jogo, 1));
        jogo.setBorder(BorderFactory.createEmptyBorder(20, 22, 20, 22));
        JPanel cab1 = TemaBetfoot.cabecalho("Jogo", "Salvamento, velocidade e avisos", null);
        cab1.setAlignmentX(0.0f);
        jogo.add(cab1);
        jogo.add(javax.swing.Box.createVerticalStrut(14));
        jogo.add(DialogoOpcoes.linha(this.a_, "Salvar automaticamente", this.Jk));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.linha(this.ur, "Velocidade do jogo", this.Jp));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.linha(this.us, "Velocidade sem jogos humanos", this.Jq));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.linha(this.vx, "Pênaltis sem humanos", this.Ji));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.linha(this.vy, "Mudanças de técnicos", this.Jo));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.linha(this.vz, "Substituição no intervalo", this.Jm));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.linha(this.vA, "Aviso de fim de contrato", this.IW));
        jogo.add(TemaBetfoot.divisor());
        jogo.add(DialogoOpcoes.em(this.IL));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.em(this.IN));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.em(this.IV));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.em(this.IU));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        jogo.add(DialogoOpcoes.fila(this.IO, javax.swing.Box.createHorizontalStrut(10), this.Ef, this.Eg, this.Eh));
        jogo.add(TemaBetfoot.divisor());
        DialogoOpcoes.rotuloLinha(this.JD, "Cor das janelas clássicas");
        this.JD.setToolTipText("Cor de fundo das telas do jogo que ainda estão no visual antigo");
        jogo.add(DialogoOpcoes.fila(this.JD, javax.swing.Box.createHorizontalStrut(10), this.Jr, this.Js, this.Jt, this.Ju, this.Jv));
        jogo.add(javax.swing.Box.createVerticalStrut(8));
        TemaBetfoot.botao(this.IM, TemaBetfoot.Estilo.CHIP, "Escolher cores", TemaBetfoot.Simbolo.LAPIS);
        JPanel cores = new JPanel(new java.awt.BorderLayout(12, 0));
        cores.setOpaque(false);
        cores.add((Component)this.IP, "Center");
        cores.add((Component)this.IM, "East");
        cores.setAlignmentX(0.0f);
        cores.setMaximumSize(new Dimension(Integer.MAX_VALUE, cores.getPreferredSize().height));
        jogo.add(cores);

        // ---- Partidas sem times humanos ----
        TemaBetfoot.Cartao partidas = new TemaBetfoot.Cartao(new java.awt.BorderLayout(0, 14));
        partidas.setBorder(BorderFactory.createEmptyBorder(20, 22, 20, 22));
        partidas.add((Component)TemaBetfoot.cabecalho("Partidas sem humanos", "O que mostrar dos jogos em que você não está", null), "North");
        JPanel centro = new JPanel();
        centro.setOpaque(false);
        centro.setLayout(new javax.swing.BoxLayout(centro, 1));
        this.Bj = TemaBetfoot.rotulo("Ver as partidas destas ligas");
        this.Bj.setAlignmentX(0.0f);
        centro.add(this.Bj);
        centro.add(javax.swing.Box.createVerticalStrut(8));
        this.wi.setPreferredSize(new Dimension(380, 150));
        this.wi.setAlignmentX(0.0f);
        centro.add(this.wi);
        centro.add(javax.swing.Box.createVerticalStrut(12));
        centro.add(DialogoOpcoes.em(this.IT));
        centro.add(javax.swing.Box.createVerticalStrut(6));
        centro.add(DialogoOpcoes.em(this.IR));
        centro.add(javax.swing.Box.createVerticalStrut(6));
        centro.add(DialogoOpcoes.em(this.IS));
        centro.add(javax.swing.Box.createVerticalStrut(6));
        centro.add(DialogoOpcoes.em(this.IQ));
        centro.add(TemaBetfoot.divisor());
        this.afo = TemaBetfoot.rotulo("Competições sem humanos");
        this.afo.setAlignmentX(0.0f);
        centro.add(this.afo);
        centro.add(javax.swing.Box.createVerticalStrut(8));
        // Duas listas: ver as partidas | ver só o resultado, com as setas para passar de uma para a outra.
        JPanel listas = new JPanel(new java.awt.GridBagLayout());
        listas.setOpaque(false);
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.fill = java.awt.GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 0.0;
        c.gridy = 0;
        c.gridx = 0;
        c.insets = new java.awt.Insets(0, 0, 6, 0);
        this.afp.setText("VER PARTIDAS");
        this.vw.setText("SÓ RESULTADOS");
        for (JLabel l : new JLabel[]{this.afp, this.vw}) {
            l.setFont(TemaBetfoot.espacada(TemaBetfoot.display(12.0f), 0.08f));
            l.setForeground(TemaBetfoot.TEXTO_FRACO);
            l.putClientProperty("tema.ok", Boolean.TRUE);
        }
        listas.add((Component)this.afp, c);
        c.gridx = 2;
        listas.add((Component)this.vw, c);
        c.gridy = 1;
        c.weighty = 1.0;
        c.gridx = 0;
        c.insets = new java.awt.Insets(0, 0, 0, 0);
        this.zf.setPreferredSize(new Dimension(160, 170));
        this.ut.setPreferredSize(new Dimension(160, 170));
        listas.add((Component)this.zf, c);
        c.gridx = 2;
        listas.add((Component)this.ut, c);
        TemaBetfoot.botao(this.yV, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.AVANCAR);
        this.yV.setToolTipText("Passar para \"s\\u00f3 resultados\"");
        TemaBetfoot.botao(this.yZ, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.VOLTAR);
        this.yZ.setToolTipText("Passar para \"ver partidas\"");
        JPanel setas = new JPanel();
        setas.setOpaque(false);
        setas.setLayout(new javax.swing.BoxLayout(setas, 1));
        setas.add(this.yV);
        setas.add(javax.swing.Box.createVerticalStrut(10));
        setas.add(this.yZ);
        JPanel meioSetas = new JPanel(new java.awt.GridBagLayout());
        meioSetas.setOpaque(false);
        meioSetas.add(setas);
        c.gridx = 1;
        c.weightx = 0.0;
        c.insets = new java.awt.Insets(0, 10, 0, 10);
        listas.add((Component)meioSetas, c);
        listas.setAlignmentX(0.0f);
        centro.add(listas);
        partidas.add((Component)centro, "Center");

        // Caixas e combos no tema (os rótulos e botões já estão prontos).
        TemaBetfoot.aplicarTema(jogo);
        TemaBetfoot.aplicarTema(centro);
        TemaBetfoot.botao(this.IM, TemaBetfoot.Estilo.CHIP, "Escolher cores", TemaBetfoot.Simbolo.LAPIS);
        TemaBetfoot.botao(this.yV, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.AVANCAR);
        TemaBetfoot.botao(this.yZ, TemaBetfoot.Estilo.ICONE, null, TemaBetfoot.Simbolo.VOLTAR);

        JPanel colunas = new JPanel(new java.awt.GridLayout(1, 2, 20, 0));
        colunas.setOpaque(false);
        colunas.add(jogo);
        colunas.add(partidas);
        this.add((Component)TemaBetfoot.topoModal(null, "Opções", "Preferências do jogo · valem para todas as carreiras", this.vm), "North");
        this.add((Component)colunas, "Center");
        JButton voltar = TemaBetfoot.botao(new JButton(), TemaBetfoot.Estilo.PRIMARIO, "Voltar", TemaBetfoot.Simbolo.VOLTAR);
        voltar.setToolTipText("As mudanças já valem; só fecha (Esc)");
        voltar.addActionListener(actionEvent -> this.vm.doClick());
        JLabel dica = new JLabel("As mudanças valem na hora");
        dica.setFont(TemaBetfoot.fonte(Font.PLAIN, 13.0f));
        dica.setForeground(TemaBetfoot.TEXTO_FRACO);
        this.add((Component)TemaBetfoot.rodapeModal(dica, voltar), "South");
    }

    static /* synthetic */ void a(DialogoOpcoes fB2) {
        fB2.nH();
    }

    static /* synthetic */ JDialog b(DialogoOpcoes fB2) {
        return fB2.ub;
    }

    static /* synthetic */ void c(DialogoOpcoes fB2) {
        fB2.qQ();
    }

    static /* synthetic */ void d(DialogoOpcoes fB2) {
        fB2.rG();
    }

    static /* synthetic */ void c(DialogoOpcoes fB2, int n2) {
        fB2.fx(n2);
    }

    static /* synthetic */ JTable e(DialogoOpcoes fB2) {
        return fB2.JG;
    }

    static /* synthetic */ void b(DialogoOpcoes fB2, Object object) {
        fB2.c(object);
    }

    static /* synthetic */ void a(DialogoOpcoes fB2, int n2) {
        fB2.db(n2);
    }

    static /* synthetic */ void b(DialogoOpcoes fB2, int n2) {
        fB2.dt(n2);
    }

    static /* synthetic */ JCheckBox f(DialogoOpcoes fB2) {
        return fB2.IL;
    }

    static /* synthetic */ JCheckBox g(DialogoOpcoes fB2) {
        return fB2.IN;
    }

    static /* synthetic */ JCheckBox h(DialogoOpcoes fB2) {
        return fB2.IO;
    }

    static /* synthetic */ JCheckBox i(DialogoOpcoes fB2) {
        return fB2.IV;
    }

    static /* synthetic */ JCheckBox j(DialogoOpcoes fB2) {
        return fB2.IU;
    }

    static /* synthetic */ JCheckBox k(DialogoOpcoes fB2) {
        return fB2.IP;
    }

    static /* synthetic */ JTable l(DialogoOpcoes fB2) {
        return fB2.IG;
    }

    static /* synthetic */ JCheckBox m(DialogoOpcoes fB2) {
        return fB2.IQ;
    }

    static /* synthetic */ JCheckBox n(DialogoOpcoes fB2) {
        return fB2.IT;
    }

    static /* synthetic */ JCheckBox o(DialogoOpcoes fB2) {
        return fB2.IR;
    }
}

