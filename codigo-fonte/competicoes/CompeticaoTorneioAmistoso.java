package competicoes;

import nucleo.Competicao;
import nucleo.FaseCompeticao;
import components.ItemFormacao;
import est.LoadLigaOptions;
import competicoes.LigaPontosCorridos;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class CompeticaoTorneioAmistoso
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private LigaPontosCorridos YD = null;
    private String agn = "";

    public CompeticaoTorneioAmistoso() {
        this.F(15, 0);
        this.setNome("Torneio Amistoso");
    }

    public void xZ() {
        this.YD = null;
    }

    public void a(ArrayList arrayList, int n2, String string, String string2, boolean bl) {
        LigaPontosCorridos s2;
        this.setNome(string);
        this.agn = string2;
        int n3 = 1;
        if (n2 == 0) {
            n3 = 2;
        }
        LoadLigaOptions loadLigaOptions = new LoadLigaOptions();
        loadLigaOptions.nTimes = arrayList.size();
        loadLigaOptions.nGrupos = n3;
        loadLigaOptions.numeroTimesMataMata = 2;
        if (n2 == 2) {
            loadLigaOptions.numeroTimesMataMata = 0;
        }
        loadLigaOptions.doisTurnos = false;
        boolean[] blArray = new boolean[7];
        loadLigaOptions.duasVoltasMataMata = blArray;
        if (bl) {
            Collections.shuffle(arrayList);
        }
        this.YD = s2 = new LigaPontosCorridos(loadLigaOptions, arrayList, 0, null, null, null, 15, null, false, null, true, this);
        s2.setNome(string);
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
        ArrayList<ItemFormacao> arrayList = new ArrayList<ItemFormacao>();
        if (this.YD.yX() > 0) {
            String string = "Primeira Fase";
            if (this.YD.yQ().size() > 0) {
                string = "Fase de Grupos";
            }
            FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.YD};
            arrayList.add(new ItemFormacao(l_0Array, string));
            FaseCompeticao[] l_0Array2 = new FaseCompeticao[]{this.YD.yY()};
            arrayList.add(new ItemFormacao(l_0Array2, "Fase Final"));
            return arrayList;
        }
        return null;
    }

    public String Bt() {
        return this.agn;
    }

    @Override
    public void mr() {
        this.YD.za();
    }
}

