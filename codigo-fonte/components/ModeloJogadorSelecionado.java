package components;

import nucleo.ModeloJogador;

public class ModeloJogadorSelecionado {
    private ModeloJogador U = null;
    private int QW = -1;
    private int dF = 0;

    public ModeloJogador x() {
        return this.U;
    }

    public void a(ModeloJogador f2) {
        this.U = f2;
    }

    public int ut() {
        return this.QW;
    }

    public void dN(int n2) {
        this.QW = n2;
    }

    public int et() {
        return this.dF;
    }

    public void dO(int n2) {
        this.dF = n2;
    }
}

