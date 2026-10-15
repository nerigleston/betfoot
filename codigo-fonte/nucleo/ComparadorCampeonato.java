package nucleo;

import nucleo.Campeonato;
import java.util.Comparator;

class ComparadorCampeonato
implements Comparator {
    ComparadorCampeonato() {
    }

    public int b(Campeonato al2, Campeonato al3) {
        int n2 = al2.lI();
        int n3 = al3.lI();
        int n4 = al2.lJ();
        int n5 = al3.lJ();
        int n6 = al2.A();
        int n7 = al3.A();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n5 - n4;
        }
        if (n6 != n7) {
            return n6 - n7;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((Campeonato)object, (Campeonato)object2);
    }
}

