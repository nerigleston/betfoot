package competicoes;

import nucleo.ListaTimes;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import configuracao.LoadLigaOptions;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoEliminatoriasConcacaf
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos agb = null;
    private LigaPontosCorridos afX = null;
    private ArrayList agc = new ArrayList();
    private ChaveMataMata agd = null;
    private ModeloTime afW = null;

    public CompeticaoEliminatoriasConcacaf() {
        this.F(9, 4);
    }

    public void xZ() {
        if (this.afX != null) {
            this.afX.aN(true);
        }
        this.agb = null;
        this.afX = null;
        this.agc.clear();
        this.afW = null;
    }

    public void Bj() {
        LigaPontosCorridos s2;
        Serializable serializable;
        this.agc.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int[] nArray = new int[]{131, 68, 51, 106, 86, 58, 38, 8, 147, 84, 189, 7, 79, 166, 181, 139, 158, 77, 20, 80, 168, 24, 22, 165, 153, 53, 212, 56, 90, 17, 13, 213, 211, 94, 6};
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < nArray.length) {
            serializable = GerenciadorJogo.SR.s(nArray[n2]);
            arrayList3.add(((LigaNacional)serializable).jo());
            ((LigaNacional)serializable).z(true);
            ++n2;
        }
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.cN);
        n2 = 0;
        while (n2 <= 4) {
            this.agc.add((ModeloTime)arrayList3.get(n2));
            ++n2;
        }
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        serializable = new ArrayList();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList6 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList7 = new ArrayList<ModeloTime>();
        int n3 = 5;
        while (n3 <= 10) {
            arrayList4.add((ModeloTime)arrayList3.get(n3));
            ++n3;
        }
        n3 = 11;
        while (n3 <= 16) {
            ((ArrayList)serializable).add((ModeloTime)arrayList3.get(n3));
            ++n3;
        }
        n3 = 17;
        while (n3 <= 22) {
            arrayList5.add((ModeloTime)arrayList3.get(n3));
            ++n3;
        }
        n3 = 23;
        while (n3 <= 28) {
            arrayList6.add((ModeloTime)arrayList3.get(n3));
            ++n3;
        }
        n3 = 29;
        while (n3 <= 34) {
            arrayList7.add((ModeloTime)arrayList3.get(n3));
            ++n3;
        }
        n3 = 0;
        while (n3 <= 5) {
            arrayList2.add((ModeloTime)arrayList4.get(n3));
            arrayList2.add((ModeloTime)((ArrayList)serializable).get(n3));
            arrayList2.add((ModeloTime)arrayList5.get(n3));
            arrayList2.add((ModeloTime)arrayList6.get(n3));
            arrayList2.add((ModeloTime)arrayList7.get(n3));
            ++n3;
        }
        Collections.shuffle(arrayList4);
        Collections.shuffle((ArrayList)serializable);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Collections.shuffle(arrayList7);
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 30;
        loadLigaOptions.nGrupos = 6;
        loadLigaOptions.doisTurnos = false;
        this.agb = s2 = new LigaPontosCorridos(loadLigaOptions, arrayList2, 0, null, null, null, 9, null, false, null, true, this);
        s2.setNome(this.getNome());
        s2.fb(9400);
        GerenciadorJogo.afQ.L(arrayList2);
        GerenciadorJogo.afQ.L(this.agc);
    }

    public void Bp() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.agb.yQ().size()) {
            arrayList.add((ModeloTime)((ListaTimes)this.agb.yQ().get(n2)).gR().get(0));
            ++n2;
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        boolean[] blArray2 = blArray;
        this.agd = new ChaveMataMata(null, arrayList.size(), this.b(), 1, blArray2, this, 9401);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.agd, arrayList, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void ay(ArrayList arrayList) {
        this.agc.addAll(arrayList);
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 8;
        loadLigaOptions.doisTurnos = true;
        LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, this.agc, 0, null, null, null, this.b(), null, false, null, true, this);
        s2.fb(9402);
        this.afX = s2;
        s2.setNome(this.getNome());
    }

    public void Bm() {
        int n2 = 0;
        while (n2 < 6) {
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)this.afX.yK().get(n2)).getPais()));
            ++n2;
        }
        this.afW = (ModeloTime)this.afX.yK().get(6);
        GerenciadorJogo.SR.bQ().X((ModeloTime)this.afX.yK().get(7));
    }

    public void Y(ModeloTime ah2) {
        GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(ah2.getPais()));
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.agd};
        if (this.agd == null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.agb};
            l_0Array = l_0Array2;
        } else if (this.afX != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afX};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.agb};
        arrayList.add(new ItemFormacao(l_0Array, "Fase Preliminar"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.agd};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase Intermedi\u00e1ria"));
        FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afX};
        arrayList.add(new ItemFormacao(l_0Array3, "Fase Final"));
        FaseCompeticao[] l_0Array4 = new FaseCompeticao[]{GerenciadorJogo.SR.bQ().Bo()};
        arrayList.add(new ItemFormacao(l_0Array4, "Torneio Repescagem"));
        return arrayList;
    }

    public ModeloTime Bl() {
        return this.afW;
    }
}

