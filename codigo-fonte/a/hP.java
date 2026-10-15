package a;

import a.hF;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hP
implements ActionListener {
    final /* synthetic */ hF Ma;

    hP(hF hF2) {
        this.Ma = hF2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        hF.a(this.Ma).dispose();
    }
}

