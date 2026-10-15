package telas;

import telas.PainelPartidaAoVivo;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerTeclaVelocidade4
extends AbstractAction {
    final /* synthetic */ PainelPartidaAoVivo Hu;

    ListenerTeclaVelocidade4(PainelPartidaAoVivo dV2) {
        this.Hu = dV2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPartidaAoVivo.a(this.Hu, 4);
    }
}

