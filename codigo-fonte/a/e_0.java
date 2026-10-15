package a;

import a.c_0;
import a.dV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class e_0
implements ActionListener {
    final /* synthetic */ c_0 vs;

    e_0(c_0 c_02) {
        this.vs = c_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dV.a(c_0.a(this.vs), c_0.b(this.vs));
        c_0.c(this.vs).dispose();
    }
}

