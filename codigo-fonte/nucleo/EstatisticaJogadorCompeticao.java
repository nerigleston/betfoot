package nucleo;

import nucleo.ModeloJogador;
import nucleo.Competicao;
import java.io.Serializable;

public class EstatisticaJogadorCompeticao
implements Serializable {
    private static final long serialVersionUID = 1L;
    ModeloJogador U = null;
    Competicao Y = null;
    double Z = 0.0;
    double aa = 0.0;
    double ab = 0.0;
    int ac = 0;

    public EstatisticaJogadorCompeticao() {
    }

    public EstatisticaJogadorCompeticao(Competicao at2, ModeloJogador f2) {
        this.Y = at2;
        this.U = f2;
    }

    public ModeloJogador x() {
        return this.U;
    }

    public void a(ModeloJogador f2) {
        this.U = f2;
    }

    public double C() {
        return this.Z;
    }

    public void a(double d2) {
        this.Z += d2;
        this.aa += 1.0;
        this.ab = this.Z / this.aa;
    }

    public double D() {
        return this.aa;
    }

    public int E() {
        return this.ac;
    }

    public void j(int n2) {
        this.ac = n2;
    }

    public double F() {
        return this.ab;
    }
}

