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

public class CompeticaoCopaAsia
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YE = new ArrayList();
    private ArrayList YF = new ArrayList();
    private LigaNacional YG = null;
    private int YH = 0;

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.YE.clear();
        this.YF.clear();
    }

    public CompeticaoCopaAsia() {
        this.F(7, 3);
        this.O(true);
    }

    public void ya() {
        this.YE.clear();
        this.YF.clear();
        this.YD = null;
        int n2 = 23;
        ++this.YH;
        this.YG = this.yb();
        if (this.YG == null || !this.YG.jl()) {
            ++n2;
        } else {
            this.YE.add(this.YG);
        }
        LigaNacional.a(false, 3, n2, this.YE, false, null);
        if (this.YE.size() >= 24) {
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
        int[] nArray = new int[]{65000, 55000, 52698, 48134, 45600, 34990, 37215, 28065};
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
        n3 %= 10;
        String[][] stringArrayArray = new String[][]{{"Pequim", "Xangai", "Cant\u00e3o", "Shenzhen", "Tianjin", "Wuhan", "Hangzhou", "Shenyang"}, {"T\u00f3quio", "Yokohama", "Osaka", "Nagoya", "Sapporo", "Kobe", "Kyoto", "Hiroshima"}, {"Dubai", "Abu Dabi", "Xarja", "Alaine", "Ajm\u00e3", "Fujeira", "Al Quwain", "Ras al-Khaimah"}, {"Sydney", "Melbourne", "Brisbane", "Perth", "Adelaide", "Camberra", "Wollongong", "Hobart"}, {"Teer\u00e3", "Mexede", "Ispa\u00e3", "Karaj", "Tabriz", "Xiraz", "Avaz", "Qom"}, {"Alepo", "Damasco", "Homs", "Latakia", "Hama", "Ar-Raqqah", "Deir ez-Zor", "Al-Hasakah"}, {"Lusail", "Al Khor", "Doha", "Al Wakrah", "Umm Salal", "Madinat", "Al Rayyan", "Doha"}, {"Seul", "Busan", "Incheon", "Daegu", "Daejeon", "Ulsan", "Changwon", "Gwangju"}, {"Bagd\u00e1", "Ba\u00e7or\u00e1", "Mossul", "Arbil", "Quircuque", "Faluja", "Suleim\u00e2nia", "Carbala"}, {"Ha Noi", "Ho Chi Minh", "Haiphong", "Can Tho", "Da Nang", "Bien Hoa", "Nha Trang", "Thai Nguyen"}};
        String string = null;
        int n4 = n2;
        if (n2 > 7) {
            n4 = n2 - 8;
        }
        if (n4 < stringArrayArray[n3].length) {
            string = stringArrayArray[n3][n4];
        }
        return string;
    }

    public LigaNacional yb() {
        int n2 = this.YH - 1;
        int[] nArray = new int[]{43, 107, 59, 14, 98, 174, 39, 49, 99, 199};
        if ((n2 %= 10) >= 0 && n2 < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
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

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    public void p(LigaPontosCorridos s2) {
        this.YD = s2;
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
        stringArray[0] = "tr_copaasia";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public int ye() {
        return this.YH;
    }

    @Override
    public void mr() {
        this.YD.za();
    }

    /* Atalho com nome único para a.al, que já usa o yc() de f.d. */
    public static ArrayList chamaYc() {
        return CompeticaoCopaAsia.yc();
    }
}
