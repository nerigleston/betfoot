package competicoes;

import nucleo.ListaTimes;
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
import est.LoadLigaOptions;
import competicoes.SorteioAdversarios;
import competicoes.GeradorChaveMataMata;
import competicoes.LigaPontosCorridos;
import competicoes.ChaveMataMata;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoSulAmericana
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata YJ = null;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ArrayList YS = new ArrayList();
    private ArrayList aao = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();
    private ArrayList YW = new ArrayList();

    public CompeticaoSulAmericana() {
        this.setNome(GerenciadorIdioma.getString("csa"));
        this.F(6, 1);
        this.yo();
        this.yp();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new ModeloCoeficientePais("bra", 29, 3));
        this.YV.add(new ModeloCoeficientePais("bra", 29, 3));
        this.YV.add(new ModeloCoeficientePais("arg", 11, 6));
    }

    private void yp() {
        this.YW.clear();
        this.YW.add(new ModeloCoeficientePais("bol", 26, 4));
        this.YW.add(new ModeloCoeficientePais("chil", 42, 4));
        this.YW.add(new ModeloCoeficientePais("col", 46, 4));
        this.YW.add(new ModeloCoeficientePais("equ", 60, 4));
        this.YW.add(new ModeloCoeficientePais("par", 150, 4));
        this.YW.add(new ModeloCoeficientePais("per", 151, 4));
        this.YW.add(new ModeloCoeficientePais("uru", 195, 4));
        this.YW.add(new ModeloCoeficientePais("vez", 198, 4));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(1, 2, this.YV, this.YW, n2, al2);
    }

    public void yq() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.YJ = null;
        this.YF.clear();
        this.YS.clear();
        this.aao.clear();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(GerenciadorJogo.SR.aF().yy());
        arrayList.addAll(GerenciadorJogo.SR.aF().yE());
        SorteioAdversarios.a(this.YV, this.YF, arrayList, false);
        SorteioAdversarios.a(this.YW, this.YS, arrayList, false);
        if (this.YF.size() < 12) {
            SorteioAdversarios.a(this.YF, this.YV, 12, arrayList);
        }
        if (this.YF.size() < 12) {
            SorteioAdversarios.a(this.YF, this.YV, 12, arrayList);
        }
        if (this.YS.size() < 32) {
            SorteioAdversarios.a(this.YS, this.YW, 32, arrayList);
        }
        if (this.YS.size() < 32) {
            SorteioAdversarios.a(this.YS, this.YV, 32, arrayList);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        ArrayList arrayList2 = new ArrayList();
        if (this.YS.size() == 32) {
            int n2 = 0;
            while (n2 <= 7) {
                arrayList2.addAll(this.b(this.YS, n2, 4));
                ++n2;
            }
        }
        if (arrayList2.size() == 32 && this.YF.size() == 12) {
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            boolean[] blArray2 = blArray;
            this.YJ = new ChaveMataMata(null, arrayList2.size(), 6, 1, blArray2, this, 6100);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.YJ, arrayList2, 0, true, 0, 0, 6, false);
        } else {
            System.out.println("erro sul americana size:" + this.YS.size() + " " + this.YF.size() + " " + arrayList2.size());
        }
    }

    public void o(ArrayList arrayList, ArrayList arrayList2) {
        int n2 = 0;
        while (n2 < arrayList2.size()) {
            ((ModeloTime)arrayList2.get(n2)).a(this, -1, 6100);
            ++n2;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.aao);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(this.YF);
        Collections.sort(arrayList3, ColecaoComparadoresSorteio.abm);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        arrayList4.addAll(this.b(arrayList3, 0, 8));
        arrayList5.addAll(this.b(arrayList3, 1, 8));
        arrayList6.addAll(this.b(arrayList3, 2, 8));
        arrayList7.addAll(this.b(arrayList3, 3, 8));
        components.GrupoSorteioSemMesmoPais[] aqArray = new components.GrupoSorteioSemMesmoPais[8];
        int n3 = 0;
        while (n3 <= 7) {
            aqArray[n3] = new components.GrupoSorteioSemMesmoPais();
            ++n3;
        }
        n3 = 0;
        while (n3 <= 7) {
            aqArray[n3].a(arrayList4, arrayList5, arrayList6, arrayList7);
            ++n3;
        }
        aqArray[0].a(aqArray);
        ArrayList arrayList8 = new ArrayList();
        int n4 = 0;
        while (n4 <= 7) {
            arrayList8.addAll(aqArray[n4].cZ());
            ++n4;
        }
        if (arrayList8.size() == 32) {
            boolean[] blArray = new boolean[7];
            blArray[0] = true;
            blArray[1] = true;
            blArray[2] = true;
            boolean[] blArray2 = blArray;
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 32;
            loadLigaOptions.nGrupos = 8;
            loadLigaOptions.numeroTimesMataMata = 1;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = false;
            loadLigaOptions.duasVoltasMataMata = blArray2;
            LigaPontosCorridos s2 = new LigaPontosCorridos(loadLigaOptions, arrayList8, 0, null, null, null, 6, null, false, null, true, this);
            s2.fb(6105);
            this.YD = s2;
            s2.setNome(this.getNome());
        }
    }

    public void yt() {
        ArrayList<ModeloTime> arrayList = new ArrayList<ModeloTime>();
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int n2 = 0;
        while (n2 < this.YD.yQ().size()) {
            arrayList.add((ModeloTime)((ListaTimes)this.YD.yQ().get(n2)).gR().get(0));
            ++n2;
        }
        n2 = 0;
        while (n2 < GerenciadorJogo.SR.aF().yd().yQ().size()) {
            arrayList2.add((ModeloTime)((ListaTimes)GerenciadorJogo.SR.aF().yd().yQ().get(n2)).gR().get(2));
            ++n2;
        }
        Collections.shuffle(arrayList);
        Collections.shuffle(arrayList2);
        components.GrupoSorteioSemMesmoPais[] aqArray = new components.GrupoSorteioSemMesmoPais[8];
        int n3 = 0;
        while (n3 <= 7) {
            aqArray[n3] = new components.GrupoSorteioSemMesmoPais();
            ++n3;
        }
        n3 = 0;
        while (n3 <= 7) {
            aqArray[n3].f(arrayList, arrayList2);
            ++n3;
        }
        n3 = 0;
        while (n3 <= 7) {
            arrayList4.addAll(aqArray[n3].cZ());
            ++n3;
        }
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        boolean[] blArray2 = blArray;
        this.YD.c(new ChaveMataMata(this.YD, arrayList4.size(), this.b(), 0, blArray2, this, -1));
        GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
        g_02.a(this.YD.yY(), arrayList4, 0, blArray2[0], 0, 0, this.b(), false);
    }

    private ArrayList b(ArrayList arrayList, int n2, int n3) {
        ArrayList<ModeloTime> arrayList2 = new ArrayList<ModeloTime>();
        int n4 = n2 * n3;
        int n5 = n4 + (n3 - 1);
        int n6 = n4;
        while (n6 <= n5) {
            arrayList2.add((ModeloTime)arrayList.get(n6));
            ++n6;
        }
        Collections.shuffle(arrayList2);
        return arrayList2;
    }

    public ModeloTime yz() {
        return this.ZA;
    }

    public void N(ModeloTime ah2) {
        this.ZA = ah2;
    }

    @Override
    public void mr() {
        this.YD.za();
    }

    @Override
    public LigaNacional mF() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        int[] nArray = new int[]{11, 29, 150, 42, 46, 151, 195, 26, 198, 60};
        if ((n2 %= 10) < nArray.length) {
            return GerenciadorJogo.SR.s(nArray[n2]);
        }
        return null;
    }

    public static String yD() {
        int n2 = GerenciadorJogo.SR.H() - 1;
        String string = "";
        String[] stringArray = new String[]{"Assun\u00e7\u00e3o", "Lima", "S\u00e3o Paulo", "Caracas", "Quito", "Medell\u00edn", "La Paz", "Montevid\u00e9u", "Santiago", "C\u00f3rdoba"};
        string = stringArray[n2 %= 10];
        return string;
    }

    public void c(ArrayList arrayList, int n2) {
        int n3 = 0;
        while (n3 < arrayList.size()) {
            if (((ModeloTime)arrayList.get(n3)).jZ().booleanValue()) {
                if (n2 == 0) {
                    new ModeloRegistroJogador(((ModeloTime)arrayList.get(n3)).ka(), 32, 87, "", "");
                } else {
                    new ModeloRegistroJogador(((ModeloTime)arrayList.get(n3)).ka(), 33, 88, "", "");
                }
            }
            ++n3;
        }
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD == null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YJ};
            l_0Array = l_0Array2;
        } else if (this.YD.yZ()) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD.yY()};
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
        if (this.YD != null) {
            FaseCompeticao[] l_0Array3 = new FaseCompeticao[]{this.YD.yY()};
            arrayList.add(new ItemFormacao(l_0Array3, "Fase Final"));
        } else {
            arrayList.add(new ItemFormacao(null, "Fase Final"));
        }
        return arrayList;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        if (l_02 == this.YJ) {
            return ConstantesJogo.pM;
        }
        return ConstantesJogo.pA;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_sulamericana";
        stringArray[1] = this.getNome();
        return stringArray;
    }

    public ArrayList Aa() {
        return this.aao;
    }

    @Override
    public boolean cz(int n2) {
        return this.YD != null && this.YD.yY() != null && this.YD.yY().zq() == n2;
    }
}

