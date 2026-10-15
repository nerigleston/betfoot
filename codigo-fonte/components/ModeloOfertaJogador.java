package components;

import nucleo.ModeloJogador;
import nucleo.ModeloTime;
import motor.GerenciadorJogo;
import java.io.Serializable;

public class ModeloOfertaJogador
implements Serializable {
    private static final long serialVersionUID = 1L;
    private ModeloJogador U = null;
    private long Pm = 0L;
    private ModeloTime Pn = null;
    private boolean Po = false;

    public ModeloOfertaJogador() {
    }

    public ModeloOfertaJogador(ModeloJogador f2, ModeloTime ah2) {
        this.U = f2;
        this.Pn = ah2;
        GerenciadorJogo.SR.bt().add(this);
        long l2 = 366L;
        this.Pm = GerenciadorJogo.SR.bc() + (l2 *= 86400000L);
    }

    public boolean tM() {
        return this.Pm < GerenciadorJogo.SR.bc();
    }

    public boolean tN() {
        boolean bl = false;
        if (this.Pn != null) {
            if (this.Pn.jZ().booleanValue()) {
                if (this.Pn.kw() < 35) {
                    this.U.r(this.Pn);
                    bl = true;
                }
            } else {
                this.U.r(this.Pn);
                bl = true;
            }
        }
        return bl;
    }

    public ModeloJogador x() {
        return this.U;
    }

    public long tO() {
        return this.Pm;
    }

    public ModeloTime tP() {
        return this.Pn;
    }

    public boolean tQ() {
        return this.Po;
    }

    public void au(boolean bl) {
        this.Po = bl;
    }
}

