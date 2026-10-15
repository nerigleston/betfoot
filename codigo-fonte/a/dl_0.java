package a;

import a.dk_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dl_0
implements ActionListener {
    final /* synthetic */ dk_0 Fm;

    dl_0(dk_0 dk_02) {
        this.Fm = dk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dk_0.a(this.Fm).dispose();
    }
}

