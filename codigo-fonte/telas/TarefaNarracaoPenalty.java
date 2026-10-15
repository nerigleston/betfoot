package telas;

import telas.PainelAnimacaoPenalty;
import java.util.TimerTask;

class TarefaNarracaoPenalty
extends TimerTask {
    final /* synthetic */ PainelAnimacaoPenalty JV;

    TarefaNarracaoPenalty(PainelAnimacaoPenalty gb2) {
        this.JV = gb2;
    }

    @Override
    public void run() {
        PainelAnimacaoPenalty.a(this.JV).cancel();
        this.JV.py();
    }
}

