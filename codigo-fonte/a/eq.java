package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class eq
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    eq(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.d(this.Iz);
    }
}

