package nucleo;

import nucleo.ModeloJogador;
import nucleo.Competicao;
import java.io.Serializable;

public class EntradaArtilheiro
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ModeloJogador U = null;
    private int V = 0;
    private int W = 0;

    public EntradaArtilheiro() {
    }

    public EntradaArtilheiro(Competicao at2, ModeloJogador f2) {
        this.U = f2;
    }

    public EntradaArtilheiro(ModeloJogador f2, int n2, int n3) {
        this.U = f2;
        this.V = n2;
        this.W = n3;
    }

    public ModeloJogador x() {
        return this.U;
    }

    public int y() {
        return this.V;
    }

    public void z() {
        ++this.V;
    }

    public int A() {
        return this.W;
    }

    public void i(int n2) {
        this.W = n2;
    }
}

