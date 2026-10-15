package nucleo;

import nucleo.LigaNacional;
import java.util.Comparator;

class ComparadorLigaNacional
implements Comparator {
    ComparadorLigaNacional() {
    }

    public int a(LigaNacional z2, LigaNacional z3) {
        int n2 = LigaNacional.b(z2);
        int n3 = LigaNacional.b(z3);
        int n4 = LigaNacional.c(z2);
        int n5 = LigaNacional.c(z3);
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n5 - n4;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((LigaNacional)object, (LigaNacional)object2);
    }
}

