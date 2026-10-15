package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fj_0
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    fj_0(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.w(this.Iz);
    }
}

