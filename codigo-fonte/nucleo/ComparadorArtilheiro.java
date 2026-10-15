package nucleo;

import nucleo.EntradaArtilheiro;
import java.util.Comparator;

class ComparadorArtilheiro
implements Comparator {
    ComparadorArtilheiro() {
    }

    public int a(EntradaArtilheiro c_02, EntradaArtilheiro c_03) {
        int n2 = c_02.y();
        int n3 = c_03.y();
        int n4 = c_02.A();
        int n5 = c_03.A();
        if (n2 != n3) {
            return n3 - n2;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((EntradaArtilheiro)object, (EntradaArtilheiro)object2);
    }
}

