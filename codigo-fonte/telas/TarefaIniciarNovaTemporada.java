package telas;

import telas.PainelFimTemporada;
import motor.GerenciadorJogo;
import java.util.TimerTask;

class TarefaIniciarNovaTemporada
extends TimerTask {
    final /* synthetic */ PainelFimTemporada DV;

    TarefaIniciarNovaTemporada(PainelFimTemporada cR2) {
        this.DV = cR2;
    }

    @Override
    public void run() {
        PainelFimTemporada.ph().cancel();
        GerenciadorJogo.SR.V();
    }
}

