package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerAtalhoJogosAmistosos
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAtalhoJogosAmistosos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.re();
    }
}

