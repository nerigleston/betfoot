package comparadores;

import nucleo.Estadio;
import java.util.Comparator;

class ComparadorEstadioCapacidade
implements Comparator {
    ComparadorEstadioCapacidade() {
    }

    public int a(Estadio v_02, Estadio v_03) {
        int n2;
        int n3 = v_02.dW();
        if (n3 != (n2 = v_03.dW())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Estadio)object, (Estadio)object2);
    }
}

