package a;

import a.gX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hb_0
implements ActionListener {
    final /* synthetic */ gX KE;

    hb_0(gX gX2) {
        this.KE = gX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gX.b(this.KE).dispose();
    }
}

