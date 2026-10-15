package h;

import best.F;
import java.util.Comparator;

class n
implements Comparator {
    n() {
    }

    public int a(F f2, F f3) {
        boolean bl;
        boolean bl2 = f2.ft();
        if (bl2 != (bl = f3.ft().booleanValue())) {
            if (bl2) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((F)object, (F)object2);
    }
}

