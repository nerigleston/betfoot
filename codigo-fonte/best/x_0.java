package best;

import components.ad_0;
import java.util.Comparator;

class x_0
implements Comparator {
    x_0() {
    }

    public int a(ad_0 ad_02, ad_0 ad_03) {
        int n2 = ad_02.getId();
        int n3 = ad_03.getId();
        int n4 = ad_02.co();
        int n5 = ad_03.co();
        int n6 = ad_02.vE();
        int n7 = ad_03.vE();
        if (n2 != n3) {
            return n2 - n3;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        if (n6 != n7) {
            return n6 - n7;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ad_0)object, (ad_0)object2);
    }
}

