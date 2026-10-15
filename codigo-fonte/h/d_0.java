package h;

import best.ah;
import java.util.Comparator;

class d_0
implements Comparator {
    d_0() {
    }

    public int c(ah ah2, ah ah3) {
        int n2 = ah2.getNivel();
        int n3 = ah3.getNivel();
        int n4 = ah2.iS();
        int n5 = ah3.iS();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n5 - n4;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((ah)object, (ah)object2);
    }
}

