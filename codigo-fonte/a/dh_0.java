package a;

import a.dg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dh_0
implements ActionListener {
    final /* synthetic */ dg_0 EP;

    dh_0(dg_0 dg_02) {
        this.EP = dg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dg_0.a(this.EP).dispose();
    }
}

