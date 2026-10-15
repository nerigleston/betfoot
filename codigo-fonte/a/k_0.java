package a;

import a.h_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class k_0
implements ActionListener {
    final /* synthetic */ h_0 vJ;

    k_0(h_0 h_02) {
        this.vJ = h_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        h_0.d(this.vJ).dispose();
    }
}

