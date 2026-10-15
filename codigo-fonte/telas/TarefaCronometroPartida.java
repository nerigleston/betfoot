package telas;

import telas.PainelPartidaAoVivo2;
import motor.GerenciadorJogo;
import java.util.TimerTask;

class TarefaCronometroPartida
extends TimerTask {
    final /* synthetic */ PainelPartidaAoVivo2 Lt;

    TarefaCronometroPartida(PainelPartidaAoVivo2 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void run() {
        PainelPartidaAoVivo2.ph().cancel();
        GerenciadorJogo.SR.ax();
    }
}

