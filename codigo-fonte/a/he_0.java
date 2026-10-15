package a;

import a.hc_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class he_0
implements ActionListener {
    final /* synthetic */ hc_0 LD;

    he_0(hc_0 hc_02) {
        this.LD = hc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        hc_0.c(this.LD).dispose();
    }
}

