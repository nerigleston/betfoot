package a;

import a.cd_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cL
implements ActionListener {
    final /* synthetic */ cd_0 DI;

    cL(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cd_0.c(this.DI);
    }
}

