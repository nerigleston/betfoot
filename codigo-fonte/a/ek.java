package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ek
extends AbstractAction {
    final /* synthetic */ eg_0 Iz;

    ek(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.rl();
    }
}

