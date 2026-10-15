package components;

import best.I;
import best.j_0;
import c.a;

public class x_0 {
    private double Z = 0.0;
    private I zz = null;

    public x_0(j_0 j_02) {
        this.Z = j_02.C();
        int n2 = j_02.hM();
        int n3 = j_02.im();
        if (n2 >= 0 && n3 >= 0 && a.SR.m(n2) != null && n3 < a.SR.m(n2).size()) {
            this.zz = (I)a.SR.m(n2).get(n3);
        }
    }

    public double C() {
        return this.Z;
    }

    public void j(double d2) {
        this.Z = d2;
    }

    public I tR() {
        return this.zz;
    }

    public void n(I i2) {
        this.zz = i2;
    }
}

