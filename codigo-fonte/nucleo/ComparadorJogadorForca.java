package nucleo;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorForca
implements Comparator {
    ComparadorJogadorForca() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2 = f2.fi();
        int n3 = f3.fi();
        int bl = 0;
        int bl2 = 0;
        if (f2.ff().booleanValue()) {
            bl = 1;
        }
        if (f3.ff().booleanValue()) {
            bl2 = 1;
        }
        if (n2 > n3) {
            return -1;
        }
        if (n2 < n3) {
            return 1;
        }
        if (bl > bl2) {
            return -1;
        }
        if (bl < bl2) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

