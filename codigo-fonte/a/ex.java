package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ex
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    ex(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.i(this.Iz).show(eg_0.j(this.Iz), 0, eg_0.j(this.Iz).getHeight());
    }
}

