package a;

import a.hk_0;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class hp_0
extends AbstractAction {
    final /* synthetic */ hk_0 Lt;

    hp_0(hk_0 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        hk_0.a(this.Lt);
    }
}

