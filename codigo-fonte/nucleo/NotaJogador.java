package nucleo;

import nucleo.ModeloJogador;

public class NotaJogador {
    private ModeloJogador U = null;
    private double ab = 0.0;
    private int W = 0;

    public NotaJogador() {
    }

    public NotaJogador(ModeloJogador f2, double d2, int n2) {
        this.U = f2;
        this.ab = d2;
        this.W = n2;
    }

    public ModeloJogador x() {
        return this.U;
    }

    public double F() {
        return this.ab;
    }

    public void c(double d2) {
        this.ab = d2;
    }

    public String cE() {
        if (this.ab > 0.0) {
            if (this.ab == 10.0) {
                return "10";
            }
            return String.format("%.2f", this.ab);
        }
        return "--";
    }

    public int A() {
        return this.W;
    }
}

