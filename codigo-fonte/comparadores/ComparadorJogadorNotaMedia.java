package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorNotaMedia
implements Comparator {
    ComparadorJogadorNotaMedia() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        double d2;
        double d3 = f2.F();
        if (d3 != (d2 = f3.F())) {
            if (d2 > d3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

