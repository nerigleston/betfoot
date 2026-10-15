package h;

import best.at;
import java.util.Comparator;

class f_0
implements Comparator {
    f_0() {
    }

    public int a(at at2, at at3) {
        String string;
        String string2 = at2.getNome();
        if (!string2.equals(string = at3.getNome())) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((at)object, (at)object2);
    }
}

