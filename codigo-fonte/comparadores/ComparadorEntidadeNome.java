package comparadores;

import nucleo.Competicao;
import java.util.Comparator;

class ComparadorEntidadeNome
implements Comparator {
    ComparadorEntidadeNome() {
    }

    public int a(Competicao at2, Competicao at3) {
        String string;
        String string2 = at2.getNome();
        if (!string2.equals(string = at3.getNome())) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Competicao)object, (Competicao)object2);
    }
}

