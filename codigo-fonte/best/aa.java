package best;

import best.F;
import java.util.Comparator;

class aa
implements Comparator {
    aa() {
    }

    public int a(F f2, F f3) {
        int n2 = f2.fi();
        int n3 = f3.fi();
        int bl = 0;
        int bl2 = 0;
        if (f2.ff().booleanValue()) {
            bl = 1;
        }
        if (f3.ff().booleanValue()) {
            bl2 = 1;
        }
        if (n2 > n3) {
            return -1;
        }
        if (n2 < n3) {
            return 1;
        }
        if (bl > bl2) {
            return -1;
        }
        if (bl < bl2) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((F)object, (F)object2);
    }
}

