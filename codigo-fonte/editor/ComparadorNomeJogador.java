package editor;

import editor.ModeloTabelaJogadores;
import modelos.ModeloJogador2;
import java.util.Comparator;

class ComparadorNomeJogador
implements Comparator {
    ComparadorNomeJogador() {
    }

    public int a(ModeloJogador2 g2, ModeloJogador2 g3) {
        String string = "";
        String string2 = "";
        if (ModeloTabelaJogadores.xi() == -1) {
            string = g3.getNome();
            string2 = g2.getNome();
        } else {
            string = g2.getNome();
            string2 = g3.getNome();
        }
        if (!string.equals(string2)) {
            return string.compareTo(string2);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador2)object, (ModeloJogador2)object2);
    }
}

