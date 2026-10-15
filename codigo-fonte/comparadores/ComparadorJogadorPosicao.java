package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorPosicao
implements Comparator {
    ComparadorJogadorPosicao() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2;
        int n3 = f2.getPosicao();
        if (n3 > (n2 = f3.getPosicao())) {
            return 1;
        }
        if (n3 < n2) {
            return -1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

