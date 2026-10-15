package telas;

import nucleo.Campeonato;
import java.util.Comparator;

class ComparadorReputacaoTecnico
implements Comparator {
    ComparadorReputacaoTecnico() {
    }

    public int b(Campeonato al2, Campeonato al3) {
        int n2;
        int n3 = al2.getReputacao();
        if (n3 != (n2 = al3.getReputacao())) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.b((Campeonato)object, (Campeonato)object2);
    }
}

