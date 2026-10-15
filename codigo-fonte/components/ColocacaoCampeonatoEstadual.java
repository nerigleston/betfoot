package components;

import nucleo.ModeloTime;
import java.io.Serializable;

public class ColocacaoCampeonatoEstadual
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int d;
    private ModeloTime SC = null;
    private int c;

    public ColocacaoCampeonatoEstadual() {
    }

    public ColocacaoCampeonatoEstadual(int n2, int n3, ModeloTime ah2, int n4) {
        this.id = n2;
        this.d = n3;
        this.SC = ah2;
        this.c = n4;
    }

    public int getEstado() {
        return this.id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int n2) {
        this.id = n2;
    }

    public int co() {
        return this.d;
    }

    public void dT(int n2) {
        this.d = n2;
    }

    public ModeloTime vD() {
        return this.SC;
    }

    public void J(ModeloTime ah2) {
        this.SC = ah2;
    }

    public int vE() {
        return this.c;
    }

    public void er(int n2) {
        this.c = n2;
    }
}

