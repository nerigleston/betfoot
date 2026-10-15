package telas;

import nucleo.ConstantesJogo;
import components.LinhaJogadorPartidaAoVivo;
import java.util.Comparator;

class ComparadorJogadorPosicaoCampo
implements Comparator {
    ComparadorJogadorPosicaoCampo() {
    }

    public int a(LinhaJogadorPartidaAoVivo i2, LinhaJogadorPartidaAoVivo i3) {
        int n2 = 0;
        int n3 = 0;
        boolean bl = false;
        boolean bl2 = false;
        n2 = ConstantesJogo.sE[i2.fb().fT()][0];
        if (n2 != (n3 = ConstantesJogo.sE[i3.fb().fT()][0])) {
            return n2 - n3;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((LinhaJogadorPartidaAoVivo)object, (LinhaJogadorPartidaAoVivo)object2);
    }
}

