package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorIdioma;
import motor.GerenciadorJogo;
import components.AtributosJogador;
import components.ModeloCoeficientePais;
import components.ModeloRegistroJogador;
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

public class CompeticaoLigaEuropa
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata YP = null;
    private ChaveMataMata YQ = null;
    private LigaPontosCorridos YD = null;
    private ChaveMataMata afT = null;
    private ArrayList YF = new ArrayList();
    private ArrayList YS = new ArrayList();
    private ArrayList ZE = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();
    private ArrayList YW = new ArrayList();
    private ArrayList cabecas = null;
    private ArrayList confrontos = null;
    private ModeloTime ago = null;

    public CompeticaoLigaEuropa() {
        this.setNome(GerenciadorIdioma.getString("ligaE"));
        this.F(6, 0);
        this.yo();
        this.yp();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new ModeloCoeficientePais("ing", 97, 1, true));
        this.YV.add(new ModeloCoeficientePais("esp", 65, 1, true));
        this.YV.add(new ModeloCoeficientePais("ita", 104, 1, true));
        this.YV.add(new ModeloCoeficientePais("ale", 3, 1, true));
        this.YV.add(new ModeloCoeficientePais("fra", 72, 1, true));
        this.YV.add(new ModeloCoeficientePais("por", 154, 1, true));
        this.YV.add(new ModeloCoeficientePais("hol", 85, 1, true));
        this.YV.add(new ModeloCoeficientePais("fra", 72, 1, false));
        this.YV.add(new ModeloCoeficientePais("ing", 97, 1, false));
        this.YV.add(new ModeloCoeficientePais("esp", 65, 1, false));
        this.YV.add(new ModeloCoeficientePais("ita", 104, 1, false));
        this.YV.add(new ModeloCoeficientePais("ale", 3, 1, false));
        this.YV.add(new ModeloCoeficientePais("por", 154, 1, false));
        this.YV.add(new ModeloCoeficientePais("hol", 85, 1, false));
        this.YV.add(new ModeloCoeficientePais("bel", 21, 1, false));
    }

    private void yp() {
        this.YW.clear();
        this.YW.add(new ModeloCoeficientePais("bel", 21, 1, true));
        this.YW.add(new ModeloCoeficientePais("aut", 15, 1, true));
        this.YW.add(new ModeloCoeficientePais("esc", 62, 1, true));
        this.YW.add(new ModeloCoeficientePais("ucr", 193, 1, true));
        this.YW.add(new ModeloCoeficientePais("tur", 192, 1, true));
        this.YW.add(new ModeloCoeficientePais("din", 54, 1, true));
        this.YW.add(new ModeloCoeficientePais("chipre", 44, 1, true));
        this.YW.add(new ModeloCoeficientePais("cze", 159, 1, true));
        this.YW.add(new ModeloCoeficientePais("serv", 171, 1, true));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(0, 2, this.YV, this.YW, n2, al2);
    }

    private void Bd() {
        ((ModeloCoeficientePais)this.YW.get(6)).fE(162);
    }

    public void yq() {
        if (this.YV.size() < 15) {
            this.yo();
        }
        if (GerenciadorJogo.SR.H() == 3) {
            this.Bd();
        }
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YF.clear();
        this.YS.clear();
        this.ZE.clear();
        this.YD = null;
        this.YP = null;
        this.YQ = null;
        ArrayList<ModeloCoeficientePais> arrayList = new ArrayList<ModeloCoeficientePais>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        arrayList2.addAll(GerenciadorJogo.SR.aI().yy());
        arrayList2.addAll(GerenciadorJogo.SR.aI().yE());
        if (GerenciadorJogo.SR.H() > 1 && this.ago != null && !GerenciadorJogo.SR.aI().yy().contains(this.ago) && !GerenciadorJogo.SR.aI().yE().contains(this.ago)) {
            this.YF.add(this.ago);
            arrayList2.add(this.ago);
        } else {
            arrayList.add(new ModeloCoeficientePais("ale", 3, 1));
        }
        if (arrayList.size() > 0) {
            SorteioAdversarios.a(arrayList, this.YF, arrayList2, false);
        }
        SorteioAdversarios.a(this.YV, this.YF, arrayList2, false);
        SorteioAdversarios.a(this.YW, this.YS, arrayList2, false);
        if (this.YF.size() < 16) {
            SorteioAdversarios.a(this.YF, this.YV, 16, arrayList2);
        }
        if (this.YS.size() < 9) {
            SorteioAdversarios.a(this.YS, this.YW, 9, arrayList2);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
    }

    public void aj(ArrayList arrayList) {
        int n2;
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        for (n2 = 0; n2 <= 9; ++n2) {
            arrayList2.add((ModeloTime)arrayList.get(n2));
        }
        for (n2 = 10; n2 <= 11; ++n2) {
            arrayList3.add((ModeloTime)arrayList.get(n2));
        }
        for (n2 = 7; n2 <= 8; ++n2) {
            arrayList3.add((ModeloTime)this.YS.get(n2));
        }
        Collections.shuffle(arrayList2);
        Collections.shuffle(arrayList3);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YP = new ChaveMataMata(null, arrayList4.size(), this.b(), 1, blArray, this, 6001);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YP, arrayList4, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void g(ArrayList arrayList, ArrayList arrayList2) {
        int n2;
        int n3;
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 6001);
        }
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList4 = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList5 = new ArrayList<ModeloTime>();
        ArrayList arrayList6 = new ArrayList();
        GerenciadorJogo.SR.mj().zo().addAll(arrayList2);
        GerenciadorJogo.SR.mj().b(arrayList2, 0);
        for (n3 = 0; n3 <= 6; ++n3) {
            arrayList3.add((ModeloTime)this.YS.get(n3));
        }
        for (n3 = 0; n3 <= 5; ++n3) {
            arrayList3.add((ModeloTime)this.ZE.get(n3));
        }
        arrayList3.addAll(arrayList);
        Collections.shuffle(arrayList3);
        for (n3 = 0; n3 <= 9; ++n3) {
            arrayList4.add((ModeloTime)arrayList3.get(n3));
        }
        for (n3 = 10; n3 <= 19; ++n3) {
            arrayList5.add((ModeloTime)arrayList3.get(n3));
        }
        Random random = new Random();
        components.GrupoSorteioSemMesmoPais[] aqArray = new components.GrupoSorteioSemMesmoPais[10];
        for (n2 = 0; n2 <= 9; ++n2) {
            aqArray[n2] = new components.GrupoSorteioSemMesmoPais();
        }
        for (n2 = 0; n2 <= 9; ++n2) {
            if (random.nextBoolean()) {
                aqArray[n2].e(arrayList4, arrayList5);
                continue;
            }
            aqArray[n2].e(arrayList5, arrayList4);
        }
        for (n2 = 0; n2 <= 9; ++n2) {
            arrayList6.addAll(aqArray[n2].cZ());
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        this.YQ = new ChaveMataMata(null, arrayList6.size(), this.b(), 1, blArray, this, 6002);
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YQ, arrayList6, 0, blArray[0], 0, 0, this.b(), false);
    }

    public void m(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 6004);
        }
        GerenciadorJogo.SR.mj().zo().addAll(arrayList2);
        GerenciadorJogo.SR.mj().b(arrayList2, 0);
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        for (int i3 = 6; i3 <= 15; ++i3) {
            arrayList3.add((ModeloTime)this.ZE.get(i3));
        }
        arrayList3.addAll(arrayList);
        arrayList3.addAll(this.YF);
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.abm);
        if (arrayList3.size() >= 36) {
            ArrayList arrayList4 = new ArrayList(arrayList3.subList(0, 36));
            this.YD = LigaSuica.criar(this, arrayList4, 4, this.b(), 6005, this.getNome());
        } else {
            System.out.println("erro fase de liga " + this.getNome() + ": " + arrayList3.size() + " clubes");
        }
    }

    public void b(ArrayList arrayList, int n2) {
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            if (!((ModeloTime)arrayList.get(i2)).jZ().booleanValue()) continue;
            if (n2 == 0) {
                new ModeloRegistroJogador(((ModeloTime)arrayList.get(i2)).ka(), 30, 85, "", "");
                continue;
            }
            new ModeloRegistroJogador(((ModeloTime)arrayList.get(i2)).ka(), 31, 86, "", "");
        }
    }

    public void Be() {
        ArrayList arrayList = LigaSuica.classificacao(this.YD);
        this.cabecas = new ArrayList(arrayList.subList(0, 8));
        for (int i2 = 24; i2 < arrayList.size(); ++i2) {
            ((ModeloTime)arrayList.get(i2)).a(this, -1, 6005);
        }
        this.confrontos = new ArrayList();
        ArrayList arrayList2 = LigaSuica.playoff(arrayList, this.confrontos);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.YD.c(new ChaveMataMata(this.YD, arrayList2.size(), this.b(), 1, blArray, this, 6006));
        new GeradorChaveMataMata().a(this.YD.yY(), arrayList2, 0, true, 0, 0, this.b(), false);
    }

    public void l(ArrayList arrayList, ArrayList arrayList2) {
        for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
            ((ModeloTime)arrayList2.get(i2)).a(this, -1, 6006);
        }
        ArrayList arrayList3 = LigaSuica.oitavas(this.cabecas, this.confrontos, arrayList);
        boolean[] blArray = new boolean[]{true, true, true, false, false, false, false};
        this.afT = new ChaveMataMata(null, arrayList3.size(), this.b(), 0, blArray, this, -1);
        new GeradorChaveMataMata().a(this.afT, arrayList3, 0, true, 0, 0, this.b(), false);
    }

    public ArrayList yy() {
        return this.YF;
    }

    public ArrayList yE() {
        return this.YS;
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
        this.YD.f(this.afT);
    }

    @Override
    public LigaNacional mF() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        int[] nArray = new int[]{152, 65, 52, 31, 21, 154, 3, 72, 162, 97};
        if ((n2 %= 10) < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
    }

    public static String yD() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        String string = "";
        String[] stringArray = new String[]{"Gdansk", "Sevilla", "Zagreb", "Sofia", "Bruxelas", "Porto", "Frankfurt", "Lyon", "Moscou", "Liverpool"};
        string = stringArray[n2 %= 10];
        return string;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD == null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YP, this.YQ};
            l_0Array = l_0Array2;
        } else if (this.YD.yY() != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD.yY(), this.afT};
            l_0Array = l_0Array3;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YP, this.YQ};
        arrayList.add(new ItemFormacao(l_0Array, "Fase Preliminar"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array2, "Fase de Liga"));
        if (this.YD != null && this.YD.yY() != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD.yY(), this.afT};
            arrayList.add(new ItemFormacao(l_0Array3, "Fase Final"));
        } else {
            arrayList.add(new ItemFormacao(null, "Fase Final"));
        }
        return arrayList;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (l_02 == this.YP) {
            return ConstantesJogo.pN;
        }
        if (l_02 == this.YQ) {
            return ConstantesJogo.pO;
        }
        if (this.YD != null && l_02 == this.YD.yY()) {
            return ConstantesJogo.abY;
        }
        return ConstantesJogo.pA;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_ligaeuropa";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public ArrayList zo() {
        return this.ZE;
    }

    @Override
    public boolean cz(int n2) {
        return this.afT != null && this.afT.zq() == n2;
    }

    public void ab(ModeloTime ah2) {
        this.ago = ah2;
    }

    public ModeloTime BA() {
        return this.ago;
    }
}

