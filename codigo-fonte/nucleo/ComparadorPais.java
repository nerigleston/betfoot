package nucleo;

import nucleo.DadosPais;
import java.util.Comparator;

class ComparadorPais
implements Comparator {
    ComparadorPais() {
    }

    public int a(DadosPais ad2, DadosPais ad3) {
        String string;
        String string2 = ad2.jF();
        if (!string2.equals(string = ad3.jF())) {
            return string2.compareTo(string);
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((DadosPais)object, (DadosPais)object2);
    }
}

