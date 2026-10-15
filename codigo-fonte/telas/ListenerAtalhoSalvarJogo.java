package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.AbstractAction;

class ListenerAtalhoSalvarJogo
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAtalhoSalvarJogo(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.Iz.ru();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

