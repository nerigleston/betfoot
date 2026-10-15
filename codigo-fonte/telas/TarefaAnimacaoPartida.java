package telas;

import telas.PainelTaticaPartida;
import java.util.TimerTask;

class TarefaAnimacaoPartida
extends TimerTask {
    final /* synthetic */ PainelTaticaPartida DI;

    TarefaAnimacaoPartida(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void run() {
        PainelTaticaPartida.ph().cancel();
        PainelTaticaPartida.a(this.DI);
    }
}

