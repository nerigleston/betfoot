package a;

import static c.a.SR;
import static c.a.vM;

import a.ga_0;
import a.gb_0;
import a.gc_0;
import a.gd_0;
import a.gy_0;
import a.gz_0;
import b.ay;
import b.d_0;
import best.F;
import best.ad;
import best.af;
import best.ah;
import best.aq;
import best.n_0;
import best.s_0;
import components.O;
import components.a;
import components.aa;
import components.b_0;
import h.a_0;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class gx_0
extends JPanel {
    private JDialog ub;
    private ArrayList uK = new ArrayList();
    private ArrayList vp = new ArrayList();
    private String pU = "Qualquer";
    private ah Af = null;
    private ah zu = null;
    private int w;
    private boolean yp = false;
    private JButton yY;
    private JButton Kf;
    private JScrollPane ut;
    private JLabel zh;
    private O zi;
    private JTable zj;

    public gx_0(JDialog jDialog, ah ah2, boolean bl, int n2) {
        this.ub = jDialog;
        this.Af = ah2;
        this.yp = bl;
        this.w = n2;
        if (n2 == 1) {
            this.mJ();
        } else {
            this.rS();
        }
        if (n2 == 1) {
            this.nE();
        } else {
            this.nF();
        }
        this.mH();
        this.mK();
        this.mY();
        this.mG();
    }

    private void mG() {
        this.setBackground(aq.E(vM().getCorTema(), 1));
    }

    public void s(F f2) {
        this.zu = f2.fg();
    }

    private void mK() {
        this.zi.mK();
    }

    public void mH() {
        this.yY.addActionListener(new gy_0(this));
        this.Kf.addActionListener(new gz_0(this));
        this.zj.getSelectionModel().addListSelectionListener(new ga_0(this));
        this.zj.addMouseListener(new gb_0(this));
    }

    private void mY() {
        this.a(this);
        this.a(this.zj);
        this.a(this.yY);
    }

    private void a(JComponent jComponent) {
        InputMap inputMap = jComponent.getInputMap(1);
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(10, 0), "st");
        jComponent.getInputMap().put(KeyStroke.getKeyStroke(27, 0), "esc");
        ActionMap actionMap = this.getActionMap();
        jComponent.getActionMap().put("st", new gc_0(this));
        jComponent.getActionMap().put("esc", new gd_0(this));
    }

    public void rQ() {
        if (this.zu != null && this.Af != null) {
            s_0.a(this.zu, this.Af, this.yp);
        }
    }

    private void rR() {
        this.zi.rR();
    }

    private void nD() {
        Object object;
        af af2 = new af();
        af2.setNome(this.zi.uf.getText());
        af2.bv(this.zi.Nq.getSelectedIndex() - 1);
        af2.bw(this.zi.Qx.getSelectedIndex() - 1);
        if (this.w == 1) {
            if (this.zi.QB.getValue() > this.zi.QB.getMinimum() || this.zi.QB.uv() < this.zi.QB.getMaximum()) {
                af2.bM(this.zi.QB.getValue());
                af2.bN(this.zi.QB.uv());
                af2.bx(0);
            } else {
                af2.bx(-1);
            }
        } else {
            object = new String[]{"gol", "des", "vel", "fin", "arm", "tec", "pas"};
            aa[] aaArray = new aa[]{this.zi.QN, this.zi.QL, this.zi.QQ, this.zi.QM, this.zi.QK, this.zi.QP, this.zi.QO};
            int n2 = 0;
            while (n2 < aaArray.length) {
                if (aaArray[n2].getValue() > aaArray[n2].getMinimum() || aaArray[n2].uv() < aaArray[n2].getMaximum()) {
                    af2.b(((String[])object)[n2], aaArray[n2].getValue(), aaArray[n2].uv());
                }
                ++n2;
            }
        }
        if (this.zi.QC.getValue() > this.zi.QC.getMinimum() || this.zi.QC.uv() < this.zi.QC.getMaximum()) {
            af2.bO(this.zi.QC.getValue());
            af2.bP(this.zi.QC.uv());
            if (this.zi.QC.uv() == this.zi.QC.getMaximum()) {
                af2.bP(100);
            }
            af2.by(0);
        } else {
            af2.by(-1);
        }
        af2.bz(this.zi.Qy.getSelectedIndex() - 1);
        af2.bA(this.zi.Qv.getSelectedIndex() - 1);
        af2.bB(this.zi.Qw.getSelectedIndex() - 1);
        if (this.zi.BD.getSelectedIndex() > 0) {
            object = (String)this.zi.BD.getSelectedItem();
            int n3 = n_0.h((String)object);
            af2.bC(((ad)n_0.cY().get(n3)).getPais());
        }
        af2.bD(this.zi.Qu.getSelectedIndex() - 1);
        af2.E(this.zi.Qs.isSelected());
        af2.F(this.zi.Qt.isSelected());
        af2.G(this.zi.Qr.isSelected());
        af2.H(this.zi.Qq.isSelected());
        this.vp.clear();
        this.uK.clear();
        this.zj.addNotify();
        this.vp = af2.D(false);
        int n4 = 0;
        int n5 = 0;
        while (n5 < this.vp.size()) {
            this.uK.add((F)this.vp.get(n5));
            ++n4;
            ++n5;
        }
        if (this.uK.size() == 0) {
            this.zh.setText("Nenhum jogador encontrado");
        } else if (this.uK.size() == 1) {
            this.zh.setText("1 jogador encontrado");
        } else {
            this.zh.setText(String.valueOf(Integer.toString(this.uK.size())) + " jogadores encontrados");
        }
        if (this.w == 1) {
            this.nE();
        } else {
            this.nF();
        }
        if (this.zj.getRowCount() > 0) {
            this.zj.setRowSelectionInterval(0, 0);
        }
    }

    private void nF() {
        d_0 d_02 = new d_0(this.uK, this);
        this.zj.setModel(d_02);
        int[] nArray = new int[]{20, 45, 120, 120, 20, 20, 50, 50, 45, 35, 25, 20, 20};
        int[] nArray2 = new int[]{20, 50, 110, 100, 20, 20, 20, 20, 20, 20, 20, 20, 50, 50, 45, 35, 25, 15, 15};
        if (SR.isHabilidadeIndividual()) {
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
        this.zj.setDefaultRenderer(F.class, new ay());
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
        tableRowSorter.setComparator(0, a_0.abe);
        tableRowSorter.setComparator(1, a_0.cL);
        tableRowSorter.setComparator(2, a_0.abk);
        tableRowSorter.setComparator(3, a_0.abl);
        tableRowSorter.setComparator(4, a_0.aba);
        if (!SR.isHabilidadeIndividual()) {
            tableRowSorter.setComparator(5, a_0.aaJ);
            tableRowSorter.setComparator(6, a_0.aaZ);
            tableRowSorter.setComparator(7, a_0.aaW);
            tableRowSorter.setComparator(9, a_0.abd);
            tableRowSorter.setComparator(10, a_0.VU);
            tableRowSorter.setComparator(11, a_0.aaX);
            tableRowSorter.setComparator(12, a_0.aaY);
        } else {
            tableRowSorter.setComparator(5, a_0.aaK);
            tableRowSorter.setComparator(6, a_0.aaM);
            tableRowSorter.setComparator(7, a_0.aaL);
            tableRowSorter.setComparator(8, a_0.aaN);
            tableRowSorter.setComparator(9, a_0.aaP);
            tableRowSorter.setComparator(10, a_0.aaO);
            tableRowSorter.setComparator(11, a_0.aaQ);
            tableRowSorter.setComparator(12, a_0.aaZ);
            tableRowSorter.setComparator(13, a_0.aaW);
            tableRowSorter.setComparator(15, a_0.abd);
            tableRowSorter.setComparator(16, a_0.VU);
            tableRowSorter.setComparator(17, a_0.aaX);
            tableRowSorter.setComparator(18, a_0.aaY);
        }
    }

    private void nE() {
        d_0 d_02 = new d_0(this.uK, this);
        this.zj.setModel(d_02);
        int[] nArray = new int[]{20, 45, 120, 120, 20, 20, 50, 50, 45, 35, 25, 20, 20};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.zj.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.zj.setAutoResizeMode(3);
        this.zj.setRowHeight(20);
        this.zj.setShowGrid(false);
        this.zj.setDefaultRenderer(F.class, new ay());
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
        tableRowSorter.setComparator(0, a_0.abe);
        tableRowSorter.setComparator(1, a_0.cL);
        tableRowSorter.setComparator(2, a_0.abk);
        tableRowSorter.setComparator(3, a_0.abl);
        tableRowSorter.setComparator(4, a_0.aba);
        tableRowSorter.setComparator(5, a_0.aaJ);
        tableRowSorter.setComparator(6, a_0.aaZ);
        tableRowSorter.setComparator(7, a_0.aaW);
        tableRowSorter.setComparator(9, a_0.abd);
        tableRowSorter.setComparator(10, a_0.VU);
        tableRowSorter.setComparator(11, a_0.aaX);
        tableRowSorter.setComparator(12, a_0.aaY);
    }

    private void mJ() {
        this.ut = new JScrollPane();
        this.zj = new JTable();
        this.zh = new JLabel();
        this.Kf = new JButton();
        this.yY = new JButton();
        this.zi = new O(this.ub, this.w);
        this.setBackground(new Color(176, 161, 142));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.setMinimumSize(new Dimension(800, 600));
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(new b_0());
        this.ut.setViewportView(this.zj);
        this.add((Component)this.ut, new a(10, 290, 800, 320));
        this.zh.setForeground(new Color(255, 255, 255));
        this.zh.setText("");
        this.add((Component)this.zh, new a(510, 260, 290, -1));
        this.Kf.setForeground(new Color(51, 102, 0));
        this.Kf.setText("Resetar filtros");
        this.add((Component)this.Kf, new a(10, 250, 130, 30));
        this.yY.setForeground(new Color(51, 102, 0));
        this.yY.setText("Procurar");
        this.add((Component)this.yY, new a(340, 250, 130, 30));
        this.add((Component)this.zi, new a(10, 20, 800, 210));
    }

    private void rS() {
        this.ut = new JScrollPane();
        this.zj = new JTable();
        this.zh = new JLabel();
        this.Kf = new JButton();
        this.yY = new JButton();
        this.zi = new O(this.ub, this.w);
        this.setBackground(new Color(176, 161, 142));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.setMinimumSize(new Dimension(800, 600));
        this.setPreferredSize(new Dimension(840, 670));
        this.setLayout(new b_0());
        this.ut.setViewportView(this.zj);
        this.add((Component)this.ut, new a(10, 370, 815, 280));
        this.zh.setForeground(new Color(255, 255, 255));
        this.zh.setText("");
        this.add((Component)this.zh, new a(530, 330, 173, -1));
        this.Kf.setForeground(new Color(51, 102, 0));
        this.Kf.setText("Resetar");
        this.add((Component)this.Kf, new a(10, 330, 105, 30));
        this.yY.setForeground(new Color(51, 102, 0));
        this.yY.setText("Procurar");
        this.add((Component)this.yY, new a(340, 330, 105, 30));
        this.add((Component)this.zi, new a(10, 10, 815, 300));
    }

    static /* synthetic */ void a(gx_0 gx_02) {
        gx_02.nD();
    }

    static /* synthetic */ void b(gx_0 gx_02) {
        gx_02.rR();
    }

    static /* synthetic */ JTable c(gx_0 gx_02) {
        return gx_02.zj;
    }

    static /* synthetic */ JDialog d(gx_0 gx_02) {
        return gx_02.ub;
    }
}

