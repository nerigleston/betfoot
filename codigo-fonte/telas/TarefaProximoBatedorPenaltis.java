package telas;

import telas.PainelAnimacaoPenaltis;
import java.util.TimerTask;

class TarefaProximoBatedorPenaltis
extends TimerTask {
    final /* synthetic */ PainelAnimacaoPenaltis zT;

    TarefaProximoBatedorPenaltis(PainelAnimacaoPenaltis bg_02) {
        this.zT = bg_02;
    }

    @Override
    public void run() {
        PainelAnimacaoPenaltis.b(this.zT).cancel();
        this.zT.nL();
    }
}

