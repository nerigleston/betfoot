package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.LigaPontosCorridos;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoEurocopa
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YE = new ArrayList();
    private ArrayList YF = new ArrayList();
    private LigaNacional YG = null;
    private int YH = 0;
    private ArrayList YM = new ArrayList();

    public CompeticaoEurocopa() {
        this.F(7, 0);
        this.O(true);
    }

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.YE.clear();
        this.YF.clear();
    }

    public void ya() {
        this.YE.clear();
        this.YF.clear();
        this.YD = null;
        int n2 = 23;
        ++this.YH;
        this.YG = this.yb();
        this.YE.addAll(this.YM);
        this.YM.clear();
        if (this.YE.size() == 24) {
            LigaPontosCorridos s2;
            ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
            int n3 = 0;
            while (n3 < this.YE.size()) {
                arrayList.add(((LigaNacional)this.YE.get(n3)).jo());
                ((LigaNacional)this.YE.get(n3)).z(true);
                ++n3;
            }
            Collections.sort(this.YF, ColecaoComparadoresSorteio.cN);
            ArrayList arrayList2 = ColecaoComparadoresSorteio.ad(6, 4);
            int n4 = 0;
            while (n4 < arrayList2.size()) {
                this.YF.add((ModeloTime)arrayList.get((Integer)arrayList2.get(n4)));
                ++n4;
            }
            boolean[] blArray = new boolean[7];
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 24;
            loadLigaOptions.nGrupos = 6;
            loadLigaOptions.numeroTimesMataMata = 2;
            loadLigaOptions.doisTurnos = false;
            loadLigaOptions.duasVoltasMataMata = blArray;
            loadLigaOptions.melhoresTerceiros = true;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, this.YF, 0, null, null, null, 7, null, false, null, true, this);
            s2.setNome(this.getNome());
            GerenciadorJogo.afQ.L(this.YF);
        }
    }

    @Override
    public int cy(int n2) {
        int n3 = this.YH - 1;
        n3 %= 10;
        int n4 = 45000;
        int[] nArray = new int[]{80000, 75000, 72698, 68134, 55600, 44990, 47215, 38065};
        if (n2 <= 7) {
            n4 = nArray[n2];
        } else if (n2 - 8 < nArray.length) {
            n4 = nArray[n2 - 8];
        }
        return n4;
    }

    @Override
    public String cx(int n2) {
        int n3 = this.YH - 1;
        String[][] stringArrayArray = new String[][]{{"Berlim", "Munique", "Hamburgo", "Dortmund", "Frankfurt", "Hannover", "Leipzig", "Nuremberg"}, {"Roma", "Mil\u00e3o", "Turim", "Bologna", "Cagliari", "G\u00eanoa", "Floren\u00e7a", "Udine"}, {"Londres", "Liverpool", "Manchester", "Notthingam", "Leeds", "Coventry", "Sheffield", "Bristol"}, {"Madrid", "Sevilha", "Valencia", "Vigo", "M\u00e1laga", "Valladolid", "Barcelona", "Gij\u00f3n"}, {"Lisboa", "Porto", "Coimbra", "Set\u00fabal", "Aveiro", "Faro", "Braga", "Viseu"}, {"Moscou", "S\u00e3o Petesburgo", "Kazan", "Kaliningrad", "Yaroslavl", "Samara", "Volgograd", "Yekaterinburg"}, {"Kiev", "Carc\u00f3via", "Odessa", "Dnipro", "Donetsk", "Zaporizhzhya", "Lviv", "Mariupol"}, {"Atenas", "Tessal\u00f4nica", "Patras", "Larissa", "Heracli\u00e3o", "V\u00f3los", "Tr\u00edcala", "C\u00e1lcis"}, {"Paris", "Marselha", "Lyon", "Toulouse", "Nice", "Nantes", "Estrasburgo", "Montpellier"}, {"Vars\u00f3via", "Crac\u00f3via", "Lodz", "Bresl\u00e1via", "Poznan", "Gdansk", "Lublin", "Katowice"}};
        String string = null;
        string = n2 < stringArrayArray[n3 %= 10].length ? stringArrayArray[n3][n2] : (n2 - stringArrayArray[n3].length < stringArrayArray[n3].length ? stringArrayArray[n3][n2 - stringArrayArray[n3].length] : stringArrayArray[n3][0]);
        return string;
    }

    public LigaNacional yb() {
        int n2 = this.YH - 1;
        int[] nArray = new int[]{72, 3, 104, 97, 65, 154, 162, 193, 78, 152};
        if ((n2 %= 10) == 0) {
            return null;
        }
        if (n2 >= 0 && n2 < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
    }

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    public void p(LigaPontosCorridos s2) {
        this.YD = s2;
    }

    public void a(Competicao at2, LigaNacional z2) {
        this.YM.add(z2);
        z2.jo().e(at2, 1);
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD.yZ()) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array, "Fase de Grupos"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase Final"));
        return arrayList;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_eurocopa";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    @Override
    public void mr() {
        this.YD.za();
    }
}

