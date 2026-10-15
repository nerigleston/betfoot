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

public class CompeticaoLigaAsiatica
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();

    public CompeticaoLigaAsiatica() {
        this.setNome(GerenciadorIdioma.getString("ligaAfc"));
        this.F(4, 3);
        this.yo();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new ModeloCoeficientePais("chn.", 43, 2));
        this.YV.add(new ModeloCoeficientePais("arab s.", 9, 3));
        this.YV.add(new ModeloCoeficientePais("jap", 107, 3));
        this.YV.add(new ModeloCoeficientePais("cor s.", 49, 3));
        this.YV.add(new ModeloCoeficientePais("cat", 39, 3));
        this.YV.add(new ModeloCoeficientePais("irn", 98, 3));
        this.YV.add(new ModeloCoeficientePais("emi", 59, 3));
        this.YV.add(new ModeloCoeficientePais("uzb", 196, 2));
        this.YV.add(new ModeloCoeficientePais("aus", 14, 2));
        this.YV.add(new ModeloCoeficientePais("tai", 183, 1));
        this.YV.add(new ModeloCoeficientePais("vie", 199, 1));
        this.YV.add(new ModeloCoeficientePais("ind", 95, 1));
        this.YV.add(new ModeloCoeficientePais("hk", 87, 1));
        this.YV.add(new ModeloCoeficientePais("sir", 174, 1));
        this.YV.add(new ModeloCoeficientePais("idn", 96, 1));
        this.YV.add(new ModeloCoeficientePais("irq", 99, 1));
        this.YV.add(new ModeloCoeficientePais("mal\u00e1sia", 124, 1));
        this.YV.add(new ModeloCoeficientePais("libano", 115, 1));
        this.YV.add(new ModeloCoeficientePais("tajiq", 182, 1));
        this.YV.add(new ModeloCoeficientePais("jord", 108, 1));
        this.YV.add(new ModeloCoeficientePais("sing", 173, 1));
        this.YV.add(new ModeloCoeficientePais("Filp", 71, 1));
        this.YV.add(new ModeloCoeficientePais("KorN", 48, 1));
        this.YV.add(new ModeloCoeficientePais("mianmar", 132, 1));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(3, 1, this.YV, null, n2, al2);
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
        if (this.YF.size() < 40) {
            SorteioAdversarios.a(this.YF, this.YV, 40, arrayList2);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        if (this.YF.size() >= 40) {
            LigaPontosCorridos s2;
            int[] nArray = new int[40];
            nArray[1] = 10;
            nArray[2] = 20;
            nArray[3] = 30;
            nArray[4] = 1;
            nArray[5] = 11;
            nArray[6] = 21;
            nArray[7] = 31;
            nArray[8] = 2;
            nArray[9] = 12;
            nArray[10] = 22;
            nArray[11] = 32;
            nArray[12] = 3;
            nArray[13] = 13;
            nArray[14] = 23;
            nArray[15] = 33;
            nArray[16] = 4;
            nArray[17] = 14;
            nArray[18] = 24;
            nArray[19] = 34;
            nArray[20] = 5;
            nArray[21] = 15;
            nArray[22] = 25;
            nArray[23] = 35;
            nArray[24] = 6;
            nArray[25] = 16;
            nArray[26] = 26;
            nArray[27] = 36;
            nArray[28] = 7;
            nArray[29] = 17;
            nArray[30] = 27;
            nArray[31] = 37;
            nArray[32] = 8;
            nArray[33] = 18;
            nArray[34] = 28;
            nArray[35] = 38;
            nArray[36] = 9;
            nArray[37] = 19;
            nArray[38] = 29;
            nArray[39] = 39;
            int[] nArray2 = nArray;
            int n2 = 0;
            while (n2 < nArray2.length) {
                arrayList3.add((ModeloTime)this.YF.get(nArray2[n2]));
                ++n2;
            }
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 40;
            loadLigaOptions.nGrupos = 10;
            loadLigaOptions.numeroTimesMataMata = 1;
            loadLigaOptions.melhoresTerceiros = true;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = true;
            loadLigaOptions.var0 = 1403;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, arrayList3, 0, null, null, null, 4, null, false, null, true, this);
            s2.setNome(this.getNome());
        } else {
            System.out.println("erro Liga Asiatica() " + this.YF.size());
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
        stringArray[0] = "tr_ligaafc";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

