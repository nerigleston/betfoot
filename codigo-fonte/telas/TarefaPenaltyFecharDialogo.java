package telas;

import telas.PainelAnimacaoPenalty;
import java.util.TimerTask;

class TarefaPenaltyFecharDialogo
extends TimerTask {
    final /* synthetic */ PainelAnimacaoPenalty JV;

    TarefaPenaltyFecharDialogo(PainelAnimacaoPenalty gb2) {
        this.JV = gb2;
    }

    @Override
    public void run() {
        PainelAnimacaoPenalty.a(this.JV).cancel();
        PainelAnimacaoPenalty.d(this.JV);
    }
}

