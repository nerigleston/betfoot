package comparadores;

import nucleo.ModeloTime;
import java.util.Comparator;

class ComparadorTimeRegiaoGeografica
implements Comparator {
    ComparadorTimeRegiaoGeografica() {
    }

    public int c(ModeloTime ah2, ModeloTime ah3) {
        int n2;
        int n3 = ah2.jW();
        if (n3 != (n2 = ah3.jW())) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((ModeloTime)object, (ModeloTime)object2);
    }
}

