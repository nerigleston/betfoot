package telas;

import telas.PainelEscolhaBatedorPenalty;
import java.util.TimerTask;

class TarefaTempoEscolhaBatedor
extends TimerTask {
    final /* synthetic */ PainelEscolhaBatedorPenalty JW;

    TarefaTempoEscolhaBatedor(PainelEscolhaBatedorPenalty gh_02) {
        this.JW = gh_02;
    }

    @Override
    public void run() {
        PainelEscolhaBatedorPenalty.rL().cancel();
        PainelEscolhaBatedorPenalty.b(this.JW);
    }
}

