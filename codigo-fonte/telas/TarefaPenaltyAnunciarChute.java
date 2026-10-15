package telas;

import telas.PainelAnimacaoPenalty;
import java.util.TimerTask;

class TarefaPenaltyAnunciarChute
extends TimerTask {
    final /* synthetic */ PainelAnimacaoPenalty JV;

    TarefaPenaltyAnunciarChute(PainelAnimacaoPenalty gb2) {
        this.JV = gb2;
    }

    @Override
    public void run() {
        PainelAnimacaoPenalty.a(this.JV).cancel();
        PainelAnimacaoPenalty.b(this.JV);
    }
}

