package nucleo;

import nucleo.NotaJogador;
import java.util.Comparator;

class ComparadorNotaJogador
implements Comparator {
    ComparadorNotaJogador() {
    }

    public int a(NotaJogador x2, NotaJogador x3) {
        double d2 = x2.F();
        double d3 = x3.F();
        int n2 = x2.A();
        int n3 = x3.A();
        if (d2 != d3) {
            return Double.compare(d3, d2);
        }
        if (n2 != n3) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((NotaJogador)object, (NotaJogador)object2);
    }
}

