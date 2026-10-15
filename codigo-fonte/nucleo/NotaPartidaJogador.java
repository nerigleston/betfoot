package nucleo;

import nucleo.ModeloPartida;
import motor.GerenciadorJogo;
import java.io.Serializable;

public class NotaPartidaJogador
implements Serializable {
    private static final long serialVersionUID = 1L;
    private double Z = 0.0;
    private int fy = -1;
    private int gx = -1;

    public NotaPartidaJogador() {
    }

    public NotaPartidaJogador(ModeloPartida i2, double d2) {
        this.Z = d2;
        this.fy = GerenciadorJogo.SR.J();
        int n2 = 0;
        while (n2 < GerenciadorJogo.SR.S().size()) {
            if (GerenciadorJogo.SR.S().get(n2) == i2) {
                this.gx = n2;
                break;
            }
            ++n2;
        }
    }

    public double C() {
        return this.Z;
    }

    public void j(double d2) {
        this.Z = d2;
    }

    public int hM() {
        return this.fy;
    }

    public int im() {
        return this.gx;
    }
}

