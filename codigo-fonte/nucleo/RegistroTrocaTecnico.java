package nucleo;

import nucleo.ModeloTime;
import nucleo.Campeonato;
import motor.GerenciadorJogo;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;

public class RegistroTrocaTecnico
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Calendar p = Calendar.getInstance();
    private int bW = -1;
    private Campeonato di = null;
    private Campeonato dj = null;
    private int dk = 0;
    transient String dl = null;

    public Campeonato dO() {
        return this.di;
    }

    public void c(Campeonato al2) {
        this.di = al2;
    }

    public Campeonato dP() {
        return this.dj;
    }

    public void d(Campeonato al2) {
        this.dj = al2;
    }

    public int dQ() {
        return this.dk;
    }

    public void M(int n2) {
        this.dk = n2;
    }

    public String f() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        return dateFormat.format(this.a().getTime());
    }

    public int ct() {
        return this.bW;
    }

    public void C(int n2) {
        this.bW = n2;
    }

    public String dR() {
        ModeloTime ah2;
        if (this.dl == null && this.bW >= 0 && (ah2 = GerenciadorJogo.SR.x(this.bW)) != null) {
            this.dl = ah2.getNome();
        }
        return this.dl;
    }

    public Calendar a() {
        return this.p;
    }

    public void b(Calendar calendar) {
        this.p = calendar;
    }
}

