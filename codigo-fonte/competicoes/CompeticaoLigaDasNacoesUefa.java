package competicoes;

import nucleo.ListaTimes;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CompeticaoLigaDasNacoesUefa
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos agp = null;
    private LigaPontosCorridos agq = null;
    private LigaPontosCorridos agr = null;
    private LigaPontosCorridos ags = null;
    private ArrayList agt = new ArrayList();
    private ArrayList agu = new ArrayList();
    private ArrayList agv = new ArrayList();
    private ArrayList agw = new ArrayList();
    private ChaveMataMata afT = null;
    private ChaveMataMata agx = null;
    private ArrayList xc = new ArrayList();
    private int YH = 0;
    private int agy = -1;

    public CompeticaoLigaDasNacoesUefa() {
        this.F(14, 0);
        this.O(true);
    }

    public void Ar() {
        if (this.YH == 0) {
            int[] nArray = new int[]{72, 65, 104, 21, 154, 85, 54, 3, 97, 152, 180, 52, 145, 15, 159, 88};
            int[] nArray2 = new int[]{193, 179, 27, 102, 70, 142, 62, 192, 103, 160, 171, 100, 64, 105, 2, 12};
            int[] nArray3 = new int[]{162, 63, 31, 101, 78, 25, 120, 122, 119, 76, 16, 110, 40, 44, 114, 92};
            int[] nArray4 = new int[]{66, 134, 118, 128, 216, 164, 4};
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
            n2 = 0;
            while (n2 < nArray4.length) {
                this.agw.add(GerenciadorJogo.SR.s(nArray4[n2]).jo());
                ++n2;
            }
        }
        this.aB(this.agt);
        this.aB(this.agu);
        this.aB(this.agv);
        this.aB(this.agw);
        this.agp = this.e(this.agt, 14001);
        this.agq = this.e(this.agu, 14002);
        this.agr = this.e(this.agv, 14003);
        this.ags = this.e(this.agw, 14004);
        this.agy = -1;
        ++this.YH;
        GerenciadorJogo.afQ.L(this.agt);
        GerenciadorJogo.afQ.L(this.agu);
        GerenciadorJogo.afQ.L(this.agv);
        GerenciadorJogo.afQ.L(this.agw);
    }

    private LigaPontosCorridos e(ArrayList arrayList, int n2) {
        if (arrayList.size() == 16 || arrayList.size() == 7) {
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
            if (arrayList.size() == 7) {
                loadLigaOptions.nGrupos = 2;
                loadLigaOptions.gruposNumeroDiferenteTimes = true;
                loadLigaOptions.numeroDefinidoTimesPorGrupo[0] = 4;
                loadLigaOptions.numeroDefinidoTimesPorGrupo[1] = 3;
            }
            LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList, 0, null, null, null, 14, null, false, null, true, this);
            s2.fb(n2);
            s2.setNome(this.getNome());
            return s2;
        }
        return null;
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

    public void BB() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        arrayList.add((ModeloTime)((ListaTimes)this.agr.yQ().get(0)).gR().get(3));
        arrayList.add((ModeloTime)((ListaTimes)this.agr.yQ().get(1)).gR().get(3));
        arrayList.add((ModeloTime)((ListaTimes)this.agr.yQ().get(2)).gR().get(3));
        arrayList.add((ModeloTime)((ListaTimes)this.agr.yQ().get(3)).gR().get(3));
        Collections.shuffle(arrayList);
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        boolean[] blArray2 = blArray;
        this.agx = new ChaveMataMata(null, arrayList.size(), this.b(), 1, blArray2, this, 14006);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.agx, arrayList, 0, blArray2[0], 0, 0, this.b(), false);
    }

    public void aA(ArrayList arrayList) {
        this.xc.clear();
        this.xc.addAll(arrayList);
    }

    private void aB(ArrayList arrayList) {
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        if (arrayList.size() == 16) {
            int n2 = 0;
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
        } else {
            int n3 = 0;
            while (n3 <= 3) {
                arrayList2.add((ModeloTime)arrayList.get(n3));
                ++n3;
            }
            n3 = 4;
            while (n3 <= 6) {
                arrayList3.add((ModeloTime)arrayList.get(n3));
                ++n3;
            }
            Collections.shuffle(arrayList2);
            Collections.shuffle(arrayList3);
            arrayList.clear();
            arrayList.add((ModeloTime)arrayList2.get(0));
            arrayList.add((ModeloTime)arrayList3.get(0));
            arrayList.add((ModeloTime)arrayList2.get(1));
            arrayList.add((ModeloTime)arrayList3.get(1));
            arrayList.add((ModeloTime)arrayList2.get(2));
            arrayList.add((ModeloTime)arrayList2.get(3));
            arrayList.add((ModeloTime)arrayList3.get(2));
        }
    }

    public void BC() {
    }

    private void BD() {
        int n2 = 0;
        while (n2 < this.agp.yQ().size()) {
            this.a(this.agt, this.agu, this.a(this.agt, (ModeloTime)((ListaTimes)this.agp.yQ().get(n2)).gR().get(3)), this.a(this.agu, (ModeloTime)((ListaTimes)this.agq.yQ().get(n2)).gR().get(0)));
            ++n2;
        }
        n2 = 0;
        while (n2 < this.agq.yQ().size()) {
            this.a(this.agu, this.agv, this.a(this.agu, (ModeloTime)((ListaTimes)this.agq.yQ().get(n2)).gR().get(3)), this.a(this.agv, (ModeloTime)((ListaTimes)this.agr.yQ().get(n2)).gR().get(0)));
            ++n2;
        }
        this.a(this.agv, this.agw, this.a(this.agv, (ModeloTime)this.xc.get(0)), this.a(this.agw, (ModeloTime)((ListaTimes)this.ags.yQ().get(0)).gR().get(0)));
        this.a(this.agv, this.agw, this.a(this.agv, (ModeloTime)this.xc.get(1)), this.a(this.agw, (ModeloTime)((ListaTimes)this.ags.yQ().get(1)).gR().get(0)));
        this.xc.clear();
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
        if (this.ags != null) {
            this.ags.aN(true);
        }
        this.agp = null;
        this.agq = null;
        this.agr = null;
        this.ags = null;
        this.afT = null;
        this.agx = null;
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
        FaseCompeticao[] l_0Array4 = new FaseCompeticao[]{this.ags};
        arrayList.add(new ItemFormacao(l_0Array4, "Liga D"));
        FaseCompeticao[] l_0Array5 = new FaseCompeticao[]{this.afT};
        arrayList.add(new ItemFormacao(l_0Array5, "Fase Final"));
        FaseCompeticao[] l_0Array6 = new FaseCompeticao[]{this.agx};
        arrayList.add(new ItemFormacao(l_0Array6, "Play off rebaixamento"));
        return arrayList;
    }

    public ChaveMataMata BE() {
        return this.agx;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (l_02 == this.agx) {
            return ConstantesJogo.abX;
        }
        return ConstantesJogo.pF;
    }

    public ChaveMataMata BF() {
        return this.afT;
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
        stringArray[0] = "tr_liganacoes";
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
        n2 = 0;
        while (n2 < this.ags.yK().size()) {
            ((ModeloTime)this.ags.yK().get(n2)).e(this, 4);
            ++n2;
        }
    }
}

