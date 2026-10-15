package a;

import a.c_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class g_0
implements ActionListener {
    final /* synthetic */ c_0 vs;

    g_0(c_0 c_02) {
        this.vs = c_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        c_0.a(this.vs, -1);
    }
}

