package nucleo;

import nucleo.ModeloTime;

public class ContagemTime {
    private ModeloTime cg = null;
    private int om = 0;

    public ContagemTime() {
    }

    public ContagemTime(ModeloTime ah2, int n2) {
        this.cg = ah2;
        this.om = n2;
    }

    public ModeloTime fg() {
        return this.cg;
    }

    public int lX() {
        return this.om;
    }
}

