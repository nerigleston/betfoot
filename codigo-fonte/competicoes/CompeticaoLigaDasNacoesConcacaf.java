package competicoes;

import nucleo.ListaTimes;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import configuracao.LoadLigaOptions;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CompeticaoLigaDasNacoesConcacaf
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos agp = null;
    private LigaPontosCorridos agq = null;
    private LigaPontosCorridos agr = null;
    private ArrayList agt = new ArrayList();
    private ArrayList agu = new ArrayList();
    private ArrayList agv = new ArrayList();
    private ChaveMataMata afT = null;
    private ArrayList xc = new ArrayList();
    private int YH = 0;
    private int agy = -1;

    public CompeticaoLigaDasNacoesConcacaf() {
        this.F(14, 4);
        this.O(true);
    }

    public void Ar() {
        if (this.YH == 0) {
            int[] nArray = new int[]{131, 68, 38, 51, 147, 106, 58, 86, 219, 8, 181, 77};
            int[] nArray2 = new int[]{84, 79, 189, 53, 220, 217, 139, 24, 7, 80, 158, 168, 22, 212, 20, 17};
            int[] nArray3 = new int[]{166, 153, 221, 165, 56, 13, 90, 213, 222, 223, 211, 6, 94};
            int n2 = 0;
            while (n2 < nArray.length) {
                this.agt.add(GerenciadorJogo.SR.s(nArray[n2]).jo());
                ++n2;
            }
            n2 = 0;
            while (n2 < nArray2.length) {
                this.agu.add(GerenciadorJogo.SR.s(nArray2[n2]).jo());
                ++n2;
            }
            n2 = 0;
            while (n2 < nArray3.length) {
                this.agv.add(GerenciadorJogo.SR.s(nArray3[n2]).jo());
                ++n2;
            }
        }
        this.aB(this.agt);
        this.aB(this.agu);
        this.aB(this.agv);
        this.agp = this.e(this.agt, 14401);
        this.agq = this.e(this.agu, 14402);
        this.agr = this.e(this.agv, 14403);
        this.agy = -1;
        ++this.YH;
        GerenciadorJogo.afQ.L(this.agt);
        GerenciadorJogo.afQ.L(this.agu);
        GerenciadorJogo.afQ.L(this.agv);
    }

    private LigaPontosCorridos e(ArrayList arrayList, int n2) {
        int n3 = 0;
        while (n3 < arrayList.size()) {
            GerenciadorJogo.SR.s(((ModeloTime)arrayList.get(n3)).getPais()).z(false);
            ++n3;
        }
        boolean[] blArray = new boolean[7];
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = arrayList.size();
        loadLigaOptions.nGrupos = 4;
        loadLigaOptions.numeroTimesMataMata = 0;
        loadLigaOptions.doisTurnos = true;
        loadLigaOptions.duasVoltasMataMata = blArray;
        if (arrayList.size() == 13) {
            loadLigaOptions.nGrupos = 4;
            loadLigaOptions.gruposNumeroDiferenteTimes = true;
            loadLigaOptions.gruposNumeroDiferenteTimes = true;
            loadLigaOptions.numeroDefinidoTimesPorGrupo[0] = 4;
            loadLigaOptions.numeroDefinidoTimesPorGrupo[1] = 3;
            loadLigaOptions.numeroDefinidoTimesPorGrupo[2] = 3;
            loadLigaOptions.numeroDefinidoTimesPorGrupo[3] = 3;
        }
        LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList, 0, null, null, null, 14, null, false, null, true, this);
        s2.fb(n2);
        s2.setNome(this.getNome());
        return s2;
    }

    public void yt() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        arrayList.add((ModeloTime)((ListaTimes)this.agp.yQ().get(0)).gR().get(0));
        arrayList.add((ModeloTime)((ListaTimes)this.agp.yQ().get(1)).gR().get(0));
        arrayList.add((ModeloTime)((ListaTimes)this.agp.yQ().get(2)).gR().get(0));
        arrayList.add((ModeloTime)((ListaTimes)this.agp.yQ().get(3)).gR().get(0));
        Collections.shuffle(arrayList);
        this.agy = ((ModeloTime)arrayList.get(0)).getPais();
        boolean[] blArray = new boolean[7];
        this.afT = new ChaveMataMata(null, arrayList.size(), this.b(), 0, blArray, this, -1);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.afT, arrayList, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void aA(ArrayList arrayList) {
        this.xc.clear();
        this.xc.addAll(arrayList);
    }

    private void aB(ArrayList arrayList) {
        int n2;
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        if (arrayList.size() == 16) {
            n2 = 0;
            while (n2 <= 3) {
                arrayList2.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 4;
            while (n2 <= 7) {
                arrayList3.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 8;
            while (n2 <= 11) {
                arrayList4.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 12;
            while (n2 <= 15) {
                arrayList5.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            Collections.shuffle(arrayList2);
            Collections.shuffle(arrayList3);
            Collections.shuffle(arrayList4);
            Collections.shuffle(arrayList5);
            arrayList.clear();
            n2 = 0;
            while (n2 <= 3) {
                arrayList.add((ModeloTime)arrayList2.get(n2));
                arrayList.add((ModeloTime)arrayList3.get(n2));
                arrayList.add((ModeloTime)arrayList4.get(n2));
                arrayList.add((ModeloTime)arrayList5.get(n2));
                ++n2;
            }
        }
        if (arrayList.size() == 15) {
            n2 = 0;
            while (n2 <= 3) {
                arrayList2.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 4;
            while (n2 <= 7) {
                arrayList3.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 8;
            while (n2 <= 12) {
                arrayList4.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            Collections.shuffle(arrayList2);
            Collections.shuffle(arrayList3);
            Collections.shuffle(arrayList4);
            arrayList.clear();
            n2 = 0;
            while (n2 <= 3) {
                arrayList.add((ModeloTime)arrayList2.get(n2));
                arrayList.add((ModeloTime)arrayList3.get(n2));
                arrayList.add((ModeloTime)arrayList4.get(n2));
                ++n2;
            }
            arrayList.add((ModeloTime)arrayList4.get(4));
        }
        if (arrayList.size() == 12) {
            n2 = 0;
            while (n2 <= 3) {
                arrayList2.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 4;
            while (n2 <= 7) {
                arrayList3.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            n2 = 8;
            while (n2 <= 11) {
                arrayList4.add((ModeloTime)arrayList.get(n2));
                ++n2;
            }
            Collections.shuffle(arrayList2);
            Collections.shuffle(arrayList3);
            Collections.shuffle(arrayList4);
            arrayList.clear();
            n2 = 0;
            while (n2 <= 3) {
                arrayList.add((ModeloTime)arrayList2.get(n2));
                arrayList.add((ModeloTime)arrayList3.get(n2));
                arrayList.add((ModeloTime)arrayList4.get(n2));
                ++n2;
            }
        }
    }

    public void BC() {
    }

    private void BD() {
        int n2 = 0;
        while (n2 < this.agp.yQ().size()) {
            this.a(this.agt, this.agu, this.a(this.agt, (ModeloTime)((ListaTimes)this.agp.yQ().get(n2)).gR().get(2)), this.a(this.agu, (ModeloTime)((ListaTimes)this.agq.yQ().get(n2)).gR().get(0)));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.agq.yQ().size()) {
            this.a(this.agu, this.agv, this.a(this.agu, (ModeloTime)((ListaTimes)this.agq.yQ().get(n2)).gR().get(3)), this.a(this.agv, (ModeloTime)((ListaTimes)this.agr.yQ().get(n2)).gR().get(0)));
            ++n2;
        }
    }

    private int a(ArrayList arrayList, ModeloTime ah2) {
        int n2 = 0;
        while (n2 < arrayList.size()) {
            if (arrayList.get(n2) == ah2) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    private void a(ArrayList arrayList, ArrayList arrayList2, int n2, int n3) {
        ModeloTime ah2 = null;
        ModeloTime ah3 = null;
        ah2 = (ModeloTime)arrayList.get(n2);
        ah3 = (ModeloTime)arrayList2.get(n3);
        ah2.b(this, 0);
        ah3.b(this, 1);
        arrayList.set(n2, ah3);
        arrayList2.set(n3, ah2);
    }

    public void xZ() {
        if (this.agp != null) {
            this.BD();
        }
        if (this.agp != null) {
            this.agp.aN(true);
        }
        if (this.agq != null) {
            this.agq.aN(true);
        }
        if (this.agr != null) {
            this.agr.aN(true);
        }
        this.agp = null;
        this.agq = null;
        this.agr = null;
        this.afT = null;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.agp};
        if (this.afT != null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.afT};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.agp};
        arrayList.add(new ItemFormacao(l_0Array, "Liga A"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.agq};
        arrayList.add(new ItemFormacao(l_0Array2, "Liga B"));
        FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.agr};
        arrayList.add(new ItemFormacao(l_0Array3, "Liga C"));
        FaseCompeticao[] l_0Array4 = new FaseCompeticao[]{this.afT};
        arrayList.add(new ItemFormacao(l_0Array4, "Fase Final"));
        return arrayList;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        return ConstantesJogo.pF;
    }

    @Override
    public int cy(int n2) {
        int[] nArray = new int[]{65000, 55000, 52698};
        int n3 = new Random().nextInt(nArray.length);
        return nArray[n3] + new Random().nextInt(5000);
    }

    @Override
    public String cx(int n2) {
        return EnumPaises.bl(this.agy);
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_liganacoesC";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    @Override
    public void mr() {
        this.afT.z(this);
        this.BG();
    }

    private void BG() {
        int n2 = 0;
        while (n2 < this.agp.yK().size()) {
            ((ModeloTime)this.agp.yK().get(n2)).e(this, 1);
            ++n2;
        }
        n2 = 0;
        while (n2 < this.agq.yK().size()) {
            ((ModeloTime)this.agq.yK().get(n2)).e(this, 2);
            ++n2;
        }
        n2 = 0;
        while (n2 < this.agr.yK().size()) {
            ((ModeloTime)this.agr.yK().get(n2)).e(this, 3);
            ++n2;
        }
    }
}

