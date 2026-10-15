package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorNumeroCamisa
implements Comparator {
    ComparadorJogadorNumeroCamisa() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2 = f2.fn();
        int n3 = f3.fn();
        int n4 = f2.getPosicao();
        int n5 = f3.getPosicao();
        if (n2 == 0) {
            n2 = 100;
        }
        if (n3 == 0) {
            n3 = 100;
        }
        if (n2 != n3) {
            return n2 - n3;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

