package competicoes;

import nucleo.ListaTimes;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoRepescagemIntercontinental
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos agb = null;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ChaveMataMata afT = null;
    private ModeloTime agf = null;

    public CompeticaoRepescagemIntercontinental() {
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
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int[] nArray = new int[]{214, 91, 163, 188, 69, 215, 143, 148, 93, 184, 197};
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < nArray.length) {
            serializable = GerenciadorJogo.SR.s(nArray[n2]);
            arrayList2.add(((LigaNacional)serializable).jo());
            ((LigaNacional)serializable).z(true);
            ++n2;
        }
        Collections.sort(arrayList2, ColecaoComparadoresSorteio.cN);
        n2 = 0;
        while (n2 <= 6) {
            this.YF.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 7;
        while (n2 < arrayList2.size()) {
            arrayList.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 4;
        loadLigaOptions.nGrupos = 0;
        loadLigaOptions.doisTurnos = true;
        serializable = new LigaPontosCorridos(loadLigaOptions, arrayList, 0, null, null, null, 9, null, false, null, true, this);
        this.agb = (LigaPontosCorridos)serializable;
        ((FaseCompeticao)serializable).setNome(this.getNome());
        ((LigaPontosCorridos)serializable).fb(9500);
        GerenciadorJogo.afQ.L(arrayList);
        GerenciadorJogo.afQ.L(this.YF);
    }

    public void yt() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(0));
            arrayList.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(1));
            ++n2;
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        boolean[] blArray2 = blArray;
        this.afT = new ChaveMataMata(null, arrayList.size(), this.b(), 0, blArray2, this, 9502);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.afT, arrayList, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void Bq() {
        LigaPontosCorridos s2;
        this.YF.add((ModeloTime)this.agb.yK().get(0));
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 8;
        loadLigaOptions.nGrupos = 2;
        loadLigaOptions.doisTurnos = true;
        this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, this.YF, 0, null, null, null, 9, null, false, null, true, this);
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
        GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)arrayList.get(0)).getPais()));
        this.agf = (ModeloTime)arrayList2.get(0);
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
        if (this.YD == null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.agb};
            l_0Array = l_0Array2;
        } else if (this.afT != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afT};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.agb};
        arrayList.add(new ItemFormacao(l_0Array, "Fase Preliminar"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase de Grupos"));
        FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afT};
        arrayList.add(new ItemFormacao(l_0Array3, "Fase Final"));
        FaseCompeticao[] l_0Array4 = new FaseCompeticao[]{GerenciadorJogo.SR.bQ().Bo()};
        arrayList.add(new ItemFormacao(l_0Array4, "Torneio Repescagem"));
        return arrayList;
    }

    public ModeloTime Br() {
        return this.agf;
    }
}

