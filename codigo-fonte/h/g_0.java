package h;

import best.F;
import java.util.Comparator;

class g_0
implements Comparator {
    g_0() {
    }

    public int a(F f2, F f3) {
        String string;
        String string2 = f2.getNome();
        if (!string2.equals(string = f3.getNome())) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((F)object, (F)object2);
    }
}

