package best;

import best.c_0;
import java.util.Comparator;

class au
implements Comparator {
    au() {
    }

    public int a(c_0 c_02, c_0 c_03) {
        int n2 = c_02.y();
        int n3 = c_03.y();
        int n4 = c_02.A();
        int n5 = c_03.A();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((c_0)object, (c_0)object2);
    }
}

