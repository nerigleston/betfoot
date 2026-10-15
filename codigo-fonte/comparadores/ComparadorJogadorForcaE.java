package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorForcaE
implements Comparator {
    ComparadorJogadorForcaE() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2 = f2.fi();
        int n3 = f3.fi();
        int n4 = f2.fp();
        int n5 = f3.fp();
        if (n2 > n3) {
            return -1;
        }
        if (n2 < n3) {
            return 1;
        }
        if (n4 > n5) {
            return -1;
        }
        if (n4 < n5) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

