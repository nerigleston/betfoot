package nucleo;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorIdade
implements Comparator {
    ComparadorJogadorIdade() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2 = f2.fi();
        int n3 = f3.fi();
        int n4 = f2.getIdade();
        int n5 = f3.getIdade();
        if (n2 == n3) {
            return n5 - n4;
        }
        return n3 - n2;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

