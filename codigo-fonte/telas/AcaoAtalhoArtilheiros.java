package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoArtilheiros
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    AcaoAtalhoArtilheiros(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.rk();
    }
}

