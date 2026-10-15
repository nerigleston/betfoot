package h;

import best.v_0;
import java.util.Comparator;

class i
implements Comparator {
    i() {
    }

    public int a(v_0 v_02, v_0 v_03) {
        int n2;
        int n3 = v_02.dW();
        if (n3 != (n2 = v_03.dW())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((v_0)object, (v_0)object2);
    }
}

