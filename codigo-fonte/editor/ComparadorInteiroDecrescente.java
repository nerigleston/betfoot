package editor;

import editor.JanelaEditorBetfoot;
import java.util.Comparator;

class ComparadorInteiroDecrescente
implements Comparator {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ComparadorInteiroDecrescente(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
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

