package telas;

import telas.PainelTaticaPartida;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoConfirmarTaticas
extends AbstractAction {
    final /* synthetic */ PainelTaticaPartida DI;

    AcaoAtalhoConfirmarTaticas(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelTaticaPartida.b(this.DI);
    }
}

