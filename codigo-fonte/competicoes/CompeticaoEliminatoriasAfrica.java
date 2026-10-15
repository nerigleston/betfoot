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

public class CompeticaoEliminatoriasAfrica
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ChaveMataMata YJ = null;
    private ChaveMataMata afV = null;
    private ArrayList YF = new ArrayList();
    private ModeloTime afW = null;

    public CompeticaoEliminatoriasAfrica() {
        this.F(9, 2);
    }

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.YJ = null;
        this.afV = null;
        this.YF.clear();
        this.afW = null;
    }

    public void Bj() {
        ArrayList<LigaNacional> arrayList = new ArrayList<LigaNacional>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.aG().size()) {
            if (((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jo() != null && ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).gg() == 2) {
                arrayList.add((LigaNacional)GerenciadorJogo.SR.aG().get(n2));
            }
            ++n2;
        }
        Collections.sort(arrayList, LigaNacional.cN);
        n2 = 0;
        while (n2 < arrayList.size()) {
            arrayList2.add(((LigaNacional)arrayList.get(n2)).jo());
            ++n2;
        }
        n2 = 0;
        while (n2 <= 25) {
            this.YF.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        int n3 = 26;
        while (n3 <= 39) {
            arrayList4.add((ModeloTime)arrayList2.get(n3));
            ++n3;
        }
        n3 = 40;
        while (n3 <= 53) {
            arrayList5.add((ModeloTime)arrayList2.get(n3));
            ++n3;
        }
        n3 = 0;
        while (n3 < arrayList4.size()) {
            arrayList3.add((ModeloTime)arrayList4.get(n3));
            arrayList3.add((ModeloTime)arrayList5.get(n3));
            ++n3;
        }
        n3 = 0;
        while (n3 < this.YF.size()) {
            GerenciadorJogo.SR.s(((ModeloTime)this.YF.get(n3)).getPais()).z(true);
            ++n3;
        }
        n3 = 0;
        while (n3 < arrayList3.size()) {
            GerenciadorJogo.SR.s(((ModeloTime)arrayList3.get(n3)).getPais()).z(true);
            ++n3;
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YJ = new ChaveMataMata(null, arrayList3.size(), this.b(), 1, blArray, this, 9200);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YJ, arrayList3, 0, blArray[0], 0, 0, this.b(), false);
        GerenciadorJogo.afQ.L(arrayList3);
        GerenciadorJogo.afQ.L(this.YF);
    }

    public void Bk() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList2.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(1));
            ++n2;
        }
        LigaPontosCorridos.r(this.YD);
        Collections.sort(arrayList2, ColecaoComparadoresSorteio.abn);
        n2 = 0;
        while (n2 <= 3) {
            arrayList.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        Collections.shuffle(arrayList);
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.afV = new ChaveMataMata(null, arrayList.size(), this.b(), 0, blArray, this, 9202);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.afV, arrayList, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void p(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList3.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(0));
            ++n2;
        }
        arrayList3.add((ModeloTime)arrayList.get(0));
        this.afW = (ModeloTime)arrayList2.get(0);
        n2 = 0;
        while (n2 < arrayList3.size()) {
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)arrayList3.get(n2)).getPais()));
            ++n2;
        }
    }

    public void aw(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(this.YF);
        Collections.sort(arrayList2, ColecaoComparadoresSorteio.abm);
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList6 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 <= 9) {
            arrayList3.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 10;
        while (n2 <= 19) {
            arrayList4.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 20;
        while (n2 <= 29) {
            arrayList5.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 30;
        while (n2 <= 39) {
            arrayList6.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        ArrayList<ModeloTime> arrayList7 = new ArrayList<ModeloTime>();
        int n3 = 0;
        while (n3 <= 9) {
            arrayList7.add((ModeloTime)arrayList3.get(n3));
            arrayList7.add((ModeloTime)arrayList4.get(n3));
            arrayList7.add((ModeloTime)arrayList5.get(n3));
            arrayList7.add((ModeloTime)arrayList6.get(n3));
            ++n3;
        }
        if (arrayList7.size() == 40) {
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            blArray[1] = true;
            blArray[2] = true;
            blArray[3] = true;
            boolean[] blArray2 = blArray;
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 40;
            loadLigaOptions.nGrupos = 8;
            loadLigaOptions.numeroTimesMataMata = 1;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = false;
            loadLigaOptions.duasVoltasMataMata = blArray2;
            LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList7, 0, null, null, null, this.b(), null, false, null, true, this);
            s2.fb(9201);
            this.YD = s2;
            s2.setNome(this.getNome());
        }
    }

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"Sorteio 1", "Sorteio 2", "Sorteio 3", "Sorteio 4", "Sorteio 5", "Sorteio 6", "Sorteio 7", "Sorteio 8"};
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
        if (this.YD == null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YJ};
            l_0Array = l_0Array2;
        } else if (this.afV != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afV};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YJ};
        arrayList.add(new ItemFormacao(l_0Array, "Fase Preliminar"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase de Grupos"));
        if (this.afV != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afV};
            arrayList.add(new ItemFormacao(l_0Array3, "Play-offs"));
        }
        return arrayList;
    }

    public ModeloTime Bl() {
        return this.afW;
    }
}

