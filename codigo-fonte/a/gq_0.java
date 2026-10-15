package a;

import a.gO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gq_0
implements ActionListener {
    final /* synthetic */ gO Kz;

    gq_0(gO gO2) {
        this.Kz = gO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gO.b(this.Kz).dispose();
    }
}

