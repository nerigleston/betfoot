package components;

import java.io.Serializable;

public class ModeloCoeficientePais
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int Rw;
    private int Rx;
    private boolean Ry = false;

    public ModeloCoeficientePais(String string, int n2, int n3) {
        this.Rw = n2;
        this.Rx = n3;
    }

    public ModeloCoeficientePais(String string, int n2, int n3, boolean bl) {
        this.Rw = n2;
        this.Rx = n3;
        this.Ry = bl;
    }

    public ModeloCoeficientePais() {
    }

    public int uW() {
        return this.Rw;
    }

    public int uX() {
        return this.Rx;
    }

    public boolean uY() {
        return this.Ry;
    }

    public void fE(int n2) {
        this.Rw = n2;
    }
}

