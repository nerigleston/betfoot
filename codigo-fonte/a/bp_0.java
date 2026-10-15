package a;

import a.bn_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bp_0
implements ActionListener {
    final /* synthetic */ bn_0 Ae;

    bp_0(bn_0 bn_02) {
        this.Ae = bn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bn_0.a(this.Ae, 1);
    }
}

