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
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoLigaAfricana
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();
    private ChaveMataMata YP = null;
    private ChaveMataMata YQ = null;

    public CompeticaoLigaAfricana() {
        this.setNome(GerenciadorIdioma.getString("ligaCaf"));
        this.F(4, 2);
        this.yo();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new ModeloCoeficientePais("tun", 190, 2));
        this.YV.add(new ModeloCoeficientePais("argl", 10, 3));
        this.YV.add(new ModeloCoeficientePais("egi", 57, 3));
        this.YV.add(new ModeloCoeficientePais("mar", 129, 3));
        this.YV.add(new ModeloCoeficientePais("afr sul", 1, 2));
        this.YV.add(new ModeloCoeficientePais("congo", 47, 1));
        this.YV.add(new ModeloCoeficientePais("cosMarf", 50, 1));
        this.YV.add(new ModeloCoeficientePais("gana", 75, 1));
        this.YV.add(new ModeloCoeficientePais("nigeria", 141, 1));
        this.YV.add(new ModeloCoeficientePais("mali", 127, 1));
        this.YV.add(new ModeloCoeficientePais("eti", 67, 1));
        this.YV.add(new ModeloCoeficientePais("camar", 36, 1));
        this.YV.add(new ModeloCoeficientePais("ang", 5, 1));
        this.YV.add(new ModeloCoeficientePais("rep.dem.cong.", 157, 1));
        this.YV.add(new ModeloCoeficientePais("sudao", 178, 1));
        this.YV.add(new ModeloCoeficientePais("zim", 201, 1));
        this.YV.add(new ModeloCoeficientePais("zam", 200, 1));
        this.YV.add(new ModeloCoeficientePais("guin", 81, 1));
        this.YV.add(new ModeloCoeficientePais("lib", 116, 1));
        this.YV.add(new ModeloCoeficientePais("sen", 169, 1));
        this.YV.add(new ModeloCoeficientePais("mo\u00e7", 133, 1));
        this.YV.add(new ModeloCoeficientePais("uga", 194, 1));
        this.YV.add(new ModeloCoeficientePais("tan", 186, 1));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(2, 1, this.YV, null, n2, al2);
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
        if (this.YF.size() < 32) {
            SorteioAdversarios.a(this.YF, this.YV, 32, arrayList2);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        if (this.YF.size() >= 32) {
            LigaPontosCorridos s2;
            int[] nArray = new int[32];
            nArray[1] = 15;
            nArray[2] = 23;
            nArray[3] = 31;
            nArray[4] = 3;
            nArray[5] = 14;
            nArray[6] = 22;
            nArray[7] = 29;
            nArray[8] = 5;
            nArray[9] = 13;
            nArray[10] = 21;
            nArray[11] = 27;
            nArray[12] = 7;
            nArray[13] = 12;
            nArray[14] = 20;
            nArray[15] = 25;
            nArray[16] = 1;
            nArray[17] = 11;
            nArray[18] = 19;
            nArray[19] = 30;
            nArray[20] = 2;
            nArray[21] = 10;
            nArray[22] = 18;
            nArray[23] = 28;
            nArray[24] = 4;
            nArray[25] = 9;
            nArray[26] = 17;
            nArray[27] = 26;
            nArray[28] = 6;
            nArray[29] = 8;
            nArray[30] = 16;
            nArray[31] = 24;
            int[] nArray2 = nArray;
            int n2 = 0;
            while (n2 < nArray2.length) {
                arrayList3.add((ModeloTime)this.YF.get(nArray2[n2]));
                ++n2;
            }
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 32;
            loadLigaOptions.nGrupos = 8;
            loadLigaOptions.numeroTimesMataMata = 2;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = true;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, arrayList3, 0, null, null, null, 4, null, false, null, true, this);
            s2.setNome(this.getNome());
        } else {
            System.out.println("erro Liga Africa() " + this.YF.size());
        }
    }

    public void q(ArrayList arrayList, ArrayList arrayList2) {
    }

    public void g(ArrayList arrayList, ArrayList arrayList2) {
    }

    public void l(ArrayList arrayList, ArrayList arrayList2) {
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
        stringArray[0] = "tr_ligacaf";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public ChaveMataMata By() {
        return this.YP;
    }

    public ChaveMataMata Bz() {
        return this.YQ;
    }
}

