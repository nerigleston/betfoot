package a;
import static f.e.chamaYc;

import static f.a_0.eX;
import static f.d.yc;
import static h.a_0.abj;
import static h.a_0.abn;

import a.am;
import a.an;
import a.ao;
import a.ap_0;
import a.aq_0;
import a.ar_0;
import a.as_0;
import a.at_0;
import a.au_0;
import a.av_0;
import a.aw_0;
import a.ax;
import atalhos.AtalhosAl;
import b.a_0;
import b.af;
import b.aj;
import b.m;
import b.n_0;
import best.G;
import best.I;
import best.Z;
import best.ah;
import best.aq;
import best.at;
import c.a;
import components.d;
import components.e;
import components.w_0;
import f.F;
import f.H;
import f.b_0;
import f.c;
import f.d_0;
import f.e_0;
import f.f_0;
import f.g;
import f.g_0;
import f.h_0;
import f.i_0;
import f.j;
import f.k;
import f.l_0;
import f.m_0;
import f.n;
import f.o;
import f.p;
import f.q;
import f.r;
import f.s;
import f.t;
import f.u;
import f.v;
import f.w;
import f.x;
import f.y;
import f.z;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collections;
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
import javax.swing.table.AbstractTableModel;

public class al
extends JPanel {
    private JDialog ub;
    private ArrayList cS = new ArrayList();
    private ArrayList vS = new ArrayList();
    private ArrayList vT = new ArrayList();
    private ArrayList vU = new ArrayList();
    private ArrayList vV = new ArrayList();
    private ArrayList wr = new ArrayList();
    private ArrayList ws = new ArrayList();
    private ArrayList wt = new ArrayList();
    private s vW = null;
    private at vX = null;
    private z vY = null;
    private z wu = null;
    private ImageIcon uL = new ImageIcon(this.getClass().getResource("/aiconsb/b0.png"));
    private ImageIcon uM = new ImageIcon(this.getClass().getResource("/aiconsb/b1.png"));
    private ImageIcon uN = new ImageIcon(this.getClass().getResource("/aiconsb/b2.png"));
    private ImageIcon uO = new ImageIcon(this.getClass().getResource("/aiconsb/b3.png"));
    private ImageIcon uP = new ImageIcon(this.getClass().getResource("/aiconsb/b4.png"));
    private ImageIcon uQ = new ImageIcon(this.getClass().getResource("/aiconsb/b0s.png"));
    private ImageIcon uR = new ImageIcon(this.getClass().getResource("/aiconsb/b1s.png"));
    private ImageIcon uS = new ImageIcon(this.getClass().getResource("/aiconsb/b2s.png"));
    private ImageIcon uT = new ImageIcon(this.getClass().getResource("/aiconsb/b3s.png"));
    private ImageIcon uU = new ImageIcon(this.getClass().getResource("/aiconsb/b4s.png"));
    private int wv = -1;
    private int wa = -1;
    private int ww = -1;
    private at wb = null;
    boolean wx = false;
    boolean wy = false;
    boolean wz = false;
    boolean wA = false;
    boolean wB = false;
    int wC = -1;
    boolean wD = false;
    boolean wE = false;
    int wF = 0;
    boolean wG = false;
    int wH = 0;
    int wI = 0;
    boolean wJ = false;
    private ArrayList wK = new ArrayList();
    private JButton wL;
    private JButton wM;
    private JButton uW;
    private JButton vi;
    private JButton wN;
    private JButton wO;
    private JButton vm;
    private JButton uX;
    private JButton uY;
    private JButton uZ;
    private JComboBox va;
    private JPanel vd;
    private JPanel wP;
    private JPanel wQ;
    private JScrollPane ut;
    private JScrollPane wi;
    private JToolBar ve;
    private JLabel wm;
    private JLabel wR;
    private JLabel vf;
    private JTable wp;
    private JTable vN;
    private JComboBox wS;

    public al(JDialog jDialog, int n2, at at2) {
        this.ub = jDialog;
        this.wb = at2;
        this.mJ();
        this.mQ();
        this.mH();
        this.nj();
        this.wG = false;
        this.wE = false;
        this.mO();
        this.mP();
        int n3 = 0;
        if (n2 == 3) {
            n3 = 2;
        }
        if (n2 == 4 || n2 == 5 || n2 == 6 || n2 == 8) {
            n3 = 1;
        }
        if (n2 == 7 || n2 == 9) {
            n3 = 3;
        }
        this.cB(n3);
        this.ut.setBorder(BorderFactory.createEmptyBorder());
        this.wi.setBorder(BorderFactory.createEmptyBorder());
        this.wM.setDisabledIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftd.png")));
        this.wO.setDisabledIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftd.png")));
        this.wL.setDisabledIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftda.png")));
        this.wN.setDisabledIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftda.png")));
        this.wm.setForeground(new Color(255, 255, 255));
        this.wN.setForeground(new Color(255, 255, 255));
        this.wO.setForeground(new Color(255, 255, 255));
        this.wR.setForeground(new Color(255, 255, 255));
        this.vd.setBackground(new Color(35, 28, 14));
        this.vd.setOpaque(true);
        this.vf.setText("Classifica\u00e7\u00e3o e jogos - " + Integer.toString(a.SR.H() + a.SR.iU()));
        this.mG();
    }

    private void mG() {
        this.setBackground(aq.E(a.vM().getCorTema(), 1));
    }

    private void mQ() {
        aj aj2 = new aj();
        this.va.setPreferredSize(new Dimension(10, 25));
        this.va.setRenderer(aj2);
        this.va.setMaximumRowCount(24);
        this.va.addActionListener(new am(this));
    }

    private void mO() {
        if (!a.SR.isJogaEstadual()) {
            this.uW.setVisible(false);
        }
        if (!a.SR.isJogaRegionais()) {
            this.vi.setVisible(false);
        }
        if (!a.SR.isJogaSelecoesAll()) {
            this.uZ.setVisible(false);
        }
        if (!a.SR.isJogaIntClubes()) {
            this.uX.setVisible(false);
        }
    }

    private void mP() {
        this.uY.addActionListener(new aq_0(this));
        this.uX.addActionListener(new ar_0(this));
        this.uW.addActionListener(new as_0(this));
        this.uZ.addActionListener(new at_0(this));
        this.vi.addActionListener(new au_0(this));
    }

    private void cA(int n2) {
        JButton[] jButtonArray = new JButton[]{this.uY, this.uX, this.uW, this.uZ, this.vi};
        ImageIcon[] imageIconArray = new ImageIcon[]{this.uL, this.uM, this.uN, this.uO, this.uP};
        ImageIcon[] imageIconArray2 = new ImageIcon[]{this.uQ, this.uR, this.uS, this.uT, this.uU};
        int n3 = 0;
        while (n3 < jButtonArray.length) {
            jButtonArray[n3].setIcon(imageIconArray[n3]);
            ++n3;
        }
        jButtonArray[n2].setIcon(imageIconArray2[n2]);
    }

    private void cB(int n2) {
        this.wG = false;
        this.wE = false;
        this.wD = false;
        this.cA(n2);
        this.cS = at.a(n2, false, 0);
        this.va.removeAllItems();
        if (n2 == 2) {
            Collections.sort(this.cS, abj);
        }
        int n3 = 0;
        while (n3 < this.cS.size()) {
            this.va.addItem(this.cS.get(n3));
            ++n3;
        }
        this.va.setSelectedItem(this.wb);
    }

    public void mH() {
        this.vm.addActionListener(new av_0(this));
        this.wN.addActionListener(new aw_0(this));
        this.wO.addActionListener(new ax(this));
        this.wL.addActionListener(new an(this));
        this.wM.addActionListener(new ao(this));
    }

    private void b(int n2, boolean bl) {
        if (n2 == 0) {
            this.wN.setEnabled(bl);
        }
        if (n2 == 1) {
            this.wO.setEnabled(bl);
        }
    }

    private void c(int n2, boolean bl) {
        if (n2 == 0) {
            this.wL.setEnabled(bl);
        }
        if (n2 == 1) {
            this.wM.setEnabled(bl);
        }
    }

    private void Q(boolean bl) {
        this.wQ.setVisible(bl);
        this.wi.setVisible(bl);
    }

    private void cH(int n2) {
        if (this.wJ) {
            this.cL(this.wI + n2);
        } else if (this.wG) {
            this.cK(this.wa + n2);
        } else if (this.wa == 2 && n2 == -1) {
            if (this.ww > 0) {
                --this.ww;
                this.cI(this.wa);
            } else {
                this.cI(this.wa + n2);
            }
        } else if (this.wa == 2 && n2 == 1) {
            this.b(1, true);
            if (this.wx && this.vW == null) {
                if (this.ww < 3) {
                    ++this.ww;
                    this.cI(this.wa);
                    if (this.ww == 3) {
                        this.b(1, false);
                    }
                }
            } else if (this.wy && this.vY == null) {
                if (this.wz && this.ww < this.vW.yR()) {
                    ++this.ww;
                    this.cI(this.wa);
                    if (this.ww >= this.vW.yR()) {
                        this.b(1, false);
                    }
                } else if (this.vX instanceof f_0 && this.ww < ((f_0)this.vX).iW()) {
                    ++this.ww;
                    this.cI(this.wa);
                    if (this.ww >= ((f_0)this.vX).iW()) {
                        this.b(1, false);
                    }
                }
            } else if (this.ww < this.vY.zq()) {
                ++this.ww;
                this.cI(this.wa);
                if (this.ww >= this.vY.zq()) {
                    this.b(1, false);
                }
            } else {
                this.cI(this.wa + n2);
            }
        } else if (this.wa == 0 && AtalhosAl.ehA_0(this.vX)) {
            this.cI(2);
        } else {
            this.cI(this.wa + n2);
        }
    }

    private boolean a(int n2, s s2, at at2) {
        if (s2 == null) {
            s2 = this.vW;
        }
        if (at2 == null) {
            at2 = this.vX;
        }
        if (n2 == -1 && s2 != null) {
            n2 = 0;
        } else if (s2 == null) {
            return false;
        }
        this.wv = n2;
        this.vV.clear();
        int n3 = 0;
        while (n3 < a.SR.R().size()) {
            int n4 = 0;
            while (n4 < ((best.a)a.SR.R().get(n3)).t().size()) {
                if (((best.a)a.SR.R().get(n3)).t().get(n4) == at2) {
                    this.vV.add((best.a)a.SR.R().get(n3));
                    break;
                }
                ++n4;
            }
            ++n3;
        }
        if (n2 >= s2.yG()) {
            this.wv = n2 = s2.yG() - 1;
        }
        if (this.wE) {
            n2 += 7;
        }
        this.vU.clear();
        if (this.wJ) {
            n2 += 4;
        } else if (this.wx) {
            n2 += 2;
        }
        try {
            n3 = 0;
            while (n3 < ((best.a)this.vV.get(n2)).h().size()) {
                if (((I)((best.a)this.vV.get(n2)).h().get(n3)).ht() == s2) {
                    w_0 w_02 = new w_0();
                    w_02.ao(true);
                    this.vU.add(w_02);
                    w_0 w_03 = new w_0();
                    w_03.n((I)((best.a)this.vV.get(n2)).h().get(n3));
                    w_03.ah(true);
                    this.vU.add(w_03);
                    w_0 w_04 = new w_0();
                    w_04.n((I)((best.a)this.vV.get(n2)).h().get(n3));
                    this.vU.add(w_04);
                }
                ++n3;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (this.wJ) {
            n2 -= 4;
        } else if (this.wx) {
            n2 -= 2;
        }
        int n5 = 0;
        String string = "";
        if (this.wE) {
            n5 = 7;
            string = " - 2\u00ba T";
        }
        this.wR.setText(String.valueOf(n2 - n5 + 1) + "\u00aa rodada" + string);
        this.c(0, true);
        this.c(1, true);
        int n6 = s2.yG() - 1;
        int n7 = 0;
        if (this.wE) {
            n6 += 2;
            n7 = 7;
        }
        if (n2 == n7) {
            this.c(0, false);
        } else if (n2 == n6) {
            this.c(1, false);
        }
        this.vN.addNotify();
        return true;
    }

    private void cC(int n2) {
        this.wv = -1;
        this.wa = 0;
        this.vY = null;
        this.wi.setVisible(true);
        this.Q(true);
        this.nc();
        this.nl();
        if (this.cS.size() > 0) {
            this.u((at)this.va.getSelectedItem());
        }
    }

    private void a(s s2, z z2, z z3, boolean bl, boolean bl2) {
        this.vY = z2;
        this.vW = s2;
        this.wu = z3;
        this.wy = bl;
        this.wx = bl2;
        this.wz = true;
        if (this.vX instanceof f_0 || this.vX instanceof d_0 || this.vX instanceof e_0 || this.vX instanceof H || AtalhosAl.ehA_0(this.vX)) {
            this.wz = false;
        }
        if (this.vW != null) {
            this.vY = this.vW.yY();
        }
        if (this.vX instanceof k && a.SR.bQ() != null && a.SR.bQ().yd().yY() != null) {
            this.vY = a.SR.bQ().yd().yY();
        }
        if (this.vX instanceof m_0 && a.SR.bK() != null && a.SR.bK().yd().yY() != null) {
            this.vY = a.SR.bK().yd().yY();
        }
        this.wa = 1;
        this.ww = 0;
        this.wv = 0;
        if (s2 != null) {
            this.wv = s2.zb() - 1;
        }
        if (bl2) {
            if (this.vW == null) {
                this.wa = 0;
            }
        } else if (s2 == null) {
            this.wa = 2;
        }
        if (AtalhosAl.ehA_0(this.vX)) {
            this.wG = true;
            this.wa = this.vY == null ? 0 : this.vY.zp().size();
        }
        if (bl) {
            if (this.vW != null && s2.yZ()) {
                this.wa = 2;
                this.ww = this.vY.zp().size() - 1;
            } else if (this.vY != null) {
                this.ww = this.vY.zp().size() - 1;
            }
            this.nf();
        }
        if (this.wG) {
            this.cK(this.wa);
        } else if (this.wJ) {
            if (this.vW == null) {
                this.cL(0 + z3.zb());
            } else if (this.vY == null) {
                this.cL(2);
            } else if (this.vY != null) {
                this.cL(3 + this.vY.zb());
            }
        } else {
            this.cI(this.wa);
        }
    }

    private void nf() {
        try {
            this.wr.clear();
            this.ws.clear();
            this.wt.clear();
            int[] nArray = new int[]{64, 32, 16, 8, 4, 2, 1};
            int[] nArray2 = new int[]{40, 20, 10, 5, 8, 4, 2, 1};
            int n2 = 0;
            String[] stringArray = aq.ps;
            String[] stringArray2 = aq.pu;
            if (this.vY != null && this.vY.zf() == 29) {
                stringArray = aq.pt;
                stringArray2 = aq.pv;
                nArray = nArray2;
            }
            if (this.wx) {
                n2 = 3;
            } else if (this.vY != null) {
                n2 = stringArray.length - 1 - this.vY.zq();
            } else if (this.wz && this.vW != null) {
                n2 = stringArray.length - 1 - this.vW.yR();
            } else if (this.vX instanceof f_0) {
                n2 = stringArray.length - 1 - ((f_0)this.vX).iW();
            }
            int n3 = n2;
            while (n3 < stringArray.length) {
                this.wr.add(stringArray[n3]);
                this.ws.add(nArray[n3]);
                this.wt.add(stringArray2[n3]);
                ++n3;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void ng() {
        this.wm.setText("tabela ainda n\u00e3o sorteada");
        this.b(0, false);
        this.b(1, false);
        this.c(0, false);
        this.c(1, false);
        this.vT.clear();
        this.vS.clear();
        this.vU.clear();
        this.wp.addNotify();
        this.vN.addNotify();
    }

    private void cI(int n2) {
        try {
            this.b(0, true);
            this.b(1, true);
            if (n2 == 0) {
                if (this.wu != null) {
                    this.wa = 0;
                    this.ww = 0;
                    this.a(this.wu, null);
                } else {
                    this.nh();
                }
                this.b(0, false);
            } else if (n2 == 1) {
                if (this.vW != null && this.vW.yK().size() > 0) {
                    this.wa = 1;
                    this.a(this.wv, null, null);
                    this.i(this.vW);
                    this.nc();
                } else if (!this.wx && this.vW.yK().size() == 0) {
                    this.wm.setText("tabela ainda n\u00e3o sorteada");
                    this.b(0, false);
                    this.b(1, false);
                    this.c(0, false);
                    this.c(1, false);
                    this.vT.clear();
                    this.vS.clear();
                    this.vU.clear();
                    this.wp.addNotify();
                    this.vN.addNotify();
                } else if (this.wz) {
                    this.wa = 1;
                    this.cJ(-1);
                }
                if (!this.wx) {
                    this.b(0, false);
                }
                if (!this.wy) {
                    this.b(1, false);
                }
            } else if (n2 == 2) {
                if (this.vY != null) {
                    this.wa = 2;
                    this.a(this.vY, null);
                } else if (this.wy) {
                    this.wa = 2;
                    this.nh();
                }
                if (this.ww == 0 && !this.wz) {
                    this.b(0, false);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void cJ(int n2) {
        this.wi.setVisible(true);
        this.Q(true);
        this.wm.setText("1\u00aa fase");
        this.wR.setText("");
        if (!this.wx && !this.wy) {
            this.wm.setText("Fase \u00fanica");
        }
        if (this.wB && this.wH == 1) {
            this.wm.setText("2\u00aa fase");
            this.c(0, false);
            this.c(1, false);
        }
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        int n3 = 8;
        int n4 = 4;
        if (n2 == 318) {
            n3 = 2;
            n4 = 8;
            String[] stringArray = new String[]{"1\u00ba do grupo A", "2\u00ba do grupo A", "3\u00ba do grupo A", "4\u00ba do grupo A", "1\u00ba do grupo B", "2\u00ba do grupo B", "3\u00ba do grupo B", "4\u00ba do grupo B", "5\u00ba do grupo A", "6\u00ba do grupo A", "7\u00ba do grupo A", "8\u00ba do grupo A", "5\u00ba do grupo B", "6\u00ba do grupo B", "7\u00ba do grupo B", "8\u00ba do grupo B"};
            String[] stringArray2 = new String[]{"C", "D"};
            arrayList = new ArrayList<String>();
            int n5 = 0;
            while (n5 < stringArray.length) {
                arrayList.add(stringArray[n5]);
                ++n5;
            }
            arrayList2 = new ArrayList<String>();
            n5 = 0;
            while (n5 < stringArray2.length) {
                arrayList2.add(stringArray2[n5]);
                ++n5;
            }
        }
        this.vS.clear();
        this.vS = e.a(n3, n4, arrayList, arrayList2);
        this.vU.clear();
        this.vN.addNotify();
        this.nc();
    }

    private void nh() {
        d d2;
        Object object;
        this.ni();
        int n2 = 0;
        if (this.ww < this.ws.size()) {
            n2 = (Integer)this.ws.get(this.ww);
        }
        if (this.wB) {
            int[] nArray = new int[4];
            nArray[2] = 2;
            nArray[3] = 1;
            int[] nArray2 = nArray;
            n2 = nArray2[this.wH];
        }
        if (this.wJ && this.vX instanceof v && this.wa == 0 && this.ww == 1) {
            n2 = 10;
        }
        boolean bl = true;
        boolean[] blArray = null;
        boolean[] blArray2 = new boolean[7];
        blArray2[0] = true;
        blArray2[1] = true;
        blArray2[2] = true;
        boolean[] blArray3 = blArray2;
        String string = "";
        String string2 = "";
        if (this.wB) {
            bl = this.wH != 2;
        } else if (this.vX instanceof v || this.vX instanceof r) {
            bl = blArray3[this.ww];
        } else if (this.vY != null) {
            blArray = this.vY.zz();
            bl = blArray[this.ww];
        } else if (this.vW != null) {
            blArray = this.vW.getDuasVoltasMataMata();
            bl = blArray[this.ww];
        }
        if (this.wB) {
            if (this.wH == 2) {
                string = "Semi-Final";
            } else {
                string2 = "Semi-Final";
                string = "Decis\u00e3o";
            }
        } else if (this.wJ && this.wI < 2) {
            string = "J";
        } else {
            if (this.ww < this.wt.size()) {
                string = (String)this.wt.get(this.ww);
            }
            if (this.ww > 0 && this.ww - 1 < this.wt.size()) {
                string2 = (String)this.wt.get(this.ww - 1);
            }
        }
        ArrayList arrayList = null;
        if (this.ww == 0) {
            if (this.vX instanceof v || this.vX instanceof x) {
                string2 = "sorteio";
            } else if (this.vX instanceof r || this.vX instanceof u || this.vX instanceof t) {
                arrayList = r.yc();
            } else if (this.vX instanceof w) {
                arrayList = w.yc();
            } else if (this.vX instanceof y) {
                arrayList = y.yc();
            } else if (AtalhosAl.ehD(this.vX)) {
                arrayList = yc();
            } else if (this.vX instanceof c) {
                arrayList = c.yc();
            } else if (AtalhosAl.ehE(this.vX)) {
                arrayList = chamaYc();
            } else if (this.vX instanceof h_0) {
                arrayList = h_0.yc();
            } else if (this.vX instanceof g) {
                arrayList = g.yc();
            } else if (this.vX instanceof F) {
                arrayList = F.yc();
            } else if (this.vX instanceof l_0) {
                arrayList = l_0.yc();
            } else if (this.vX instanceof n) {
                arrayList = n.yc();
            } else if (this.vX instanceof i_0) {
                arrayList = i_0.yc();
            } else if (this.vX instanceof j) {
                arrayList = j.yc();
            } else if (this.vX instanceof m_0) {
                arrayList = m_0.yc();
            } else if (this.vX.b() != 1) {
                this.vX.b();
            }
        }
        boolean bl2 = false;
        if (this.vX instanceof l_0) {
            n2 = 4;
        } else if (this.vX instanceof n) {
            n2 = 1;
        } else if (this.vX instanceof j) {
            n2 = 1;
        } else if (this.vX instanceof m_0) {
            n2 = 1;
        } else if (this.vX instanceof k) {
            n2 = 1;
        }
        if (this.wG) {
            object = new int[]{2, 2, 2};
            n2 = ((int[])object)[this.wa];
            if (this.wa == 1) {
                string = "Semi-Final";
            } else if (this.wa == 2) {
                string2 = "Semi-Final";
                string = "Decis\u00e3o";
            }
            if (this.wa == 1) {
                arrayList = eX(1);
            } else if (this.wa == 2) {
                arrayList = eX(2);
                bl2 = true;
            }
            bl = false;
        }
        this.vT.clear();
        this.vT = d.a(n2, bl, string, string2, arrayList, bl2);
        if (this.wB) {
            if (this.wH == 2) {
                string = "Semi-Final TR";
            } else if (this.wC == 18) {
                string2 = "Semi-Final TR";
                string = "Decis\u00e3o Ta\u00e7a Rio";
            } else {
                string2 = "Semi-Final TC";
                string = "Decis\u00e3o Ta\u00e7a Cidade";
            }
            object = "Taca Cidade";
            if (this.wC == 18) {
                object = "Ta\u00e7a Rio";
            }
            arrayList = o.eX(319);
            d2 = new d();
            d2.ai(true);
            d2.aj(true);
            this.vT.add(d2);
            d d3 = new d();
            d3.ai(true);
            d3.aj(true);
            d3.D("<html><b>" + (String)object + "</b></html>");
            this.vT.add(d3);
            this.vT.addAll(d.a(n2, bl, string, string2, arrayList, bl2));
        }
        if (this.vX != null && this.vX.b() == 2 && this.vX instanceof f_0 && ((Z)(object = (Object)((f_0)this.vX).yg())).jc() == 29 && a.vM().isNovoFormatoCopa() && (((Z)object).jq() == null || ((Z)object).jq().yf() == null)) {
            this.vT.clear();
            d2 = new d();
            d2.ai(true);
            d2.aj(true);
            d2.D("<html><b>Ainda n\u00e3o sorteada</b></html>");
            this.vT.add(d2);
        }
        this.wi.setVisible(false);
        this.Q(false);
        this.nk();
    }

    private void ni() {
        if (this.vX instanceof l_0 || this.vX instanceof n || this.vX instanceof j || this.vX instanceof m_0 || this.vX instanceof k) {
            this.wm.setText("Repescagem");
        } else if (this.wB) {
            if (this.wH == 2) {
                this.wm.setText("Semi-Final");
            } else if (this.wH == 3) {
                this.wm.setText("Final");
            }
        } else if (this.wG) {
            if (this.wa == 0) {
                this.wm.setText("Quartas");
            } else if (this.wa == 1) {
                this.wm.setText("Semi-final");
            } else if (this.wa == 2) {
                this.wm.setText("Final");
            }
        } else if (this.wa == 0) {
            this.wm.setText("Fase Preliminar");
            if (this.wI == 0) {
                this.wm.setText("Fase Preliminar R1");
            } else if (this.wI == 1) {
                this.wm.setText("Fase Preliminar R2");
            }
        } else if (this.ww < this.wr.size()) {
            this.wm.setText((String)this.wr.get(this.ww));
        }
        if (this.wE) {
            int n2;
            this.wm.setText(String.valueOf(this.wm.getText()) + " - 2\u00ba turno");
            if (this.vY != null && (n2 = this.vY.zq()) == 0) {
                this.wm.setText("Final do campeonato");
            }
        }
    }

    private void a(z z2, z z3) {
        this.wi.setVisible(false);
        this.Q(false);
        if (this.wB) {
            if (this.wH == 2) {
                this.ww = 0;
            } else if (this.wH >= 3) {
                if (this.wH > 3) {
                    this.wH = 3;
                }
                this.ww = 1;
            }
        }
        this.vT.clear();
        this.ni();
        String string = "";
        if (this.ww < this.wt.size()) {
            string = (String)this.wt.get(this.ww);
        }
        if (this.ww >= z2.zp().size() && this.ww <= z2.zq()) {
            this.nh();
        }
        if (this.wa == 0) {
            string = "";
        }
        if (this.wB) {
            if (this.ww == 0) {
                string = "Semi-Final";
            } else if (this.ww == 1) {
                string = "Decis\u00e3o";
            }
        }
        boolean bl = false;
        if (this.wG) {
            if (this.wa == 0) {
                this.ww = 0;
                string = "Quartas";
            } else if (this.wa == 1) {
                this.ww = 0;
                string = "Semi-Final";
            } else if (this.wa == 2) {
                this.ww = 1;
                string = "Decis\u00e3o";
                bl = true;
            }
        }
        if (this.vX.b() == 7 && this.ww >= z2.zq()) {
            bl = true;
        }
        int n2 = 0;
        while (n2 < 2) {
            z z4 = z2;
            if (n2 == 1) {
                z4 = z3;
            }
            if (z4 != null && this.ww < z4.zp().size()) {
                int n3 = 0;
                while (n3 < ((g_0)z4.zp().get(this.ww)).zW().size()) {
                    Object object;
                    d d2 = new d();
                    d2.ai(true);
                    this.vT.add(d2);
                    d d3 = new d();
                    d3.l((I)((g_0)z4.zp().get(this.ww)).zW().get(n3));
                    d3.ah(true);
                    d3.E(String.valueOf(string) + Integer.toString(n3 + 1));
                    if (bl && n3 == 0) {
                        d3.E("Decis\u00e3o");
                    } else if (bl && n3 == 1) {
                        d3.E("Decis\u00e3o 3\u00ba lugar");
                    }
                    if (((g_0)z4.zp().get(this.ww)).zW().size() == 1) {
                        d3.E(string);
                    }
                    if (this.wB && this.wH == 3) {
                        object = "Taca Cidade";
                        if (this.wC == 18) {
                            object = "Ta\u00e7a Rio";
                        }
                        if (n3 == 0 && n2 == 1) {
                            d3.E("Decis\u00e3o " + (String)object);
                        }
                    }
                    if (this.wB && this.wH == 2 && n2 == 1) {
                        d3.E("Semi-Final TR" + Integer.toString(n3 + 1));
                    }
                    this.vT.add(d3);
                    object = new d();
                    ((d)object).l((I)((g_0)z4.zp().get(this.ww)).zW().get(n3));
                    this.vT.add(object);
                    if (((g_0)z4.zp().get(this.ww)).hO()) {
                        d3.m((I)((g_0)z4.zp().get(this.ww)).zX().get(n3));
                        ((d)object).m((I)((g_0)z4.zp().get(this.ww)).zX().get(n3));
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        this.nk();
    }

    private void i(s s2) {
        this.wi.setVisible(true);
        this.Q(true);
        this.wm.setText("1\u00aa fase");
        if (this.wE) {
            this.wm.setText("1\u00aa fase - 2\u00ba turno");
            if (this.vW.yQ().size() == 0) {
                this.wm.setText("Soma dos dois turnos");
            }
        }
        if (!this.wx && !this.wy) {
            this.wm.setText("Fase \u00fanica");
        }
        if (this.wB && this.wH == 1) {
            this.wm.setText("2\u00aa fase");
        }
        this.vS.clear();
        if (s2.yQ().size() == 0) {
            this.a(s2, "", true, 0);
        } else {
            String[] stringArray = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"};
            int n2 = 0;
            if (this.wB && this.wH == 1) {
                n2 = 2;
            }
            int n3 = 0;
            while (n3 < s2.yQ().size()) {
                String string = Integer.toString(n3 + 1);
                if (this.wA) {
                    string = stringArray[n3];
                }
                this.a(s2, string, false, n3);
                ++n3;
            }
        }
        this.j(s2);
        if (this.wB && this.wH == 1) {
            this.k(s2);
        } else if (!this.wB) {
            this.k(s2);
        }
        if (this.wE && this.vW != null) {
            this.vS.add(new e(true, "Campe\u00e3o do 1\u00ba turno:"));
            this.vS.add(new e(this.vW.tf()));
        }
        this.wp.addNotify();
    }

    private void j(s s2) {
        int n2;
        this.wK.clear();
        ArrayList<ah> arrayList = new ArrayList<ah>();
        ArrayList<ah> arrayList2 = new ArrayList<ah>();
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        int n3 = s2.yX();
        if (this.vX instanceof l_0 || this.vX instanceof i_0) {
            n3 = 1;
        } else if (this.vX instanceof n || this.vX instanceof j) {
            n3 = 4;
        } else if (this.vX instanceof k) {
            n3 = 3;
        }
        if (this.wD) {
            n3 = 2;
        }
        boolean bl = false;
        if (this.wE && this.vW.yQ().size() == 0) {
            bl = true;
        }
        if (s2.ze() == 14 && !bl && s2.tf() != null) {
            arrayList3.add(s2.tf());
        }
        if (s2.ze() == 8) {
            if (s2.tf() != null) {
                this.wK.add(s2.tf());
            }
            if (!this.wK.contains(s2.yK().get(0))) {
                this.wK.add((ah)s2.yK().get(0));
            }
            if (s2.zb() < 10) {
                this.wm.setText("1\u00aa fase - 1\u00ba turno");
            } else {
                this.wm.setText("1\u00aa fase - 2\u00ba turno");
            }
        }
        if (n3 == 0) {
            if (s2.getDivisao() > 1) {
                n2 = 0;
                int n4 = 0;
                while (n4 < n2) {
                    this.wK.add((ah)s2.yK().get(n4));
                    ++n4;
                }
            }
        } else {
            n2 = n3;
            if (s2.yQ().size() == 0 || s2.zl()) {
                int n5 = 0;
                while (n5 < n2) {
                    this.wK.add((ah)s2.yK().get(n5));
                    ++n5;
                }
            } else {
                int n6;
                if (!this.wB) {
                    int n7 = 0;
                    while (n7 < s2.yQ().size()) {
                        n6 = 0;
                        while (n6 < n2) {
                            this.wK.add((ah)((G)s2.yQ().get(n7)).gR().get(n6));
                            ++n6;
                        }
                        ++n7;
                    }
                    if (s2.yQ().size() == 12 && s2.melhoresTerceiros) {
                        ArrayList<ah> arrayList4 = new ArrayList<ah>();
                        n6 = 0;
                        while (n6 < s2.yQ().size()) {
                            arrayList4.add((ah)((G)s2.yQ().get(n6)).gR().get(2));
                            ++n6;
                        }
                        s.r(this.vW);
                        Collections.sort(arrayList4, abn);
                        n6 = 0;
                        while (n6 < 8) {
                            this.wK.add((ah)arrayList4.get(n6));
                            ++n6;
                        }
                    } else if (s2.yQ().size() == 17 && s2.melhoresTerceiros) {
                        ArrayList<ah> arrayList5 = new ArrayList<ah>();
                        n6 = 0;
                        while (n6 < s2.yQ().size()) {
                            arrayList5.add((ah)((G)s2.yQ().get(n6)).gR().get(1));
                            ++n6;
                        }
                        s.r(this.vW);
                        Collections.sort(arrayList5, abn);
                        n6 = 0;
                        while (n6 < 15) {
                            this.wK.add((ah)arrayList5.get(n6));
                            ++n6;
                        }
                    }
                }
                if (this.wB && this.wH == 0) {
                    int n8 = 0;
                    while (n8 < s2.yQ().size()) {
                        n6 = 0;
                        while (n6 < n2) {
                            this.wK.add((ah)((G)s2.yQ().get(n8)).gR().get(n6));
                            ++n6;
                        }
                        ++n8;
                    }
                    n8 = 0;
                    while (n8 < s2.yQ().size()) {
                        n6 = 4;
                        while (n6 < 8) {
                            arrayList.add((ah)((G)s2.yQ().get(n8)).gR().get(n6));
                            ++n6;
                        }
                        ++n8;
                    }
                } else if (this.wB && this.wH == 1) {
                    int n9 = 0;
                    while (n9 < n2) {
                        this.wK.add((ah)((G)s2.yQ().get(0)).gR().get(n9));
                        ++n9;
                    }
                    arrayList.add((ah)((G)s2.yQ().get(0)).gR().get(4));
                    arrayList.add((ah)((G)s2.yQ().get(0)).gR().get(5));
                    arrayList.add((ah)((G)s2.yQ().get(1)).gR().get(0));
                    arrayList.add((ah)((G)s2.yQ().get(1)).gR().get(1));
                }
            }
        }
        if (s2.ze() == 14 && bl) {
            this.wK.clear();
            ah ah2 = s2.cS();
            if (this.vW != null) {
                this.vS.add(new e(true, "Campe\u00e3o das finais:"));
                this.vS.add(new e(ah2));
            }
        }
        if (s2.b() == 1 && a.SR.isJogaIntClubes()) {
            ah ah3;
            ah ah4;
            if (s2.vl().gg() == 1) {
                ah ah5;
                ah ah6 = a.SR.aF().cS();
                if (ah6 != null) {
                    arrayList3.add(ah6);
                }
                if ((ah5 = a.SR.aH().cS()) != null) {
                    arrayList3.add(ah5);
                }
            } else if (s2.vl().gg() == 0) {
                ah ah7;
                ah ah8 = a.SR.aI().cS();
                if (ah8 != null) {
                    arrayList3.add(ah8);
                }
                if ((ah7 = a.SR.aK().cS()) != null) {
                    arrayList3.add(ah7);
                }
            } else if (s2.vl().gg() == 2) {
                ah ah9;
                ah ah10 = a.SR.aO().cS();
                if (ah10 != null) {
                    arrayList3.add(ah10);
                }
                if ((ah9 = s2.vl().jq().cS()) != null) {
                    arrayList3.add(ah9);
                }
            } else if (s2.vl().gg() == 3) {
                ah ah11 = a.SR.aL().cS();
                if (ah11 != null) {
                    arrayList3.add(ah11);
                }
            } else if (s2.vl().gg() == 5) {
                ah ah12 = a.SR.aQ().cS();
                if (ah12 != null) {
                    arrayList3.add(ah12);
                }
            } else if (s2.vl().gg() == 4 && (ah4 = a.SR.aP().cS()) != null) {
                arrayList3.add(ah4);
            }
            if (s2.vl().gg() != 0 && (ah3 = s2.vl().jq().cS()) != null) {
                arrayList3.add(ah3);
            }
        }
        if (s2.getDivisao() == 1 && s2.b() == 1 && a.SR.isJogaIntClubes()) {
            int[] nArray = new int[3];
            int n10 = 0;
            while (n10 < s2.yK().size()) {
                if (nArray[0] > 0 && !arrayList3.contains(s2.yK().get(n10))) {
                    arrayList3.add((ah)s2.yK().get(n10));
                    nArray[0] = nArray[0] - 1;
                }
                ++n10;
            }
            if (s2.vl().gg() == 1 || s2.vl().gg() == 0) {
                n10 = 0;
                while (n10 < s2.yK().size()) {
                    if (nArray[2] > 0 && !arrayList3.contains(s2.yK().get(n10))) {
                        arrayList2.add((ah)s2.yK().get(n10));
                        nArray[2] = nArray[2] - 1;
                    }
                    ++n10;
                }
            }
            if (nArray[1] > 0) {
                n10 = 0;
                while (n10 < s2.yK().size()) {
                    if (!(nArray[1] <= 0 || arrayList.contains(s2.yK().get(n10)) || arrayList3.contains(s2.yK().get(n10)) || arrayList2.contains(s2.yK().get(n10)))) {
                        arrayList.add((ah)s2.yK().get(n10));
                        nArray[1] = nArray[1] - 1;
                    }
                    ++n10;
                }
            }
        }
        if (this.vX instanceof l_0) {
            ArrayList<ah> arrayList6 = new ArrayList<ah>();
            int n11 = 0;
            while (n11 < s2.yQ().size()) {
                arrayList6.add((ah)((G)s2.yQ().get(n11)).gR().get(1));
                ++n11;
            }
            s.r(this.vW);
            Collections.sort(arrayList6, abn);
            n11 = 0;
            while (n11 < 8) {
                arrayList.add((ah)arrayList6.get(n11));
                ++n11;
            }
        } else if (this.vX instanceof n) {
            arrayList.add((ah)s2.yK().get(4));
        } else if (this.vX instanceof j) {
            arrayList.add((ah)s2.yK().get(4));
        } else if (this.vX instanceof k) {
            arrayList.add((ah)s2.yK().get(3));
        } else if (this.vX instanceof m_0) {
            arrayList.add((ah)s2.yK().get(0));
        }
        int n12 = 0;
        while (n12 < this.vS.size()) {
            if (this.wK.contains(((e)this.vS.get(n12)).fg())) {
                ((e)this.vS.get(n12)).dF(1);
            }
            ++n12;
        }
        if (arrayList.size() > 0) {
            n12 = 0;
            while (n12 < this.vS.size()) {
                if (arrayList.contains(((e)this.vS.get(n12)).fg())) {
                    ((e)this.vS.get(n12)).dF(2);
                }
                ++n12;
            }
        }
        if (arrayList3.size() > 0) {
            n12 = 0;
            while (n12 < this.vS.size()) {
                if (arrayList3.contains(((e)this.vS.get(n12)).fg())) {
                    ((e)this.vS.get(n12)).dF(4);
                }
                ++n12;
            }
        }
        if (arrayList2.size() > 0) {
            n12 = 0;
            while (n12 < this.vS.size()) {
                if (arrayList2.contains(((e)this.vS.get(n12)).fg())) {
                    ((e)this.vS.get(n12)).dF(5);
                }
                ++n12;
            }
        }
    }

    private boolean k(s s2) {
        if (s2.b() == 1 || s2.b() == 3) {
            if (s2.b() == 1 && s2.iq().jc() == 29 && a.SR.bk() && s2.getDivisao() == 4) {
                return false;
            }
            int n2 = s2.getnRebaixados();
            boolean bl = s2.zc();
            if (s2.zc() && s2.yQ().size() > 0) {
                n2 = Math.round(n2 / s2.yQ().size());
            }
            boolean bl2 = false;
            if (this.wE) {
                bl = false;
                if (this.vW.yQ().size() == 0) {
                    bl = false;
                    bl2 = true;
                }
            }
            if (this.wB) {
                n2 = 2;
                bl = true;
            }
            if (s2.zg() && s2.zh() < n2) {
                n2 = s2.zh();
            }
            if (n2 > 0) {
                int n3;
                int n4;
                ArrayList<ah> arrayList = new ArrayList<ah>();
                if (bl) {
                    n4 = 0;
                    if (this.wB) {
                        n4 = 1;
                    }
                    n3 = n4;
                    while (n3 < s2.yQ().size()) {
                        int n5 = ((G)s2.yQ().get(n3)).gR().size() - 1;
                        while (n5 >= ((G)s2.yQ().get(n3)).gR().size() - n2) {
                            arrayList.add((ah)((G)s2.yQ().get(n3)).gR().get(n5));
                            --n5;
                        }
                        ++n3;
                    }
                } else {
                    n4 = n2;
                    n3 = s2.yK().size() - 1;
                    while (n3 >= 0) {
                        if (n4 > 0 && !this.wK.contains(s2.yK().get(n3))) {
                            arrayList.add((ah)s2.yK().get(n3));
                            --n4;
                        }
                        --n3;
                    }
                }
                if (this.wD && this.wF != 4) {
                    arrayList.clear();
                }
                if (s2.ze() == 14 && !bl2) {
                    arrayList.clear();
                }
                n4 = 0;
                while (n4 < this.vS.size()) {
                    if (arrayList.contains(((e)this.vS.get(n4)).fg())) {
                        ((e)this.vS.get(n4)).dF(3);
                    }
                    ++n4;
                }
            }
        }
        return true;
    }

    private void a(s s2, String string, boolean bl, int n2) {
        e e2;
        int[] nArray = new int[8];
        int[] nArray2 = new int[8];
        String string2 = "";
        if (!bl) {
            e2 = new e();
            e2.setInfo("Grupo " + string);
            e2.ak(true);
            this.vS.add(e2);
        }
        e2 = new e();
        e2.setInfo("topo");
        this.vS.add(e2);
        ArrayList arrayList = new ArrayList();
        arrayList = bl ? s2.yK() : ((G)s2.yQ().get(n2)).gR();
        int n3 = 0;
        while (n3 < arrayList.size()) {
            e e3 = new e();
            e3.n((ah)arrayList.get(n3));
            nArray = ((ah)arrayList.get(n3)).d(s2);
            e3.l(nArray);
            if (n3 == 0) {
                string2 = "1\u00ba";
            } else if (n3 > 0) {
                nArray2 = ((ah)arrayList.get(n3 - 1)).d(s2);
                string2 = nArray[0] != nArray2[0] || nArray[2] != nArray2[2] || nArray[5] != nArray2[5] || nArray[7] != nArray2[7] ? String.valueOf(Integer.toString(n3 + 1)) + "\u00ba" : "";
            }
            e3.J(string2);
            this.vS.add(e3);
            ++n3;
        }
        if (!bl) {
            e e4 = new e();
            e4.setInfo("");
            e4.ak(true);
            this.vS.add(e4);
        }
    }

    private void nj() {
        this.wS.addActionListener(new ap_0(this));
    }

    private void u(at at2) {
        this.vX = at2;
        this.wA = false;
        this.wB = false;
        this.wD = false;
        this.wG = false;
        this.wJ = false;
        this.wS.setVisible(false);
        this.wS.removeAllItems();
        if (this.vX instanceof t) {
            this.wA = true;
            this.a(a.SR.aO().yd(), null, null, true, false);
        } else if (this.vX instanceof u) {
            this.wA = true;
            this.a(a.SR.aL().yd(), null, null, true, false);
        } else if (this.vX instanceof v) {
            this.wA = true;
            this.wJ = true;
            this.a(a.SR.aI().yd(), null, a.SR.aI().yC(), true, true);
        } else if (this.vX instanceof r) {
            this.wA = true;
            this.wJ = true;
            this.a(a.SR.aF().yd(), null, a.SR.aF().yC(), true, true);
        } else if (this.vX instanceof w) {
            this.wA = true;
            this.a(a.SR.aP().yd(), null, null, true, false);
        } else if (this.vX instanceof y) {
            this.wA = true;
            this.a(a.SR.aQ().yd(), null, null, true, false);
        } else if (this.vX instanceof x) {
            this.wA = true;
            this.a(a.SR.aK().yd(), null, null, true, false);
        } else if (AtalhosAl.ehA_0(this.vX)) {
            this.a(null, a.SR.aR().zE(), a.SR.aR().zD(), true, true);
        } else if (this.vX instanceof q) {
            this.wA = true;
            this.a(a.SR.aY().yd(), null, null, true, false);
        } else if (this.vX instanceof p) {
            this.wA = true;
            this.a(a.SR.ba().yd(), null, null, true, false);
        } else if (AtalhosAl.ehD(this.vX)) {
            this.wA = true;
            this.a(a.SR.aZ().yd(), null, null, true, false);
        } else if (this.vX instanceof c) {
            this.wA = true;
            this.a(a.SR.be().yd(), null, null, true, false);
        } else if (AtalhosAl.ehE(this.vX)) {
            this.wA = true;
            this.a(a.SR.bf().yd(), null, null, true, false);
        } else if (this.vX instanceof h_0) {
            this.wA = true;
            this.a(a.SR.bg().yd(), null, null, true, false);
        } else if (this.vX instanceof g) {
            this.wA = true;
            this.a(a.SR.bX().yd(), null, null, true, false);
        } else if (this.vX instanceof F) {
            this.a(((F)this.vX).yd(), null, null, true, false);
        } else if (this.vX instanceof m_0) {
            this.wA = true;
            this.a(a.SR.bS().yd(), null, null, true, false);
        } else if (this.vX instanceof n) {
            this.wA = true;
            this.a(a.SR.bK().yd(), null, null, true, false);
        } else if (this.vX instanceof i_0) {
            this.wA = true;
            this.a(a.SR.bM().yd(), null, null, false, false);
        } else if (this.vX instanceof j) {
            this.wA = true;
            this.a(a.SR.bQ().yd(), null, null, true, false);
        } else if (this.vX instanceof f_0) {
            this.a(null, ((f_0)this.vX).yf(), null, true, false);
        } else if (this.vX instanceof d_0) {
            this.a(null, a.SR.aW().zS(), null, true, false);
        } else if (this.vX instanceof e_0) {
            this.a(null, a.SR.aV().zS(), null, true, false);
        } else if (this.vX instanceof b_0 || this.vX instanceof o) {
            s s2 = null;
            if (this.vX instanceof b_0) {
                s2 = ((b_0)this.vX).yi();
            } else if (this.vX instanceof o) {
                s2 = ((o)this.vX).yi();
            }
            boolean bl = false;
            if (s2.yX() > 0) {
                bl = true;
            }
            this.a(s2, null, null, bl, false);
        }
    }

    private void cK(int n2) {
        this.wa = n2;
        if (n2 == 0) {
            if (this.wu != null) {
                this.a(this.wu, null);
            } else {
                this.nh();
            }
            this.b(0, false);
            this.b(1, true);
        } else if (n2 == 1) {
            if (this.vY != null) {
                this.wa = 1;
                this.a(this.vY, null);
            } else {
                this.nh();
            }
            this.b(0, true);
            this.b(1, true);
        } else if (n2 == 2) {
            if (this.vY != null && this.vY.zp().size() == 2) {
                this.a(this.vY, null);
            } else {
                this.nh();
            }
            this.b(0, true);
            this.b(1, false);
        }
    }

    private void cL(int n2) {
        this.b(0, true);
        this.b(1, true);
        if (n2 >= 0) {
            this.wI = n2;
            if (n2 == 0) {
                this.wa = 0;
                this.ww = 0;
                this.a(this.wu, null);
            } else if (n2 == 1) {
                this.wa = 0;
                this.ww = 1;
                this.a(this.wu, null);
            } else if (n2 == 2) {
                this.cI(1);
            } else if (n2 == 3) {
                this.ww = 0;
                this.cI(2);
            } else if (n2 > 3) {
                this.ww = n2 - 3;
                this.cI(2);
            }
            if (n2 == 6) {
                this.b(1, false);
            }
        }
    }

    private void nc() {
        m m2 = new m(this.vS);
        this.wp.setModel(m2);
        this.wp.setTableHeader(null);
        int[] nArray = new int[]{20, 5, 140, 20, 20, 20, 20, 20, 20, 20, 20};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.wp.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.wp.getColumnModel().getColumn(0).setMaxWidth(20);
        this.wp.getColumnModel().getColumn(1).setMaxWidth(5);
        this.wp.setAutoResizeMode(3);
        this.wp.setRowHeight(24);
        this.wp.setShowGrid(false);
        this.wp.setDefaultRenderer(e.class, new a_0());
        this.wp.setAutoCreateRowSorter(false);
        this.wp.setIntercellSpacing(new Dimension(0, 0));
        this.wp.setCellSelectionEnabled(false);
        this.wp.setRowSelectionAllowed(false);
        this.wp.setFillsViewportHeight(true);
    }

    private void nk() {
        n_0 n_02 = new n_0(this.vT);
        this.wp.setModel(n_02);
        this.wp.setTableHeader(null);
        int[] nArray = new int[]{90, 40, 90, 100, 90, 40, 90};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.wp.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.wp.setRowHeight(24);
        this.wp.setShowGrid(false);
        this.wp.setDefaultRenderer(d.class, AtalhosAl.novoB_0());
        this.wp.setAutoCreateRowSorter(false);
        this.wp.setIntercellSpacing(new Dimension(0, 0));
        this.wp.setCellSelectionEnabled(false);
        this.wp.setRowSelectionAllowed(false);
        this.wp.setFillsViewportHeight(true);
    }

    private void nl() {
        AbstractTableModel l_02 = AtalhosAl.novoL_0(this.vU);
        this.vN.setModel(l_02);
        this.vN.setTableHeader(null);
        int[] nArray = new int[]{90, 40, 90};
        int n2 = 0;
        while (n2 < nArray.length) {
            this.vN.getColumnModel().getColumn(n2).setPreferredWidth(nArray[n2]);
            ++n2;
        }
        this.vN.setRowHeight(20);
        this.vN.setShowGrid(false);
        this.vN.setDefaultRenderer(w_0.class, new af());
        this.vN.setAutoCreateRowSorter(false);
        this.vN.setIntercellSpacing(new Dimension(0, 0));
        this.vN.setCellSelectionEnabled(false);
        this.vN.setRowSelectionAllowed(false);
        this.vN.setFillsViewportHeight(true);
    }

    private void mJ() {
        this.vf = new JLabel();
        this.vd = new JPanel();
        this.va = new JComboBox();
        this.ve = new JToolBar();
        this.uY = new JButton();
        this.uX = new JButton();
        this.uW = new JButton();
        this.uZ = new JButton();
        this.vi = new JButton();
        this.wP = new JPanel();
        this.wN = new JButton();
        this.wm = new JLabel();
        this.wO = new JButton();
        this.wQ = new JPanel();
        this.wL = new JButton();
        this.wR = new JLabel();
        this.wM = new JButton();
        this.vm = new JButton();
        this.ut = new JScrollPane();
        this.wp = new JTable();
        this.wi = new JScrollPane();
        this.vN = new JTable();
        this.wS = new JComboBox();
        this.wS.setVisible(false);
        this.setBackground(new Color(176, 161, 142));
        this.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        this.vf.setForeground(new Color(255, 255, 255));
        this.vf.setFont(new Font("Tahoma", 1, 12));
        this.vf.setText("");
        this.setBackground(new Color(104, 120, 100));
        this.vd.setPreferredSize(new Dimension(483, 40));
        this.vd.setLayout(new components.b_0());
        this.vd.add((Component)this.va, new components.a(420, 10, 290, 25));
        this.ve.setBackground(new Color(38, 34, 22));
        this.ve.setFloatable(false);
        this.ve.setRollover(true);
        this.ve.setBorderPainted(false);
        this.uY.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b0.png")));
        this.uY.setBorderPainted(false);
        this.uY.setContentAreaFilled(false);
        this.uY.setFocusable(false);
        this.uY.setHorizontalTextPosition(0);
        this.uY.setMargin(new Insets(0, 0, 0, 0));
        this.uY.setMaximumSize(new Dimension(79, 45));
        this.uY.setMinimumSize(new Dimension(79, 45));
        this.uY.setPreferredSize(new Dimension(79, 45));
        this.uY.setPressedIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b0s.png")));
        this.uY.setRolloverIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b0s.png")));
        this.uY.setVerticalTextPosition(3);
        this.ve.add(this.uY);
        this.uX.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b1.png")));
        this.uX.setBorderPainted(false);
        this.uX.setContentAreaFilled(false);
        this.uX.setFocusable(false);
        this.uX.setHorizontalTextPosition(0);
        this.uX.setMargin(new Insets(0, 0, 0, 0));
        this.uX.setMaximumSize(new Dimension(79, 45));
        this.uX.setMinimumSize(new Dimension(79, 45));
        this.uX.setPreferredSize(new Dimension(79, 45));
        this.uX.setRolloverIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b1s.png")));
        this.uX.setVerticalTextPosition(3);
        this.ve.add(this.uX);
        this.vi.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b4.png")));
        this.vi.setBorderPainted(false);
        this.vi.setContentAreaFilled(false);
        this.vi.setFocusable(false);
        this.vi.setHorizontalTextPosition(0);
        this.vi.setMargin(new Insets(0, 0, 0, 0));
        this.vi.setMaximumSize(new Dimension(79, 45));
        this.vi.setMinimumSize(new Dimension(79, 45));
        this.vi.setPreferredSize(new Dimension(79, 45));
        this.vi.setRolloverIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b4s.png")));
        this.vi.setVerticalTextPosition(3);
        this.ve.add(this.vi);
        this.uW.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b2.png")));
        this.uW.setBorderPainted(false);
        this.uW.setContentAreaFilled(false);
        this.uW.setFocusable(false);
        this.uW.setHorizontalTextPosition(0);
        this.uW.setMargin(new Insets(0, 0, 0, 0));
        this.uW.setMaximumSize(new Dimension(79, 45));
        this.uW.setMinimumSize(new Dimension(79, 45));
        this.uW.setPreferredSize(new Dimension(79, 45));
        this.uW.setRolloverIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b2s.png")));
        this.uW.setVerticalTextPosition(3);
        this.ve.add(this.uW);
        this.uZ.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b3.png")));
        this.uZ.setBorderPainted(false);
        this.uZ.setContentAreaFilled(false);
        this.uZ.setFocusable(false);
        this.uZ.setHorizontalTextPosition(0);
        this.uZ.setMargin(new Insets(0, 0, 0, 0));
        this.uZ.setMaximumSize(new Dimension(79, 45));
        this.uZ.setMinimumSize(new Dimension(79, 45));
        this.uZ.setPreferredSize(new Dimension(79, 45));
        this.uZ.setRolloverIcon(new ImageIcon(this.getClass().getResource("/aiconsb/b3s.png")));
        this.uZ.setVerticalTextPosition(3);
        this.ve.add(this.uZ);
        this.vd.add((Component)this.ve, new components.a(0, 0, 410, 40));
        this.wP.setOpaque(false);
        this.wP.setLayout(new components.b_0());
        this.wN.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/lefta.png")));
        this.wN.setText("Fase anterior");
        this.wN.setBorderPainted(false);
        this.wN.setContentAreaFilled(false);
        this.wP.add((Component)this.wN, new components.a(0, 0, 139, -1));
        this.wm.setFont(new Font("Tahoma", 1, 12));
        this.wm.setHorizontalAlignment(0);
        this.wm.setText("Oitavas de final");
        this.wP.add((Component)this.wm, new components.a(167, 7, 200, -1));
        this.wO.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftar.png")));
        this.wO.setText("Pr\u00f3xima fase");
        this.wO.setBorderPainted(false);
        this.wO.setContentAreaFilled(false);
        this.wO.setHorizontalTextPosition(2);
        this.wP.add((Component)this.wO, new components.a(385, 0, 132, -1));
        this.wQ.setOpaque(false);
        this.wL.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/lefta.png")));
        this.wL.setBorderPainted(false);
        this.wL.setContentAreaFilled(false);
        this.wR.setFont(new Font("Tahoma", 1, 12));
        this.wR.setHorizontalAlignment(0);
        this.wR.setText("\u00aa rodada");
        this.wM.setIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftar.png")));
        this.wM.setBorderPainted(false);
        this.wM.setContentAreaFilled(false);
        this.wM.setDisabledIcon(new ImageIcon(this.getClass().getResource("/aiconsb/leftd.png")));
        GroupLayout groupLayout = new GroupLayout(this.wQ);
        this.wQ.setLayout(groupLayout);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addGap(69, 69, 69).addComponent(this.wL).addGap(17, 17, 17).addComponent(this.wR, -2, 105, -2).addGap(18, 18, 18).addComponent(this.wM, -2, 37, -2)));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.wL).addGroup(groupLayout.createSequentialGroup().addGap(11, 11, 11).addComponent(this.wR)).addComponent(this.wM));
        this.vm.setText("X");
        this.ut.setViewportView(this.wp);
        this.wi.setViewportView(this.vN);
        GroupLayout groupLayout2 = new GroupLayout(this);
        this.setLayout(groupLayout2);
        groupLayout2.setHorizontalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addComponent(this.wP, -2, 517, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE).addComponent(this.wQ, -2, -1, -2)).addGroup(GroupLayout.Alignment.TRAILING, groupLayout2.createSequentialGroup().addComponent(this.vf, -2, 293, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, Short.MAX_VALUE).addComponent(this.vm, -2, 60, -2).addGap(22, 22, 22)).addGroup(groupLayout2.createSequentialGroup().addComponent(this.vd, -1, -1, Short.MAX_VALUE).addGap(1, 1, 1)).addGroup(groupLayout2.createSequentialGroup().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.ut).addGroup(groupLayout2.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(this.wS, -2, 249, -2))).addGap(14, 14, 14).addComponent(this.wi, -2, 310, -2))).addContainerGap()));
        groupLayout2.setVerticalGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout2.createSequentialGroup().addContainerGap().addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.vf).addComponent(this.vm)).addGap(8, 8, 8).addComponent(this.vd, -2, -1, -2).addGap(12, 12, 12).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.wP, -2, -1, -2).addComponent(this.wQ, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(groupLayout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.wi, -1, 647, Short.MAX_VALUE).addGroup(groupLayout2.createSequentialGroup().addComponent(this.wS, -2, 25, -2).addGap(8, 8, 8).addComponent(this.ut))).addContainerGap()));
    }

    static /* synthetic */ JComboBox a(al al2) {
        return al2.va;
    }

    static /* synthetic */ void a(al al2, int n2) {
        al2.cC(n2);
    }

    static /* synthetic */ void b(al al2, int n2) {
        al2.cB(n2);
    }

    static /* synthetic */ JDialog b(al al2) {
        return al2.ub;
    }

    static /* synthetic */ void c(al al2, int n2) {
        al2.cH(n2);
    }

    static /* synthetic */ JButton c(al al2) {
        return al2.wL;
    }

    static /* synthetic */ int d(al al2) {
        return al2.wv;
    }

    static /* synthetic */ boolean a(al al2, int n2, s s2, at at2) {
        return al2.a(n2, s2, at2);
    }

    static /* synthetic */ JButton e(al al2) {
        return al2.wM;
    }

    static /* synthetic */ JComboBox f(al al2) {
        return al2.wS;
    }
}

