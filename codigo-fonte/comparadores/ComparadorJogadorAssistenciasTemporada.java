package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorAssistenciasTemporada
implements Comparator {
    ComparadorJogadorAssistenciasTemporada() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        int n2;
        int n3 = f2.gs();
        if (n3 != (n2 = f3.gs())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

