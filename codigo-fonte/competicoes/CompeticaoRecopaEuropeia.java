package competicoes;

import nucleo.ModeloTime;
import nucleo.Competicao;
import nucleo.FaseCompeticao;
import nucleo.GerenciadorIdioma;
import motor.GerenciadorJogo;
import competicoes.GeradorChaveMataMata;
import competicoes.ChaveMataMata;
import java.io.Serializable;
import java.util.ArrayList;

public class CompeticaoRecopaEuropeia
extends Competicao
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ChaveMataMata aac = null;
    private ArrayList cE = new ArrayList();

    public CompeticaoRecopaEuropeia() {
        this.setNome(GerenciadorIdioma.getString("recopaE"));
        this.F(8, 0);
    }

    public void zR() {
        this.cE.clear();
        this.aac = null;
        ModeloTime ah2 = null;
        ModeloTime ah3 = null;
        if (GerenciadorJogo.SR.aI() != null) {
            ah2 = GerenciadorJogo.SR.aI().yz();
        }
        if (GerenciadorJogo.SR.aK() != null) {
            ah3 = GerenciadorJogo.SR.aK().yz();
        }
        boolean[] blArray = new boolean[]{true, true, true, true, true, true, true};
        if (ah2 != null && ah3 != null && ah2 != ah3) {
            this.cE.add(ah3);
            this.cE.add(ah2);
            this.aac = new ChaveMataMata(null, this.cE.size(), 8, 0, blArray, this, -1);
            GeradorChaveMataMata g_02 = new GeradorChaveMataMata();
            g_02.a(this.aac, this.cE, 0, true, 0, 0, 8, false);
        }
    }

    @Override
    public void mr() {
        this.aac.z(this);
    }

    public ChaveMataMata zS() {
        return this.aac;
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
        stringArray[0] = "tr_recopaeuropa";
        stringArray[1] = this.getNome();
        return stringArray;
    }
}

