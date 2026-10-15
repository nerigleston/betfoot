package a;

import a.cd_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cM
implements ActionListener {
    final /* synthetic */ cd_0 DI;

    cM(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cd_0.d(this.DI);
    }
}

