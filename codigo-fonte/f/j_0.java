package f;

import best.Z;
import best.ah;
import best.aq;
import best.at;
import best.l_0;
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

public class j_0
extends at
implements Serializable {
    private static final long serialVersionUID = 1L;
    private z YP = null;
    private z YQ = null;
    private z YR = null;
    private z ZB = null;
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

    public j_0() {
        this.F(12, 0);
        this.yp();
    }

    private void yo() {
    }

    private void yp() {
        this.YW.add(new am("fra", 72, 1));
        this.YW.add(new am("ing", 97, 1));
        this.YW.add(new am("esp", 65, 1));
        this.YW.add(new am("ita", 104, 1));
        this.YW.add(new am("ale", 3, 1));
        this.YW.add(new am("cro", 52, 1, true));
        this.YW.add(new am("sui", 180, 1, true));
        this.YW.add(new am("gre", 78, 1, true));
        this.YW.add(new am("hol", 85, 1));
        this.YW.add(new am("bel", 21, 1));
        this.YW.add(new am("aut", 15, 1));
        this.YW.add(new am("esc", 62, 1));
        this.YW.add(new am("ucr", 193, 1));
        this.YW.add(new am("por", 154, 1));
        this.YW.add(new am("isr", 103, 1, true));
        this.YW.add(new am("nor", 142, 1, true));
        this.YW.add(new am("sue", 179, 1));
        this.YW.add(new am("bul", 31, 1, true));
        this.YW.add(new am("rom", 160, 1, true));
        this.YW.add(new am("aze", 16, 1, true));
        this.YW.add(new am("caz", 40, 1, true));
        this.YW.add(new am("hun", 88, 1, true));
        this.YW.add(new am("belarus", 25, 1, true));
        this.YW.add(new am("pol", 152, 1, true));
        this.YW.add(new am("esl", 64, 1, true));
        this.YW.add(new am("esk", 63, 1, true));
        this.YW.add(new am("lie", 118, 1));
        this.YW.add(new am("lit", 119, 1, true));
        this.YW.add(new am("lux", 120, 1, true));
        this.YW.add(new am("bos", 27, 1, true));
        this.YW.add(new am("irl", 100, 1, true));
        this.YW.add(new am("mac", 122, 1, true));
        this.YW.add(new am("arm", 12, 1, true));
        this.YW.add(new am("let", 114, 1, true));
        this.YW.add(new am("alb", 2, 1, true));
        this.YW.add(new am("serv", 171, 1));
        this.YW.add(new am("cze", 159, 1));
        this.YW.add(new am("cro", 52, 1));
        this.YW.add(new am("sui", 180, 1));
        this.YW.add(new am("gre", 78, 1));
        this.YW.add(new am("isr", 103, 1));
        this.YW.add(new am("nor", 142, 1));
        this.YW.add(new am("sue", 179, 1));
        this.YW.add(new am("bul", 31, 1));
        this.YW.add(new am("rom", 160, 1));
        this.YW.add(new am("aze", 16, 1));
        this.YW.add(new am("caz", 40, 1));
        this.YW.add(new am("hun", 88, 1));
        this.YW.add(new am("belarus", 25, 1));
        this.YW.add(new am("tu", 192, 1));
        this.YW.add(new am("din", 54, 1));
        this.YW.add(new am("chipre", 44, 1));
        this.YW.add(new am("serv", 171, 1));
        this.YW.add(new am("cze", 159, 1));
        this.YW.add(new am("cro", 52, 1));
        this.YW.add(new am("sui", 180, 1));
        this.YW.add(new am("gre", 78, 1));
        this.YW.add(new am("isr", 103, 1));
        this.YW.add(new am("nor", 142, 1));
        this.YW.add(new am("sue", 179, 1));
        this.YW.add(new am("bul", 31, 1));
        this.YW.add(new am("rom", 160, 1));
        this.YW.add(new am("aze", 16, 1));
        this.YW.add(new am("caz", 40, 1));
        this.YW.add(new am("hun", 88, 1));
        this.YW.add(new am("hol", 85, 1));
        this.YW.add(new am("bel", 21, 1));
        this.YW.add(new am("aut", 15, 1));
        this.YW.add(new am("esc", 62, 1));
        this.YW.add(new am("ucr", 193, 1));
        this.YW.add(new am("tu", 192, 1));
        this.YW.add(new am("din", 54, 1));
        this.YW.add(new am("chipre", 44, 1));
        this.YW.add(new am("por", 154, 1));
        this.YW.add(new am("irlN", 101, 1, true));
        this.YW.add(new am("geo", 76, 1, true));
        this.YW.add(new am("fin", 70, 1, true));
        this.YW.add(new am("mol", 134, 1, true));
        this.YW.add(new am("mlt", 128, 1, true));
        this.YW.add(new am("ifaroe", 92, 1, true));
        this.YW.add(new am("kos", 110, 1, true));
        this.YW.add(new am("gib", 216, 1, true));
        this.YW.add(new am("mnt", 105, 1, true));
        this.YW.add(new am("wal", 145, 1, true));
        this.YW.add(new am("isl", 102, 1, true));
        this.YW.add(new am("est", 66, 1, true));
        this.YW.add(new am("andorra", 4, 1, true));
        this.YW.add(new am("san m", 164, 1, true));
        this.YW.add(new am("pol", 152, 1));
        this.YW.add(new am("esl", 64, 1));
        this.YW.add(new am("esk", 63, 1));
        this.YW.add(new am("lit", 119, 1));
        this.YW.add(new am("lux", 120, 1));
        this.YW.add(new am("bos", 27, 1));
        this.YW.add(new am("irl", 100, 1));
        this.YW.add(new am("mac", 122, 1));
        this.YW.add(new am("arm", 12, 1));
        this.YW.add(new am("let", 114, 1));
        this.YW.add(new am("alb", 2, 1));
        this.YW.add(new am("irlN", 101, 1));
        this.YW.add(new am("geo", 76, 1));
        this.YW.add(new am("fin", 70, 1));
        this.YW.add(new am("mol", 134, 1));
        this.YW.add(new am("mlt", 128, 1));
        this.YW.add(new am("ifaroe", 92, 1));
        this.YW.add(new am("kos", 110, 1));
        this.YW.add(new am("gib", 216, 1));
        this.YW.add(new am("mnt", 105, 1));
        this.YW.add(new am("wal", 145, 1));
        this.YW.add(new am("isl", 102, 1));
        this.YW.add(new am("est", 66, 1));
        this.YW.add(new am("andorra", 4, 1));
        this.YW.add(new am("san m", 164, 1));
        this.YW.add(new am("belarus", 25, 1));
        this.YW.add(new am("pol", 152, 1));
        this.YW.add(new am("esl", 64, 1));
        this.YW.add(new am("esk", 63, 1));
        this.YW.add(new am("lit", 119, 1));
        this.YW.add(new am("lux", 120, 1));
        this.YW.add(new am("bos", 27, 1));
        this.YW.add(new am("irl", 100, 1));
        this.YW.add(new am("mac", 122, 1));
        this.YW.add(new am("arm", 12, 1));
        this.YW.add(new am("let", 114, 1));
        this.YW.add(new am("alb", 2, 1));
        this.YW.add(new am("irlN", 101, 1));
        this.YW.add(new am("geo", 76, 1));
        this.YW.add(new am("fin", 70, 1));
        this.YW.add(new am("mol", 134, 1));
        this.YW.add(new am("mlt", 128, 1));
        this.YW.add(new am("ifaroe", 92, 1));
        this.YW.add(new am("kos", 110, 1));
        this.YW.add(new am("gib", 216, 1));
        this.YW.add(new am("mnt", 105, 1));
    }

    public void a(int n2, al al2) {
        b.a(0, 3, this.YV, this.YW, n2, al2);
    }

    private void Bd() {
        ((am)this.YW.get(40)).fE(162);
        ((am)this.YW.get(87)).fE(162);
    }

    public void yq() {
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
        this.YR = null;
        this.ZB = null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a.SR.aI().yy());
        arrayList.addAll(a.SR.aI().yE());
        arrayList.addAll(a.SR.aK().yy());
        arrayList.addAll(a.SR.aK().yE());
        ArrayList<am> arrayList2 = new ArrayList<am>();
        arrayList2.add(new am("ing", 97, 1));
        arrayList2.add(new am("esp", 65, 1));
        arrayList2.add(new am("ita", 104, 1));
        arrayList2.add(new am("ale", 3, 1));
        b.a(arrayList2, this.YF, arrayList, false);
        arrayList.addAll(this.YF);
        b.a(this.YW, this.YS, arrayList, false);
        if (this.YS.size() < 134) {
            b.a(this.YS, this.YW, 134, arrayList);
        }
        Collections.sort(this.YF, a_0.abm);
        if (this.YS.size() == 134) {
            ArrayList<ah> arrayList3 = new ArrayList<ah>();
            for (int i2 = 74; i2 <= 133; ++i2) {
                arrayList3.add((ah)this.YS.get(i2));
            }
            Collections.shuffle(arrayList3);
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            boolean[] blArray2 = blArray;
            this.YP = new z(null, 60, this.b(), 1, blArray2, this, 12001);
            g_0 g_02 = new g_0();
            g_02.a(this.YP, arrayList3, 0, blArray2[0], 0, 0, this.b(), false);
        } else {
            System.out.println("erro Conference League():" + this.YS.size());
        }
    }

    public void g(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        int n4;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 12001);
        }
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        ArrayList<ah> arrayList4 = new ArrayList<ah>();
        ArrayList<ah> arrayList5 = new ArrayList<ah>();
        ArrayList<ah> arrayList6 = new ArrayList<ah>();
        ArrayList arrayList7 = new ArrayList();
        for (n4 = 0; n4 <= 7; ++n4) {
            arrayList3.add((ah)this.ZE.get(n4));
        }
        for (n4 = 8; n4 <= 15; ++n4) {
            arrayList4.add((ah)this.ZE.get(n4));
        }
        for (n4 = 14; n4 <= 58; ++n4) {
            arrayList5.add((ah)this.YS.get(n4));
        }
        for (n4 = 59; n4 <= 73; ++n4) {
            arrayList6.add((ah)this.YS.get(n4));
        }
        arrayList6.addAll(arrayList);
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Random random = new Random();
        components.aq[] aqArray = new components.aq[8];
        for (n3 = 0; n3 <= 7; ++n3) {
            aqArray[n3] = new components.aq();
        }
        for (n3 = 0; n3 <= 7; ++n3) {
            if (random.nextBoolean()) {
                aqArray[n3].e(arrayList3, arrayList4);
                continue;
            }
            aqArray[n3].e(arrayList4, arrayList3);
        }
        components.aq[] aqArray2 = new components.aq[45];
        for (n2 = 0; n2 <= 44; ++n2) {
            aqArray2[n2] = new components.aq();
        }
        for (n2 = 0; n2 <= 44; ++n2) {
            if (random.nextBoolean()) {
                aqArray2[n2].e(arrayList5, arrayList6);
                continue;
            }
            aqArray2[n2].e(arrayList6, arrayList5);
        }
        for (n2 = 0; n2 <= 7; ++n2) {
            arrayList7.addAll(aqArray[n2].cZ());
        }
        for (n2 = 0; n2 <= 44; ++n2) {
            arrayList7.addAll(aqArray2[n2].cZ());
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.YQ = new z(null, arrayList7.size(), this.b(), 1, blArray2, this, 12002);
        g_0 g_02 = new g_0();
        g_02.a(this.YQ, arrayList7, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void h(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        int n4;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 12002);
        }
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        ArrayList<ah> arrayList4 = new ArrayList<ah>();
        ArrayList<ah> arrayList5 = new ArrayList<ah>();
        ArrayList<ah> arrayList6 = new ArrayList<ah>();
        ArrayList arrayList7 = new ArrayList();
        for (n4 = 0; n4 <= 4; ++n4) {
            arrayList3.add((ah)arrayList.get(n4));
        }
        for (n4 = 5; n4 <= 7; ++n4) {
            arrayList4.add((ah)arrayList.get(n4));
        }
        arrayList4.add((ah)this.ZE.get(16));
        arrayList4.add((ah)this.ZE.get(17));
        for (n4 = 5; n4 <= 13; ++n4) {
            arrayList5.add((ah)this.YS.get(n4));
        }
        for (n4 = 8; n4 <= 25; ++n4) {
            arrayList5.add((ah)arrayList.get(n4));
        }
        for (n4 = 26; n4 <= 52; ++n4) {
            arrayList6.add((ah)arrayList.get(n4));
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Random random = new Random();
        components.aq[] aqArray = new components.aq[5];
        for (n3 = 0; n3 <= 4; ++n3) {
            aqArray[n3] = new components.aq();
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            if (random.nextBoolean()) {
                aqArray[n3].e(arrayList3, arrayList4);
                continue;
            }
            aqArray[n3].e(arrayList4, arrayList3);
        }
        components.aq[] aqArray2 = new components.aq[27];
        for (n2 = 0; n2 <= 26; ++n2) {
            aqArray2[n2] = new components.aq();
        }
        for (n2 = 0; n2 <= 26; ++n2) {
            if (random.nextBoolean()) {
                aqArray2[n2].e(arrayList5, arrayList6);
                continue;
            }
            aqArray2[n2].e(arrayList6, arrayList5);
        }
        for (n2 = 0; n2 <= 4; ++n2) {
            arrayList7.addAll(aqArray[n2].cZ());
        }
        for (n2 = 0; n2 <= 26; ++n2) {
            arrayList7.addAll(aqArray2[n2].cZ());
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.YR = new z(null, arrayList7.size(), this.b(), 1, blArray2, this, 12003);
        g_0 g_02 = new g_0();
        g_02.a(this.YR, arrayList7, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void j(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        int n4;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 12003);
        }
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        ArrayList<ah> arrayList4 = new ArrayList<ah>();
        ArrayList<ah> arrayList5 = new ArrayList<ah>();
        ArrayList<ah> arrayList6 = new ArrayList<ah>();
        ArrayList arrayList7 = new ArrayList();
        for (n4 = 0; n4 <= 4; ++n4) {
            arrayList3.add((ah)arrayList.get(n4));
        }
        for (n4 = 18; n4 <= 22; ++n4) {
            arrayList4.add((ah)this.ZE.get(n4));
        }
        for (n4 = 0; n4 <= 4; ++n4) {
            arrayList5.add((ah)this.YS.get(n4));
        }
        for (n4 = 5; n4 <= 16; ++n4) {
            arrayList5.add((ah)arrayList.get(n4));
        }
        for (n4 = 17; n4 <= 31; ++n4) {
            arrayList6.add((ah)arrayList.get(n4));
        }
        for (n4 = 23; n4 <= 24; ++n4) {
            arrayList6.add((ah)this.ZE.get(n4));
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Random random = new Random();
        components.aq[] aqArray = new components.aq[5];
        for (n3 = 0; n3 <= 4; ++n3) {
            aqArray[n3] = new components.aq();
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            if (random.nextBoolean()) {
                aqArray[n3].e(arrayList3, arrayList4);
                continue;
            }
            aqArray[n3].e(arrayList4, arrayList3);
        }
        components.aq[] aqArray2 = new components.aq[17];
        for (n2 = 0; n2 <= 16; ++n2) {
            aqArray2[n2] = new components.aq();
        }
        for (n2 = 0; n2 <= 16; ++n2) {
            if (random.nextBoolean()) {
                aqArray2[n2].e(arrayList5, arrayList6);
                continue;
            }
            aqArray2[n2].e(arrayList6, arrayList5);
        }
        for (n2 = 0; n2 <= 4; ++n2) {
            arrayList7.addAll(aqArray[n2].cZ());
        }
        for (n2 = 0; n2 <= 16; ++n2) {
            arrayList7.addAll(aqArray2[n2].cZ());
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.ZB = new z(null, arrayList7.size(), this.b(), 1, blArray2, this, 12004);
        g_0 g_02 = new g_0();
        g_02.a(this.ZB, arrayList7, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void m(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 12004);
        }
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        for (n2 = 25; n2 <= 34; ++n2) {
            arrayList3.add((ah)this.ZE.get(n2));
        }
        arrayList3.addAll(arrayList);
        for (n2 = 0; n2 < this.YF.size(); ++n2) {
            arrayList3.add((ah)this.YF.get(n2));
        }
        Collections.sort(arrayList3, a_0.abm);
        if (arrayList3.size() >= 36) {
            ArrayList arrayList4 = new ArrayList(arrayList3.subList(0, 36));
            this.YD = LigaSuica.criar(this, arrayList4, 6, this.b(), 12005, this.getNome());
        } else {
            System.out.println("erro fase de liga " + this.getNome() + ": " + arrayList3.size() + " clubes");
        }
    }

    public void Be() {
        ArrayList arrayList = LigaSuica.classificacao(this.YD);
        this.cabecas = new ArrayList(arrayList.subList(0, 8));
        for (int i2 = 24; i2 < arrayList.size(); ++i2) {
            ((ah)arrayList.get(i2)).a(this, -1, 12005);
        }
        this.confrontos = new ArrayList();
        ArrayList arrayList2 = LigaSuica.playoff(arrayList, this.confrontos);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.YD.c(new z(this.YD, arrayList2.size(), this.b(), 1, blArray, this, 12006));
        new g_0().a(this.YD.yY(), arrayList2, 0, true, 0, 0, this.b(), false);
    }

    public void l(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ah)arrayList2.get(i2)).a(this, -1, 12006);
        }
        ArrayList arrayList3 = LigaSuica.oitavas(this.cabecas, this.confrontos, arrayList);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.afT = new z(null, arrayList3.size(), this.b(), 0, blArray, this, -1);
        new g_0().a(this.afT, arrayList3, 0, true, 0, 0, this.b(), false);
    }

    public void b(ArrayList arrayList, int n2) {
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((ah)arrayList.get(i2)).jZ().booleanValue()) continue;
            if (n2 == 0) {
                new as(((ah)arrayList.get(i2)).ka(), 35, 90, "", "");
                continue;
            }
            new as(((ah)arrayList.get(i2)).ka(), 35, 90, "", "");
        }
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
            l_0[] l_0Array2 = new l_0[]{this.YP, this.YQ, this.YR, this.ZB};
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
        l_0[] l_0Array = new l_0[]{this.YP, this.YQ, this.YR, this.ZB};
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
            return aq.abZ;
        }
        if (l_02 == this.YQ) {
            return aq.aca;
        }
        if (l_02 == this.YR) {
            return aq.acb;
        }
        if (l_02 == this.ZB) {
            return aq.acc;
        }
        if (this.YD != null && l_02 == this.YD.yY()) {
            return aq.abY;
        }
        return aq.pA;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_conference";
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
}

