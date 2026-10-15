package a;

import a.hk_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hs_0
implements ActionListener {
    final /* synthetic */ hk_0 Lt;

    hs_0(hk_0 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (hk_0.b(this.Lt).getSelectedIndex() >= 0) {
            hk_0.a(this.Lt, hk_0.b(this.Lt).getSelectedIndex());
        }
    }
}

