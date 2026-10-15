package h;

import best.F;
import java.util.Comparator;

class p_0
implements Comparator {
    p_0() {
    }

    public int a(F f2, F f3) {
        int n2;
        int n3 = f2.gN();
        if (n3 != (n2 = f3.gN())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((F)object, (F)object2);
    }
}

