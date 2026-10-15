package nucleo;

import nucleo.Estadio;
import java.io.Serializable;
import java.util.Calendar;

public class ObraEstadioPendente
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Estadio dH = null;
    private Calendar dI = null;
    private int[] dJ = new int[4];

    public Estadio ev() {
        return this.dH;
    }

    public void a(Estadio v_02) {
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

