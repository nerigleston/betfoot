package competicoes;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.LigaPontosCorridos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoEliminatoriasOceania
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private ArrayList YE = new ArrayList();
    private ArrayList YF = new ArrayList();
    private ModeloTime agf = null;

    public CompeticaoEliminatoriasOceania() {
        this.F(9, 1);
    }

    public void xZ() {
        if (this.YD != null) {
            this.YD.aN(true);
        }
        this.YD = null;
        this.agf = null;
        this.YE.clear();
        this.YF.clear();
    }

    public void ya() {
        this.YE.clear();
        this.YF.clear();
        int n2 = 10;
        LigaNacional.a(false, 1, n2, this.YE, true, null);
        if (this.YE.size() == 10) {
            LigaPontosCorridos s2;
            int n3 = 0;
            while (n3 < this.YE.size()) {
                this.YF.add(((LigaNacional)this.YE.get(n3)).jo());
                ((LigaNacional)this.YE.get(n3)).z(true);
                ++n3;
            }
            Collections.shuffle(this.YF);
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 10;
            loadLigaOptions.nGrupos = 0;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.jogosDentroGrupo = true;
            loadLigaOptions.var0 = 9100;
            this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, this.YF, 0, null, null, null, 9, null, false, null, true, this);
            s2.setNome(this.getNome());
        } else if (this.YE.size() == 9) {
            LigaPontosCorridos s3;
            int n4 = 0;
            while (n4 < this.YE.size()) {
                this.YF.add(((LigaNacional)this.YE.get(n4)).jo());
                ((LigaNacional)this.YE.get(n4)).z(true);
                ++n4;
            }
            Collections.shuffle(this.YF);
            LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
            loadLigaOptions.nTimes = 9;
            loadLigaOptions.nGrupos = 0;
            loadLigaOptions.doisTurnos = true;
            loadLigaOptions.jogosDentroGrupo = true;
            loadLigaOptions.var0 = 9100;
            this.YD = s3 = new LigaPontosCorridos(loadLigaOptions, this.YF, 0, null, null, null, 9, null, false, null, true, this);
            s3.setNome(this.getNome());
        }
        GerenciadorJogo.afQ.L(this.YF);
    }

    public void Bm() {
        int n2 = 0;
        while (n2 <= 5) {
            GerenciadorJogo.SR.aY().a(this, GerenciadorJogo.SR.s(((ModeloTime)this.YD.yK().get(n2)).getPais()));
            ++n2;
        }
        this.agf = (ModeloTime)this.YD.yK().get(6);
    }

    public static ArrayList yc() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = new String[]{"5\u00ba A. Sul", "1\u00ba Oceania"};
        int n2 = 0;
        while (n2 < stringArray.length) {
            arrayList.add(stringArray[n2]);
            ++n2;
        }
        return arrayList;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        if (GerenciadorJogo.SR.bQ().Bo() != null) {
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{GerenciadorJogo.SR.bQ().Bo()};
            l_0Array = l_0Array2;
        }
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
        arrayList.add(new ItemFormacao(l_0Array, "Fase de Grupos"));
        FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{GerenciadorJogo.SR.bQ().Bo()};
        arrayList.add(new ItemFormacao(l_0Array2, "Torneio Repescagem"));
        return arrayList;
    }

    public LigaPontosCorridos yd() {
        return this.YD;
    }

    public ModeloTime Br() {
        return this.agf;
    }
}

