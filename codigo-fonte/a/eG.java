package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class eG
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    eG(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.a(this.Iz);
    }
}

