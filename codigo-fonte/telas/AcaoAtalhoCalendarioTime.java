package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoCalendarioTime
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    AcaoAtalhoCalendarioTime(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.ad(false);
    }
}

