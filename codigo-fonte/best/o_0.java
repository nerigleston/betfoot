package best;

import best.ad;
import java.util.Comparator;

class o_0
implements Comparator {
    o_0() {
    }

    public int a(ad ad2, ad ad3) {
        String string;
        String string2 = ad2.jF();
        if (!string2.equals(string = ad3.jF())) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ad)object, (ad)object2);
    }
}

