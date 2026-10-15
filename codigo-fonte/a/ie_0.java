package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ie_0
implements ActionListener {
    final /* synthetic */ hU MA;

    ie_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.bi();
        hU.a(this.MA).addNotify();
    }
}

