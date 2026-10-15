package best;

import best.v_0;
import java.io.Serializable;
import java.util.Calendar;

public class B
implements Serializable {
    private static final long serialVersionUID = 1L;
    private v_0 dH = null;
    private Calendar dI = null;
    private int[] dJ = new int[4];

    public v_0 ev() {
        return this.dH;
    }

    public void a(v_0 v_02) {
        this.dH = v_02;
    }

    public Calendar ew() {
        return this.dI;
    }

    public void c(Calendar calendar) {
        this.dI = calendar;
    }

    public void ex() {
        int n2 = 0;
        while (n2 < this.dJ.length) {
            if (this.dJ[n2] > 0) {
                this.dH.f(n2, this.dJ[n2]);
                this.dJ[n2] = 0;
            }
            ++n2;
        }
    }

    public void c(int[] nArray) {
        this.dJ = nArray;
    }
}

