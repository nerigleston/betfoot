package d;

import d.x_0;
import java.util.Comparator;

class y_0
implements Comparator {
    final /* synthetic */ x_0 Vm;

    y_0(x_0 x_02) {
        this.Vm = x_02;
    }

    public int a(Integer n2, Integer n3) {
        if (n2 != n3) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

