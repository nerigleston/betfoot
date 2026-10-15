package comparadores;

import modelos.ModeloTime2;
import java.util.Comparator;

class ComparadorEquipeNivel
implements Comparator {
    ComparadorEquipeNivel() {
    }

    public int a(ModeloTime2 t2, ModeloTime2 t3) {
        int n2;
        int n3 = t2.getNivel();
        if (n3 != (n2 = t3.getNivel())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloTime2)object, (ModeloTime2)object2);
    }
}

