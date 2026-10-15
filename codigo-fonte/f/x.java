package f;

import best.Z;
import best.ah;
import best.aq;
import best.at;
import best.l_0;
import best.m_0;
import c.a;
import components.al;
import components.am;
import components.as;
import components.y;
import f.LigaSuica;
import f.b;
import f.g_0;
import f.s;
import f.z;
import h.a_0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class x
extends at
implements Serializable {
    private static final long serialVersionUID = 1L;
    private z YP = null;
    private z YQ = null;
    private s YD = null;
    private z afT = null;
    private ArrayList YF = new ArrayList();
    private ArrayList YS = new ArrayList();
    private ArrayList ZE = new ArrayList();
    private ah ZA = null;
    private ArrayList YV = new ArrayList();
    private ArrayList YW = new ArrayList();
    private ArrayList cabecas = null;
    private ArrayList confrontos = null;
    private ah ago = null;

    public x() {
        this.setNome(m_0.getString("ligaE"));
        this.F(6, 0);
        this.yo();
        this.yp();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new am("ing", 97, 1, true));
        this.YV.add(new am("esp", 65, 1, true));
        this.YV.add(new am("ita", 104, 1, true));
        this.YV.add(new am("ale", 3, 1, true));
        this.YV.add(new am("fra", 72, 1, true));
        this.YV.add(new am("por", 154, 1, true));
        this.YV.add(new am("hol", 85, 1, true));
        this.YV.add(new am("fra", 72, 1, false));
        this.YV.add(new am("ing", 97, 1, false));
        this.YV.add(new am("esp", 65, 1, false));
        this.YV.add(new am("ita", 104, 1, false));
        this.YV.add(new am("ale", 3, 1, false));
        this.YV.add(new am("por", 154, 1, false));
        this.YV.add(new am("hol", 85, 1, false));
        this.YV.add(new am("bel", 21, 1, false));
    }

    private void yp() {
        this.YW.clear();
        this.YW.add(new am("bel", 21, 1, true));
        this.YW.add(new am("aut", 15, 1, true));
        this.YW.add(new am("esc", 62, 1, true));
        this.YW.add(new am("ucr", 193, 1, true));
        this.YW.add(new am("tur", 192, 1, true));
        this.YW.add(new am("din", 54, 1, true));
        this.YW.add(new am("chipre", 44, 1, true));
        this.YW.add(new am("cze", 159, 1, true));
        this.YW.add(new am("serv", 171, 1, true));
    }

    public void a(int n2, al al2) {
        b.a(0, 2, this.YV, this.YW, n2, al2);
    }

    private void Bd() {
        ((am)this.YW.get(6)).fE(162);
    }

    public void yq() {
        if (this.YV.size() < 15) {
            this.yo();
        }
        if (a.SR.H() == 3) {
            this.Bd();
        }
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YF.clear();
        this.YS.clear();
        this.ZE.clear();
        this.YD = null;
        this.YP = null;
        this.YQ = null;
        ArrayList<am> arrayList = new ArrayList<am>();
        ArrayList<ah> arrayList2 = new ArrayList<ah>();
        arrayList2.addAll(a.SR.aI().yy());
        arrayList2.addAll(a.SR.aI().yE());
        if (a.SR.H() > 1 && this.ago != null && !a.SR.aI().yy().contains(this.ago) && !a.SR.aI().yE().contains(this.ago)) {
            this.YF.add(this.ago);
            arrayList2.add(this.ago);
        } else {
            arrayList.add(new am("ale", 3, 1));
        }
        if (arrayList.size() > 0) {
            b.a(arrayList, this.YF, arrayList2, false);
        }
        b.a(this.YV, this.YF, arrayList2, false);
        b.a(this.YW, this.YS, arrayList2, false);
        if (this.YF.size() < 16) {
            b.a(this.YF, this.YV, 16, arrayList2);
        }
        if (this.YS.size() < 9) {
            b.a(this.YS, this.YW, 9, arrayList2);
        }
        Collections.sort(this.YF, a_0.abm);
    }

    public void aj(ArrayList arrayList) {
        int n2;
        ArrayList<ah> arrayList2 = new ArrayList<ah>();
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        ArrayList<ah> arrayList4 = new ArrayList<ah>();
        for (n2 = 0; n2 <= 9; ++n2) {
            arrayList2.add((ah)arrayList.get(n2));
        }
        for (n2 = 10; n2 <= 11; ++n2) {
            arrayList3.add((ah)arrayList.get(n2));
        }
        for (n2 = 7; n2 <= 8; ++n2) {
            arrayList3.add((ah)this.YS.get(n2));
        }
        Collections.shuffle(arrayList2);
        Collections.shuffle(arrayList3);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YP = new z(null, arrayList4.size(), this.b(), 1, blArray, this, 6001);
        g_0 g_02 = new g_0();
        g_02.a(this.YP, arrayList4, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void g(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 6001);
        }
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        ArrayList<ah> arrayList4 = new ArrayList<ah>();
        ArrayList<ah> arrayList5 = new ArrayList<ah>();
        ArrayList arrayList6 = new ArrayList();
        a.SR.mj().zo().addAll(arrayList2);
        a.SR.mj().b(arrayList2, 0);
        for (n3 = 0; n3 <= 6; ++n3) {
            arrayList3.add((ah)this.YS.get(n3));
        }
        for (n3 = 0; n3 <= 5; ++n3) {
            arrayList3.add((ah)this.ZE.get(n3));
        }
        arrayList3.addAll(arrayList);
        Collections.shuffle(arrayList3);
        for (n3 = 0; n3 <= 9; ++n3) {
            arrayList4.add((ah)arrayList3.get(n3));
        }
        for (n3 = 10; n3 <= 19; ++n3) {
            arrayList5.add((ah)arrayList3.get(n3));
        }
        Random random = new Random();
        components.aq[] aqArray = new components.aq[10];
        for (n2 = 0; n2 <= 9; ++n2) {
            aqArray[n2] = new components.aq();
        }
        for (n2 = 0; n2 <= 9; ++n2) {
            if (random.nextBoolean()) {
                aqArray[n2].e(arrayList4, arrayList5);
                continue;
            }
            aqArray[n2].e(arrayList5, arrayList4);
        }
        for (n2 = 0; n2 <= 9; ++n2) {
            arrayList6.addAll(aqArray[n2].cZ());
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YQ = new z(null, arrayList6.size(), this.b(), 1, blArray, this, 6002);
        g_0 g_02 = new g_0();
        g_02.a(this.YQ, arrayList6, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void m(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 6004);
        }
        a.SR.mj().zo().addAll(arrayList2);
        a.SR.mj().b(arrayList2, 0);
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        for (int i3 = 6; i3 <= 15; ++i3) {
            arrayList3.add((ah)this.ZE.get(i3));
        }
        arrayList3.addAll(arrayList);
        arrayList3.addAll(this.YF);
        Collections.sort(arrayList3, a_0.abm);
        if (arrayList3.size() >= 36) {
            ArrayList arrayList4 = new ArrayList(arrayList3.subList(0, 36));
            this.YD = LigaSuica.criar(this, arrayList4, 4, this.b(), 6005, this.getNome());
        } else {
            System.out.println("erro fase de liga " + this.getNome() + ": " + arrayList3.size() + " clubes");
        }
    }

    public void b(ArrayList arrayList, int n2) {
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((ah)arrayList.get(i2)).jZ().booleanValue()) continue;
            if (n2 == 0) {
                new as(((ah)arrayList.get(i2)).ka(), 30, 85, "", "");
                continue;
            }
            new as(((ah)arrayList.get(i2)).ka(), 31, 86, "", "");
        }
    }

    public void Be() {
        ArrayList arrayList = LigaSuica.classificacao(this.YD);
        this.cabecas = new ArrayList(arrayList.subList(0, 8));
        for (int i2 = 24; i2 < arrayList.size(); ++i2) {
            ((ah)arrayList.get(i2)).a(this, -1, 6005);
        }
        this.confrontos = new ArrayList();
        ArrayList arrayList2 = LigaSuica.playoff(arrayList, this.confrontos);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.YD.c(new z(this.YD, arrayList2.size(), this.b(), 1, blArray, this, 6006));
        new g_0().a(this.YD.yY(), arrayList2, 0, true, 0, 0, this.b(), false);
    }

    public void l(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 6006);
        }
        ArrayList arrayList3 = LigaSuica.oitavas(this.cabecas, this.confrontos, arrayList);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.afT = new z(null, arrayList3.size(), this.b(), 0, blArray, this, -1);
        new g_0().a(this.afT, arrayList3, 0, true, 0, 0, this.b(), false);
    }

    public ArrayList yy() {
        return this.YF;
    }

    public ArrayList yE() {
        return this.YS;
    }

    public ah yz() {
        return this.ZA;
    }

    public void N(ah ah2) {
        this.ZA = ah2;
    }

    public s yd() {
        return this.YD;
    }

    @Override
    public void mr() {
        this.YD.f(this.afT);
    }

    @Override
    public Z mF() {
        int n2 = a.SR.H() - 1;
        int[] nArray = new int[]{152, 65, 52, 31, 21, 154, 3, 72, 162, 97};
        if ((n2 %= 10) < nArray.length) {
            return a.SR.s(nArray[n2]);
        }
        return null;
    }

    public static String yD() {
        int n2 = a.SR.H() - 1;
        String string = "";
        String[] stringArray = new String[]{"Gdansk", "Sevilla", "Zagreb", "Sofia", "Bruxelas", "Porto", "Frankfurt", "Lyon", "Moscou", "Liverpool"};
        string = stringArray[n2 %= 10];
        return string;
    }

    @Override
    public l_0[] mB() {
        l_0[] l_0Array = new l_0[]{this.YD};
        if (this.YD == null) {
            l_0[] l_0Array2 = new l_0[]{this.YP, this.YQ};
            l_0Array = l_0Array2;
        } else if (this.YD.yY() != null) {
            l_0[] l_0Array3 = new l_0[]{this.YD.yY(), this.afT};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<y> arrayList = new ArrayList<y>();
        l_0[] l_0Array = new l_0[]{this.YP, this.YQ};
        arrayList.add(new y(l_0Array, "Fase Preliminar"));
        l_0[] l_0Array2 = new l_0[]{this.YD};
        arrayList.add(new y(l_0Array2, "Fase de Liga"));
        if (this.YD != null && this.YD.yY() != null) {
            l_0[] l_0Array3 = new l_0[]{this.YD.yY(), this.afT};
            arrayList.add(new y(l_0Array3, "Fase Final"));
        } else {
            arrayList.add(new y(null, "Fase Final"));
        }
        return arrayList;
    }

    @Override
    public String[] b(l_0 l_02) {
        if (l_02 == this.YP) {
            return aq.pN;
        }
        if (l_02 == this.YQ) {
            return aq.pO;
        }
        if (this.YD != null && l_02 == this.YD.yY()) {
            return aq.abY;
        }
        return aq.pA;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_ligaeuropa";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public ArrayList zo() {
        return this.ZE;
    }

    @Override
    public boolean cz(int n2) {
        return this.afT != null && this.afT.zq() == n2;
    }

    public void ab(ah ah2) {
        this.ago = ah2;
    }

    public ah BA() {
        return this.ago;
    }
}

