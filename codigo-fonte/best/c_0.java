package best;

import best.F;
import best.at;
import java.io.Serializable;

public class c_0
implements Serializable {
    private static final long serialVersionUID = 1L;
    private F U = null;
    private int V = 0;
    private int W = 0;

    public c_0() {
    }

    public c_0(at at2, F f2) {
        this.U = f2;
    }

    public c_0(F f2, int n2, int n3) {
        this.U = f2;
        this.V = n2;
        this.W = n3;
    }

    public F x() {
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

