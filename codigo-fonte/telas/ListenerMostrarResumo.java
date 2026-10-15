package telas;

import telas.PainelResumoTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarResumo
implements ActionListener {
    final /* synthetic */ PainelResumoTemporada yJ;

    ListenerMostrarResumo(PainelResumoTemporada al_02) {
        this.yJ = al_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelResumoTemporada.a(this.yJ, true);
    }
}

