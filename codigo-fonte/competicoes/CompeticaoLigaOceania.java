package competicoes;

import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorIdioma;
import components.AtributosJogador;
import components.ModeloCoeficientePais;
import est.LoadLigaOptions;
import competicoes.SorteioAdversarios;
import competicoes.LigaPontosCorridos;
import comparadores.ColecaoComparadoresSorteio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoLigaOceania
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YF = new ArrayList();
    private ModeloTime ZA = null;
    private ArrayList YV = new ArrayList();

    public CompeticaoLigaOceania() {
        this.setNome(GerenciadorIdioma.getString("ligaOfc"));
        this.F(4, 5);
        this.yo();
    }

    private void yo() {
        this.YV.clear();
        this.YV.add(new ModeloCoeficientePais("nze", 143, 2));
        this.YV.add(new ModeloCoeficientePais("pap", 148, 1));
        this.YV.add(new ModeloCoeficientePais("ilha s", 93, 1));
        this.YV.add(new ModeloCoeficientePais("taiti", 184, 1));
        this.YV.add(new ModeloCoeficientePais("fiji", 69, 1));
        this.YV.add(new ModeloCoeficientePais("van", 197, 1));
        this.YV.add(new ModeloCoeficientePais("novaCal", 215, 1));
    }

    public void a(int n2, AtributosJogador al2) {
        SorteioAdversarios.a(5, 1, this.YV, null, n2, al2);
    }

    public void yq() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YF.clear();
        this.YD = null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SorteioAdversarios.a(this.YV, this.YF, arrayList2, false);
        if (this.YF.size() < 8) {
            SorteioAdversarios.a(this.YF, this.YV, 8, arrayList2);
        }
        Collections.sort(this.YF, ColecaoComparadoresSorteio.abm);
        ArrayList<ModeloTime> arrayList3 = new ArrayList<ModeloTime>();
        if (this.YF.size() >= 8) {
            LigaPontosCorridos s2;
            int[] nArray = new int[8];
            nArray[1] = 2;
            nArray[2] = 4;
            nArray[3] = 6;
            nArray[4] = 1;
            nArray[5] = 3;
            nArray[6] = 5;
            nArray[7] = 7;
            int[] nArray2 = nArray;
            int n2 = 0;
            while (n2 < nArray2.length) {
                arrayList3.add((ModeloTime)this.YF.get(nArray2[n2]));
                ++n2;
            }
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 8;
            loadLigaOptions.nGrupos = 2;
            loadLigaOptions.numeroTimesMataMata = 2;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.pulaDuasDatas = true;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, arrayList3, 0, null, null, null, 4, null, false, null, true, this);
            s2.setNome(this.getNome());
        } else {
            System.out.println("erro Liga Ofc() " + this.YF.size());
        }
    }

    public ArrayList yy() {
        return this.YF;
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

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"1\u00ba G1", "2\u00ba G2", "1\u00ba G2", "2\u00ba G1"};
        int n2 = 0;
        while (n2 < stringArray.length) {
            arrayList.add(stringArray[n2]);
            ++n2;
        }
        return arrayList;
    }

    @Override
    public void mr() {
        this.YD.za();
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (this.YD.yZ()) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<components.ItemFormacao> arrayList = new ArrayList<components.ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        arrayList.add(new components.ItemFormacao(l_0Array, "Fase de Grupos"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
        arrayList.add(new components.ItemFormacao(l_0Array2, "Fase Final"));
        return arrayList;
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        stringArray[0] = "tr_ligaofc";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

