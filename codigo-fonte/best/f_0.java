package best;

import static c.a.SR;
import static c.a.afQ;
import static c.a.vM;

import a.cR;
import best.B;
import best.F;
import best.I;
import best.O;
import best.Z;
import best.a;
import best.ag;
import best.ah;
import best.al;
import best.ap;
import best.at;
import best.g_0;
import best.l_0;
import best.m_0;
import best.p_0;
import best.s;
import best.s_0;
import best.w;
import components.an;
import components.as;
import components.t_0;
import est.InfoArquivoSalvoType;
import f.H;
import f.L;
import f.M;
import f.b_0;
import f.c;
import f.d;
import f.d_0;
import f.e;
import f.e_0;
import f.g;
import f.h_0;
import f.i_0;
import f.j;
import f.j_0;
import f.k;
import f.k_0;
import f.n;
import f.n_0;
import f.o;
import f.p;
import f.q;
import f.r;
import f.t;
import f.u;
import f.v;
import f.x;
import f.y;
import f.z;
import h.a_0;
import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;

public class f_0
implements Serializable {
    private static final long serialVersionUID = 1L;
    private InfoArquivoSalvoType ad = new InfoArquivoSalvoType();
    private int ae = 1;
    private int rM = 2026;
    private int af = 1;
    private ArrayList ag = new ArrayList();
    private ArrayList ah = new ArrayList();
    private ArrayList ai = new ArrayList();
    private ArrayList aj = new ArrayList();
    private ArrayList ak = new ArrayList();
    private ArrayList al = new ArrayList();
    private ArrayList am = new ArrayList();
    private ArrayList an = null;
    private ArrayList ao = new ArrayList();
    private ArrayList ap = new ArrayList();
    private ArrayList aq = new ArrayList();
    private ArrayList ar = new ArrayList();
    private ArrayList as = new ArrayList();
    private ArrayList at = new ArrayList();
    private ArrayList au = new ArrayList();
    private ArrayList av = new ArrayList();
    private ArrayList aw = new ArrayList();
    private ArrayList ax = new ArrayList();
    private ArrayList ay = new ArrayList();
    private ArrayList az = new ArrayList();
    private f.a_0 aA = null;
    private v aB = null;
    private r aC = null;
    private t aD = null;
    private u aE = null;
    private f.w aF = null;
    private y aG = null;
    private f.a aH = new f.a();
    private L Gy = new L();
    private e_0 aI = null;
    private d_0 aJ = null;
    private q aK = null;
    private M GC = null;
    private n_0 GI = null;
    private k_0 IX = null;
    private n aL = null;
    private f.l_0 aM = null;
    private i_0 aN = null;
    private j aO = null;
    private f.m_0 aP = null;
    private k aQ = null;
    private d aR = null;
    private p aS = null;
    private c aT = null;
    private e aU = null;
    private h_0 aV = null;
    private g aW = null;
    private x aX = null;
    private j_0 IY = null;
    private H aY = null;
    private f.F[] aZ = new f.F[4];
    private boolean[] jogaRegionaisTodos;
    private boolean jogaRegionais;
    private boolean jogaEstadual;
    private boolean usaGrupoPadraoEstadual;
    private boolean jogaIntClubes;
    private boolean ba;
    private boolean bb;
    private boolean salarioMensal;
    private boolean habilidadeIndividual;
    private boolean jogaIntano1;
    private boolean gruposIntPadrao;
    private boolean jogaSelecoesAll;
    private boolean[] verJint;
    private boolean bc;
    private boolean bd;
    private int be;
    private int bf;
    private int bg;
    private int bh;
    private int autoSalvar;
    private int velocidade;
    private int velocidadeNH;
    private int verDecisaoPenNaoHumano;
    private int verMudancaTecnicos;
    private int verJanelaSubs;
    private int avisoTerminoContrato;
    private boolean ignoraEstadual;
    private boolean autoRenovaContrato;
    private boolean usaCorPlacar;
    private int corPlacar;
    private boolean usaSons;
    private boolean negritoCasa;
    private boolean usaCoresLista;
    private transient Color[] coresLista;
    private boolean verEstaduaisAgrupados;
    private boolean ignoraLigas;
    private boolean bi;
    private boolean verLeiloes;
    private String bj;
    public boolean bk;
    private int bl;
    private int bm;
    private int bn;
    private int IZ;
    private int bo;
    private int bp;
    private int bq;
    private int br;
    private int Ja;
    private int Jb;
    public boolean bs;
    private int bt;
    private ArrayList bu;
    private static transient ah X = null;
    private static transient I bv = null;
    private transient ArrayList bw;
    public transient ArrayList bx;
    public transient ArrayList by;
    public transient ArrayList bz;
    public transient ArrayList bA;
    public transient ArrayList bB;
    public transient ArrayList bC;
    public transient int[] bD;
    public transient int[] bE;
    public transient ArrayList bF;
    public transient ArrayList bG;
    public transient boolean bH;
    public transient boolean bI;
    public transient int bJ;
    public transient boolean bK;
    public transient boolean bL;
    public transient boolean bM;
    public transient boolean bN;
    public transient boolean Jc;
    public static Comparator bO = new g_0();
    private String[] bP;

    public f_0() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        this.jogaRegionaisTodos = blArray;
        this.jogaRegionais = true;
        this.jogaEstadual = true;
        this.usaGrupoPadraoEstadual = true;
        this.jogaIntClubes = true;
        this.ba = false;
        this.bb = false;
        this.salarioMensal = true;
        this.habilidadeIndividual = true;
        this.jogaIntano1 = true;
        this.gruposIntPadrao = true;
        this.jogaSelecoesAll = true;
        boolean[] blArray2 = new boolean[21];
        blArray2[0] = true;
        blArray2[1] = true;
        blArray2[6] = true;
        blArray2[7] = true;
        blArray2[8] = true;
        blArray2[9] = true;
        blArray2[10] = true;
        blArray2[11] = true;
        blArray2[12] = true;
        blArray2[13] = true;
        blArray2[14] = true;
        blArray2[16] = true;
        blArray2[17] = true;
        blArray2[18] = true;
        blArray2[19] = true;
        blArray2[20] = true;
        this.verJint = blArray2;
        this.bc = false;
        this.bd = true;
        this.be = -1;
        this.bf = -1;
        this.bg = -1;
        this.bh = 0;
        this.autoSalvar = 0;
        this.velocidade = 3;
        this.velocidadeNH = 4;
        this.verDecisaoPenNaoHumano = 0;
        this.verMudancaTecnicos = 1;
        this.verJanelaSubs = 1;
        this.avisoTerminoContrato = 0;
        this.ignoraEstadual = true;
        this.autoRenovaContrato = true;
        this.usaCorPlacar = true;
        this.corPlacar = 0;
        this.usaSons = true;
        this.negritoCasa = true;
        this.usaCoresLista = true;
        this.coresLista = null;
        this.verEstaduaisAgrupados = false;
        this.ignoraLigas = true;
        this.bi = false;
        this.verLeiloes = false;
        this.bj = null;
        this.bk = false;
        this.bl = 1;
        this.bm = 3;
        this.bn = 3;
        this.IZ = 4;
        this.bo = 2;
        this.bp = 2;
        this.bq = 4;
        this.br = 2;
        this.Ja = 2;
        this.Jb = 1;
        this.bs = true;
        this.bt = -1;
        this.bu = new ArrayList();
        this.bw = new ArrayList();
        this.bx = null;
        this.by = null;
        this.bz = null;
        this.bA = null;
        this.bB = null;
        this.bH = false;
        this.bI = false;
        this.bJ = 0;
        this.bK = false;
        this.bL = false;
        this.bM = false;
        this.bN = false;
        this.Jc = false;
        this.bP = new String[]{"#949449", "#B3B364", "#C0C081", "#D1D1A3", "#DEDE9E"};
        if (vM() != null) {
            this.setVerJint(vM().getVerJint());
            this.setJogaIntano1(vM().isJogaIntano1());
            this.setGruposIntPadrao(vM().isGruposIntPadrao());
            this.setJogaIntClubes(vM().isJogaIntClubes());
            this.setJogaSelecoesAll(vM().isJogaSelecoesAll());
            this.setJogaEstadual(vM().isJogaEstadual());
            this.setJogaRegionais(vM().isJogaRegionais());
            this.setSalarioMensal(vM().isSalarioMensal());
            this.setHabilidadeIndividual(vM().isHabilidadeIndividual());
            this.setIgnoraEstadual(vM().isIgnoraEstadual());
            this.setUsaGrupoPadraoEstadual(vM().isUsaGrupoPadraoEstadual());
            this.setAutoSalvar(vM().getAutoSalvar());
            this.setVelocidade(vM().getVelocidade());
            this.setVelocidadeNH(vM().getVelocidadeNH());
            this.setVerDecisaoPenNaoHumano(vM().getVerDecisaoPenNaoHumano());
            this.setVerMudancaTecnicos(vM().getVerMudancaTecnicos());
            this.setVerJanelaSubs(vM().getVerJanelaSubs());
            this.setAvisoTerminoContrato(vM().getAvisoTerminoContrato());
            this.setIgnoraLigas(vM().isIgnoraLigas());
            this.setAutoRenovaContrato(vM().isAutoRenovaContrato());
            this.setUsaCorPlacar(vM().isUsaCorPlacar());
            this.setCorPlacar(vM().getCorPlacar());
            this.setUsaSons(vM().isUsaSons());
            this.setUsaCoresLista(vM().isUsaCoresLista());
            this.setCoresLista(vM().getCoresLista());
            this.setNegritoCasa(vM().isNegritoCasa());
            this.setVerEstaduaisAgrupados(vM().isVerEstaduaisAgrupados());
            this.setUsarGruposReaisCopa(vM().isUsarGruposReaisCopa());
            this.setJogaRegionaisTodos(vM().getJogaRegionaisTodos());
            this.setVerLeiloes(vM().isVerLeiloes());
        }
        this.G();
    }

    public void G() {
        this.bx = new ArrayList();
        this.by = new ArrayList();
        this.bz = new ArrayList();
        this.bA = new ArrayList();
        this.bB = new ArrayList();
    }

    public int H() {
        return this.ae;
    }

    public void k(int n2) {
        this.ae = n2;
    }

    public void I() {
        ++this.ae;
    }

    public int J() {
        return this.af;
    }

    public void l(int n2) {
        this.af = n2;
    }

    public ArrayList L() {
        return this.al;
    }

    public void a(ArrayList arrayList) {
        this.al = arrayList;
    }

    public ArrayList M() {
        return this.am;
    }

    public void b(ArrayList arrayList) {
        this.am = arrayList;
    }

    public ArrayList N() {
        return this.ao;
    }

    public void a(Z z2) {
        this.ao.add(z2);
    }

    public ArrayList O() {
        return this.ag;
    }

    public void c(ArrayList arrayList) {
        this.ag = arrayList;
    }

    public ArrayList P() {
        return this.aj;
    }

    public void d(ArrayList arrayList) {
        this.aj = arrayList;
    }

    public void c(ah ah2) {
        this.aj.add(ah2);
    }

    public void b(F f2) {
        this.ag.add(f2);
    }

    public void c(F f2) {
        this.ah.add(f2);
    }

    public void a(a a2) {
        this.as.add(a2);
    }

    public ArrayList Q() {
        return this.ah;
    }

    public void e(ArrayList arrayList) {
        this.ah = arrayList;
    }

    public void a(al al2) {
        this.al.add(al2);
    }

    public void b(al al2) {
        this.am.add(al2);
    }

    public ArrayList R() {
        return this.as;
    }

    public ArrayList S() {
        return ((a)this.as.get(this.af)).h();
    }

    public ArrayList m(int n2) {
        if (n2 < this.as.size()) {
            return ((a)this.as.get(n2)).h();
        }
        return null;
    }

    public String T() {
        return ((a)this.as.get(this.af)).f();
    }

    private static boolean U() {
        return true;
    }

    public void V() {
        if (!this.bk) {
            this.ap();
        } else {
            this.aa();
        }
    }

    public int iU() {
        return SR.op() - 1;
    }

    private void W() {
        ArrayList<ap> arrayList = new ArrayList<ap>();
        int n2 = 0;
        while (n2 < SR.bo().size()) {
            if (((ap)SR.bo().get(n2)).getY() + 10 < this.iU()) {
                arrayList.add((ap)SR.bo().get(n2));
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList.size()) {
            SR.bo().remove(arrayList.get(n2));
            ++n2;
        }
    }

    public boolean X() {
        return SR.isJogaRegionais();
    }

    private void Y() {
        Z z2 = null;
        int n2 = 0;
        while (n2 < SR.N().size()) {
            if (((Z)SR.N().get(n2)).jc() == 29) {
                z2 = (Z)SR.N().get(n2);
            }
            ++n2;
        }
        if (z2 != null) {
            z2.y(true);
        }
    }

    private void Z() {
        if (this.ar == null || this.ar.size() == 0) {
            int n2 = 0;
            while (n2 < SR.N().size()) {
                ah ah2 = null;
                ah ah3 = null;
                ah2 = ((Z)SR.N().get(n2)).jq().cv(SR.H() - 1);
                ah[] ahArray = ((Z)SR.N().get(n2)).bk(SR.H() - 1);
                if (ahArray != null) {
                    ah3 = ah2 != ahArray[0] ? ahArray[0] : ahArray[1];
                }
                f.I i2 = new f.I(((Z)SR.N().get(n2)).jc());
                SR.ar.add(i2);
                i2.Ab();
                ++n2;
            }
        } else {
            int n3 = 0;
            while (n3 < SR.bW().size()) {
                ((f.I)SR.bW().get(n3)).Ab();
                ((f.I)SR.bW().get(n3)).mw();
                ++n3;
            }
        }
    }

    private void aa() {
        int n2 = 0;
        while (n2 < SR.aN().size()) {
            ((ah)SR.aN().get(n2)).kI();
            ++n2;
        }
        if (this.jogaIntClubes) {
            this.ai();
        }
        if (this.jogaSelecoesAll) {
            this.jw();
        }
        this.ah();
        this.ag();
        this.iZ();
        if (this.jogaIntClubes) {
            this.ae();
        }
        this.Y();
        this.Z();
        this.am();
        this.ak();
        if (SR.jogaRegionais) {
            this.aj();
        }
        if ((SR.bk() || SR.X()) && (n2 = a.e(1)) > 0) {
            a.b(n2, 4, 1);
        }
        a.q();
        this.af();
        if (SR.H() >= 5) {
            this.W();
        }
        afQ.zi();
        afQ.zj();
        best.ag.jO();
        best.ag.jQ();
        if (SR.isJogaSelecoesAll()) {
            this.ac();
        }
        SR.yn().xZ();
        this.yn().clear();
        n2 = 0;
        if (this.bs && !SR.bD()) {
            int n3 = 0;
            while (n3 < SR.M().size()) {
                if (((al)SR.M().get(n3)).fg() != null) {
                    n2 = 1;
                    break;
                }
                ++n3;
            }
            if (n2 != 0) {
                cR.pl();
            }
        }
        if (SR.yL()) {
            this.iY();
        }
        this.bk = false;
        if (n2 != 0) {
            cR.AC();
        } else {
            SR.az();
            this.V();
        }
    }

    public void iX() {
        int n2 = -1;
        n2 = JOptionPane.showConfirmDialog(null, "Deseja criar um torneio Amistoso de in\u00edcio de temporada? ", "Torneio Amistoso", 0);
        if (n2 == 0) {
            s_0.aY(10);
        } else {
            this.bk = false;
            this.V();
        }
    }

    private void iY() {
        String string = "Torneio Amistoso";
        String string2 = "Juazeiro";
        ArrayList<ah> arrayList = new ArrayList<ah>();
        int n2 = 0;
        while (n2 <= 7) {
            arrayList.add((ah)SR.P().get(n2));
            ++n2;
        }
        if (SR.yn() != null) {
            SR.yn().a(arrayList, 0, string, string2, false);
        }
    }

    public void a(String string) {
        ah ah2 = null;
        F f2 = null;
        int n2 = 0;
        int n3 = 0;
        while (n3 < SR.O().size()) {
            n2 = 0;
            f2 = (F)SR.O().get(n3);
            int n4 = 0;
            while (n4 < SR.P().size()) {
                ah2 = (ah)SR.P().get(n4);
                int n5 = 0;
                while (n5 < ah2.kc().size()) {
                    if (((F)ah2.kc().get(n5)).equals(f2)) {
                        ++n2;
                    }
                    ++n5;
                }
                ++n4;
            }
            ++n3;
        }
    }

    public void b(String string) {
        Object var2_2 = null;
        F f2 = null;
        boolean bl = false;
        int n2 = 0;
        while (n2 < SR.O().size()) {
            bl = false;
            f2 = (F)SR.O().get(n2);
            int n3 = 0;
            while (n3 < SR.P().size()) {
                Collections.frequency(((ah)SR.P().get(n3)).kc(), f2);
                ++n3;
            }
            ++n2;
        }
    }

    public void ab() {
        n n2 = new n();
        this.a(n2);
        f.l_0 l_02 = new f.l_0();
        this.a(l_02);
        i_0 i_02 = new i_0();
        this.a(i_02);
        k k2 = new k();
        this.a(k2);
        j j2 = new j();
        this.a(j2);
        f.m_0 m_02 = new f.m_0();
        this.a(m_02);
        g g2 = new g();
        this.a(g2);
        h_0 h_02 = new h_0();
        this.a(h_02);
        e e2 = new e();
        this.a(e2);
        c c2 = new c();
        this.a(c2);
        d d2 = new d();
        this.a(d2);
        p p2 = new p();
        this.a(p2);
        q q2 = new q();
        this.a(q2);
        k_0 k_02 = new k_0();
        this.a(k_02);
        M m2 = new M();
        this.a(m2);
        n_0 n_02 = new n_0();
        this.a(n_02);
        n2.setNome(m_0.getString("eliAS"));
        l_02.setNome(m_0.getString("eliEU"));
        i_02.setNome(m_0.getString("eliAfr"));
        j2.setNome(m_0.getString("eliAsia"));
        k2.setNome(m_0.getString("eliConcacaf"));
        m_02.setNome(m_0.getString("eliOce"));
        p2.setNome(m_0.getString("cro"));
        d2.setNome(m_0.getString("cam"));
        q2.setNome(m_0.getString("ncm"));
        c2.setNome(m_0.getString("nCAfr"));
        e2.setNome(m_0.getString("nCAsi"));
        h_02.setNome(m_0.getString("nCOuro"));
        g2.setNome(m_0.getString("nCopaOFC"));
        k_02.setNome("Final\u00edssima");
        m2.setNome("Liga Na\u00e7\u00f5es Europa");
        n_02.setNome("Liga Na\u00e7\u00f5es Concacaf");
    }

    public void ac() {
        at at2;
        SR.ad();
        if (this.aK != null) {
            this.aK.xZ();
            this.aK.mw();
        }
        if (this.aS != null) {
            this.aS.xZ();
            this.aS.mw();
        }
        if (this.aR != null) {
            this.aR.xZ();
            this.aR.mw();
        }
        if (this.aT != null) {
            this.aT.xZ();
            this.aT.mw();
        }
        if (this.aU != null) {
            this.aU.xZ();
            this.aU.mw();
        }
        if (this.aV != null) {
            this.aV.xZ();
            this.aV.mw();
        }
        if (this.aW != null) {
            this.aW.xZ();
            this.aW.mw();
        }
        if (this.IX != null) {
            this.IX.mw();
        }
        if (this.GC != null) {
            this.GC.mw();
            this.GC.xZ();
        }
        if (this.GI != null) {
            this.GI.mw();
            this.GI.xZ();
        }
        if (this.aL != null) {
            this.aL.xZ();
        }
        if (this.aM != null) {
            this.aM.xZ();
        }
        if (this.aN != null) {
            this.aN.xZ();
        }
        if (this.aQ != null) {
            this.aQ.xZ();
        }
        if (this.aO != null) {
            this.aO.xZ();
        }
        if (this.aP != null) {
            this.aP.xZ();
        }
        if (this.aL != null) {
            this.aL.mw();
        }
        if (this.aM != null) {
            this.aM.mw();
        }
        if (this.aN != null) {
            this.aN.mw();
        }
        if (this.aQ != null) {
            this.aQ.mw();
        }
        if (this.aO != null) {
            this.aO.mw();
        }
        if (this.aP != null) {
            this.aP.mw();
        }
        if (this.bl == this.ae) {
            if (this.aK != null) {
                this.aK.ya();
            } else {
                at2 = new q();
                this.a((q)at2);
                this.aK.ya();
            }
            this.bl += 4;
        }
        if (this.bm - 1 == this.ae) {
            if (this.aM != null) {
                this.aM.fF(0);
            } else {
                at2 = new f.l_0();
                this.a((f.l_0)at2);
                at2.setNome(m_0.getString("eliEU"));
                this.aM.fF(0);
            }
        }
        if (this.bl - 1 == this.ae) {
            if (this.aL != null) {
                this.aL.ya();
            } else {
                at2 = new n();
                this.a((n)at2);
                at2.setNome(m_0.getString("eliAS"));
                this.aL.ya();
            }
            if (this.aM != null) {
                this.aM.fF(7);
            } else {
                at2 = new f.l_0();
                this.a((f.l_0)at2);
                at2.setNome(m_0.getString("eliEU"));
                this.aM.fF(7);
            }
            if (this.aN != null) {
                this.aN.Bj();
            } else {
                at2 = new i_0();
                this.a((i_0)at2);
                at2.setNome(m_0.getString("eliAfr"));
                this.aN.Bj();
            }
            if (this.aQ != null) {
                this.aQ.Bj();
            } else {
                at2 = new k();
                this.a((k)at2);
                at2.setNome(m_0.getString("eliConcacaf"));
                this.aQ.Bj();
            }
            if (this.aO != null) {
                this.aO.Bj();
            } else {
                at2 = new j();
                this.a((j)at2);
                at2.setNome(m_0.getString("eliAsia"));
                this.aO.Bj();
            }
            if (this.aP != null) {
                this.aP.Bj();
            } else {
                at2 = new f.m_0();
                this.a((f.m_0)at2);
                at2.setNome(m_0.getString("eliOce"));
                this.aP.Bj();
            }
        }
        if (this.bm == this.ae) {
            if (this.aS != null) {
                this.aS.ya();
            } else {
                at2 = new p();
                this.a((p)at2);
                at2.setNome(m_0.getString("cro"));
                this.aS.ya();
            }
            this.bm += 4;
        } else if (this.aS != null) {
            this.aS.p((f.s)null);
        }
        if (this.bn == this.ae) {
            if (this.aR != null) {
                this.aR.ya();
            } else {
                at2 = new d();
                this.a((d)at2);
                at2.setNome(m_0.getString("cam"));
                this.aR.ya();
            }
            this.bn = this.ae == 1 ? (this.bn += 4) : (this.bn += 4);
        } else if (this.aR != null) {
            this.aR.p((f.s)null);
        }
        if (this.bo == this.ae) {
            if (this.aT != null) {
                this.aT.ya();
            } else {
                this.a(new c());
                this.aT.ya();
            }
            this.bo += 4;
        } else if (this.aT != null) {
            this.aT.p((f.s)null);
        }
        if (this.bp == this.ae) {
            if (this.aU != null) {
                this.aU.ya();
            } else {
                this.a(new e());
                this.aU.ya();
            }
            this.bp += 4;
        } else if (this.aU != null) {
            this.aU.p((f.s)null);
        }
        if (this.br == this.ae) {
            if (this.aV != null) {
                this.aV.ya();
            } else {
                this.a(new h_0());
                this.aV.ya();
            }
            this.br += 2;
        } else if (this.aV != null) {
            this.aV.p((f.s)null);
        }
        if (this.bq == this.ae) {
            if (this.aW != null) {
                this.aW.ya();
            } else {
                this.a(new g());
                this.aW.ya();
            }
            this.bq += 4;
        } else if (this.aW != null) {
            this.aW.p((f.s)null);
        }
        if (this.IZ == this.ae) {
            if (this.IX != null) {
                this.IX.Bs();
            }
            this.IZ += 4;
        }
        if (this.Ja == this.ae) {
            if (this.GC != null) {
                this.GC.Ar();
            }
            this.Ja += 2;
        }
        if (this.Jb == this.ae) {
            if (this.GI != null) {
                this.GI.Ar();
            }
            this.Jb += 2;
        }
    }

    public void ad() {
        int n2 = 0;
        while (n2 < this.ap.size()) {
            ((Z)this.ap.get(n2)).jm();
            ((Z)this.ap.get(n2)).jj();
            ++n2;
        }
    }

    public void ae() {
        at at2;
        int n2 = 0;
        while (n2 < SR.aG().size()) {
            ((Z)SR.aG().get(n2)).jy();
            ++n2;
        }
        this.aP().yq();
        this.aF().yq();
        this.aI().yq();
        this.aO().yq();
        this.aL().yq();
        this.aQ().yq();
        this.aH().yq();
        this.aK().yq();
        this.mj().yq();
        this.aH().mw();
        this.aF().mw();
        this.aI().mw();
        this.aO().mw();
        this.aL().mw();
        this.aQ().mw();
        this.aP().mw();
        this.aH().mw();
        this.aK().mw();
        this.mj().mw();
        this.aR().mw();
        if (SR.aW() != null) {
            this.aW().mw();
        }
        if (SR.aV() != null) {
            this.aV().mw();
        }
        if (this.aY() != null) {
            this.aY().mw();
        }
        if (this.ba() != null) {
            this.ba().mw();
        }
        if (this.aZ() != null) {
            this.aZ().mw();
        }
        if (this.aT != null) {
            this.aT.xZ();
            this.aT.mw();
        }
        if (this.aU != null) {
            this.aU.xZ();
            this.aU.mw();
        }
        if (this.aV != null) {
            this.aV.xZ();
            this.aV.mw();
        }
        if (this.aW != null) {
            this.aW.xZ();
            this.aW.mw();
        }
        if ((n2 = a.d(4)) > 0) {
            a.b(n2, 1, 0);
        }
        if (SR.aV() != null) {
            SR.aV().zR();
        } else {
            at2 = new e_0();
            SR.a((e_0)at2);
            ((e_0)at2).zR();
        }
        if (SR.aW() != null) {
            SR.aW().zR();
        } else {
            at2 = new d_0();
            SR.a((d_0)at2);
            ((d_0)at2).zR();
        }
        if (SR.aV() != null) {
            SR.aV().mw();
        }
        if (SR.aW() != null) {
            SR.aW().mw();
        }
    }

    public void c(String string) {
        Object var2_2 = null;
        F f2 = null;
        boolean bl = false;
        int n2 = 0;
        while (n2 < SR.Q().size()) {
            bl = false;
            f2 = (F)SR.Q().get(n2);
            int n3 = 0;
            while (n3 < SR.P().size()) {
                Collections.frequency(((ah)SR.P().get(n3)).ky(), f2);
                ++n3;
            }
            ++n2;
        }
    }

    private void af() {
        this.by.clear();
        this.bz.clear();
        this.bA.clear();
        this.bB.clear();
        int n2 = 0;
        while (n2 < this.ai.size()) {
            ((F)this.ai.get(n2)).gc();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.ag.size()) {
            ((F)this.O().get(n2)).gd();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.bz.size()) {
            this.ag.remove(this.bz.get(n2));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.by.size()) {
            this.ag.add((F)this.by.get(n2));
            ++n2;
        }
        this.by.clear();
        this.bz.clear();
        n2 = 0;
        while (n2 < this.ah.size()) {
            ((F)this.Q().get(n2)).gf();
            ++n2;
        }
        this.c(true);
        n2 = 0;
        while (n2 < this.bB.size()) {
            this.ah.remove(this.bB.get(n2));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.bA.size()) {
            if (!this.ah.contains(this.bA.get(n2))) {
                this.ah.add((F)this.bA.get(n2));
            }
            ++n2;
        }
        this.bA.clear();
        this.bB.clear();
        n2 = 0;
        while (n2 < SR.O().size()) {
            ((F)SR.O().get(n2)).fK();
            ((F)SR.O().get(n2)).fJ();
            ++n2;
        }
    }

    public void c(boolean bl) {
        int n2 = 0;
        if (!bl) {
            int[] nArray = new int[6];
            nArray[1] = 1;
            nArray[2] = 2;
            nArray[3] = 3;
            nArray[4] = 3;
            nArray[5] = 4;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[5];
            nArray3[1] = 1;
            nArray3[2] = 2;
            nArray3[3] = 3;
            nArray3[4] = 4;
            int[] nArray4 = nArray3;
            int n3 = 0;
            while (n3 < this.aj.size()) {
                int n4;
                if (((ah)this.aj.get(n3)).kn().booleanValue() && ((ah)this.aj.get(n3)).getReputacao() >= 3) {
                    if (((ah)this.aj.get(n3)).kx() < 12) {
                        n4 = 0;
                        while (n4 < nArray2.length) {
                            F.a((ah)this.aj.get(n3), nArray2[n4], null, 0, null, bl);
                            ++n4;
                        }
                    }
                } else if (((ah)this.aj.get(n3)).kx() < 5) {
                    n4 = 0;
                    while (n4 < nArray4.length) {
                        F.a((ah)this.aj.get(n3), nArray4[n4], null, 0, null, bl);
                        ++n4;
                    }
                }
                ++n3;
            }
        } else {
            int n5 = 0;
            while (n5 < this.aj.size()) {
                if (((ah)this.aj.get(n5)).kx() < 15) {
                    if (((ah)this.aj.get(n5)).kn().booleanValue()) {
                        n2 = 2 + new Random().nextInt(3);
                    } else {
                        n2 = new Random().nextInt(3);
                        if (((ah)this.aj.get(n5)).getNivel() >= 20) {
                            ++n2;
                        }
                    }
                    if (n2 + ((ah)this.aj.get(n5)).kx() >= 20) {
                        n2 = 20 - ((ah)this.aj.get(n5)).kx() - 2;
                    }
                    if (n2 > 0) {
                        int n6 = 0;
                        while (n6 <= n2) {
                            F.a((ah)this.aj.get(n5), -1, null, 0, null, bl);
                            ++n6;
                        }
                    }
                }
                ++n5;
            }
        }
    }

    private void iZ() {
        int n2 = 0;
        while (n2 < this.al.size()) {
            ((al)this.al.get(n2)).kk();
            ++n2;
        }
    }

    private void ag() {
        int n2 = 0;
        while (n2 < this.aj.size()) {
            ((ah)this.aj.get(n2)).km().clear();
            ((ah)this.aj.get(n2)).kk();
            if (!((ah)this.aj.get(n2)).jZ().booleanValue()) {
                ((ah)this.aj.get(n2)).kp();
                ((ah)this.aj.get(n2)).kA();
                ((ah)this.aj.get(n2)).kz();
            }
            if (((ah)this.aj.get(n2)).ka() != null) {
                ((ah)this.aj.get(n2)).ka().cj(50);
                ((ah)this.aj.get(n2)).ka().ck(50);
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < SR.aN().size()) {
            ((ah)SR.aN().get(n2)).kG();
            ++n2;
        }
    }

    private void ah() {
        this.I();
        int n2 = 0;
        while (n2 < this.as.size()) {
            ((a)this.as.get(n2)).clear();
            ++n2;
        }
        this.as.clear();
        this.r(SR.op() + (this.ae - 1));
        a.g();
    }

    private void ai() {
        ah ah2;
        if (SR.aK() != null && SR.aI() != null) {
            ah2 = SR.aK().cS();
            SR.aI().T(ah2);
            SR.aK().N(ah2);
        }
        if (SR.aF() != null && SR.aH() != null) {
            ah2 = SR.aH().cS();
            SR.aF().O(ah2);
            SR.aH().N(ah2);
        }
        if (SR.aK() != null && SR.mj() != null) {
            ah2 = SR.mj().cS();
            SR.aK().ab(ah2);
        }
    }

    private void jw() {
        ah ah2;
        if (this.IX != null && this.aS != null && (ah2 = this.aS.cS()) != null) {
            this.IX.Z(ah2);
        }
        if (this.IX != null && this.aR != null && (ah2 = this.aR.cS()) != null) {
            this.IX.aa(ah2);
        }
    }

    private void aj() {
        ArrayList arrayList = new ArrayList();
        arrayList = p_0.di();
        int n2 = 0;
        while (n2 < this.aZ.length) {
            if (this.aZ[n2] != null) {
                this.aZ[n2].am(arrayList);
            }
            ++n2;
        }
    }

    private void ak() {
        int n2 = 0;
        while (n2 < SR.aE().size()) {
            ((w)SR.aE().get(n2)).ee();
            ++n2;
        }
        n2 = 0;
        while (n2 < SR.aE().size()) {
            int n3 = 0;
            while (n3 < ((w)SR.aE().get(n2)).eb().size()) {
                ((o)((w)SR.aE().get(n2)).eb().get(n3)).yi().aN(false);
                ++n3;
            }
            ++n2;
        }
    }

    public void al() {
        int n2;
        int n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 0;
            while (n2 < ((Z)SR.N().get(n3)).eb().size()) {
                ((b_0)((Z)SR.N().get(n3)).eb().get(n2)).fi(n2);
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.O().size()) {
            ((F)SR.O().get(n3)).ay(0);
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 0;
            while (n2 < ((b_0)((Z)SR.N().get(n3)).eb().get(0)).zM().size()) {
                ((F)((b_0)((Z)SR.N().get(n3)).eb().get(0)).zM().get(n2)).fd();
                ++n2;
            }
            ++n3;
        }
    }

    private void am() {
        int n2;
        int n3 = 0;
        while (n3 < SR.N().size()) {
            ((Z)SR.N().get(n3)).ee();
            ((Z)SR.N().get(n3)).jq().mw();
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 0;
            while (n2 < ((Z)SR.N().get(n3)).eb().size()) {
                ((b_0)((Z)SR.N().get(n3)).eb().get(n2)).yi().aN(false);
                ((b_0)((Z)SR.N().get(n3)).eb().get(n2)).aT(false);
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.N().size()) {
            n2 = 1;
            if (((Z)SR.N().get(n3)).jc() == 29 && SR.bk()) {
                n2 = 0;
            } else if (((Z)SR.N().get(n3)).jc() == 29 && SR.X()) {
                n2 = 0;
            }
            if (n2 != 0) {
                int n4;
                ArrayList<ah> arrayList = new ArrayList<ah>();
                int n5 = 0;
                while (n5 < ((Z)SR.N().get(n3)).eb().size()) {
                    n4 = 0;
                    while (n4 < ((b_0)((Z)SR.N().get(n3)).eb().get(n5)).yi().yK().size()) {
                        arrayList.add((ah)((b_0)((Z)SR.N().get(n3)).eb().get(n5)).yi().yK().get(n4));
                        ++n4;
                    }
                    ++n5;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(((Z)SR.N().get(n3)).jg());
                Collections.sort(arrayList2, a_0.cN);
                n4 = 0;
                while (n4 < arrayList2.size()) {
                    if (!arrayList.contains(arrayList2.get(n4))) {
                        arrayList.add((ah)arrayList2.get(n4));
                    }
                    ++n4;
                }
                ((Z)SR.N().get(n3)).a(arrayList, false, "atualizaLigasNacionais");
            } else if (((Z)SR.N().get(n3)).jc() == 29) {
                ((Z)SR.N().get(n3)).a((f.f_0)null);
            }
            ++n3;
        }
    }

    public static void an() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((a)SR.R().get(SR.af)).j();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (arrayList.get(n2) instanceof f.s && ((l_0)arrayList.get(n2)).b() == 1 && ((f.s)arrayList.get(n2)).vl() != null) {
                ((f.s)arrayList.get(n2)).vl().a((f.s)arrayList.get(n2));
            }
            ++n2;
        }
    }

    public int ao() {
        if (((a)SR.R().get(SR.J())).t().size() > 0) {
            return ((at)((a)SR.R().get(SR.J())).t().get(0)).b();
        }
        return -1;
    }

    public void ap() {
        this.bH = false;
        if (SR.bD() && SR.H() == 10) {
            SR.h(false);
        }
        if (f_0.ay()) {
            if (this.bs) {
                s_0.aY(2);
                if (!this.bL) {
                    if (SR.autoSalvar == 1) {
                        if (this.bJ >= 3) {
                            try {
                                s_0.iF().ru();
                            }
                            catch (IOException iOException) {
                                iOException.printStackTrace();
                            }
                            this.bJ = 0;
                        } else {
                            ++this.bJ;
                        }
                    } else if (SR.autoSalvar == 2) {
                        try {
                            s_0.iF().ru();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    } else if (SR.autoSalvar == 3 && this.bF()) {
                        this.bM = false;
                        try {
                            s_0.iF().ru();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    }
                }
                if (!this.bL && !s_0.iF().rB()) {
                    if (new Random().nextInt(100) == 1) {
                        s_0.iF().ac(false);
                    } else if (new Random().nextInt(2) == 1) {
                        s_0.iF().ac(true);
                    }
                }
            }
        } else {
            if (SR.isIgnoraLigas() && this.ao() == 1 && !s.dG() && !this.bI) {
                this.bH = true;
            }
            if (this.bI) {
                this.bI = false;
            }
            if (SR.isIgnoraEstadual() && this.ao() == 3) {
                if (!s.J(3)) {
                    this.bH = true;
                }
            } else if (SR.isIgnoraEstadual() && this.ao() == 10 && !s.J(10)) {
                this.bH = true;
            }
            if (!this.bH && this.ao() == 10 && this.aq() && !s.dH()) {
                this.bH = true;
            } else if (!this.bH && this.ao() == 10 && !this.ar() && vM().getRegionaisSemHumanos() == 0) {
                this.bH = true;
            }
            best.ah.kh();
            I.he();
            if (this.bs && !this.bH && s.dw()) {
                s.dx();
            } else {
                this.at();
            }
        }
        if (this.bL) {
            this.bL = false;
        }
    }

    private boolean aq() {
        int n2 = 0;
        int n3 = 0;
        while (n3 < SR.aZ.length) {
            if (SR.aZ[n3] != null) {
                ++n2;
            }
            ++n3;
        }
        return n2 < 4 && n2 > 0;
    }

    private boolean ar() {
        int n2 = 0;
        while (n2 < SR.M().size()) {
            ah ah2;
            if (SR.M().get(n2) != null && (ah2 = ((al)SR.M().get(n2)).fg()) != null) {
                int n3 = 0;
                while (n3 < SR.aZ.length) {
                    if (SR.aZ[n3] != null && SR.aZ[n3].yd() != null && SR.aZ[n3].yd().yK() != null && SR.aZ[n3].yd().yK().contains(ah2)) {
                        return true;
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        return false;
    }

    public void as() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((a)SR.R().get(SR.J())).h();
        int n2 = ((a)SR.R().get(SR.J())).b();
        int n3 = 0;
        while (n3 < arrayList.size()) {
            ((I)arrayList.get(n3)).a(true);
            ((I)arrayList.get(n3)).hg();
            ((I)arrayList.get(n3)).hi();
            ((I)arrayList.get(n3)).hf();
            ((I)arrayList.get(n3)).hh();
            ((I)arrayList.get(n3)).hc().I(false);
            ((I)arrayList.get(n3)).hd().I(false);
            ((I)arrayList.get(n3)).a(null);
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.O().size()) {
            ((F)SR.O().get(n3)).fr();
            ++n3;
        }
        n3 = 0;
        while (n3 < SR.Q().size()) {
            ((F)SR.Q().get(n3)).ai(100);
            ++n3;
        }
        if (n2 == 7 || n2 == 9) {
            n3 = 0;
            while (n3 < SR.aG().size()) {
                ah ah2 = ((Z)SR.aG().get(n3)).jn();
                if (ah2 != null) {
                    int n4 = 0;
                    while (n4 < ah2.kc().size()) {
                        if (((F)ah2.kc().get(n4)).fg() == null) {
                            ((F)ah2.kc().get(n4)).fr();
                        }
                        ++n4;
                    }
                }
                ++n3;
            }
        }
        Collections.sort(SR.L(), bO);
    }

    public void at() {
        this.as();
        f_0.an();
        this.aM();
        this.aC();
        this.aB();
        this.q(0);
        if (this.bs && !this.bH) {
            s_0.aY(5);
        } else {
            this.ax();
        }
    }

    private void au() {
        int n2;
        ArrayList<t_0> arrayList = new ArrayList<t_0>();
        if (this.av != null && SR.av.size() > 0) {
            n2 = 0;
            while (n2 < SR.av.size()) {
                if (((t_0)this.av.get(n2)).tM()) {
                    boolean bl = false;
                    al al2 = null;
                    if (((t_0)this.av.get(n2)).x().fg() != null && ((t_0)this.av.get(n2)).x().fg().jZ().booleanValue()) {
                        bl = true;
                        al2 = ((t_0)this.av.get(n2)).x().fg().ka();
                    }
                    if (((t_0)this.av.get(n2)).tN()) {
                        arrayList.add((t_0)SR.av.get(n2));
                        if (((t_0)this.av.get(n2)).tP() != null && ((t_0)this.av.get(n2)).tP().jZ().booleanValue()) {
                            new as(((t_0)this.av.get(n2)).tP().ka(), 29, 83, "", ((t_0)this.av.get(n2)).x().getNome());
                        } else if (bl) {
                            new as(al2, 29, 84, "", ((t_0)this.av.get(n2)).x().getNome());
                        }
                    } else if (((t_0)this.av.get(n2)).tP() != null && ((t_0)this.av.get(n2)).tP().jZ().booleanValue() && !((t_0)this.av.get(n2)).tQ()) {
                        new as(((t_0)this.av.get(n2)).tP().ka(), 28, 82, "", ((t_0)this.av.get(n2)).x().getNome());
                        ((t_0)this.av.get(n2)).au(true);
                    }
                }
                ++n2;
            }
        }
        if (arrayList.size() > 0) {
            n2 = 0;
            while (n2 < arrayList.size()) {
                SR.av.remove(arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void d(F f2) {
        int n2 = -1;
        if (this.av != null && SR.av.size() > 0) {
            int n3 = 0;
            while (n3 < SR.av.size()) {
                if (((t_0)SR.av.get(n3)).x() == f2) {
                    n2 = n3;
                    break;
                }
                ++n3;
            }
        }
        if (n2 >= 0) {
            SR.av.remove(n2);
        }
    }

    private void av() {
        int n2 = 0;
        while (n2 < SR.aN().size()) {
            int n3 = 0;
            while (n3 < ((ah)SR.aN().get(n2)).kc().size()) {
                if (((F)((ah)SR.aN().get(n2)).kc().get(n3)).ft().booleanValue()) {
                    new an((F)((ah)SR.aN().get(n2)).kc().get(n3), ((F)((ah)SR.aN().get(n2)).kc().get(n3)).fl(), true, true);
                }
                ++n3;
            }
            ++n2;
        }
    }

    private void aw() {
        int n2;
        ArrayList<B> arrayList = new ArrayList<B>();
        if (this.aw != null && SR.aw.size() > 0) {
            n2 = 0;
            while (n2 < SR.aw.size()) {
                if (((B)SR.aw.get(n2)).ew().before(SR.bb())) {
                    ((B)SR.aw.get(n2)).ex();
                    arrayList.add((B)SR.aw.get(n2));
                }
                ++n2;
            }
        }
        if (arrayList.size() > 0) {
            n2 = 0;
            while (n2 < arrayList.size()) {
                SR.aw.remove(arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void ax() {
        int n2 = ((a)SR.R().get(SR.J())).i();
        if (n2 == 1 || n2 == 3) {
            this.n(n2);
        }
        int n3 = this.az();
        if (this.av != null && SR.av.size() > 0) {
            this.au();
        }
        if (new Random().nextInt(100) > 50) {
            this.av();
        }
        if (this.aw != null && SR.aw.size() > 0) {
            this.aw();
        }
        this.q(1);
        if (n3 == 0) {
            this.bk = true;
        }
        if (this.bs) {
            if (this.bk) {
                afQ.zw();
                this.al();
                s_0.aY(6);
            } else {
                SR.ap();
            }
        } else if (this.bk) {
            this.al();
        }
    }

    private static boolean ay() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((a)SR.R().get(SR.af)).h();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (((I)arrayList.get(n2)).hc().jZ().booleanValue() && !((I)arrayList.get(n2)).hc().kf()) {
                f_0.a(((I)arrayList.get(n2)).hc(), (I)arrayList.get(n2));
                return true;
            }
            if (((I)arrayList.get(n2)).hd().jZ().booleanValue() && !((I)arrayList.get(n2)).hd().kf()) {
                f_0.a(((I)arrayList.get(n2)).hd(), (I)arrayList.get(n2));
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static ah B() {
        return X;
    }

    public static void a(ah ah2, I i2) {
        X = ah2;
        bv = i2;
    }

    public int az() {
        int n2 = SR.af;
        while (n2 < SR.R().size()) {
            if (!((a)SR.R().get(n2)).e() && ((a)SR.R().get(n2)).b() > 0 && ((a)SR.R().get(n2)).h().size() > 0) {
                SR.l(n2);
                return n2;
            }
            ++n2;
        }
        return 0;
    }

    private static void aA() {
    }

    private void aB() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((a)this.as.get(this.af)).t();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            ((at)arrayList.get(n2)).mx();
            ++n2;
        }
    }

    private void aC() {
        ArrayList arrayList = new ArrayList();
        arrayList = ((a)this.as.get(this.af)).j();
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (arrayList.get(n2) instanceof f.s) {
                ((f.s)arrayList.get(n2)).pO();
            } else if (arrayList.get(n2) instanceof z) {
                ((z)arrayList.get(n2)).pO();
            }
            ++n2;
        }
    }

    private void n(int n2) {
        int n3;
        int n4 = 0;
        while (n4 < this.am.size()) {
            if (((al)this.am.get(n4)).jZ().booleanValue() && ((al)this.am.get(n4)).fg() == null) {
                ArrayList arrayList = afQ.b((al)this.am.get(n4), false);
                if (!SR.bD() && arrayList != null && arrayList.size() > 0) {
                    s_0.a(arrayList, (al)this.am.get(n4), 0);
                }
            }
            ++n4;
        }
        ArrayList arrayList = new ArrayList();
        if (n2 == 1) {
            n3 = 0;
            while (n3 < this.ao.size()) {
                ((Z)this.ao.get(n3)).A(arrayList);
                ++n3;
            }
        } else if (n2 == 3) {
            n3 = 0;
            while (n3 < this.aq.size()) {
                ((w)this.aq.get(n3)).A(arrayList);
                ++n3;
            }
        }
        if (arrayList.size() > 0 && SR.bs && !SR.bD() && SR.getVerMudancaTecnicos() == 1) {
            s_0.K(arrayList);
        }
        n3 = 0;
    }

    public boolean isJogaEstadual() {
        return this.jogaEstadual;
    }

    public void setJogaEstadual(boolean bl) {
        this.jogaEstadual = bl;
    }

    public ArrayList aE() {
        return this.aq;
    }

    public r aF() {
        return this.aC;
    }

    public void a(r r2) {
        this.aC = r2;
    }

    public Z o(int n2) {
        int n3 = 0;
        while (n3 < this.ao.size()) {
            if (((Z)this.ao.get(n3)).jc() == n2) {
                return (Z)this.ao.get(n3);
            }
            ++n3;
        }
        return null;
    }

    public w p(int n2) {
        int n3 = 0;
        while (n3 < this.aq.size()) {
            if (((w)this.aq.get(n3)).getEstado() == n2) {
                return (w)this.aq.get(n3);
            }
            ++n3;
        }
        return null;
    }

    public ArrayList aG() {
        return this.ap;
    }

    public H aH() {
        return this.aY;
    }

    public void a(H h3) {
        this.aY = h3;
    }

    public boolean isJogaIntClubes() {
        return this.jogaIntClubes;
    }

    public void setJogaIntClubes(boolean bl) {
        this.jogaIntClubes = bl;
    }

    public v aI() {
        return this.aB;
    }

    public void a(v v2) {
        this.aB = v2;
    }

    public boolean aJ() {
        return this.bb;
    }

    public void d(boolean bl) {
        this.bb = bl;
    }

    public x aK() {
        return this.aX;
    }

    public void a(x x2) {
        this.aX = x2;
    }

    public u aL() {
        return this.aE;
    }

    public void a(u u2) {
        this.aE = u2;
    }

    public void aM() {
        int n2 = 0;
        while (n2 <= this.af) {
            ((a)this.as.get(n2)).a(true);
            ++n2;
        }
    }

    public void q(int n2) {
        if (n2 == 0) {
            int n3 = 0;
            while (n3 <= this.af) {
                if (((a)this.as.get(n3)).r().size() > 0) {
                    ((a)this.as.get(n3)).f(0);
                }
                ++n3;
            }
        } else {
            int n4 = 0;
            while (n4 <= this.af) {
                if (((a)this.as.get(n4)).s().size() > 0) {
                    ((a)this.as.get(n4)).f(1);
                }
                ++n4;
            }
        }
    }

    public ArrayList aN() {
        return this.ak;
    }

    public void d(ah ah2) {
        this.ak.add(ah2);
    }

    public t aO() {
        return this.aD;
    }

    public void a(t t2) {
        this.aD = t2;
    }

    public f.w aP() {
        return this.aF;
    }

    public y aQ() {
        return this.aG;
    }

    public void a(y y2) {
        this.aG = y2;
    }

    public void a(f.w w2) {
        this.aF = w2;
    }

    public f.a_0 aR() {
        if (this.aA == null && SR.isJogaIntClubes()) {
            this.aA = new f.a_0();
        }
        return this.aA;
    }

    public void a(f.a_0 a_02) {
        this.aA = a_02;
    }

    public void r(int n2) {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = DateFormat.getDateInstance();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        calendar.set(n2, 0, 1, 0, 0, 0);
        while (calendar.get(1) == n2) {
            a a2 = new a();
            a2.a(calendar.get(1), calendar.get(2), calendar.get(5));
            SR.a(a2);
            if (calendar.get(2) == 0 && calendar.get(7) == 1 && ++n3 == 1) {
                n4 = n5;
                SR.l(n5);
            }
            ++n5;
            calendar.add(5, 1);
        }
        this.aS();
    }

    private void aS() {
        ArrayList arrayList = a.d();
        ArrayList arrayList2 = a.c(1);
        ArrayList arrayList3 = this.salarioMensal ? arrayList : arrayList2;
        int n2 = 0;
        while (n2 < arrayList3.size()) {
            a.b((Integer)arrayList3.get(n2), 2, 0);
            ++n2;
        }
        n2 = 0;
        while (n2 < arrayList.size()) {
            a.b((Integer)arrayList.get(n2), 5, 0);
            ++n2;
        }
        arrayList3 = arrayList2;
        n2 = 0;
        while (n2 < arrayList3.size()) {
            a.b((Integer)arrayList3.get(n2), 3, 0);
            ++n2;
        }
    }

    public boolean isUsaGrupoPadraoEstadual() {
        return this.usaGrupoPadraoEstadual;
    }

    public void setUsaGrupoPadraoEstadual(boolean bl) {
        this.usaGrupoPadraoEstadual = bl;
    }

    public void aT() {
        int n2;
        if (SR.isHabilidadeIndividual() && SR.bO() == 3) {
            n2 = 0;
            while (n2 < this.aj.size()) {
                ((ah)this.aj.get(n2)).lj();
                ++n2;
            }
        }
        n2 = 0;
        while (n2 < this.ag.size()) {
            ((F)this.ag.get(n2)).fV();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.ah.size()) {
            ((F)this.ah.get(n2)).fY();
            ++n2;
        }
        if (SR.isHabilidadeIndividual()) {
            if (SR.bO() == 3) {
                SR.A(0);
            } else {
                SR.bP();
            }
        }
    }

    public void aU() {
        int n2 = 0;
        while (n2 < this.O().size()) {
            ((F)this.O().get(n2)).fI();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.Q().size()) {
            ((F)this.Q().get(n2)).fI();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.aj.size()) {
            ((ah)this.aj.get(n2)).kp();
            ((ah)this.aj.get(n2)).kH();
            ++n2;
        }
    }

    public e_0 aV() {
        return this.aI;
    }

    public void a(e_0 e_02) {
        this.aI = e_02;
    }

    public d_0 aW() {
        return this.aJ;
    }

    public void a(d_0 d_02) {
        this.aJ = d_02;
    }

    public boolean isSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(boolean bl) {
        this.salarioMensal = bl;
    }

    public ArrayList aX() {
        if (this.bx == null) {
            this.bx = new ArrayList();
        }
        return this.bx;
    }

    public q aY() {
        return this.aK;
    }

    public void a(q q2) {
        this.aK = q2;
    }

    public d aZ() {
        return this.aR;
    }

    public void a(d d2) {
        this.aR = d2;
    }

    public p ba() {
        return this.aS;
    }

    public void a(p p2) {
        this.aS = p2;
    }

    public Z s(int n2) {
        int n3 = 0;
        while (n3 < this.ap.size()) {
            if (((Z)this.ap.get(n3)).jc() == n2) {
                return (Z)this.ap.get(n3);
            }
            ++n3;
        }
        return null;
    }

    public Calendar bb() {
        return ((a)this.as.get(this.af)).a();
    }

    public long bc() {
        return ((a)this.as.get(this.af)).a().getTime().getTime();
    }

    public ArrayList bd() {
        return this.ax;
    }

    public c be() {
        return this.aT;
    }

    public void a(c c2) {
        this.aT = c2;
    }

    public e bf() {
        return this.aU;
    }

    public void a(e e2) {
        this.aU = e2;
    }

    public h_0 bg() {
        return this.aV;
    }

    public void a(h_0 h_02) {
        this.aV = h_02;
    }

    public al bh() {
        int n2 = 0;
        while (n2 < this.al.size()) {
            if (((al)this.al.get(n2)).fg() == null && !((al)this.al.get(n2)).jZ().booleanValue()) {
                return (al)this.al.get(n2);
            }
            ++n2;
        }
        return null;
    }

    public al a(ah ah2, int n2) {
        ArrayList<al> arrayList = new ArrayList<al>();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (n5 < this.al.size()) {
            if (n2 == -1) {
                n3 = 0;
                n4 = 5;
            } else if (n2 == 0) {
                n3 = ah2.getReputacao();
                n4 = ah2.getReputacao();
            } else if (n2 == 1) {
                n3 = ah2.getReputacao() - 1;
                n4 = ah2.getReputacao();
            } else if (n2 == 2) {
                n3 = ah2.getReputacao() - 2;
                n4 = ah2.getReputacao() + 1;
            }
            if (!(((al)this.al.get(n5)).fg() != null || ((al)this.al.get(n5)).jZ().booleanValue() || ((al)this.al.get(n5)).fg() == ah2 || ((al)this.al.get(n5)).bz() != ah2.getPais() && ((al)this.al.get(n5)).lE() != ah2.getPais() || ((al)this.al.get(n5)).getReputacao() < n3 || ((al)this.al.get(n5)).getReputacao() > n4)) {
                arrayList.add((al)this.al.get(n5));
            }
            ++n5;
        }
        if (arrayList.size() > 0) {
            n5 = new Random().nextInt(100);
            if (n5 < 50) {
                Collections.sort(arrayList, bO);
            } else {
                Collections.shuffle(arrayList);
            }
        }
        if (arrayList.size() > 0) {
            return (al)arrayList.get(0);
        }
        return null;
    }

    public void a(al al2, al al3) {
        ah ah2 = al2.fg();
        ah ah3 = al3.fg();
        al2.i(al3);
        al3.i(al2);
        al2.E(ah3);
        al3.E(ah2);
    }

    public void a(ah ah2, al al2, al al3) {
        if (al2 != null) {
            al2.i(al3);
        }
        if (al3 != null) {
            al3.E(ah2);
        }
    }

    public boolean t(int n2) {
        int n3 = 0;
        while (n3 < this.bF.size()) {
            if (((O)this.bF.get(n3)).getPais() == n2 && ((O)this.bF.get(n3)).iC()) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    public void bi() {
        int n2 = 0;
        while (n2 < this.bF.size()) {
            ((O)this.bF.get(n2)).v(true);
            ++n2;
        }
    }

    public boolean bj() {
        int n2 = 0;
        while (n2 < this.bF.size()) {
            if (((O)this.bF.get(n2)).iC()) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public boolean isJogaIntano1() {
        return this.jogaIntano1;
    }

    public void setJogaIntano1(boolean bl) {
        this.jogaIntano1 = bl;
    }

    public boolean isGruposIntPadrao() {
        return this.gruposIntPadrao;
    }

    public void setGruposIntPadrao(boolean bl) {
        this.gruposIntPadrao = bl;
    }

    public boolean[] getVerJint() {
        return this.verJint;
    }

    public void setVerJint(boolean[] blArray) {
        this.verJint = blArray;
    }

    public void setVerJint(boolean bl, int n2) {
        this.verJint[n2] = bl;
    }

    public boolean isJogaSelecoesAll() {
        return this.jogaSelecoesAll;
    }

    public void setJogaSelecoesAll(boolean bl) {
        this.jogaSelecoesAll = bl;
    }

    public boolean bk() {
        return this.bc;
    }

    public void e(boolean bl) {
        this.bc = bl;
    }

    public static I bl() {
        return bv;
    }

    public boolean bm() {
        return this.bd;
    }

    public void f(boolean bl) {
        this.bd = bl;
    }

    public boolean isNegritoCasa() {
        return this.negritoCasa;
    }

    public void setNegritoCasa(boolean bl) {
        this.negritoCasa = bl;
    }

    public ArrayList bn() {
        return this.at;
    }

    public ArrayList bo() {
        return this.au;
    }

    public int getAutoSalvar() {
        return this.autoSalvar;
    }

    public void setAutoSalvar(int n2) {
        this.autoSalvar = n2;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int n2) {
        this.velocidade = n2;
    }

    public int getVelocidadeNH() {
        return this.velocidadeNH;
    }

    public void setVelocidadeNH(int n2) {
        this.velocidadeNH = n2;
    }

    public int getAvisoTerminoContrato() {
        return this.avisoTerminoContrato;
    }

    public void setAvisoTerminoContrato(int n2) {
        this.avisoTerminoContrato = n2;
    }

    public int getVerDecisaoPenNaoHumano() {
        return this.verDecisaoPenNaoHumano;
    }

    public void setVerDecisaoPenNaoHumano(int n2) {
        this.verDecisaoPenNaoHumano = n2;
    }

    public int getVerMudancaTecnicos() {
        return this.verMudancaTecnicos;
    }

    public void setVerMudancaTecnicos(int n2) {
        this.verMudancaTecnicos = n2;
    }

    public int getVerJanelaSubs() {
        return this.verJanelaSubs;
    }

    public void setVerJanelaSubs(int n2) {
        this.verJanelaSubs = n2;
    }

    public boolean isAutoRenovaContrato() {
        return this.autoRenovaContrato;
    }

    public void setAutoRenovaContrato(boolean bl) {
        this.autoRenovaContrato = bl;
    }

    public boolean isUsaCorPlacar() {
        return this.usaCorPlacar;
    }

    public void setUsaCorPlacar(boolean bl) {
        this.usaCorPlacar = bl;
    }

    public int getCorPlacar() {
        return this.corPlacar;
    }

    public void setCorPlacar(int n2) {
        this.corPlacar = n2;
    }

    public boolean isUsaSons() {
        return this.usaSons;
    }

    public void setUsaSons(boolean bl) {
        this.usaSons = bl;
    }

    public boolean isUsaCoresLista() {
        return this.usaCoresLista;
    }

    public void setUsaCoresLista(boolean bl) {
        this.usaCoresLista = bl;
    }

    public boolean isVerEstaduaisAgrupados() {
        return this.verEstaduaisAgrupados;
    }

    public void setVerEstaduaisAgrupados(boolean bl) {
        this.verEstaduaisAgrupados = bl;
    }

    public String[] bp() {
        return this.bP;
    }

    public void bq() {
        int n2 = 0;
        while (n2 < this.bP.length) {
            this.bP[n2] = String.format("#%02x%02x%02x", this.coresLista[0].getRed(), this.coresLista[n2].getGreen(), this.coresLista[n2].getBlue());
            ++n2;
        }
    }

    public Color[] getCoresLista() {
        if (this.coresLista != null) {
            return this.coresLista;
        }
        this.coresLista = new Color[5];
        int n2 = 0;
        while (n2 < this.coresLista.length) {
            this.coresLista[n2] = new Color(Integer.valueOf(this.bP[n2].substring(1, 3), 16), Integer.valueOf(this.bP[n2].substring(3, 5), 16), Integer.valueOf(this.bP[n2].substring(5, 7), 16));
            ++n2;
        }
        return this.coresLista;
    }

    public void setCoresLista(Color[] colorArray) {
        this.coresLista = colorArray;
        this.bq();
    }

    public String br() {
        return this.bj;
    }

    public void d(String string) {
        this.bj = string;
    }

    public InfoArquivoSalvoType bs() {
        if (this.ad == null) {
            this.ad = new InfoArquivoSalvoType();
        }
        return this.ad;
    }

    public void a(InfoArquivoSalvoType infoArquivoSalvoType) {
        this.ad = infoArquivoSalvoType;
    }

    public ArrayList bt() {
        return this.av;
    }

    public ArrayList bu() {
        if (this.an == null) {
            this.an = new ArrayList();
        }
        return this.an;
    }

    public f.a bv() {
        return this.aH;
    }

    public ArrayList bw() {
        if (this.aw == null) {
            this.aw = new ArrayList();
        }
        return this.aw;
    }

    public ArrayList bx() {
        return this.ay;
    }

    public int by() {
        return this.be;
    }

    public void u(int n2) {
        this.be = n2;
    }

    public int bz() {
        return this.bf;
    }

    public int bA() {
        int n2 = -1;
        if (SR.M().size() > 0) {
            al al2 = (al)SR.M().get(0);
            if (al2.fg() != null) {
                return al2.fg().getPais();
            }
            return al2.bz();
        }
        return n2;
    }

    public void v(int n2) {
        this.bf = n2;
    }

    public void setIgnoraLigas(boolean bl) {
        this.ignoraLigas = bl;
    }

    public boolean isIgnoraLigas() {
        return this.ignoraLigas;
    }

    public at[] bB() {
        at[] atArray = new at[]{this.aK, this.aS, this.aR, this.aT, this.aU, this.aV, this.aW, this.aA, this.aB, this.aC, this.aD, this.aE, this.aF, this.aG, this.aX, this.aY, this.aI, this.aJ, this.IY};
        return atArray;
    }

    public boolean isIgnoraEstadual() {
        return this.ignoraEstadual;
    }

    public void setIgnoraEstadual(boolean bl) {
        this.ignoraEstadual = bl;
    }

    public boolean bC() {
        return this.bI;
    }

    public void g(boolean bl) {
        this.bI = bl;
    }

    public boolean bD() {
        return this.bK;
    }

    public void h(boolean bl) {
        this.bK = bl;
    }

    public boolean bE() {
        return this.bL;
    }

    public void i(boolean bl) {
        this.bL = bl;
    }

    public boolean bF() {
        return this.bM;
    }

    public void j(boolean bl) {
        this.bM = bl;
    }

    public void f(ArrayList arrayList) {
        this.ak = arrayList;
    }

    public ArrayList bG() {
        return this.bF;
    }

    public void g(ArrayList arrayList) {
        this.bF = arrayList;
    }

    public void h(ArrayList arrayList) {
        this.an = arrayList;
    }

    public void i(ArrayList arrayList) {
        this.ao = arrayList;
    }

    public void j(ArrayList arrayList) {
        this.ap = arrayList;
    }

    public void k(ArrayList arrayList) {
        this.aq = arrayList;
    }

    public void l(ArrayList arrayList) {
        this.av = arrayList;
    }

    public void m(ArrayList arrayList) {
        this.ax = arrayList;
    }

    public void n(ArrayList arrayList) {
        this.as = arrayList;
    }

    public void o(ArrayList arrayList) {
        this.at = arrayList;
    }

    public void p(ArrayList arrayList) {
        this.au = arrayList;
    }

    public void q(ArrayList arrayList) {
        this.aw = arrayList;
    }

    public void r(ArrayList arrayList) {
        this.ay = arrayList;
    }

    public int bH() {
        return this.bg;
    }

    public void bI() {
        ++this.bg;
    }

    public void w(int n2) {
        this.bg = n2;
    }

    public ah x(int n2) {
        ah ah2 = null;
        int n3 = 0;
        while (n3 < SR.P().size()) {
            if (((ah)SR.P().get(n3)).lk() == n2) {
                ah2 = (ah)SR.P().get(n3);
                return ah2;
            }
            ++n3;
        }
        if (ah2 == null) {
            n3 = 0;
            while (n3 < SR.aG().size()) {
                if (((Z)SR.aG().get(n3)).jn() != null && ((Z)SR.aG().get(n3)).jn().lk() == n2) {
                    ah2 = ((Z)SR.aG().get(n3)).jn();
                    return ah2;
                }
                ++n3;
            }
        }
        return ah2;
    }

    public al y(int n2) {
        al al2 = null;
        int n3 = 0;
        while (n3 < SR.L().size()) {
            if (((al)SR.L().get(n3)).lT() == n2) {
                al2 = (al)SR.L().get(n3);
                return al2;
            }
            ++n3;
        }
        return al2;
    }

    public static String z(int n2) {
        ah ah2 = null;
        int n3 = 0;
        while (n3 < SR.P().size()) {
            if (((ah)SR.P().get(n3)).lk() == n2) {
                ah2 = (ah)SR.P().get(n3);
                return ah2.getNome();
            }
            ++n3;
        }
        if (ah2 == null) {
            n3 = 0;
            while (n3 < SR.aG().size()) {
                if (((Z)SR.aG().get(n3)).jn() != null && ((Z)SR.aG().get(n3)).jn().lk() == n2) {
                    ah2 = ((Z)SR.aG().get(n3)).jn();
                    return ah2.getNome();
                }
                ++n3;
            }
        }
        return "";
    }

    public ArrayList bJ() {
        return this.az;
    }

    public void s(ArrayList arrayList) {
        this.az = arrayList;
    }

    public n bK() {
        return this.aL;
    }

    public void a(n n2) {
        this.aL = n2;
    }

    public f.l_0 bL() {
        return this.aM;
    }

    public void a(f.l_0 l_02) {
        this.aM = l_02;
    }

    public i_0 bM() {
        return this.aN;
    }

    public void a(i_0 i_02) {
        this.aN = i_02;
    }

    public ArrayList bN() {
        return this.ai;
    }

    public void t(ArrayList arrayList) {
        this.ai = arrayList;
    }

    public boolean isHabilidadeIndividual() {
        return this.habilidadeIndividual;
    }

    public void setHabilidadeIndividual(boolean bl) {
        this.habilidadeIndividual = bl;
    }

    public int bO() {
        return this.bh;
    }

    public void bP() {
        ++this.bh;
    }

    public void A(int n2) {
        this.bh = n2;
    }

    public boolean isUsarGruposReaisCopa() {
        return this.bi;
    }

    public void setUsarGruposReaisCopa(boolean bl) {
        this.bi = bl;
    }

    public j bQ() {
        return this.aO;
    }

    public void a(j j2) {
        this.aO = j2;
    }

    public k bR() {
        return this.aQ;
    }

    public void a(k k2) {
        this.aQ = k2;
    }

    public f.m_0 bS() {
        return this.aP;
    }

    public void a(f.m_0 m_02) {
        this.aP = m_02;
    }

    public boolean isJogaRegionais() {
        return this.jogaRegionais;
    }

    public void setJogaRegionais(boolean bl) {
        this.jogaRegionais = bl;
    }

    public int bT() {
        return this.bl;
    }

    public int bU() {
        ++this.bt;
        return this.bt;
    }

    public f.F[] bV() {
        return this.aZ;
    }

    public void a(f.F f2, int n2) {
        this.aZ[n2] = f2;
    }

    public boolean[] getJogaRegionaisTodos() {
        return this.jogaRegionaisTodos;
    }

    public void setJogaRegionaisTodos(boolean[] blArray) {
        this.jogaRegionaisTodos = blArray;
    }

    public ArrayList bW() {
        return this.ar;
    }

    public void u(ArrayList arrayList) {
        this.ar = arrayList;
    }

    public g bX() {
        return this.aW;
    }

    public void a(g g2) {
        this.aW = g2;
    }

    public ArrayList bY() {
        return this.bu;
    }

    public int bZ() {
        return this.bn;
    }

    public int ca() {
        return this.br;
    }

    public at c(int n2, int n3) {
        at[] atArray = new at[]{this.aB, this.aC, this.aD, this.aE, this.aF, this.aG};
        at[] atArray2 = new at[]{this.aX, this.aY};
        at[] atArray3 = new at[]{this.IY};
        if (n2 == 4 && n3 < atArray.length) {
            return atArray[n3];
        }
        if (n2 == 6 && n3 < atArray2.length) {
            return atArray2[n3];
        }
        if (n2 == 12 && n3 < atArray3.length) {
            return atArray3[n3];
        }
        return null;
    }

    public void cb() {
        if (this.bw == null) {
            this.bw = new ArrayList();
        }
        int n2 = 0;
        while (n2 < this.aj.size()) {
            this.bw.add(((ah)this.aj.get(n2)).ev());
            ++n2;
        }
        Collections.sort(this.bw, a_0.aaT);
    }

    public ArrayList cc() {
        return this.bw;
    }

    public ArrayList e(ah ah2) {
        ArrayList<t_0> arrayList = new ArrayList<t_0>();
        int n2 = 0;
        while (n2 < this.av.size()) {
            if (((t_0)this.av.get(n2)).x().fg() != null && ((t_0)this.av.get(n2)).x().fg() == ah2) {
                arrayList.add((t_0)this.av.get(n2));
            }
            ++n2;
        }
        return arrayList;
    }

    public ArrayList f(ah ah2) {
        ArrayList<t_0> arrayList = new ArrayList<t_0>();
        int n2 = 0;
        while (n2 < this.av.size()) {
            if (((t_0)this.av.get(n2)).tP() == ah2) {
                arrayList.add((t_0)this.av.get(n2));
            }
            ++n2;
        }
        return arrayList;
    }

    public t_0 e(F f2) {
        int n2 = 0;
        while (n2 < this.av.size()) {
            if (((t_0)this.av.get(n2)).x() == f2) {
                return (t_0)this.av.get(n2);
            }
            ++n2;
        }
        return null;
    }

    public boolean isVerLeiloes() {
        return this.verLeiloes;
    }

    public void setVerLeiloes(boolean bl) {
        this.verLeiloes = bl;
    }

    public boolean cd() {
        int n2 = 0;
        while (n2 < this.ak.size()) {
            if (((ah)this.ak.get(n2)).ka() != null && ((ah)this.ak.get(n2)).kb() > 0L && ((ah)this.ak.get(n2)).kw() < 35) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public j_0 mj() {
        return this.IY;
    }

    public void a(j_0 j_02) {
        this.IY = j_02;
    }

    public int op() {
        return this.rM;
    }

    public void I(int n2) {
        this.rM = n2;
    }

    public void rU() {
        this.bl = 4;
        this.bm = 2;
        this.bn = 2;
        this.IZ = 3;
        this.bo = 1;
        this.bp = 1;
        this.bq = 3;
        this.br = 1;
        this.Ja = 1;
        this.Jb = 1;
    }

    public M sq() {
        return this.GC;
    }

    public void a(M m2) {
        this.GC = m2;
    }

    public k_0 yl() {
        return this.IX;
    }

    public void a(k_0 k_02) {
        this.IX = k_02;
    }

    public n_0 ym() {
        return this.GI;
    }

    public void a(n_0 n_02) {
        this.GI = n_02;
    }

    public L yn() {
        return this.Gy;
    }

    public void a(L l2) {
        this.Gy = l2;
    }

    public boolean yL() {
        return this.Jc;
    }

    public void aO(boolean bl) {
        this.Jc = bl;
    }

    public int ae(int n2, int n3) {
        int n4 = 0;
        if (n2 == 2) {
            n4 = 8;
        } else if (n2 == 3) {
            n4 = 9;
        } else if (n2 == 4) {
            n4 = n3;
        } else if (n2 == 6) {
            if (n3 == 0) {
                n4 = 6;
            } else if (n3 == 1) {
                n4 = 7;
            }
        } else if (n2 == 12) {
            n4 = 14;
        } else if (n2 == 10) {
            n4 = 10;
        } else if (n2 == 8) {
            n4 = 12;
        } else if (n2 == 11) {
            n4 = 13;
        } else if (n2 == 15) {
            n4 = 15;
        } else if (n2 == 7) {
            n4 = n3 == 7 ? 11 : 16;
        } else if (n2 == 9) {
            n4 = 17;
        } else if (n2 == 14) {
            n4 = 18;
        } else if (n2 == 5) {
            n4 = 19;
        } else if (n2 == 13) {
            n4 = 20;
        }
        return n4;
    }
}

