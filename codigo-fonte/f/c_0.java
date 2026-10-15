package f;

import best.y_0;
import java.util.Comparator;

class c_0
implements Comparator {
    c_0() {
    }

    public int a(y_0 y_02, y_0 y_03) {
        double d2 = y_02.C();
        double d3 = y_03.C();
        int n2 = y_02.iS();
        int n3 = y_03.iS();
        if (Double.compare(d3, d2) != 0) {
            return Double.compare(d3, d2);
        }
        if (n2 != n3) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((y_0)object, (y_0)object2);
    }
}

