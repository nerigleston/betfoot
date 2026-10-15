package editor;

import editor.ModeloTabelaJogadores;
import modelos.ModeloJogador2;
import java.util.Comparator;

class ComparadorIdadeJogador
implements Comparator {
    ComparadorIdadeJogador() {
    }

    public int a(ModeloJogador2 g2, ModeloJogador2 g3) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (ModeloTabelaJogadores.xk() == -1) {
            n2 = g2.getIdade();
            n3 = g3.getIdade();
        } else {
            n2 = g3.getIdade();
            n3 = g2.getIdade();
        }
        n4 = g2.getPosicao();
        n5 = g2.getPosicao();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n5 - n4;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador2)object, (ModeloJogador2)object2);
    }
}

