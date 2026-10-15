package a;

import a.bs_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bt_0
implements ActionListener {
    final /* synthetic */ bs_0 Ar;

    bt_0(bs_0 bs_02) {
        this.Ar = bs_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bs_0.a(this.Ar).dispose();
    }
}

