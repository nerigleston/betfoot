package d;

import d.n_0;
import java.util.Comparator;

class o
implements Comparator {
    final /* synthetic */ n_0 Vh;

    o(n_0 n_02) {
        this.Vh = n_02;
    }

    public int a(Integer n2, Integer n3) {
        if (n2 != n3) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

