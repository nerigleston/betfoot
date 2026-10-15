package telas;

import telas.PainelCalendarioTime;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoFecharCalendario
extends AbstractAction {
    final /* synthetic */ PainelCalendarioTime vO;

    AcaoFecharCalendario(PainelCalendarioTime l2) {
        this.vO = l2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCalendarioTime.a(this.vO).dispose();
    }
}

