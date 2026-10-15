package components;

import best.Z;
import best.ah;
import best.al;
import best.i_0;
import c.a;

public class ap {
    private int ae;
    private int RN = -1;
    private int V;
    private ah RO = null;
    private ah RP = null;
    private ah RQ = null;
    private String RR = "";
    private al RS = null;
    private boolean Or;
    private Z RT = null;
    private boolean afN = false;

    public ap(i_0 i_02, int n2, int n3) {
        this.RN = n2;
        if (i_02 != null) {
            this.ae = i_02.H();
            this.RO = i_02.ce();
            this.RP = i_02.cf();
            this.RQ = i_02.ch();
            this.RR = i_02.cg();
            this.RS = i_02.ci();
            this.V = i_02.y();
        } else {
            this.RT = a.SR.o(n2);
            this.Or = true;
        }
    }

    public al ci() {
        return this.RS;
    }

    public ah ce() {
        return this.RO;
    }

    public ah cf() {
        return this.RP;
    }

    public String cg() {
        return this.RR;
    }

    public ah ch() {
        return this.RQ;
    }

    public int H() {
        return this.ae;
    }

    public void k(int n2) {
        this.ae = n2;
    }

    public int y() {
        return this.V;
    }

    public void ek(int n2) {
        this.V = n2;
    }

    public boolean tt() {
        return this.Or;
    }

    public void ar(boolean bl) {
        this.Or = bl;
    }

    public int vk() {
        return this.RN;
    }

    public void el(int n2) {
        this.RN = n2;
    }

    public Z vl() {
        return this.RT;
    }

    public void f(Z z2) {
        this.RT = z2;
    }
}

