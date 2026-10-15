package a;

import a.eg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class es_0
implements ActionListener {
    final /* synthetic */ eg_0 Iz;

    es_0(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        eg_0.t(this.Iz);
    }
}

