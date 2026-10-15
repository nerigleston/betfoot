package a;

import a.al;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ap_0
implements ActionListener {
    final /* synthetic */ al wT;

    ap_0(al al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        al.f(this.wT).getSelectedIndex();
    }
}

