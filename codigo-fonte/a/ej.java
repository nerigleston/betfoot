package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ej
extends AbstractAction {
    final /* synthetic */ eg_0 Iz;

    ej(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.rk();
    }
}

