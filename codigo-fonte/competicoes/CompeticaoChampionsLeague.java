package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.AtributosJogador;
import components.ModeloCoeficientePais;
import components.ItemFormacao;
import competicoes.LigaSuica;
import competicoes.SorteioAdversarios;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CompeticaoChampionsLeague
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata YJ = null;
    private ChaveMataMata YP = null;
    private ChaveMataMata YQ = null;
    private ChaveMataMata YR = null;
    private ChaveMataMata ZB = null;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ArrayList YS = new ArrayList();
    private ModeloTime YT = null;
    private ModeloTime ZC = null;
    private int ZD = 1;
    private ArrayList YV = new ArrayList();
    private ArrayList YW = new ArrayList();
    private ChaveMataMata playoff = null;
    private boolean playoffAtivo = false;
    private ArrayList cabecas = null;
    private ArrayList confrontos = null;
    static final int DIRETOS = 30;
    static final String[] NOMES_PLAYOFF = new String[]{"Playoff", "Playoff", "Playoff", "Playoff", "Playoff", "Playoff", "Playoff"};

    public CompeticaoChampionsLeague() {
        this.F(4, 0);
        this.yo();
        this.yp();
    }

    private void yo() {
        this.YV.clear();
        String[] stringArray = new String[]{"ing", "esp", "ita", "ale", "fra", "por", "hol", "bel", "aut", "esc", "ucr", "ing", "esp", "ita", "ale", "fra", "por", "ing", "esp", "ita", "ale", "ing", "esp", "ita"};
        int[] nArray = new int[]{97, 65, 104, 3, 72, 154, 85, 21, 15, 62, 193, 97, 65, 104, 3, 72, 154, 97, 65, 104, 3, 97, 65, 104};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.YV.add(new ModeloCoeficientePais(stringArray[i2], nArray[i2], 1));
        }
        this.YV.add(new ModeloCoeficientePais("ale", 3, 1));
        this.YV.add(new ModeloCoeficientePais("fra", 72, 1));
        this.YV.add(new ModeloCoeficientePais("hol", 85, 1));
        this.YV.add(new ModeloCoeficientePais("por", 154, 1));
    }

    private void yp() {
        this.YW.clear();
        String[] stringArray = new String[]{"tur", "din", "chipre", "serv", "hol", "bel", "aut", "esc", "fra", "por", "cze", "cro", "sui", "gre", "isr", "ucr", "tu", "din", "chipre", "nor", "sue", "bul", "rom", "aze", "caz", "hun", "belarus", "pol", "esl", "esk", "lit", "lux", "bos", "irl", "mac", "arm", "let", "alb", "irlN", "geo", "fin", "mol", "mlt", "ifaroe", "kos", "gib", "mnt", "wal", "isl", "est", "andorra", "san m"};
        int[] nArray = new int[]{192, 54, 44, 171, 85, 21, 15, 62, 72, 154, 159, 52, 180, 78, 103, 193, 192, 54, 44, 142, 179, 31, 160, 16, 40, 88, 25, 152, 64, 63, 119, 120, 27, 100, 122, 12, 114, 2, 101, 76, 70, 134, 128, 92, 110, 216, 105, 145, 102, 66, 4, 164};
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.YW.add(new ModeloCoeficientePais(stringArray[i2], nArray[i2], 1));
        }
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(0, 1, this.YV, this.YW, n2, al2);
    }

    private void Bd() {
        ((ModeloCoeficientePais)this.YV.get(8)).fE(192);
        ((ModeloCoeficientePais)this.YW.get(0)).fE(15);
        ((ModeloCoeficientePais)this.YW.get(43)).fE(102);
        ((ModeloCoeficientePais)this.YW.get(48)).fE(92);
        ((ModeloCoeficientePais)this.YW.get(2)).fE(162);
    }

    public void yq() {
        if (this.YV.size() < 28) {
            this.yo();
        }
        if (GerenciadorJogo.SR.H() == 3) {
            this.Bd();
        }
        ArrayList<ModeloCoeficientePais> arrayList = new ArrayList<ModeloCoeficientePais>();
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YF.clear();
        this.YS.clear();
        this.YD = null;
        this.YJ = null;
        this.YP = null;
        this.YQ = null;
        this.YR = null;
        this.ZB = null;
        this.playoff = null;
        this.playoffAtivo = false;
        this.cabecas = null;
        this.confrontos = null;
        ModeloTime ah2 = null;
        if (GerenciadorJogo.SR.aK() != null) {
            ah2 = GerenciadorJogo.SR.aK().BA();
        }
        if (this.YT == null) {
            arrayList.add(new ModeloCoeficientePais("fra", 72, 1));
        } else {
            this.YF.add(this.YT);
        }
        if (this.ZC == null) {
            arrayList.add(new ModeloCoeficientePais("ale", 3, 1));
        } else if (this.ZC != this.YT) {
            this.YF.add(this.ZC);
        }
        if (this.YT != null && this.YT == this.ZC) {
            arrayList.add(new ModeloCoeficientePais("mesmo pais", this.YT.getPais(), 1));
        }
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        arrayList2.addAll(this.YF);
        arrayList2.addAll(this.YS);
        if (arrayList.size() > 0) {
            SorteioAdversarios.a(arrayList, this.YF, arrayList2, false);
        }
        SorteioAdversarios.a(this.YV, this.YF, arrayList2, false);
        if (GerenciadorJogo.SR.H() > 1 && ah2 != null) {
            arrayList2.add(ah2);
        }
        SorteioAdversarios.a(this.YW, this.YS, arrayList2, false);
        if (this.YF.size() < 30) {
            SorteioAdversarios.a(this.YF, this.YV, 30, arrayList2);
        }
        if (this.YS.size() < 52) {
            SorteioAdversarios.a(this.YS, this.YW, 52, arrayList2);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        if (this.YF.size() >= 30 && this.YS.size() == 52) {
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 48; i2 <= 51; ++i2) {
                arrayList3.add(this.YS.get(i2));
            }
            Collections.shuffle(arrayList3);
            boolean[] blArray = new boolean[7];
            this.YJ = new ChaveMataMata(null, 4, this.b(), -1, blArray, this, 4000);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.YJ, arrayList3, 0, false, 0, 0, this.b(), false);
        } else {
            System.out.println("erro Liga C() " + this.YF.size() + " " + this.YS.size());
        }
    }

    public void aj(ArrayList arrayList) {
        int n2;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 48; i2 <= 51; ++i2) {
            if (arrayList.contains(this.YS.get(i2))) continue;
            arrayList2.add(this.YS.get(i2));
            ((ModeloTime)this.YS.get(i2)).a(this, -1, 4000);
        }
        GerenciadorJogo.SR.mj().zo().addAll(arrayList2);
        GerenciadorJogo.SR.mj().b(arrayList2, 0);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (n2 = 19; n2 <= 33; ++n2) {
            arrayList3.add(this.YS.get(n2));
        }
        for (n2 = 34; n2 <= 47; ++n2) {
            arrayList4.add(this.YS.get(n2));
        }
        arrayList4.add(arrayList.get(0));
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        Random random = new Random();
        for (int i3 = 0; i3 < arrayList3.size(); ++i3) {
            if (random.nextBoolean()) {
                arrayList5.add(arrayList3.get(i3));
                arrayList5.add(arrayList4.get(i3));
                continue;
            }
            arrayList5.add(arrayList4.get(i3));
            arrayList5.add(arrayList3.get(i3));
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YP = new ChaveMataMata(null, 30, this.b(), 1, blArray, this, 4001);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YP, arrayList5, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void g(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        if (this.playoffAtivo) {
            this.oitavas(arrayList);
            return;
        }
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 4001);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        GerenciadorJogo.SR.mj().zo().addAll(arrayList2);
        GerenciadorJogo.SR.mj().b(arrayList2, 0);
        for (n2 = 10; n2 <= 14; ++n2) {
            arrayList3.add(this.YS.get(n2));
        }
        arrayList3.addAll(arrayList);
        for (n2 = 15; n2 <= 18; ++n2) {
            arrayList4.add(this.YS.get(n2));
        }
        Collections.shuffle(arrayList3);
        Collections.shuffle(arrayList4);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YQ = new ChaveMataMata(null, 24, this.b(), 1, blArray, this, 4002);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YQ, arrayList5, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void h(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 4002);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (n3 = 0; n3 <= 9; ++n3) {
            arrayList3.add(arrayList2.get(n3));
        }
        Collections.shuffle(arrayList3);
        for (n3 = 10; n3 <= 11; ++n3) {
            arrayList4.add(arrayList2.get(n3));
        }
        ArrayList arrayList5 = new ArrayList();
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        GerenciadorJogo.SR.aK().b(arrayList5, 0);
        GerenciadorJogo.SR.aK().aj(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (n2 = 0; n2 <= 9; ++n2) {
            arrayList6.add(arrayList.get(n2));
        }
        for (n2 = 2; n2 <= 3; ++n2) {
            arrayList6.add(this.YS.get(n2));
        }
        Collections.shuffle(arrayList6);
        for (n2 = 4; n2 <= 9; ++n2) {
            arrayList7.add(this.YS.get(n2));
        }
        for (n2 = 10; n2 <= 11; ++n2) {
            arrayList7.add(arrayList.get(n2));
        }
        Collections.shuffle(arrayList7);
        arrayList8.addAll(arrayList6);
        arrayList8.addAll(arrayList7);
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YR = new ChaveMataMata(null, 20, this.b(), 1, blArray, this, 4003);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YR, arrayList8, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void j(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 4003);
        }
        GerenciadorJogo.SR.aK().zo().addAll(arrayList2);
        GerenciadorJogo.SR.aK().b(arrayList2, 0);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (n2 = 0; n2 <= 5; ++n2) {
            arrayList3.add(arrayList.get(n2));
        }
        for (n2 = 0; n2 <= 1; ++n2) {
            arrayList3.add(this.YS.get(n2));
        }
        Collections.shuffle(arrayList3);
        for (n2 = 6; n2 <= 9; ++n2) {
            arrayList4.add(arrayList.get(n2));
        }
        Collections.shuffle(arrayList4);
        arrayList5.addAll(arrayList3);
        arrayList5.addAll(arrayList4);
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.ZB = new ChaveMataMata(null, 12, this.b(), 1, blArray, this, 4004);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.ZB, arrayList5, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void k(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 4004);
        }
        GerenciadorJogo.SR.aK().zo().addAll(arrayList2);
        GerenciadorJogo.SR.aK().b(arrayList2, 0);
        this.YD = null;
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < 30 && i3 < this.YF.size(); ++i3) {
            arrayList3.add(this.YF.get(i3));
        }
        arrayList3.addAll(arrayList);
        if (arrayList3.size() != 36) {
            System.out.println("erro fase de liga: " + arrayList3.size() + " clubes");
            return;
        }
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.abm);
        this.YD = LigaSuica.criar(this, arrayList3, 4, this.b(), 4005, this.getNome());
    }

    public void yt() {
        ArrayList arrayList = LigaSuica.classificacao(this.YD);
        this.cabecas = new ArrayList(arrayList.subList(0, 8));
        for (int i2 = 24; i2 < arrayList.size(); ++i2) {
            ((ModeloTime)arrayList.get(i2)).a(this, -1, 4005);
        }
        this.confrontos = new ArrayList();
        ArrayList arrayList2 = LigaSuica.playoff(arrayList, this.confrontos);
        this.playoff = new ChaveMataMata(null, 16, this.b(), 1, new boolean[]{true, true, true, true, true, true, true}, this, 4001);
        this.playoffAtivo = true;
        new GeradorChaveMataMata().a(this.playoff, arrayList2, 0, true, 0, 0, this.b(), false);
    }

    private void oitavas(ArrayList arrayList) {
        this.playoffAtivo = false;
        ArrayList arrayList2 = LigaSuica.perdedores(this.confrontos, arrayList);
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 4001);
        }
        ArrayList arrayList3 = LigaSuica.oitavas(this.cabecas, this.confrontos, arrayList);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.YD.c(new ChaveMataMata(this.YD, arrayList3.size(), this.b(), 0, blArray, this, -1));
        new GeradorChaveMataMata().a(this.YD.yY(), arrayList3, 0, blArray[0], 0, 0, this.b(), false);
    }

    public ArrayList yy() {
        return this.YF;
    }

    public void S(ModeloTime ah2) {
        this.YT = ah2;
    }

    public ArrayList yE() {
        return this.YS;
    }

    public ModeloTime zm() {
        return this.ZC;
    }

    public void T(ModeloTime ah2) {
        this.ZC = ah2;
    }

    public int zn() {
        return this.ZD;
    }

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    public ModeloTime yz() {
        return this.YT;
    }

    public void N(ModeloTime ah2) {
        this.YT = ah2;
    }

    public ChaveMataMata yC() {
        return this.YJ;
    }

    @Override
    public void mr() {
        this.YD.za();
    }

    @Override
    public LigaNacional mF() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        int[] nArray = new int[]{192, 162, 3, 104, 154, 97, 72, 152, 65, 52};
        if ((n2 %= 10) < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
    }

    public static String yD() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        String[] stringArray = new String[]{"Istambul", "S\u00e3o Petersburgo", "Munique", "Roma", "Lisboa", "Londres", "Paris", "Vars\u00f3via", "Madrid", "Zagreb"};
        return stringArray[n2 % 10];
    }

    @Override
    public FaseCompeticao[] mB() {
        if (this.YD == null) {
            return new FaseCompeticao[]{this.YJ, this.YP, this.YQ, this.YR, this.ZB};
        }
        if (this.YD.yZ()) {
            return new FaseCompeticao[]{this.YD.yY()};
        }
        if (this.playoff != null) {
            return new FaseCompeticao[]{this.playoff};
        }
        return new FaseCompeticao[]{this.YD};
    }

    @Override
    public ArrayList mC() {
        FaseCompeticao[] l_0Array;
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        arrayList.add(new ItemFormacao(new FaseCompeticao[]{this.YJ, this.YP, this.YQ, this.YR, this.ZB}, "Fase Preliminar"));
        arrayList.add(new ItemFormacao(new FaseCompeticao[]{this.YD}, "Fase de Liga"));
        if (this.playoff != null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[1];
            l_0Array = l_0Array2;
            l_0Array2[0] = this.playoff;
        } else {
            l_0Array = null;
        }
        arrayList.add(new ItemFormacao(l_0Array, "Playoff"));
        if (this.YD != null) {
            arrayList.add(new ItemFormacao(new FaseCompeticao[]{this.YD.yY()}, "Fase Final"));
        } else {
            arrayList.add(new ItemFormacao(null, "Fase Final"));
        }
        return arrayList;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (l_02 == this.YJ) {
            return ConstantesJogo.pH;
        }
        if (l_02 == this.YP) {
            return ConstantesJogo.pI;
        }
        if (l_02 == this.YQ) {
            return ConstantesJogo.pJ;
        }
        if (l_02 == this.YR) {
            return ConstantesJogo.pK;
        }
        if (l_02 == this.ZB) {
            return ConstantesJogo.pL;
        }
        if (l_02 != null && l_02 == this.playoff) {
            return NOMES_PLAYOFF;
        }
        return ConstantesJogo.pA;
    }

    @Override
    public String[] mA() {
        return new String[]{"tr_ligacampeoes", this.getNome()};
    }

    @Override
    public boolean cz(int n2) {
        return this.YD != null && this.YD.yY() != null && this.YD.yY().zq() == n2;
    }
}

