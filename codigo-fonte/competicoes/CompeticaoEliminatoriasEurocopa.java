package competicoes;

import nucleo.ListaTimes;
import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.GerenciadorIdioma;
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

public class CompeticaoEliminatoriasEurocopa
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ChaveMataMata afV = null;
    private int age = 7;

    public CompeticaoEliminatoriasEurocopa() {
        this.F(9, 0);
    }

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.afV = null;
        this.YD = null;
    }

    public void fF(int n2) {
        this.age = n2;
        if (n2 == 7) {
            this.setNome(GerenciadorIdioma.getString("eliEU"));
            this.F(9, 0);
        } else {
            this.setNome("Classificat\u00f3rio Eurocopa");
            this.F(9, 70);
        }
        ArrayList<LigaNacional> arrayList = new ArrayList<LigaNacional>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n3 = 0;
        while (n3 < GerenciadorJogo.SR.aG().size()) {
            if (((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).jo() != null && ((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).gg() == 0) {
                arrayList.add((LigaNacional)GerenciadorJogo.SR.aG().get(n3));
            }
            ((LigaNacional)GerenciadorJogo.SR.aG().get(n3)).z(true);
            ++n3;
        }
        Collections.sort(arrayList, LigaNacional.cN);
        n3 = 0;
        while (n3 < arrayList.size()) {
            arrayList2.add(((LigaNacional)arrayList.get(n3)).jo());
            ++n3;
        }
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList6 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList7 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList8 = new ArrayList<ModeloTime>();
        int n4 = 0;
        while (n4 <= 9) {
            arrayList3.add((ModeloTime)arrayList2.get(n4));
            ++n4;
        }
        n4 = 10;
        while (n4 <= 19) {
            arrayList4.add((ModeloTime)arrayList2.get(n4));
            ++n4;
        }
        n4 = 20;
        while (n4 <= 29) {
            arrayList5.add((ModeloTime)arrayList2.get(n4));
            ++n4;
        }
        n4 = 30;
        while (n4 <= 39) {
            arrayList6.add((ModeloTime)arrayList2.get(n4));
            ++n4;
        }
        n4 = 40;
        while (n4 <= 49) {
            arrayList7.add((ModeloTime)arrayList2.get(n4));
            ++n4;
        }
        n4 = 50;
        while (n4 <= 54) {
            arrayList8.add((ModeloTime)arrayList2.get(n4));
            ++n4;
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Collections.shuffle(arrayList5);
        Collections.shuffle(arrayList6);
        Collections.shuffle(arrayList7);
        Collections.shuffle(arrayList8);
        ArrayList<ModeloTime> arrayList9 = new ArrayList<ModeloTime>();
        int n5 = 0;
        while (n5 <= 9) {
            arrayList9.add((ModeloTime)arrayList3.get(n5));
            arrayList9.add((ModeloTime)arrayList4.get(n5));
            arrayList9.add((ModeloTime)arrayList5.get(n5));
            arrayList9.add((ModeloTime)arrayList6.get(n5));
            arrayList9.add((ModeloTime)arrayList7.get(n5));
            if (n5 > 4) {
                arrayList9.add((ModeloTime)arrayList8.get(n5 - 5));
            }
            ++n5;
        }
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = 55;
        loadLigaOptions.nGrupos = 10;
        loadLigaOptions.doisTurnos = true;
        loadLigaOptions.gruposNumeroDiferenteTimes = true;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[0] = 5;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[1] = 5;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[2] = 5;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[3] = 5;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[4] = 5;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[5] = 6;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[6] = 6;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[7] = 6;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[8] = 6;
        loadLigaOptions.numeroDefinidoTimesPorGrupo[9] = 6;
        LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList9, 0, null, null, null, 9, null, false, null, true, this);
        s2.fb(9001);
        this.YD = s2;
        s2.setNome(this.getNome());
        GerenciadorJogo.afQ.L(arrayList9);
    }

    public void Bk() {
        int n2;
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        if (this.age == 7) {
            n2 = 0;
            while (n2 < this.YD.yQ().size()) {
                arrayList.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(1));
                ++n2;
            }
            n2 = 0;
            while (n2 < this.YD.yQ().size()) {
                arrayList2.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(2));
                ++n2;
            }
            LigaPontosCorridos.r(this.YD);
            Collections.sort(arrayList2, ColecaoComparadoresSorteio.abn);
            n2 = 0;
            while (n2 <= 1) {
                arrayList.add((ModeloTime)arrayList2.get(n2));
                ++n2;
            }
        } else {
            n2 = 0;
            while (n2 < this.YD.yQ().size()) {
                arrayList2.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(2));
                ++n2;
            }
            LigaPontosCorridos.r(this.YD);
            Collections.sort(arrayList2, ColecaoComparadoresSorteio.abn);
            n2 = 0;
            while (n2 <= 7) {
                arrayList.add((ModeloTime)arrayList2.get(n2));
                ++n2;
            }
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.afV = new ChaveMataMata(null, arrayList.size(), this.b(), 1, blArray, this, 9002);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.afV, arrayList, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void az(ArrayList arrayList) {
        if (this.age == 7) {
            int n2 = 0;
            while (n2 < this.YD.yQ().size()) {
                GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(0)).getPais()));
                ++n2;
            }
            n2 = 0;
            while (n2 < arrayList.size()) {
                GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)arrayList.get(n2)).getPais()));
                ++n2;
            }
        } else {
            int n3 = 0;
            while (n3 < this.YD.yQ().size()) {
                GerenciadorJogo.SR.ba().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.YD.yQ().get(n3)).gR().get(0)).getPais()));
                GerenciadorJogo.SR.ba().a(this, GerenciadorJogo.SR.s(((ModeloTime)((ListaTimes)this.YD.yQ().get(n3)).gR().get(1)).getPais()));
                ++n3;
            }
            n3 = 0;
            while (n3 < arrayList.size()) {
                GerenciadorJogo.SR.ba().a(this, GerenciadorJogo.SR.s(((ModeloTime)arrayList.get(n3)).getPais()));
                ++n3;
            }
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

    @Override
    public nucleo.FaseCompeticao[] mB() {
        nucleo.FaseCompeticao[] l_0Array = new nucleo.FaseCompeticao[]{this.YD};
        if (this.afV != null) {
            nucleo.FaseCompeticao[] l_0Array2 = new nucleo.FaseCompeticao[]{this.afV};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        nucleo.FaseCompeticao[] l_0Array = new nucleo.FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array, "Fase de Grupos"));
        nucleo.FaseCompeticao[] l_0Array2 = new nucleo.FaseCompeticao[]{this.afV};
        arrayList.add(new ItemFormacao(l_0Array2, "Play-offs"));
        return arrayList;
    }
}

