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

public class CompeticaoEliminatoriasRepescagem
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private LigaPontosCorridos afX = null;
    private ChaveMataMata YJ = null;
    private ChaveMataMata afY = null;
    private ArrayList YF = new ArrayList();
    private LigaPontosCorridos afZ = null;
    private ModeloTime aga = null;

    public CompeticaoEliminatoriasRepescagem() {
        this.F(9, 3);
    }

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.afZ = null;
        this.YD = null;
        this.YJ = null;
        this.afX = null;
        this.afY = null;
        this.aga = null;
        this.YF.clear();
    }

    public void Bj() {
        ArrayList<LigaNacional> arrayList = new ArrayList<LigaNacional>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.aG().size()) {
            if (((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jo() != null && ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).gg() == 3) {
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
        while (n2 <= 33) {
            this.YF.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        int n3 = 34;
        while (n3 <= 39) {
            arrayList4.add((ModeloTime)arrayList2.get(n3));
            ++n3;
        }
        n3 = 40;
        while (n3 <= 45) {
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
        this.YJ = new ChaveMataMata(null, arrayList3.size(), this.b(), 1, blArray, this, 9300);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YJ, arrayList3, 0, blArray[0], 0, 0, this.b(), false);
        GerenciadorJogo.afQ.L(arrayList3);
        GerenciadorJogo.afQ.L(this.YF);
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
        ArrayList<ModeloTime> arrayList7 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 <= 7) {
            arrayList3.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 8;
        while (n2 <= 15) {
            arrayList4.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 16;
        while (n2 <= 23) {
            arrayList5.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 24;
        while (n2 <= 31) {
            arrayList6.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        n2 = 32;
        while (n2 <= 39) {
            arrayList7.add((ModeloTime)arrayList2.get(n2));
            ++n2;
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Collections.shuffle(arrayList7);
        ArrayList<ModeloTime> arrayList8 = new ArrayList<ModeloTime>();
        int n3 = 0;
        while (n3 <= 7) {
            arrayList8.add((ModeloTime)arrayList3.get(n3));
            arrayList8.add((ModeloTime)arrayList4.get(n3));
            arrayList8.add((ModeloTime)arrayList5.get(n3));
            arrayList8.add((ModeloTime)arrayList6.get(n3));
            arrayList8.add((ModeloTime)arrayList7.get(n3));
            ++n3;
        }
        if (arrayList8.size() == 40) {
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            blArray[1] = true;
            blArray[2] = true;
            blArray[3] = true;
            boolean[] blArray2 = blArray;
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 40;
            loadLigaOptions.nGrupos = 8;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = false;
            loadLigaOptions.duasVoltasMataMata = blArray2;
            LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList8, 0, null, null, null, this.b(), null, false, null, true, this);
            s2.fb(9301);
            this.YD = s2;
            s2.setNome(this.getNome());
        }
    }

    public void yt() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        int n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(0));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList3.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(1));
            ++n2;
        }
        LigaPontosCorridos.r(this.YD);
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.abn);
        n2 = 0;
        while (n2 <= 3) {
            arrayList.add((ModeloTime)arrayList3.get(n2));
            ++n2;
        }
        Collections.sort(arrayList, ColecaoComparadoresSorteio.cN);
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        int n3 = 0;
        while (n3 <= 5) {
            arrayList4.add((ModeloTime)arrayList.get(n3));
            ++n3;
        }
        n3 = 6;
        while (n3 <= 11) {
            arrayList5.add((ModeloTime)arrayList.get(n3));
            ++n3;
        }
        n3 = 0;
        while (n3 < arrayList4.size()) {
            arrayList2.add((ModeloTime)arrayList4.get(n3));
            arrayList2.add((ModeloTime)arrayList5.get(n3));
            ++n3;
        }
        if (arrayList2.size() == 12) {
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            blArray[1] = true;
            blArray[2] = true;
            blArray[3] = true;
            boolean[] blArray2 = blArray;
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 12;
            loadLigaOptions.nGrupos = 2;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = false;
            loadLigaOptions.duasVoltasMataMata = blArray2;
            LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList2, 0, null, null, null, this.b(), null, false, null, true, this);
            s2.fb(9302);
            this.afX = s2;
            s2.setNome(this.getNome());
        }
    }

    public void Bm() {
        int n2 = 0;
        while (n2 < this.afX.yQ().size()) {
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.afX.yQ().get(n2)).gR().get(0)).getPais()));
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.afX.yQ().get(n2)).gR().get(1)).getPais()));
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.afX.yQ().get(n2)).gR().get(2)).getPais()));
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.afX.yQ().get(n2)).gR().get(3)).getPais()));
            ++n2;
        }
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        arrayList.add((ModeloTime)((ListaTimes)this.afX.yQ().get(0)).gR().get(4));
        arrayList.add((ModeloTime)((ListaTimes)this.afX.yQ().get(1)).gR().get(4));
        boolean[] blArray = new boolean[7];
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        boolean[] blArray2 = blArray;
        this.afY = new ChaveMataMata(null, arrayList.size(), this.b(), 1, blArray2, this, 9303);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.afY, arrayList, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void ax(ArrayList arrayList) {
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        arrayList2.add(GerenciadorJogo.SR.bK().Br());
        arrayList2.add((ModeloTime)arrayList.get(0));
        arrayList2.add(GerenciadorJogo.SR.bR().Bl());
        arrayList2.add(this.aga);
        arrayList2.add(GerenciadorJogo.SR.bM().Bl());
        arrayList2.add(GerenciadorJogo.SR.bS().Br());
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 6;
        loadLigaOptions.doisTurnos = false;
        LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList2, 0, null, null, null, this.b(), null, false, null, true, this);
        s2.fb(7701);
        this.afZ = s2;
        s2.setNome("Eliminat\u00f3rias - Repescagem");
    }

    public void Bn() {
        int n2 = 0;
        while (n2 <= 1) {
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)this.Bo().yK().get(n2)).getPais()));
            ++n2;
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
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YJ};
        if (this.afZ != null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.afZ};
            l_0Array = l_0Array2;
        } else if (this.afX != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.afX};
            l_0Array = l_0Array3;
        } else if (this.YD != null) {
            FaseCompeticao[] l_0Array4 = new FaseCompeticao[]{this.YD};
            l_0Array = l_0Array4;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        FaseCompeticao[] l_0Array;
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YJ};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase Preliminar"));
        FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array3, "Fase de Grupos"));
        if (this.YD != null && this.afX != null) {
            l_0Array = new FaseCompeticao[]{this.afX};
            arrayList.add(new ItemFormacao(l_0Array, "Fase Final"));
        } else {
            arrayList.add(new ItemFormacao(null, "Fase Final"));
        }
        if (this.afY != null) {
            l_0Array = new FaseCompeticao[]{this.afY};
            arrayList.add(new ItemFormacao(l_0Array, "Pr\u00e9-repescagem"));
        } else {
            arrayList.add(new ItemFormacao(null, "Pr\u00e9-repescagem"));
        }
        l_0Array = new FaseCompeticao[]{GerenciadorJogo.SR.bQ().Bo()};
        arrayList.add(new ItemFormacao(l_0Array, "Repescagem"));
        return arrayList;
    }

    public LigaPontosCorridos Bo() {
        return this.afZ;
    }

    public void X(ModeloTime ah2) {
        this.aga = ah2;
    }
}

