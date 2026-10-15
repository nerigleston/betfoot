package a;

import a.eg_0;
import best.s_0;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ez_0
extends AbstractAction {
    final /* synthetic */ eg_0 Iz;

    ez_0(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        s_0.a(eg_0.c(this.Iz));
    }
}

