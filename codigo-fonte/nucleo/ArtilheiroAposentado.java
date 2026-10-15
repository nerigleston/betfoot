package nucleo;

import motor.GerenciadorJogo;
import java.io.Serializable;

public class ArtilheiroAposentado
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int g = 0;
    private int T = 0;
    private String n = null;

    public ArtilheiroAposentado() {
    }

    public ArtilheiroAposentado(String string, int n2, int n3) {
        this.n = string;
        this.g = n2;
        this.T = n3;
        GerenciadorJogo.SR.bJ().add(this);
    }

    public int v() {
        return this.g;
    }

    public void g(int n2) {
        this.g = n2;
    }

    public int w() {
        return this.T;
    }

    public void h(int n2) {
        this.T = n2;
    }

    public String getN() {
        return this.n;
    }

    public void setN(String string) {
        this.n = string;
    }
}

