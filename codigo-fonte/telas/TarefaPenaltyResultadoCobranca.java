package telas;

import telas.PainelAnimacaoPenalty;
import java.util.TimerTask;

class TarefaPenaltyResultadoCobranca
extends TimerTask {
    final /* synthetic */ PainelAnimacaoPenalty JV;

    TarefaPenaltyResultadoCobranca(PainelAnimacaoPenalty gb2) {
        this.JV = gb2;
    }

    @Override
    public void run() {
        PainelAnimacaoPenalty.a(this.JV).cancel();
        PainelAnimacaoPenalty.c(this.JV);
    }
}

