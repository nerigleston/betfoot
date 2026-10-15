package a;

import a.fy_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fz_0
implements ActionListener {
    final /* synthetic */ fy_0 IF;

    fz_0(fy_0 fy_02) {
        this.IF = fy_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        fy_0.a(this.IF).dispose();
    }
}

