package a;

import a.dn_0;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dr_0
implements ActionListener {
    final /* synthetic */ dn_0 GR;

    dr_0(dn_0 dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.c(dn_0.d(this.GR), false);
        dn_0.a(this.GR).dispose();
    }
}

