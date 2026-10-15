package a;

import a.gh_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class gi_0
implements ActionListener {
    final /* synthetic */ gh_0 JW;

    gi_0(gh_0 gh_02) {
        this.JW = gh_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gh_0.a(this.JW).dispose();
    }
}

