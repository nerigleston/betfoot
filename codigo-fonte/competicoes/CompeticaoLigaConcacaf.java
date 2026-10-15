package competicoes;

import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorIdioma;
import components.AtributosJogador;
import components.ModeloCoeficientePais;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.SorteioAdversarios;
import competicoes.LigaPontosCorridos;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoLigaConcacaf
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();

    public CompeticaoLigaConcacaf() {
        this.setNome(GerenciadorIdioma.getString("ligaConcacaf"));
        this.F(4, 4);
        this.yo();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new ModeloCoeficientePais("nic", 139, 1));
        this.YV.add(new ModeloCoeficientePais("mex", 131, 4));
        this.YV.add(new ModeloCoeficientePais("eua", 68, 3));
        this.YV.add(new ModeloCoeficientePais("can", 38, 1));
        this.YV.add(new ModeloCoeficientePais("cosr", 51, 2));
        this.YV.add(new ModeloCoeficientePais("hon", 86, 1));
        this.YV.add(new ModeloCoeficientePais("guat", 79, 2));
        this.YV.add(new ModeloCoeficientePais("pan", 147, 2));
        this.YV.add(new ModeloCoeficientePais("els", 58, 1));
        this.YV.add(new ModeloCoeficientePais("belize", 22, 1));
        this.YV.add(new ModeloCoeficientePais("triT", 189, 1));
        this.YV.add(new ModeloCoeficientePais("jam", 106, 1));
        this.YV.add(new ModeloCoeficientePais("haiti", 84, 1));
        this.YV.add(new ModeloCoeficientePais("cub", 53, 1));
        this.YV.add(new ModeloCoeficientePais("rep dom", 158, 1));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(4, 1, this.YV, null, n2, al2);
    }

    public void yq() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YF.clear();
        this.YD = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.ZA != null) {
            this.YF.add(this.ZA);
        }
        arrayList2.addAll(this.YF);
        SorteioAdversarios.a(this.YV, this.YF, arrayList2, false);
        SorteioAdversarios.a(arrayList, this.YF, arrayList2, false);
        if (this.YF.size() < 24) {
            SorteioAdversarios.a(this.YF, this.YV, 24, arrayList2);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        if (this.YF.size() >= 24) {
            LigaPontosCorridos s2;
            int[] nArray = new int[24];
            nArray[1] = 15;
            nArray[2] = 23;
            nArray[3] = 4;
            nArray[4] = 14;
            nArray[5] = 22;
            nArray[6] = 6;
            nArray[7] = 13;
            nArray[8] = 21;
            nArray[9] = 2;
            nArray[10] = 11;
            nArray[11] = 20;
            nArray[12] = 1;
            nArray[13] = 12;
            nArray[14] = 19;
            nArray[15] = 5;
            nArray[16] = 10;
            nArray[17] = 18;
            nArray[18] = 7;
            nArray[19] = 9;
            nArray[20] = 17;
            nArray[21] = 3;
            nArray[22] = 8;
            nArray[23] = 16;
            int[] nArray2 = nArray;
            int n2 = 0;
            while (n2 < nArray2.length) {
                arrayList3.add((ModeloTime)this.YF.get(nArray2[n2]));
                ++n2;
            }
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 24;
            loadLigaOptions.nGrupos = 8;
            loadLigaOptions.numeroTimesMataMata = 1;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = true;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, arrayList3, 0, null, null, null, 4, null, false, null, true, this);
            s2.setNome(this.getNome());
        }
    }

    public ArrayList yy() {
        return this.YF;
    }

    public ModeloTime yz() {
        return this.ZA;
    }

    public void N(ModeloTime ah2) {
        this.ZA = ah2;
    }

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    @Override
    public void mr() {
        this.YD.za();
    }

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"1\u00ba G1", "1\u00ba G8", "1\u00ba G2", "1\u00ba G7", "1\u00ba G3", "1\u00ba G6", "1\u00ba G4", "1\u00ba G5"};
        int n2 = 0;
        while (n2 < stringArray.length) {
            arrayList.add(stringArray[n2]);
            ++n2;
        }
        return arrayList;
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
        stringArray[0] = "tr_ligaconcacaf";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

