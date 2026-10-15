package h;

import f.s;
import java.util.Comparator;

class c_0
implements Comparator {
    c_0() {
    }

    public int a(s s2, s s3) {
        int n2 = s2.getDivisao();
        int n3 = s3.getDivisao();
        int n4 = s2.ze();
        int n5 = s3.ze();
        if (n2 != n3) {
            return n2 - n3;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((s)object, (s)object2);
    }
}

