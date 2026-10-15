package telas;

import telas.PainelCalendarioTime;
import telas.DialogoRetrospectoTime;
import telas.ListenerAbrirCalendarioSelecao2;
import telas.ListenerAbrirGaleriaTrofeusSelecao;
import telas.ListenerAbrirRetrospectoSelecao;
import telas.ListenerSelecaoRankingSelecoes;
import telas.ComparadorPontosCrescente;
import telas.ComparadorPontosEDesempate;
import telas.ListenerAtualizarRankingSelecoes;
import telas.ListenerFecharRankingSelecoes;
import tabelas.RendererRankingNomeTime;
import tabelas.ModeloTabelaReputacaoTimes;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import components.ItemRankingTime;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

public class PainelRankingSelecoes
extends JPanel {
    private JDialog ub;
    private ModeloTime uk = null;
    private ModeloTime KF = null;
    private ArrayList KG = new ArrayList();
    private ArrayList KH = new ArrayList();
    private ArrayList Fj = new ArrayList();
    private int vk = -1;
    private int vl = -1;
    private int w = 0;
    public static Comparator KI = new ComparadorPontosCrescente();
    public static Comparator KJ = new ComparadorPontosEDesempate();
    private JButton HR;
    private JButton vm;
    private JButton HY;
    private JButton Ie;
    private JComboBox ue;
    private JLabel ug;
    private JScrollPane ut;
    private JToolBar ve;
    private JTable vn;

    public PainelRankingSelecoes(JDialog jDialog, ModeloTime ah2) {
        this.ub = jDialog;
        this.KF = ah2;
        this.mJ();
        this.mH();
        this.mQ();
        this.w = 2;
        this.ue.setSelectedIndex(0);
        this.vn.setRowSelectionInterval(0, 0);
        this.mG();
    }

    private void mQ() {
        this.ue.addItem("Europa");
        this.ue.addItem("Am\u00e9rica do Sul");
        this.ue.addItem("\u00c1frica");
        this.ue.addItem("\u00c1sia");
        this.ue.addItem("Concacaf");
        this.ue.addItem("Oceania");
        this.ue.addActionListener(new ListenerAtualizarRankingSelecoes(this));
    }

    private void AQ() {
        this.dw(this.ue.getSelectedIndex());
    }

    private void mG() {
        this.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 1));
        this.ve.setBackground(ConstantesJogo.E(GerenciadorJogo.vM().getCorTema(), 2));
    }

    private void dw(int n2) {
        this.KG.clear();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.aG().size()) {
            if (((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).jo() != null && ((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).gg() == n2 && ((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).jc() != 135) {
                this.KG.add(((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).jo());
            }
            ++n3;
        }
        this.w = 1;
        this.KH.clear();
        n3 = 0;
        while (n3 < this.KG.size()) {
            ItemRankingTime ae2 = new ItemRankingTime();
            ae2.n((ModeloTime)this.KG.get(n3));
            ae2.a(this.w);
            if (this.w == 0) {
                ae2.dQ(((ModeloTime)this.KG.get(n3)).getReputacao());
            } else if (this.w == 1) {
                ae2.m(((ModeloTime)this.KG.get(n3)).ld());
            } else if (this.w == 2) {
                ae2.dQ(((ModeloTime)this.KG.get(n3)).lb());
            }
            this.KH.add(ae2);
            ++n3;
        }
        if (this.w == 1) {
            Collections.sort(this.KH, KJ);
        } else {
            Collections.sort(this.KH, KI);
        }
        this.dx(this.w);
        this.vn.setRowSelectionInterval(0, 0);
        this.vn.scrollRectToVisible(new Rectangle(this.vn.getCellRect(0, 0, true)));
    }

    public void mH() {
        this.vm.addActionListener(new ListenerFecharRankingSelecoes(this));
        this.HR.addActionListener(new ListenerAbrirCalendarioSelecao2(this));
        this.Ie.addActionListener(new ListenerAbrirGaleriaTrofeusSelecao(this));
        this.HY.addActionListener(new ListenerAbrirRetrospectoSelecao(this));
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

    private void rw() {
        this.Ie.setCursor(new Cursor(3));
        GerenciadorTelas.v(this.uk);
        this.Ie.setCursor(new Cursor(12));
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

    private void dx(int n2) {
        ModeloTabelaReputacaoTimes h_02 = new ModeloTabelaReputacaoTimes(this.KH, n2);
        this.vn.setModel(h_02);
        int[] nArray = new int[]{40, 200, 150, 40};
        int n3 = 0;
        while (n3 < nArray.length) {
            this.vn.getColumnModel().getColumn(n3).setPreferredWidth(nArray[n3]);
            ++n3;
        }
        this.vn.getColumnModel().getColumn(0).setMaxWidth(40);
        this.vn.getColumnModel().getColumn(1).setMaxWidth(200);
        this.vn.getColumnModel().getColumn(2).setMaxWidth(200);
        this.vn.setAutoResizeMode(3);
        this.vn.setRowHeight(20);
        this.vn.setShowGrid(false);
        this.vn.setDefaultRenderer(ItemRankingTime.class, new RendererRankingNomeTime());
        this.vn.setAutoCreateRowSorter(false);
        this.vn.getTableHeader().setReorderingAllowed(false);
        this.vn.setIntercellSpacing(new Dimension(0, 0));
        this.vn.setCellSelectionEnabled(false);
        this.vn.setSelectionMode(0);
        this.vn.setRowSelectionAllowed(true);
        this.vn.setSelectionBackground(Color.YELLOW);
        this.vn.setFillsViewportHeight(true);
        this.vn.getSelectionModel().addListSelectionListener(new ListenerSelecaoRankingSelecoes(this));
    }

    private void mJ() {
        this.ug = new JLabel();
        this.ue = new JComboBox();
        this.vm = new JButton();
        this.ut = new JScrollPane();
        this.vn = new JTable();
        this.ve = new JToolBar();
        this.HR = new JButton();
        this.Ie = new JButton();
        this.HY = new JButton();
        this.setBackground(new Color(104, 120, 100));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.ug.setFont(new Font("Tahoma", 1, 12));
        this.ug.setForeground(new Color(255, 255, 255));
        this.ug.setText("Ranking de Sele\u00e7\u00f5es");
        this.vm.setText("X");
        this.vn.setModel(new DefaultTableModel(new Object[0][], new String[0]));
        this.ut.setViewportView(this.vn);
        this.ve.setBackground(new Color(0, 51, 51));
        this.ve.setRollover(true);
        this.ve.setBorderPainted(false);
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
        this.HY.setMaximumSize(new Dimension(31, 31));
        this.HY.setOpaque(false);
        this.HY.setVerticalTextPosition(3);
        this.ve.add(this.HY);
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.ve, -1, -1, Short.MAX_VALUE).addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup().addComponent(this.ug, -2, 154, -2).addGap(18, 18, 18).addComponent(this.ue, 0, 156, Short.MAX_VALUE).addGap(18, 18, 18).addComponent(this.vm, -2, 52, -2)).addComponent(this.ut, -2, 0, Short.MAX_VALUE)).addContainerGap(22, Short.MAX_VALUE)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(16, 16, 16).addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ug).addComponent(this.ue, -2, 23, -2))).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(this.vm))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.ut, -2, 554, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.ve, -2, -1, -2).addContainerGap()));
        this.ug.getAccessibleContext().setAccessibleName("Ranking de Sele\u00e7\u00f5es");
    }

    static /* synthetic */ void a(PainelRankingSelecoes jv2) {
        jv2.AQ();
    }

    static /* synthetic */ JDialog b(PainelRankingSelecoes jv2) {
        return jv2.ub;
    }

    static /* synthetic */ void c(PainelRankingSelecoes jv2) {
        jv2.sD();
    }

    static /* synthetic */ void d(PainelRankingSelecoes jv2) {
        jv2.rw();
    }

    static /* synthetic */ void e(PainelRankingSelecoes jv2) {
        jv2.qP();
    }

    static /* synthetic */ JTable f(PainelRankingSelecoes jv2) {
        return jv2.vn;
    }

    static /* synthetic */ ArrayList g(PainelRankingSelecoes jv2) {
        return jv2.KH;
    }

    static /* synthetic */ void a(PainelRankingSelecoes jv2, ModeloTime ah2) {
        jv2.uk = ah2;
    }
}

