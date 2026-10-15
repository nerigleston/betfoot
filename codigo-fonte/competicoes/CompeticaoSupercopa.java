package competicoes;

import nucleo.LigaNacional;
import nucleo.EnumPaises;
import nucleo.ModeloTime;
import nucleo.ConstantesJogo;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import motor.GerenciadorJogo;
import competicoes.CompeticaoLigaNacional;
import competicoes.GeradorChaveMataMata;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;

public class CompeticaoSupercopa
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata aac = null;
    private ArrayList cE = new ArrayList();
    private int pais;

    public CompeticaoSupercopa() {
    }

    public CompeticaoSupercopa(int n2) {
        this.pais = n2;
        LigaNacional z2 = GerenciadorJogo.SR.o(this.pais);
        this.setNome("Supercopa - " + z2.jf());
        this.F(11, n2);
    }

    public void Ab() {
        ModeloTime ah2 = null;
        ModeloTime ah3 = null;
        LigaNacional z2 = GerenciadorJogo.SR.o(this.pais);
        if (z2 != null && z2.eb() != null && z2.eb().size() > 0) {
            ah2 = ((CompeticaoLigaNacional)z2.eb().get(0)).cv(GerenciadorJogo.SR.H() - 1);
            ModeloTime[] ahArray = z2.bk(GerenciadorJogo.SR.H() - 1);
            if (ahArray != null) {
                ah3 = ah2 != ahArray[0] ? ahArray[0] : ahArray[1];
            }
            this.b(ah2, ah3);
        }
    }

    public void b(ModeloTime ah2, ModeloTime ah3) {
        this.cE.clear();
        this.aac = null;
        boolean[] blArray = new boolean[7];
        if (ah2 != null && ah3 != null) {
            this.cE.add(ah2);
            this.cE.add(ah3);
            this.aac = new ChaveMataMata(null, this.cE.size(), 11, 0, blArray, this, -1);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.aac, this.cE, 0, blArray[0], 0, 0, 11, false);
        }
    }

    @Override
    public void mr() {
        this.aac.z(this);
    }

    public ChaveMataMata zS() {
        return this.aac;
    }

    public int getPais() {
        return this.pais;
    }

    @Override
    public FaseCompeticao[] mB() {
        FaseCompeticao[] l_0Array = new FaseCompeticao[]{this.aac};
        return l_0Array;
    }

    @Override
    public ArrayList mC() {
        return null;
    }

    @Override
    public String[] b(FaseCompeticao l_02) {
        return this.aac.zB();
    }

    @Override
    public String[] mA() {
        String[] stringArray = new String[]{"", ""};
        String string = "tr_supercopa_" + EnumPaises.valueOf("P" + Integer.toString(this.pais)).jA();
        String string2 = "tr_supercopa_generico";
        stringArray[0] = ConstantesJogo.w(string) ? string : string2;
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

