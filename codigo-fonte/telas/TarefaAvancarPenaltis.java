package telas;

import telas.PainelAnimacaoPenaltis;
import java.util.TimerTask;

class TarefaAvancarPenaltis
extends TimerTask {
    final /* synthetic */ PainelAnimacaoPenaltis zT;

    TarefaAvancarPenaltis(PainelAnimacaoPenaltis bg_02) {
        this.zT = bg_02;
    }

    @Override
    public void run() {
        PainelAnimacaoPenaltis.b(this.zT).cancel();
        PainelAnimacaoPenaltis.c(this.zT);
    }
}

