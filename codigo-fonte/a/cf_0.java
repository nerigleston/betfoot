package a;

import a.cd_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cf_0
implements ActionListener {
    final /* synthetic */ cd_0 DI;

    cf_0(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cd_0.g(this.DI);
    }
}

