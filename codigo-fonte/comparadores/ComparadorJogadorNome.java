package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorNome
implements Comparator {
    ComparadorJogadorNome() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        String string;
        String string2 = f2.getNome();
        if (!string2.equals(string = f3.getNome())) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

