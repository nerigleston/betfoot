package a;

import a.ji_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class jj_0
implements ActionListener {
    final /* synthetic */ ji_0 Ns;

    jj_0(ji_0 ji_02) {
        this.Ns = ji_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ji_0.a(this.Ns).dispose();
    }
}

