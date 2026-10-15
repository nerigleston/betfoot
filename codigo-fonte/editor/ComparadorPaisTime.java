package editor;

import editor.ModeloTabelaTimes;
import modelos.ModeloTime2;
import java.util.Comparator;

class ComparadorPaisTime
implements Comparator {
    ComparadorPaisTime() {
    }

    public int a(ModeloTime2 t2, ModeloTime2 t3) {
        String string = "";
        String string2 = "";
        if (ModeloTabelaTimes.xi() == -1) {
            string = t3.getNomep();
            string2 = t2.getNomep();
        } else {
            string = t2.getNomep();
            string2 = t3.getNomep();
        }
        int n2 = t2.getNivel();
        int n3 = t3.getNivel();
        if (!string.equals(string2)) {
            return string.compareTo(string2);
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

