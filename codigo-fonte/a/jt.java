package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class jt
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    jt(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.b(this.Iz, actionEvent);
    }
}

