package editor;

import editor.ModeloTabelaTimes;
import modelos.ModeloTime2;
import java.util.Comparator;

class ComparadorNomeTime
implements Comparator {
    ComparadorNomeTime() {
    }

    public int a(ModeloTime2 t2, ModeloTime2 t3) {
        String string = "";
        String string2 = "";
        if (ModeloTabelaTimes.xj() == -1) {
            string = t3.getNome();
            string2 = t2.getNome();
        } else {
            string = t2.getNome();
            string2 = t3.getNome();
        }
        if (!string.equals(string2)) {
            return string.compareTo(string2);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloTime2)object, (ModeloTime2)object2);
    }
}

