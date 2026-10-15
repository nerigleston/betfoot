package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ew
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    ew(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.Hy.show(eg_0.h(this.Iz), 0, eg_0.h(this.Iz).getHeight());
    }
}

