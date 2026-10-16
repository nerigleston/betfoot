package nucleo;

import nucleo.ModeloJogador;
import java.util.Random;

public class CandidatoSelecaoCampeonato {
    private ModeloJogador U;
    private double Z;
    private int hq;
    private int hr = new Random().nextInt(100);

    public ModeloJogador x() {
        return this.U;
    }

    public void a(ModeloJogador f2) {
        this.U = f2;
    }

    public double C() {
        return this.Z;
    }

    public void j(double d2) {
        this.Z = d2;
    }

    public int iR() {
        return this.hq;
    }

    public void bi(int n2) {
        this.hq = n2;
    }

    public int iS() {
        return this.hr;
    }
}

