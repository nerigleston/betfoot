package comparadores;

import competicoes.LigaPontosCorridos;
import java.util.Comparator;

class ComparadorLigaDivisao
implements Comparator {
    ComparadorLigaDivisao() {
    }

    public int a(LigaPontosCorridos s2, LigaPontosCorridos s3) {
        int n2 = s2.getDivisao();
        int n3 = s3.getDivisao();
        int n4 = s2.ze();
        int n5 = s3.ze();
        if (n2 != n3) {
            return n2 - n3;
        }
        if (n4 != n5) {
            return n4 - n5;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((LigaPontosCorridos)object, (LigaPontosCorridos)object2);
    }
}

