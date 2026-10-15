package nucleo;

import nucleo.LigaNacional;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import java.io.Serializable;

public class RegistroTemporadaTime
implements Serializable {
    private static final long serialVersionUID = 1L;
    private int ae;
    private int bW = -1;
    private int T;
    private int bX;
    private int d;
    private int bY;
    private int bZ;

    public RegistroTemporadaTime() {
    }

    public RegistroTemporadaTime(ModeloTime ah2) {
        this.ae = GerenciadorJogo.SR.H();
        if (ah2 != null) {
            this.bW = ah2.lk();
        }
    }

    public String ck() {
        int n2;
        String string = null;
        if (string == null) {
            n2 = 0;
            while (n2 < GerenciadorJogo.SR.P().size()) {
                if (((ModeloTime)GerenciadorJogo.SR.P().get(n2)).lk() == this.bW) {
                    string = ((ModeloTime)GerenciadorJogo.SR.P().get(n2)).getNome();
                    return string;
                }
                ++n2;
            }
        }
        if (string == null) {
            n2 = 0;
            while (n2 < GerenciadorJogo.SR.aG().size()) {
                if (((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn() != null && ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().lk() == this.bW) {
                    string = ((LigaNacional)GerenciadorJogo.SR.aG().get(n2)).jn().getNome();
                    return string;
                }
                ++n2;
            }
        }
        return string;
    }

    public int H() {
        return this.ae;
    }

    public void k(int n2) {
        this.ae = n2;
    }

    public int w() {
        return this.T;
    }

    public void cl() {
        ++this.T;
    }

    public int cm() {
        return this.bX;
    }

    public void cn() {
        ++this.bX;
    }

    public int co() {
        return this.d;
    }

    public void cp() {
        ++this.d;
    }

    public int cq() {
        return this.bY;
    }

    public void B(int n2) {
        this.bY += n2;
    }

    public int cr() {
        return this.bZ;
    }

    public void cs() {
        ++this.bZ;
    }

    public int ct() {
        return this.bW;
    }

    public void C(int n2) {
        this.bW = n2;
    }
}

