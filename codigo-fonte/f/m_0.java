package f;

import best.G;
import best.Z;
import best.ah;
import best.at;
import best.l_0;
import c.a;
import components.y;
import est.LoadLigaOptions;
import f.g_0;
import f.s;
import f.z;
import h.a_0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class m_0
extends at
implements Serializable {
    private static final long serialVersionUID = 1L;
    private s agb = null;
    private s YD = null;
    private ArrayList YF = new ArrayList();
    private z afT = null;
    private ah agf = null;

    public m_0() {
        this.F(9, 5);
    }

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.agb = null;
        this.agf = null;
        this.afT = null;
        this.YF.clear();
    }

    public void Bj() {
        Serializable serializable;
        this.YF.clear();
        ArrayList<ah> arrayList = new ArrayList<ah>();
        int[] nArray = new int[]{214, 91, 163, 188, 69, 215, 143, 148, 93, 184, 197};
        ArrayList<ah> arrayList2 = new ArrayList<ah>();
        int n2 = 0;
        while (n2 < nArray.length) {
            serializable = a.SR.s(nArray[n2]);
            arrayList2.add(((Z)serializable).jo());
            ((Z)serializable).z(true);
            ++n2;
        }
        Collections.sort(arrayList2, a_0.cN);
        n2 = 0;
        while (n2 <= 6) {
            this.YF.add((ah)arrayList2.get(n2));
            ++n2;
        }
        n2 = 7;
        while (n2 < arrayList2.size()) {
            arrayList.add((ah)arrayList2.get(n2));
            ++n2;
        }
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 4;
        loadLigaOptions.nGrupos = 0;
        loadLigaOptions.doisTurnos = true;
        serializable = new s(loadLigaOptions, arrayList, 0, null, null, null, 9, null, false, null, true, this);
        this.agb = (s)serializable;
        ((l_0)serializable).setNome(this.getNome());
        ((s)serializable).fb(9500);
        a.afQ.L(arrayList);
        a.afQ.L(this.YF);
    }

    public void yt() {
        ArrayList<ah> arrayList = new ArrayList<ah>();
        int n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList.add((ah)((G)this.YD.yQ().get(n2)).gR().get(0));
            arrayList.add((ah)((G)this.YD.yQ().get(n2)).gR().get(1));
            ++n2;
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        boolean[] blArray2 = blArray;
        this.afT = new z(null, arrayList.size(), this.b(), 0, blArray2, this, 9502);
        g_0 g_02 = new g_0();
        g_02.a(this.afT, arrayList, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void Bq() {
        s s2;
        this.YF.add((ah)this.agb.yK().get(0));
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 8;
        loadLigaOptions.nGrupos = 2;
        loadLigaOptions.doisTurnos = true;
        this.YD = s2 = new s(loadLigaOptions, this.YF, 0, null, null, null, 9, null, false, null, true, this);
        s2.setNome(this.getNome());
        s2.fb(9501);
    }

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"5\u00ba A. Sul", "1\u00ba Oceania"};
        int n2 = 0;
        while (n2 < stringArray.length) {
            arrayList.add(stringArray[n2]);
            ++n2;
        }
        return arrayList;
    }

    public void p(ArrayList arrayList, ArrayList arrayList2) {
        a.SR.aY().a(this, a.SR.s(((ah)arrayList.get(0)).getPais()));
        this.agf = (ah)arrayList2.get(0);
    }

    public s yd() {
        return this.YD;
    }

    public void p(s s2) {
        this.YD = s2;
    }

    @Override
    public l_0[] mB() {
        l_0[] l_0Array = new l_0[]{this.YD};
        if (this.YD == null) {
            l_0[] l_0Array2 = new l_0[]{this.agb};
            l_0Array = l_0Array2;
        } else if (this.afT != null) {
            l_0[] l_0Array3 = new l_0[]{this.afT};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<y> arrayList = new ArrayList<y>();
        l_0[] l_0Array = new l_0[]{this.agb};
        arrayList.add(new y(l_0Array, "Fase Preliminar"));
        l_0[] l_0Array2 = new l_0[]{this.YD};
        arrayList.add(new y(l_0Array2, "Fase de Grupos"));
        l_0[] l_0Array3 = new l_0[]{this.afT};
        arrayList.add(new y(l_0Array3, "Fase Final"));
        l_0[] l_0Array4 = new l_0[]{a.SR.bQ().Bo()};
        arrayList.add(new y(l_0Array4, "Torneio Repescagem"));
        return arrayList;
    }

    public ah Br() {
        return this.agf;
    }
}

