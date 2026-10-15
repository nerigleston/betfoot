package a;

import a.dn_0;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class do_0
implements ActionListener {
    final /* synthetic */ dn_0 GR;

    do_0(dn_0 dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dn_0.a(this.GR).setCursor(new Cursor(3));
        dn_0.b(this.GR);
    }
}

