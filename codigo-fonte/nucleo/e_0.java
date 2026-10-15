package nucleo;

import nucleo.ModeloJogador;
import java.io.Serializable;

public class e_0
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int dB;
    private int ed;
    private int ee = -1;
    private ModeloJogador ef = null;
    private int eg = 0;
    private static Double eh = 0.0;

    public int en() {
        return this.dB;
    }

    public void T(int n2) {
        this.dB = n2;
    }

    public int eZ() {
        return this.ed;
    }

    public void aa(int n2) {
        this.ed = n2;
    }

    public int fa() {
        return this.ee;
    }

    public void ab(int n2) {
        this.ee = n2;
    }

    public ModeloJogador fb() {
        return this.ef;
    }

    public void h(ModeloJogador f2) {
        this.ef = f2;
    }

    public int fc() {
        return this.eg;
    }

    public void ac(int n2) {
        this.eg = n2;
    }

    public static void a(Double d2) {
        eh = d2;
    }
}

