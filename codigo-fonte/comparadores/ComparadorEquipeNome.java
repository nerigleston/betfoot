package comparadores;

import nucleo.UtilitariosTexto;
import modelos.ModeloTime2;
import java.util.Comparator;

class ComparadorEquipeNome
implements Comparator {
    ComparadorEquipeNome() {
    }

    public int a(ModeloTime2 t2, ModeloTime2 t3) {
        String string;
        String string2 = UtilitariosTexto.f(t2.getNome());
        if (!string2.equals(string = UtilitariosTexto.f(t3.getNome()))) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ModeloTime2)object, (ModeloTime2)object2);
    }
}

