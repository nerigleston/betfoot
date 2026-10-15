package comparadores;

import nucleo.ModeloJogador;
import java.util.Comparator;

class ComparadorJogadorParaEmprestimo
implements Comparator {
    ComparadorJogadorParaEmprestimo() {
    }

    public int a(ModeloJogador f2, ModeloJogador f3) {
        boolean bl;
        boolean bl2 = f2.fz();
        if (bl2 != (bl = f3.fz().booleanValue())) {
            if (bl2) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloJogador)object, (ModeloJogador)object2);
    }
}

