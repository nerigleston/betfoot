package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoGerenciarClube
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    AcaoAtalhoGerenciarClube(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.G(null);
    }
}

