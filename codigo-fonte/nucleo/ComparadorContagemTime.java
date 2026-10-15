package nucleo;

import nucleo.ContagemTime;
import java.util.Comparator;

class ComparadorContagemTime
implements Comparator {
    ComparadorContagemTime() {
    }

    public int a(ContagemTime an2, ContagemTime an3) {
        int n2;
        int n3 = an2.lX();
        if (n3 != (n2 = an3.lX())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ContagemTime)object, (ContagemTime)object2);
    }
}

