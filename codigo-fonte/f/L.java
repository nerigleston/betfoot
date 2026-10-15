package f;

import best.at;
import best.l_0;
import components.y;
import est.LoadLigaOptions;
import f.s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class L
extends at
implements Serializable {
    private static final long serialVersionUID = 1L;
    private s YD = null;
    private String agn = "";

    public L() {
        this.F(15, 0);
        this.setNome("Torneio Amistoso");
    }

    public void xZ() {
        this.YD = null;
    }

    public void a(ArrayList arrayList, int n2, String string, String string2, boolean bl) {
        s s2;
        this.setNome(string);
        this.agn = string2;
        int n3 = 1;
        if (n2 == 0) {
            n3 = 2;
        }
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = arrayList.size();
        loadLigaOptions.nGrupos = n3;
        loadLigaOptions.numeroTimesMataMata = 2;
        if (n2 == 2) {
            loadLigaOptions.numeroTimesMataMata = 0;
        }
        loadLigaOptions.doisTurnos = false;
        boolean[] blArray = new boolean[7];
        loadLigaOptions.duasVoltasMataMata = blArray;
        if (bl) {
            Collections.shuffle(arrayList);
        }
        this.YD = s2 = new s(loadLigaOptions, arrayList, 0, null, null, null, 15, null, false, null, true, this);
        s2.setNome(string);
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
        ArrayList<y> arrayList = new ArrayList<y>();
        if (this.YD.yX() > 0) {
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

    public String Bt() {
        return this.agn;
    }

    @Override
    public void mr() {
        this.YD.za();
    }
}

