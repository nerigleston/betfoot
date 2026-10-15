package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorPais
implements Comparator {
    ComparadorJogadorPais() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2;
        int n3 = f2.getPais();
        if (n3 != (n2 = f3.getPais())) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

