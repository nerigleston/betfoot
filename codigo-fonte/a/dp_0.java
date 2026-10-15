package a;

import a.dn_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dp_0
implements ActionListener {
    final /* synthetic */ dn_0 GR;

    dp_0(dn_0 dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dn_0.a(this.GR).dispose();
    }
}

