package telas;

import telas.PainelPartidaAoVivo2;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoTeclaLinhaAcimaPartida
extends AbstractAction {
    final /* synthetic */ PainelPartidaAoVivo2 Lt;

    AcaoTeclaLinhaAcimaPartida(PainelPartidaAoVivo2 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Lt.dz(1);
    }
}

