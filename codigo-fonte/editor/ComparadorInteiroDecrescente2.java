package editor;

import editor.JanelaEditorTabela;
import java.util.Comparator;

class ComparadorInteiroDecrescente2
implements Comparator {
    final /* synthetic */ JanelaEditorTabela Vm;

    ComparadorInteiroDecrescente2(JanelaEditorTabela x_02) {
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

