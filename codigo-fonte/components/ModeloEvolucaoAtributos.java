package components;

import nucleo.ModeloTime;
import nucleo.Campeonato;

public class ModeloEvolucaoAtributos {
    private ModeloTime cg = null;
    private Campeonato Oi = null;
    private Campeonato Oj = null;
    private int Fp = 1;

    public ModeloEvolucaoAtributos(ModeloTime ah2, Campeonato al2, Campeonato al3, int n2) {
        this.cg = ah2;
        this.Oi = al2;
        this.Oj = al3;
        this.Fp = n2;
    }

    public ModeloTime fg() {
        return this.cg;
    }

    public void n(ModeloTime ah2) {
        this.cg = ah2;
    }

    public Campeonato tj() {
        return this.Oi;
    }

    public void j(Campeonato al2) {
        this.Oi = al2;
    }

    public Campeonato tk() {
        return this.Oj;
    }

    public void k(Campeonato al2) {
        this.Oj = al2;
    }

    public int tl() {
        return this.Fp;
    }

    public void dH(int n2) {
        this.Fp = n2;
    }
}

