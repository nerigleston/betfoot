package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoCampeoes
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    AcaoAtalhoCampeoes(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.rl();
    }
}

