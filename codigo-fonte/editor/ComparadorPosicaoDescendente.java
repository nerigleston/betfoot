package editor;

import modelos.ModeloJogador2;
import java.util.Comparator;

class ComparadorPosicaoDescendente
implements Comparator {
    ComparadorPosicaoDescendente() {
    }

    public int a(ModeloJogador2 g2, ModeloJogador2 g3) {
        int n2;
        int n3 = g2.getPosicao();
        if (n3 != (n2 = g3.getPosicao())) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador2)object, (ModeloJogador2)object2);
    }
}

