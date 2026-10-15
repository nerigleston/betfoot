package components;

import nucleo.ModeloPartida;
import nucleo.EventoPartida;

public class ItemPartidaAoVivo {
    private ModeloPartida zz;
    private String Pp = "";
    private int Pq = 0;
    private int Pr = 0;
    private EventoPartida Ps = null;
    private boolean Pt = false;
    private int Pu = 0;
    private String gq = null;
    private static Double Pv = 36.0;

    public ModeloPartida tR() {
        return this.zz;
    }

    public void n(ModeloPartida i2) {
        this.zz = i2;
        if (i2.hc().jZ().booleanValue() || i2.hd().jZ().booleanValue()) {
            this.Pt = true;
        }
    }

    public String tS() {
        return this.Pp;
    }

    public void L(String string) {
        this.Pp = string;
    }

    public int tT() {
        return this.Pq;
    }

    public void dJ(int n2) {
        if (n2 == 1) {
            ++this.Pq;
        } else if (n2 == 2) {
            ++this.Pr;
        }
    }

    public int tU() {
        return this.Pr;
    }

    public EventoPartida tV() {
        return this.Ps;
    }

    public void a(EventoPartida a_02) {
        this.Ps = a_02;
    }

    public boolean ei() {
        return this.Pt;
    }

    public int hU() {
        return this.Pu;
    }

    public void tW() {
        if (this.zz != null) {
            this.Pu = this.zz.hU();
        }
    }

    public String ik() {
        return this.gq;
    }

    public void p(String string) {
        if (this.zz != null) {
            this.zz.p(string);
        }
        this.gq = string;
    }

    public static void b(Double d2) {
        Pv = d2;
    }

    public static Double tX() {
        return Pv;
    }
}

