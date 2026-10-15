package editor;

import editor.ModeloTabelaJogadores;
import modelos.ModeloJogador2;
import java.util.Comparator;

class ComparadorPosicaoJogador
implements Comparator {
    ComparadorPosicaoJogador() {
    }

    public int a(ModeloJogador2 g2, ModeloJogador2 g3) {
        int n2 = 0;
        int n3 = 0;
        if (ModeloTabelaJogadores.vG() == 0) {
            n2 = g2.getPosicao();
            n3 = g3.getPosicao();
        } else {
            n2 = g3.getPosicao();
            n3 = g2.getPosicao();
        }
        if (n2 != n3) {
            return n3 - n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador2)object, (ModeloJogador2)object2);
    }
}

