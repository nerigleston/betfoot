package comparadores;

import nucleo.ModeloTime;
import nucleo.UtilitariosTexto;
import java.util.Comparator;

class ComparadorClubeNome
implements Comparator {
    ComparadorClubeNome() {
    }

    public int c(ModeloTime ah2, ModeloTime ah3) {
        String string;
        String string2 = UtilitariosTexto.f(ah2.getNome());
        if (!string2.equals(string = UtilitariosTexto.f(ah3.getNome()))) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((ModeloTime)object, (ModeloTime)object2);
    }
}

