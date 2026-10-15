package a;

import a.gx_0;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class gd_0
extends AbstractAction {
    final /* synthetic */ gx_0 Kg;

    gd_0(gx_0 gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gx_0.d(this.Kg).dispose();
    }
}

