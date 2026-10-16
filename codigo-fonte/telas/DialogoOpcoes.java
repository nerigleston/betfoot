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
import components.LayoutPosicaoAbsoluta;
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
import javax.swing.table.DefaultTableModel;

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
        this.afq.addNotify();
        this.afr.addNotify();
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
        this.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 1));
    }

    private void rH() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png"));
        this.Ef.setIcon(imageIcon);
        ImageIcon imageIcon2 = new ImageIcon(this.getClass().getResource("/aiconsc/cor2.png"));
        this.Eg.setIcon(imageIcon2);
        ImageIcon imageIcon3 = new ImageIcon(this.getClass().getResource("/aiconsc/cor3.png"));
        this.Eh.setIcon(imageIcon3);
    }

    private void rI() {
        this.Jr.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/corTema0.png")));
        this.Js.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/corTema1.png")));
        this.Jt.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/corTema2.png")));
        this.Ju.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/corTema3.png")));
        this.Jv.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/corTema4.png")));
    }

    private void du(int n2) {
        this.rH();
        JLabel[] jLabelArray = new JLabel[]{this.Ef, this.Eg, this.Eh};
        String[] stringArray = new String[]{"cor0s", "cor2s", "cor3s"};
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aiconsc/" + stringArray[n2] + ".png"));
        jLabelArray[n2].setIcon(imageIcon);
    }

    private void setCorTema(int n2) {
        this.rI();
        JLabel[] jLabelArray = new JLabel[]{this.Jr, this.Js, this.Jt, this.Ju, this.Jv};
        String[] stringArray = new String[]{"corTema0s", "corTema1s", "corTema2s", "corTema3s", "corTema4s"};
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aiconsc/" + stringArray[n2] + ".png"));
        jLabelArray[n2].setIcon(imageIcon);
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
        this.IN = new JCheckBox();
        this.IO = new JCheckBox();
        this.IV = new JCheckBox();
        this.IU = new JCheckBox();
        this.IP = new JCheckBox();
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
        this.IL = new JCheckBox();
        this.vm = new JButton();
        this.we = new JPanel();
        this.Bj = new JLabel();
        this.ut = new JScrollPane();
        this.afr = new JTable();
        this.vw = new JLabel();
        this.IQ = new JCheckBox();
        this.IR = new JCheckBox();
        this.IT = new JCheckBox();
        this.IS = new JCheckBox();
        this.wi = new JScrollPane();
        this.JG = new JTable();
        this.afo = new JLabel();
        this.zf = new JScrollPane();
        this.afq = new JTable();
        this.afp = new JLabel();
        this.yZ = new JButton();
        this.yV = new JButton();
        this.ug = new JLabel();
        this.setBackground(new Color(104, 120, 100));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.setPreferredSize(new Dimension(800, 567));
        this.setLayout(new LayoutPosicaoAbsoluta());
        this.vd.setBackground(new Color(224, 220, 220));
        this.vd.setLayout(new LayoutPosicaoAbsoluta());
        this.a_.setHorizontalAlignment(4);
        this.a_.setText("Salvar automaticamente:");
        this.vd.add((Component)this.a_, new components.RestricaoPosicaoLayout(10, 23, 204, -1));
        this.vd.add((Component)this.Jk, new components.RestricaoPosicaoLayout(224, 20, 148, -1));
        this.ur.setHorizontalAlignment(4);
        this.ur.setText("Velocidade do Jogo:");
        this.vd.add((Component)this.ur, new components.RestricaoPosicaoLayout(10, 54, 204, -1));
        this.vd.add((Component)this.Jp, new components.RestricaoPosicaoLayout(224, 51, 148, -1));
        this.us.setHorizontalAlignment(4);
        this.us.setText("Velocidade sem jogos humanos:");
        this.vd.add((Component)this.us, new components.RestricaoPosicaoLayout(10, 85, 204, -1));
        this.vd.add((Component)this.Jq, new components.RestricaoPosicaoLayout(224, 82, 148, -1));
        this.vx.setHorizontalAlignment(4);
        this.vx.setText("Disputas de p\u00eanaltis sem humanos:");
        this.vd.add((Component)this.vx, new components.RestricaoPosicaoLayout(10, 123, 204, -1));
        this.vd.add((Component)this.Ji, new components.RestricaoPosicaoLayout(224, 120, 148, -1));
        this.vy.setHorizontalAlignment(4);
        this.vy.setText("Mudan\u00e7as de t\u00e9cnicos:");
        this.vd.add((Component)this.vy, new components.RestricaoPosicaoLayout(10, 154, 204, -1));
        this.vd.add((Component)this.Jo, new components.RestricaoPosicaoLayout(224, 151, 148, -1));
        this.vz.setHorizontalAlignment(4);
        this.vz.setText("Janela de substitui\u00e7\u00e3o no intervalo:");
        this.vd.add((Component)this.vz, new components.RestricaoPosicaoLayout(10, 192, 204, -1));
        this.vd.add((Component)this.Jm, new components.RestricaoPosicaoLayout(224, 189, 148, -1));
        this.vA.setHorizontalAlignment(4);
        this.vA.setText("Aviso de t\u00e9rmino de contrato:");
        this.vd.add((Component)this.vA, new components.RestricaoPosicaoLayout(10, 223, 204, -1));
        this.vd.add((Component)this.IW, new components.RestricaoPosicaoLayout(224, 220, 148, -1));
        this.IN.setFont(new Font("Tahoma", 0, 12));
        this.IN.setText("Atualizar automaticamente contratos encerrados");
        this.IN.setOpaque(false);
        this.vd.add((Component)this.IN, new components.RestricaoPosicaoLayout(20, 290, 350, -1));
        this.IO.setFont(new Font("Tahoma", 0, 12));
        this.IO.setText("Cor nos placares humanos:");
        this.IO.setOpaque(false);
        this.vd.add((Component)this.IO, new components.RestricaoPosicaoLayout(20, 330, 200, -1));
        this.IV.setFont(new Font("Tahoma", 0, 12));
        this.IV.setText("Sons nos eventos dos jogos");
        this.IV.setOpaque(false);
        this.vd.add((Component)this.IV, new components.RestricaoPosicaoLayout(20, 370, 265, -1));
        this.IU.setFont(new Font("Tahoma", 0, 12));
        this.IU.setText("Destaque nos eventos do time da casa");
        this.IU.setOpaque(false);
        this.vd.add((Component)this.IU, new components.RestricaoPosicaoLayout(20, 410, 265, -1));
        this.IP.setFont(new Font("Tahoma", 0, 12));
        this.IP.setText("Usar cores na lista de jogadores");
        this.IP.setOpaque(false);
        this.vd.add((Component)this.IP, new components.RestricaoPosicaoLayout(22, 512, 230, -1));
        this.IM.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconcor.png")));
        this.IM.setText("cores");
        this.vd.add((Component)this.IM, new components.RestricaoPosicaoLayout(260, 510, -1, -1));
        this.Ef.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png")));
        this.vd.add((Component)this.Ef, new components.RestricaoPosicaoLayout(240, 330, -1, -1));
        this.Eg.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor2.png")));
        this.vd.add((Component)this.Eg, new components.RestricaoPosicaoLayout(280, 330, -1, -1));
        this.Eh.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor3s.png")));
        this.vd.add((Component)this.Eh, new components.RestricaoPosicaoLayout(320, 330, -1, -1));
        this.JD.setFont(new Font("Tahoma", 0, 12));
        this.JD.setText("Tema de cores das janelas:");
        this.vd.add((Component)this.JD, new components.RestricaoPosicaoLayout(22, 445, 320, -1));
        this.Jr.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png")));
        this.vd.add((Component)this.Jr, new components.RestricaoPosicaoLayout(60, 467, -1, -1));
        this.Js.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png")));
        this.vd.add((Component)this.Js, new components.RestricaoPosicaoLayout(100, 467, -1, -1));
        this.Jt.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png")));
        this.vd.add((Component)this.Jt, new components.RestricaoPosicaoLayout(140, 467, -1, -1));
        this.Ju.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png")));
        this.vd.add((Component)this.Ju, new components.RestricaoPosicaoLayout(180, 467, -1, -1));
        this.Jv.setIcon(new ImageIcon(this.getClass().getResource("/aiconsc/cor0.png")));
        this.vd.add((Component)this.Jv, new components.RestricaoPosicaoLayout(220, 467, -1, -1));
        this.IL.setFont(new Font("Tahoma", 0, 12));
        this.IL.setText("Ver leil\u00e3o de jogadores");
        this.IL.setOpaque(false);
        this.vd.add((Component)this.IL, new components.RestricaoPosicaoLayout(20, 255, 320, -1));
        this.add((Component)this.vd, new components.RestricaoPosicaoLayout(20, 43, 380, 560));
        this.vm.setText("X");
        this.add((Component)this.vm, new components.RestricaoPosicaoLayout(789, 10, 60, -1));
        this.we.setBackground(new Color(224, 220, 220));
        this.we.setLayout(new LayoutPosicaoAbsoluta());
        this.Bj.setFont(new Font("Tahoma", 1, 11));
        this.Bj.setText("Visualizar partidas das ligas mesmo sem times humanos:");
        this.we.add((Component)this.Bj, new components.RestricaoPosicaoLayout(10, 10, -1, -1));
        this.afr.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.ut.setViewportView(this.afr);
        this.we.add((Component)this.ut, new components.RestricaoPosicaoLayout(260, 340, 170, 210));
        this.vw.setFont(new Font("Tahoma", 1, 11));
        this.vw.setHorizontalAlignment(0);
        this.vw.setText("Ver s\u00f3 resultados");
        this.vw.setToolTipText("");
        this.we.add((Component)this.vw, new components.RestricaoPosicaoLayout(240, 320, 170, -1));
        this.IQ.setText("Ver todos os estaduais agrupados");
        this.IQ.setOpaque(false);
        this.we.add((Component)this.IQ, new components.RestricaoPosicaoLayout(10, 260, 304, -1));
        this.IR.setText("Fora do Brasil n\u00e3o mostrar estaduais/regionais");
        this.IR.setOpaque(false);
        this.we.add((Component)this.IR, new components.RestricaoPosicaoLayout(10, 220, 362, -1));
        this.IT.setSelected(true);
        this.IT.setText("N\u00e3o mostrar rodadas das ligas nacionais n\u00e3o-humanas");
        this.IT.setOpaque(false);
        this.we.add((Component)this.IT, new components.RestricaoPosicaoLayout(10, 200, 362, -1));
        this.IS.setText("N\u00e3o mostrar regionais que n\u00e3o tiveram humanos");
        this.IS.setOpaque(false);
        this.we.add((Component)this.IS, new components.RestricaoPosicaoLayout(10, 240, 362, -1));
        this.JG.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.wi.setViewportView(this.JG);
        this.we.add((Component)this.wi, new components.RestricaoPosicaoLayout(10, 40, 415, 151));
        this.afo.setFont(new Font("Tahoma", 1, 12));
        this.afo.setText("Competi\u00e7\u00f5es sem times humanos:");
        this.we.add((Component)this.afo, new components.RestricaoPosicaoLayout(110, 290, -1, -1));
        this.afq.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.zf.setViewportView(this.afq);
        this.we.add((Component)this.zf, new components.RestricaoPosicaoLayout(10, 340, 170, 210));
        this.afp.setFont(new Font("Tahoma", 1, 11));
        this.afp.setHorizontalAlignment(0);
        this.afp.setText("Ver partidas");
        this.we.add((Component)this.afp, new components.RestricaoPosicaoLayout(10, 320, 160, -1));
        this.yZ.setFont(new Font("Tahoma", 1, 11));
        this.yZ.setText("<<");
        this.we.add((Component)this.yZ, new components.RestricaoPosicaoLayout(190, 440, 60, 30));
        this.yV.setFont(new Font("Tahoma", 1, 11));
        this.yV.setText(">>");
        this.we.add((Component)this.yV, new components.RestricaoPosicaoLayout(190, 380, 60, 30));
        this.add((Component)this.we, new components.RestricaoPosicaoLayout(412, 43, 440, 560));
        this.ug.setFont(new Font("Tahoma", 1, 12));
        this.ug.setForeground(new Color(255, 255, 255));
        this.ug.setText("Op\u00e7\u00f5es");
        this.add((Component)this.ug, new components.RestricaoPosicaoLayout(29, 14, 240, -1));
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

