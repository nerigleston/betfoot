package telas;

import telas.PainelCalendarioTime;
import telas.DialogoNegociacaoJogador;
import telas.PainelAcademiaJuniores;
import telas.PainelRankingTecnicos;
import telas.PainelUltimasMovimentacoes;
import telas.DialogoRetrospectoTime;
import telas.ComparadorPosicaoLinhaTabela;
import telas.ListenerEmprestarJogador;
import telas.ListenerComprarJogador2;
import telas.ListenerFazerOfertaJogador;
import telas.ListenerSelecionarTimeArvore;
import telas.ListenerSelecaoJogadorTabela;
import telas.ListenerCliqueTabelaJogadores2;
import telas.ListenerTeclaEscFecharTela;
import telas.ListenerFecharTelaMercado;
import telas.ListenerAbrirCalendario;
import telas.ListenerAbrirAcademiaJuniores3;
import telas.ListenerAbrirTransferencias;
import telas.ListenerAbrirGaleriaTrofeus2;
import telas.ListenerAbrirRetrospectoTime2;
import telas.ListenerAbrirRankingTecnicos2;
import tabelas.ModeloTabelaJogadoresDetalhado;
import tabelas.RenderizadorTabelaHistoricoCarreira;
import tabelas.RenderizadorTabelaJogadoresCompleta;
import tabelas.ModeloTabelaHistoricoTemporadas;
import nucleo.BalancoFinanceiro;
import nucleo.ModeloJogador;
import nucleo.LigaNacional;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.TemporadaCarreiraJogador;
import nucleo.BuscadorTimeDestinoTransferencia;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import comparadores.ColecaoComparadoresSorteio;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class TelaGerenciamentoClube
extends JPanel {
    private JDialog ub;
    private ModeloTime uk = null;
    private ModeloTime ul = null;
    private ModeloJogador yK = null;
    private ArrayList um = new ArrayList();
    private ArrayList uK = new ArrayList();
    private ArrayList Fj = new ArrayList();
    private boolean yp = false;
    public static Comparator KZ = new ComparadorPosicaoLinhaTabela();
    private JButton HR;
    private JButton FN;
    private JButton MJ;
    private JButton vm;
    private JButton HW;
    private JButton HY;
    private JButton Ic;
    private JButton Ie;
    private JButton MK;
    private JLabel a_;
    private JLabel ur;
    private JPanel we;
    private JPanel wf;
    private JPanel wg;
    private JPanel wh;
    private JProgressBar Hf;
    private JProgressBar Ig;
    private JScrollPane ut;
    private JScrollPane wi;
    private JScrollPane zf;
    private JScrollPane zg;
    private JTabbedPane ML;
    private JToolBar ve;
    private JLabel Fq;
    private JLabel MM;
    private JLabel MN;
    private JLabel MO;
    private JLabel MP;
    private JLabel MQ;
    private JLabel MR;
    private JLabel MS;
    private JLabel uu;
    private JLabel MT;
    private JTable zj;
    private JTable MU;
    private JTree uw;

    public TelaGerenciamentoClube(JDialog jDialog, ModeloTime ah2, ModeloTime ah3, boolean bl) {
        this.ub = jDialog;
        this.uk = ah2;
        this.ul = ah3;
        this.yp = bl;
        this.mJ();
        this.qz();
        this.nE();
        this.mK();
        this.mH();
        this.mM();
        this.zf.setBorder(BorderFactory.createEmptyBorder());
        this.zg.setBorder(BorderFactory.createEmptyBorder());
        this.ML.setBorder(BorderFactory.createEmptyBorder());
        this.MP.setIcon(new ImageIcon(this.getClass().getResource("/aicons/iconmoneys.png")));
        if (this.zj.getRowCount() > 0) {
            this.zj.setRowSelectionInterval(0, 0);
            this.yK = (ModeloJogador)this.uK.get(0);
            this.sG();
            this.sF();
        }
        this.mY();
        if (bl) {
            this.MP.setVisible(false);
        }
        this.mG();
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 1));
        this.wf.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 2));
        this.wh.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 2));
        this.ve.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 2));
    }

    private void mY() {
        this.a(this);
        this.a(this.zj);
        this.a(this.uw);
        this.a(this.ML);
        this.a(this.MJ);
        this.a(this.FN);
        this.a(this.MK);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(27, 0), "esc");
        jComponent.getActionMap().put("esc", new ListenerTeclaEscFecharTela(this));
    }

    private void pq() {
        ModeloTabelaHistoricoTemporadas k_02 = new ModeloTabelaHistoricoTemporadas(this.Fj);
        this.MU.setModel(k_02);
        int[] nArray = new int[]{40, 80, 30, 20, 20, 20, 20, 20};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.MU.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.MU.setAutoResizeMode(3);
        this.MU.setRowHeight(20);
        this.MU.setShowGrid(false);
        this.MU.setDefaultRenderer(TemporadaCarreiraJogador.class, new RenderizadorTabelaHistoricoCarreira());
        this.MU.setAutoCreateRowSorter(false);
        this.MU.getTableHeader().setReorderingAllowed(false);
        this.MU.setIntercellSpacing(new Dimension(0, 0));
        this.MU.setCellSelectionEnabled(false);
        this.MU.setSelectionMode(0);
        this.MU.setRowSelectionAllowed(true);
        this.MU.setSelectionBackground(Color.YELLOW);
        this.MU.setFillsViewportHeight(true);
    }

    private void qz() {
        this.HR.setToolTipText("Calend\u00e1rio");
        this.HW.setToolTipText("Academia de Juniores");
        this.Ie.setToolTipText("Galeria de trof\u00e9us");
        this.HY.setToolTipText("Retrospecto do time");
        this.Ic.setToolTipText("Transfer\u00eancias");
    }

    public void mH() {
        this.vm.addActionListener(new ListenerFecharTelaMercado(this));
        this.HR.addActionListener(new ListenerAbrirCalendario(this));
        this.HW.addActionListener(new ListenerAbrirAcademiaJuniores3(this));
        this.Ic.addActionListener(new ListenerAbrirTransferencias(this));
        this.Ie.addActionListener(new ListenerAbrirGaleriaTrofeus2(this));
        this.HY.addActionListener(new ListenerAbrirRetrospectoTime2(this));
        this.MS.addMouseListener(new ListenerAbrirRankingTecnicos2(this));
        this.MJ.addActionListener(new ListenerEmprestarJogador(this));
        this.FN.addActionListener(new ListenerComprarJogador2(this));
        this.MK.addActionListener(new ListenerFazerOfertaJogador(this));
    }

    private void sz() {
        BuscadorTimeDestinoTransferencia.l(false);
        int n2 = 0;
        n2 = BuscadorTimeDestinoTransferencia.a(this.yK, this.ul);
        String[] stringArray = new String[]{"N\u00e3o foi poss\u00edvel emprestar", "Empr\u00e9stimo realizado", "Jogador do seu time", "Seu time j\u00e1 pegou o limite de quatro emprestados", "N\u00e3o deseja jogar no seu time", "N\u00e3o est\u00e1 dispon\u00edvel para empr\u00e9stimo", "Limite de 30 jogadores alcan\u00e7ado"};
        if (n2 == 1) {
            this.sH();
            this.zj.addNotify();
        }
        JOptionPane.showMessageDialog(this.ub, stringArray[n2], "Empr\u00e9stimo", 2);
    }

    private void oM() {
        BuscadorTimeDestinoTransferencia.l(false);
        int n2 = 0;
        n2 = BuscadorTimeDestinoTransferencia.b(this.yK, this.ul);
        String[] stringArray = new String[]{"N\u00e3o est\u00e1 \u00e0 venda", "Compra realizada", "Jogador do seu time", "Limite de 30 jogadores alcan\u00e7ado", "N\u00e3o deseja se transferir para o seu time", "Sem dinheiro para comprar este jogador"};
        if (n2 == 1) {
            this.sH();
            this.zj.addNotify();
        }
        JOptionPane.showMessageDialog(this.ub, stringArray[n2], "Compra", 2);
    }

    private void sA() {
        if (BuscadorTimeDestinoTransferencia.d(this.sE(), this.ul)) {
            if (this.sE().fg() == this.ul) {
                JOptionPane.showMessageDialog(this.ub, "Jogador do time", "Proposta", 2);
            } else if (this.ul.kc().size() >= 35) {
                JOptionPane.showMessageDialog(this.ub, "Limite de 32 jogadores alcan\u00e7ado", "Limite de jogadores", 2);
            } else if (this.sE() != null) {
                BuscadorTimeDestinoTransferencia.l(false);
                JDialog jDialog = new JDialog(this.ub);
                DialogoNegociacaoJogador cz_02 = new DialogoNegociacaoJogador(jDialog, this.sE(), this.ul, false);
                jDialog.add(cz_02);
                jDialog.setSize(373, 300);
                jDialog.setPreferredSize(new Dimension(373, 300));
                jDialog.setModal(true);
                jDialog.setResizable(false);
                jDialog.setLocationRelativeTo(null);
                jDialog.setUndecorated(true);
                jDialog.setVisible(true);
                if (BuscadorTimeDestinoTransferencia.cO()) {
                    this.sH();
                    this.zj.addNotify();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this.ub, "O jogador n\u00e3o deseja jogar no seu time.", "Jogador recusou", 2);
        }
    }

    private void rw() {
        this.Ie.setCursor(new Cursor(3));
        GerenciadorTelas.v(this.uk);
        this.Ie.setCursor(new Cursor(12));
    }

    private void qP() {
        this.HY.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.ub);
        DialogoRetrospectoTime hw2 = new DialogoRetrospectoTime(jDialog, this.uk);
        jDialog.add(hw2);
        jDialog.setSize(740, 684);
        jDialog.setPreferredSize(new Dimension(740, 684));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HY.setCursor(new Cursor(12));
    }

    private void sB() {
        JDialog jDialog = new JDialog(this.ub);
        PainelRankingTecnicos gX2 = new PainelRankingTecnicos(jDialog, this.uk.ka());
        jDialog.add(gX2);
        jDialog.setSize(880, 663);
        jDialog.setPreferredSize(new Dimension(880, 663));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
    }

    private void sC() {
        this.Ic.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.ub);
        PainelUltimasMovimentacoes hc_02 = new PainelUltimasMovimentacoes(jDialog, this.uk, 0);
        jDialog.add(hc_02);
        jDialog.setSize(695, 500);
        jDialog.setPreferredSize(new Dimension(695, 500));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.Ic.setCursor(new Cursor(12));
    }

    public void qY() {
        this.HW.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.ub);
        PainelAcademiaJuniores ds_02 = new PainelAcademiaJuniores(jDialog, this.ul, this.uk);
        jDialog.add(ds_02);
        jDialog.setSize(763, 568);
        jDialog.setPreferredSize(new Dimension(763, 568));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HW.setCursor(new Cursor(12));
    }

    private void sD() {
        this.HR.setCursor(new Cursor(3));
        JDialog jDialog = new JDialog(this.ub);
        PainelCalendarioTime l2 = new PainelCalendarioTime(jDialog, this.uk);
        jDialog.add(l2);
        jDialog.setSize(820, 600);
        jDialog.setPreferredSize(new Dimension(820, 600));
        jDialog.setModal(true);
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setUndecorated(true);
        jDialog.setVisible(true);
        this.HR.setCursor(new Cursor(12));
    }

    private void mM() {
        this.uw.getSelectionModel().setSelectionMode(1);
        this.uw.addTreeSelectionListener(new ListenerSelecionarTimeArvore(this));
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.P().size()) {
            if (!((ModeloTime)GerenciadorJogo.SR.P().get(n2)).kn().booleanValue()) {
                this.um.add((ModeloTime)GerenciadorJogo.SR.P().get(n2));
                Collections.sort(this.um, ColecaoComparadoresSorteio.VS);
            }
            ++n2;
        }
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Times");
        this.a(defaultMutableTreeNode);
        this.uw.setModel(new DefaultTreeModel(defaultMutableTreeNode));
        this.uw.setRootVisible(false);
        DefaultMutableTreeNode defaultMutableTreeNode2 = defaultMutableTreeNode.getNextNode();
        do {
            if (defaultMutableTreeNode2.getLevel() != 1) continue;
            this.uw.expandPath(new TreePath(defaultMutableTreeNode2.getPath()));
        } while ((defaultMutableTreeNode2 = defaultMutableTreeNode2.getNextNode()) != null);
    }

    private void a(DefaultMutableTreeNode defaultMutableTreeNode) {
        DefaultMutableTreeNode defaultMutableTreeNode2 = null;
        DefaultMutableTreeNode defaultMutableTreeNode3 = null;
        DefaultMutableTreeNode defaultMutableTreeNode4 = null;
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.N().size()) {
            defaultMutableTreeNode2 = new DefaultMutableTreeNode(((LigaNacional)GerenciadorJogo.SR.N().get(n2)).jp());
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            int n3 = 0;
            while (n3 < ((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().size()) {
                if (((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK().size() > 0) {
                    String string = ((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).getNome();
                    if (string.length() > 39) {
                        string = String.valueOf(string.substring(0, 39)) + "...";
                    }
                    defaultMutableTreeNode3 = new DefaultMutableTreeNode(string);
                    defaultMutableTreeNode2.add(defaultMutableTreeNode3);
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(((CompeticaoLigaNacional)((LigaNacional)GerenciadorJogo.SR.N().get(n2)).eb().get(n3)).yi().yK());
                    Collections.sort(arrayList, ColecaoComparadoresSorteio.VS);
                    int n4 = 0;
                    while (n4 < arrayList.size()) {
                        defaultMutableTreeNode4 = new DefaultMutableTreeNode(arrayList.get(n4));
                        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
                        ++n4;
                    }
                }
                ++n3;
            }
            if (((LigaNacional)GerenciadorJogo.SR.N().get(n2)).ek().size() > 0) {
                defaultMutableTreeNode3 = new DefaultMutableTreeNode("Regionais");
                defaultMutableTreeNode2.add(defaultMutableTreeNode3);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((LigaNacional)GerenciadorJogo.SR.N().get(n2)).ek());
                Collections.sort(arrayList, ColecaoComparadoresSorteio.VS);
                int n5 = 0;
                while (n5 < arrayList.size()) {
                    defaultMutableTreeNode4 = new DefaultMutableTreeNode(arrayList.get(n5));
                    defaultMutableTreeNode3.add(defaultMutableTreeNode4);
                    ++n5;
                }
            }
            ++n2;
        }
        if (this.um.size() > 0) {
            defaultMutableTreeNode2 = new DefaultMutableTreeNode("Internacionais");
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            n2 = 0;
            while (n2 < this.um.size()) {
                defaultMutableTreeNode4 = new DefaultMutableTreeNode(this.um.get(n2));
                defaultMutableTreeNode2.add(defaultMutableTreeNode4);
                ++n2;
            }
        }
    }

    public ModeloJogador sE() {
        if (this.yK == null && this.uK.size() > 0) {
            this.yK = (ModeloJogador)this.uK.get(0);
        }
        return this.yK;
    }

    private void sF() {
        Object object;
        int[] nArray = new int[6];
        if (this.yK != null) {
            this.MO.setText(String.valueOf(this.yK.getNome()) + " - " + ConstantesJogo.rI[this.yK.getPosicao()]);
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aflags/" + this.yK.getPais() + ".png"));
            this.MO.setIcon(imageIcon);
            nArray = this.yK.gw();
            String string = "";
            if (this.yK.fP() && this.yK.fo() > ((nucleo.Calendario)GerenciadorJogo.SR.R().get(GerenciadorJogo.SR.J())).a().getTime().getTime()) {
                string = "Fim contus\u00e3o: " + nucleo.Calendario.a(this.yK.fo());
            }
            object = "<html>\n<body><p style=\\\"padding:5; font-size:12\\\">\n<b>For\u00e7a:</b>&nbsp;" + Integer.toString(this.yK.fi()) + "&nbsp;&nbsp;&nbsp;";
            if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
                object = "<html>\n<body><p style=\\\"padding:5; font-size:12\\\">\n&nbsp;&nbsp;&nbsp;&nbsp;";
            }
            String string2 = String.valueOf(object) + "<b>Idade:</b>" + Integer.toString(this.yK.getIdade()) + "<br>\n</p>\n<p style=\\\"padding:5; font-size:12\\\">\n" + "<b>Jogos:" + "</b>&nbsp;" + Integer.toString(nArray[0]) + "&nbsp;&nbsp;&nbsp;" + "<b>Gols:" + "</b>" + Integer.toString(nArray[1]) + "&nbsp;&nbsp;&nbsp;" + "<b>" + "</b><br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n<b>Passe:" + "</b>&nbsp;" + BalancoFinanceiro.c(this.yK.fk()) + "<br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n<b>" + "Sal\u00e1rio:" + "</b>&nbsp;" + BalancoFinanceiro.c(this.yK.fj()) + "<br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n" + "<b>" + ConstantesJogo.qM[this.yK.getCr1()] + "/" + ConstantesJogo.qM[this.yK.getCr2()] + "<br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n" + "<b></b>&nbsp; <br>\n</p>\n<p style=\\\"padding:5; font-size:20\\\">\n" + "<b>" + string + "<b><br>\n</p>\n</body></html>\n";
            this.MN.setText(string2);
        }
        if (this.yK != null) {
            this.Fj.clear();
            int n2 = 0;
            int n3 = this.yK.gr().size() - 1;
            while (n3 >= 0) {
                this.Fj.add((TemporadaCarreiraJogador)this.yK.gr().get(n3));
                if (++n2 >= 10) break;
                --n3;
            }
            TemporadaCarreiraJogador k2 = new TemporadaCarreiraJogador(true, nArray);
            this.Fj.add(k2);
            if (this.yK.fL() > 0) {
                object = new TemporadaCarreiraJogador();
                ((TemporadaCarreiraJogador)object).D(this.yK.fL());
                this.Fj.add(object);
            }
            this.pq();
        }
    }

    public void s(ModeloJogador f2) {
        this.yK = f2;
        this.sG();
        this.sF();
    }

    private void nE() {
        ModeloTabelaJogadoresDetalhado u2 = new ModeloTabelaJogadoresDetalhado(this.uK, this);
        this.zj.setModel(u2);
        int[] nArray = new int[]{20, 20, 45, 120, 20, 20, 50, 50, 45, 35, 25, 25, 20, 20};
        int[] nArray2 = new int[]{20, 20, 20, 110, 20, 25, 25, 25, 25, 25, 25, 25, 50, 50, 60, 45, 25, 22, 20, 20};
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            nArray = nArray2;
        }
        int n2 = 0;
        while (n2 < nArray.length) {
            this.zj.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.zj.setAutoResizeMode(3);
        this.zj.setRowHeight(20);
        this.zj.setShowGrid(false);
        this.zj.setDefaultRenderer(ModeloJogador.class, new RenderizadorTabelaJogadoresCompleta());
        this.zj.setAutoCreateRowSorter(false);
        this.zj.getTableHeader().setReorderingAllowed(false);
        this.zj.setIntercellSpacing(new Dimension(0, 0));
        this.zj.setCellSelectionEnabled(false);
        this.zj.setSelectionMode(0);
        this.zj.setRowSelectionAllowed(true);
        this.zj.setSelectionBackground(Color.YELLOW);
        this.zj.setFillsViewportHeight(true);
        TableRowSorter<TableModel> tableRowSorter = new TableRowSorter<TableModel>(this.zj.getModel());
        this.zj.setRowSorter(tableRowSorter);
        tableRowSorter.setComparator(0, ColecaoComparadoresSorteio.abe);
        tableRowSorter.setComparator(2, ColecaoComparadoresSorteio.cL);
        tableRowSorter.setComparator(3, ColecaoComparadoresSorteio.abk);
        tableRowSorter.setComparator(4, ColecaoComparadoresSorteio.aba);
        if (!GerenciadorJogo.SR.isHabilidadeIndividual()) {
            tableRowSorter.setComparator(5, ColecaoComparadoresSorteio.aaJ);
            tableRowSorter.setComparator(6, ColecaoComparadoresSorteio.aaZ);
            tableRowSorter.setComparator(7, ColecaoComparadoresSorteio.aaW);
            tableRowSorter.setComparator(9, ColecaoComparadoresSorteio.abd);
            tableRowSorter.setComparator(10, ColecaoComparadoresSorteio.abc);
            tableRowSorter.setComparator(11, ColecaoComparadoresSorteio.VU);
        } else {
            tableRowSorter.setComparator(5, ColecaoComparadoresSorteio.aaK);
            tableRowSorter.setComparator(6, ColecaoComparadoresSorteio.aaM);
            tableRowSorter.setComparator(7, ColecaoComparadoresSorteio.aaL);
            tableRowSorter.setComparator(8, ColecaoComparadoresSorteio.aaN);
            tableRowSorter.setComparator(9, ColecaoComparadoresSorteio.aaP);
            tableRowSorter.setComparator(10, ColecaoComparadoresSorteio.aaO);
            tableRowSorter.setComparator(11, ColecaoComparadoresSorteio.aaQ);
            tableRowSorter.setComparator(12, ColecaoComparadoresSorteio.aaZ);
            tableRowSorter.setComparator(13, ColecaoComparadoresSorteio.aaW);
            tableRowSorter.setComparator(15, ColecaoComparadoresSorteio.abd);
            tableRowSorter.setComparator(16, ColecaoComparadoresSorteio.abc);
            tableRowSorter.setComparator(17, ColecaoComparadoresSorteio.VU);
        }
        this.zj.getSelectionModel().addListSelectionListener(new ListenerSelecaoJogadorTabela(this));
        this.zj.addMouseListener(new ListenerCliqueTabelaJogadores2(this));
        if (this.zj.getRowCount() > 0) {
            this.zj.setRowSelectionInterval(0, 0);
        }
    }

    private void sG() {
        if (this.uk == this.ul || this.yp || this.yK.gl().booleanValue()) {
            this.MJ.setEnabled(false);
            this.FN.setEnabled(false);
            this.MK.setEnabled(false);
        } else if (this.yK != null) {
            this.MJ.setEnabled(this.yK.fz());
            this.FN.setEnabled(this.yK.ft());
            this.MK.setEnabled(true);
        }
    }

    private void sH() {
        this.uK.clear();
        this.uK.addAll(this.uk.kc());
        ((ModeloTabelaJogadoresDetalhado)this.zj.getModel()).fireTableDataChanged();
        Collections.sort(this.uK, KZ);
        if (this.zj.getRowCount() > 0) {
            this.zj.setRowSelectionInterval(0, 0);
            this.yK = (ModeloJogador)this.uK.get(0);
            this.sG();
            this.sF();
        }
        this.MP.setText(BalancoFinanceiro.c(this.ul.kb()));
    }

    public void F(ModeloTime ah2) {
        this.uk = ah2;
        this.yK = null;
        this.mK();
        if (this.zj.getRowCount() > 0) {
            this.zj.setRowSelectionInterval(0, 0);
        }
        Collections.sort(this.uK, KZ);
        this.zj.addNotify();
    }

    public void mK() {
        this.uu.setText(this.uk.getNome());
        this.MP.setText(BalancoFinanceiro.c(this.ul.kb()));
        if (this.uk.ka() != null) {
            this.MS.setText(this.uk.ka().dS());
        } else {
            this.MS.setText("interino");
        }
        this.MR.setText(ConstantesJogo.pZ[this.uk.getReputacao()]);
        this.Fq.setIcon(this.uk.kP());
        this.MQ.setText(EnumPaises.valueOf("P" + this.uk.getPais()).getNome());
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aflags/" + this.uk.getPais() + ".png"));
        this.MQ.setIcon(imageIcon);
        if (this.uk.getPais() == 29) {
            this.MQ.setText(String.valueOf(EnumPaises.valueOf("P" + this.uk.getPais()).getNome()) + " (" + ConstantesJogo.rX[this.uk.getEstado()] + ")");
        } else {
            this.MM.setVisible(false);
        }
        this.Hf.setValue(this.uk.ka().lL());
        this.Ig.setValue(this.uk.ka().lM());
        long l2 = 0L;
        int n2 = 0;
        while (n2 < this.uk.kc().size()) {
            ((ModeloJogador)this.uk.kc().get(n2)).a((ImageIcon)null);
            l2 += (long)((ModeloJogador)this.uk.kc().get(n2)).fk();
            ++n2;
        }
        this.MT.setText("Valor do elenco: " + BalancoFinanceiro.a(l2, 0));
        this.uK.clear();
        this.uK.addAll(this.uk.kc());
        ((ModeloTabelaJogadoresDetalhado)this.zj.getModel()).fireTableDataChanged();
        Collections.sort(this.uK, KZ);
    }

    private void mJ() {
        this.we = new JPanel();
        this.MO = new JLabel();
        this.ML = new JTabbedPane();
        this.zf = new JScrollPane();
        this.MN = new JLabel();
        this.zg = new JScrollPane();
        this.MU = new JTable();
        this.wf = new JPanel();
        this.Fq = new JLabel();
        this.uu = new JLabel();
        this.MS = new JLabel();
        this.MR = new JLabel();
        this.MQ = new JLabel();
        this.MM = new JLabel();
        this.MT = new JLabel();
        this.wg = new JPanel();
        this.ve = new JToolBar();
        this.HW = new JButton();
        this.HR = new JButton();
        this.Ie = new JButton();
        this.HY = new JButton();
        this.Ic = new JButton();
        this.ut = new JScrollPane();
        this.zj = new JTable();
        this.MP = new JLabel();
        this.vm = new JButton();
        this.MJ = new JButton();
        this.FN = new JButton();
        this.MK = new JButton();
        this.wh = new JPanel();
        this.a_ = new JLabel();
        this.ur = new JLabel();
        this.Hf = new JProgressBar();
        this.Ig = new JProgressBar();
        this.wi = new JScrollPane();
        this.uw = new JTree();
        this.setBackground(new Color(104, 120, 100));
        this.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
        this.MO.setFont(new Font("Tahoma", 0, 12));
        this.MO.setHorizontalAlignment(2);
        this.MO.setIcon(new ImageIcon(this.getClass().getResource("/aicons/1.png")));
        this.MO.setText("Marquinhos Paran\u00e1 - M");
        this.MN.setFont(new Font("Tahoma", 0, 12));
        this.MN.setText("");
        this.MN.setVerticalAlignment(1);
        this.zf.setViewportView(this.MN);
        this.ML.addTab("Info", this.zf);
        this.zg.setViewportView(this.MU);
        this.ML.addTab("Carreira", this.zg);
        GroupLayout groupLayout = new GroupLayout(this.we);
        this.we.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.MO, -1, 254, Short.MAX_VALUE).addComponent(this.ML, GroupLayout.Alignment.TRAILING, -2, 0, Short.MAX_VALUE)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(-1, Short.MAX_VALUE).addComponent(this.MO).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.ML, -2, 233, -2).addGap(208, 208, 208)));
        this.ML.getAccessibleContext().setAccessibleName("Info");
        this.ML.getAccessibleContext().setAccessibleDescription("");
        this.wf.setBackground(new Color(44, 53, 49));
        this.Fq.setIcon(new ImageIcon(this.getClass().getResource("/aicons/escudo.png")));
        this.uu.setFont(new Font("Tahoma", 1, 14));
        this.uu.setForeground(new Color(255, 255, 255));
        this.uu.setText("Cruzeiro");
        this.MS.setForeground(new Color(255, 255, 255));
        this.MS.setText("Marcelo Oliveira");
        this.MR.setForeground(new Color(255, 255, 255));
        this.MR.setText("Continental");
        this.MQ.setForeground(new Color(255, 255, 255));
        this.MQ.setText("Brasil");
        this.MM.setForeground(new Color(255, 255, 255));
        this.MM.setHorizontalAlignment(0);
        this.MM.setText("");
        this.MT.setForeground(new Color(255, 255, 255));
        this.MT.setText("Valor elenco:");
        GroupLayout groupLayout2 = new GroupLayout(this.wf);
        this.wf.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addComponent(this.Fq, -2, 60, -2).addGap(18, 18, 18).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.MS, -1, 294, Short.MAX_VALUE).addComponent(this.uu, -1, -1, Short.MAX_VALUE).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.MR, -2, 73, -2).addGap(18, 18, 18).addComponent(this.MQ, -1, -1, Short.MAX_VALUE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.MM, -2, 42, -2)).addComponent(this.MT, -1, -1, Short.MAX_VALUE)).addContainerGap()))));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.uu).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.MS).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.MR).addComponent(this.MQ).addComponent(this.MM))).addComponent(this.Fq, -2, 60, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.MT).addContainerGap(19, Short.MAX_VALUE)));
        this.wg.setBackground(new Color(36, 91, 45));
        this.ve.setBackground(new Color(44, 53, 49));
        this.ve.setRollover(true);
        this.ve.setBorderPainted(false);
        this.HW.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon09.png")));
        this.HW.setBorderPainted(false);
        this.HW.setFocusable(false);
        this.HW.setHorizontalTextPosition(0);
        this.HW.setOpaque(false);
        this.HW.setVerticalTextPosition(3);
        this.ve.add(this.HW);
        this.HR.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon02.png")));
        this.HR.setBorderPainted(false);
        this.HR.setFocusable(false);
        this.HR.setHorizontalTextPosition(0);
        this.HR.setOpaque(false);
        this.HR.setVerticalTextPosition(3);
        this.ve.add(this.HR);
        this.Ie.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon10.png")));
        this.Ie.setBorderPainted(false);
        this.Ie.setFocusable(false);
        this.Ie.setHorizontalTextPosition(0);
        this.Ie.setOpaque(false);
        this.Ie.setVerticalTextPosition(3);
        this.ve.add(this.Ie);
        this.HY.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon11.png")));
        this.HY.setBorderPainted(false);
        this.HY.setFocusable(false);
        this.HY.setHorizontalTextPosition(0);
        this.HY.setMaximumSize(new Dimension(41, 41));
        this.HY.setOpaque(false);
        this.HY.setVerticalTextPosition(3);
        this.ve.add(this.HY);
        this.Ic.setIcon(new ImageIcon(this.getClass().getResource("/aicons/icon12.png")));
        this.Ic.setBorderPainted(false);
        this.Ic.setFocusable(false);
        this.Ic.setHorizontalTextPosition(0);
        this.Ic.setOpaque(false);
        this.Ic.setVerticalTextPosition(3);
        this.ve.add(this.Ic);
        GroupLayout groupLayout3 = new GroupLayout(this.wg);
        this.wg.setLayout(groupLayout3);
        groupLayout3.setHorizontalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ve, -1, -1, Short.MAX_VALUE));
        groupLayout3.setVerticalGroup(groupLayout3.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout3.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(this.ve, -2, -1, -2)));
        this.ut.setViewportView(this.zj);
        this.MP.setForeground(new Color(255, 255, 255));
        this.MP.setText("Dinheiro em caixa:");
        this.vm.setText("Fechar");
        this.MJ.setText("Empr\u00e9stimo");
        this.FN.setText("Comprar");
        this.MK.setText("Fazer oferta");
        this.wh.setBackground(new Color(44, 53, 49));
        this.a_.setForeground(new Color(255, 255, 255));
        this.a_.setHorizontalAlignment(2);
        this.a_.setText("Confian\u00e7a Diretoria:");
        this.ur.setForeground(new Color(255, 255, 255));
        this.ur.setHorizontalAlignment(2);
        this.ur.setText("Confian\u00e7a Torcida:");
        this.Hf.setMinimum(1);
        this.Ig.setMinimum(1);
        GroupLayout groupLayout4 = new GroupLayout(this.wh);
        this.wh.setLayout(groupLayout4);
        groupLayout4.setHorizontalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a_, -2, 115, -2).addComponent(this.ur, -2, 123, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.Hf, -2, 115, -2).addComponent(this.Ig, -2, 115, -2)).addContainerGap(13, Short.MAX_VALUE)));
        groupLayout4.setVerticalGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout4.createSequentialGroup().addContainerGap().addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a_).addComponent(this.Hf, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout4.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ur).addComponent(this.Ig, -2, -1, -2)).addContainerGap(18, Short.MAX_VALUE)));
        DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode("Times");
        DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode("Brasil");
        DefaultMutableTreeNode defaultMutableTreeNode3 = new DefaultMutableTreeNode("1\u00aa divis\u00e3o");
        DefaultMutableTreeNode defaultMutableTreeNode4 = new DefaultMutableTreeNode("Cruzeiro");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode4 = new DefaultMutableTreeNode("Atl\u00e9tico");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode2.add(defaultMutableTreeNode3);
        defaultMutableTreeNode3 = new DefaultMutableTreeNode("2\u00aa divis\u00e3o");
        defaultMutableTreeNode4 = new DefaultMutableTreeNode("Barcelona");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode4 = new DefaultMutableTreeNode("Real Madrid");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode2.add(defaultMutableTreeNode3);
        defaultMutableTreeNode.add(defaultMutableTreeNode2);
        defaultMutableTreeNode2 = new DefaultMutableTreeNode("Espanha");
        defaultMutableTreeNode3 = new DefaultMutableTreeNode("1\u00aa Divis\u00e3o");
        defaultMutableTreeNode4 = new DefaultMutableTreeNode("Sevilla");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode4 = new DefaultMutableTreeNode("Gijon");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode2.add(defaultMutableTreeNode3);
        defaultMutableTreeNode3 = new DefaultMutableTreeNode("2\u00aa divis\u00e3o");
        defaultMutableTreeNode4 = new DefaultMutableTreeNode("Sporting");
        defaultMutableTreeNode3.add(defaultMutableTreeNode4);
        defaultMutableTreeNode2.add(defaultMutableTreeNode3);
        defaultMutableTreeNode.add(defaultMutableTreeNode2);
        defaultMutableTreeNode2 = new DefaultMutableTreeNode("Outros Times");
        defaultMutableTreeNode3 = new DefaultMutableTreeNode("M\u00e1laga");
        defaultMutableTreeNode2.add(defaultMutableTreeNode3);
        defaultMutableTreeNode3 = new DefaultMutableTreeNode("Alecrim");
        defaultMutableTreeNode2.add(defaultMutableTreeNode3);
        defaultMutableTreeNode.add(defaultMutableTreeNode2);
        this.uw.setModel(new DefaultTreeModel(defaultMutableTreeNode));
        this.wi.setViewportView(this.uw);
        GroupLayout groupLayout5 = new GroupLayout(this);
        this.setLayout(groupLayout5);
        groupLayout5.setHorizontalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addGap(20, 20, 20).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.MP, -1, -1, Short.MAX_VALUE).addGap(41, 41, 41)).addGroup(groupLayout5.createSequentialGroup().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.wi).addComponent(this.we, -1, -1, Short.MAX_VALUE)).addGap(22, 22, 22))).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.MJ, -2, 126, -2).addGap(21, 21, 21).addComponent(this.FN, -2, 120, -2).addGap(18, 18, 18).addComponent(this.MK, -2, 122, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.vm, -2, 116, -2)).addComponent(this.ut, GroupLayout.Alignment.TRAILING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.wf, -2, -1, -2).addGap(18, 18, 18).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.wh, -1, -1, Short.MAX_VALUE).addComponent(this.wg, -1, -1, Short.MAX_VALUE)))).addGap(29, 29, 29)));
        groupLayout5.setVerticalGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addGap(13, 13, 13).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout5.createSequentialGroup().addComponent(this.wh, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.wg, -2, -1, -2)).addComponent(this.wf, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.ut, -1, 509, Short.MAX_VALUE)).addGroup(groupLayout5.createSequentialGroup().addComponent(this.wi, -2, 351, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.we, -2, 280, Short.MAX_VALUE))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout5.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.MP, -2, 39, -2).addComponent(this.vm).addComponent(this.MJ).addComponent(this.FN).addComponent(this.MK)).addContainerGap()));
    }

    static /* synthetic */ JDialog a(TelaGerenciamentoClube iA2) {
        return iA2.ub;
    }

    static /* synthetic */ void b(TelaGerenciamentoClube iA2) {
        iA2.sD();
    }

    static /* synthetic */ void c(TelaGerenciamentoClube iA2) {
        iA2.sC();
    }

    static /* synthetic */ void d(TelaGerenciamentoClube iA2) {
        iA2.rw();
    }

    static /* synthetic */ void e(TelaGerenciamentoClube iA2) {
        iA2.qP();
    }

    static /* synthetic */ void f(TelaGerenciamentoClube iA2) {
        iA2.sB();
    }

    static /* synthetic */ void g(TelaGerenciamentoClube iA2) {
        iA2.sz();
    }

    static /* synthetic */ void h(TelaGerenciamentoClube iA2) {
        iA2.oM();
    }

    static /* synthetic */ void i(TelaGerenciamentoClube iA2) {
        iA2.sA();
    }

    static /* synthetic */ JTree j(TelaGerenciamentoClube iA2) {
        return iA2.uw;
    }

    static /* synthetic */ JTable k(TelaGerenciamentoClube iA2) {
        return iA2.zj;
    }

    static /* synthetic */ ModeloJogador l(TelaGerenciamentoClube iA2) {
        return iA2.yK;
    }
}

