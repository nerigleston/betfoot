package editor;

import editor.ModeloTabelaTimes;
import modelos.ModeloTime2;
import java.util.Comparator;

class ComparadorNivelTime
implements Comparator {
    ComparadorNivelTime() {
    }

    public int a(ModeloTime2 t2, ModeloTime2 t3) {
        int n2 = 0;
        int n3 = 0;
        if (ModeloTabelaTimes.vG() == 0) {
            n2 = t2.getNivel();
            n3 = t3.getNivel();
        } else {
            n2 = t3.getNivel();
            n3 = t2.getNivel();
        }
        if (n2 != n3) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloTime2)object, (ModeloTime2)object2);
    }
}

