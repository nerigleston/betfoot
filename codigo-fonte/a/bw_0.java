package a;

import a.bv_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bw_0
implements ActionListener {
    final /* synthetic */ bv_0 BP;

    bw_0(bv_0 bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.BP.os();
    }
}

