package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ey
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    ey(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.k(this.Iz).show(eg_0.l(this.Iz), 0, eg_0.l(this.Iz).getHeight());
    }
}

