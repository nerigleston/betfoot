package a;

import a.cd_0;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class cj_0
extends AbstractAction {
    final /* synthetic */ cd_0 DI;

    cj_0(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cd_0.b(this.DI);
    }
}

