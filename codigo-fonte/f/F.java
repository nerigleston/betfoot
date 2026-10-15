package f;

import best.ah;
import best.aq;
import best.at;
import best.l_0;
import components.y;
import est.LoadLigaOptions;
import f.s;
import h.a_0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class F
extends at
implements Serializable {
    private static final long serialVersionUID = 1L;
    private s YD = null;
    private ArrayList YF = new ArrayList();
    private ah ZA = null;
    private Integer aad = -1;

    public s yd() {
        return this.YD;
    }

    public F() {
    }

    public F(Integer n2, ArrayList arrayList) {
        this.aad = n2;
        this.setNome(aq.pY[n2]);
        this.F(10, n2);
        this.an(arrayList);
    }

    public void am(ArrayList arrayList) {
        this.YD = null;
        this.an(arrayList);
        this.mw();
    }

    public void an(ArrayList arrayList) {
        int n2;
        this.YF.clear();
        this.YD = null;
        Integer[][] integerArrayArray = new Integer[][]{{18, 25}, {10, 17, 22, 23}, {1, 4, 5, 9, 14, 15, 16, 19, 24}, {0, 2, 3, 6, 7, 8, 11, 12, 13, 20, 21, 26}};
        ArrayList<ah> arrayList2 = new ArrayList<ah>();
        ArrayList<ah> arrayList3 = new ArrayList<ah>();
        int n3 = 0;
        while (n3 < arrayList.size()) {
            n2 = ((ah)arrayList.get(n3)).getEstado();
            if (Arrays.asList(integerArrayArray[this.aad]).contains(n2)) {
                arrayList2.add((ah)arrayList.get(n3));
            }
            ++n3;
        }
        if (arrayList2.size() >= 16) {
            s s2;
            n3 = 0;
            while (n3 < 16) {
                arrayList3.add((ah)arrayList2.get(n3));
                ++n3;
            }
            Collections.sort(arrayList3, a_0.abm);
            ArrayList arrayList4 = a_0.ad(4, 4);
            n2 = 0;
            while (n2 < arrayList4.size()) {
                this.YF.add((ah)arrayList3.get((Integer)arrayList4.get(n2)));
                ++n2;
            }
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            blArray[1] = true;
            blArray[2] = true;
            boolean[] blArray2 = blArray;
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 16;
            loadLigaOptions.nGrupos = 4;
            loadLigaOptions.numeroTimesMataMata = 2;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.duasVoltasMataMata = blArray2;
            this.YD = s2 = new s(loadLigaOptions, this.YF, 0, null, null, null, 10, null, false, null, true, this);
            s2.setNome(this.getNome());
        }
    }

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"1\u00ba Grupo A", "2\u00ba Grupo B", "1\u00ba Grupo D", "2\u00ba Grupo C", "1\u00ba Grupo B", "2\u00ba Grupo A", "1\u00ba Grupo C", "2\u00ba Grupo D"};
        int n2 = 0;
        while (n2 < stringArray.length) {
            arrayList.add(stringArray[n2]);
            ++n2;
        }
        return arrayList;
    }

    @Override
    public void mr() {
        this.YD.za();
    }

    @Override
    public l_0[] mB() {
        l_0[] l_0Array = new l_0[]{this.YD};
        if (this.YD.yZ()) {
            l_0[] l_0Array2 = new l_0[]{this.YD.yY()};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        if (this.YD.yX() > 0) {
            ArrayList<y> arrayList = new ArrayList<y>();
            String string = "Primeira Fase";
            if (this.YD.yQ().size() > 0) {
                string = "Fase de Grupos";
            }
            l_0[] l_0Array = new l_0[]{this.YD};
            arrayList.add(new y(l_0Array, string));
            l_0[] l_0Array2 = new l_0[]{this.YD.yY()};
            arrayList.add(new y(l_0Array2, "Fase Final"));
            return arrayList;
        }
        return null;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        String[] stringArray2 = new String[]{"tr_riosaopaulo", "tr_sulminas", "tr_copanordeste", "tr_copaverde", ""};
        stringArray[0] = aq.w(stringArray2[this.aad]) ? stringArray2[this.aad] : "tr_nacionalgenerico";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

