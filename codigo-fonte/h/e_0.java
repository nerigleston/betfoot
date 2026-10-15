package h;

import best.ah;
import best.n_0;
import java.util.Comparator;

class e_0
implements Comparator {
    e_0() {
    }

    public int c(ah ah2, ah ah3) {
        String string;
        String string2 = n_0.f(ah2.getNome());
        if (!string2.equals(string = n_0.f(ah3.getNome()))) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((ah)object, (ah)object2);
    }
}

