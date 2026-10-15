package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerAtalhoTabelas
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAtalhoTabelas(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.a(this.Iz);
    }
}

