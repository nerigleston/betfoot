package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ez
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    ez(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.Hz.show(eg_0.m(this.Iz), 0, eg_0.m(this.Iz).getHeight());
    }
}

