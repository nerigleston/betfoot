package a;

import a.bv_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cb
implements ActionListener {
    final /* synthetic */ bv_0 BP;

    cb(bv_0 bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.BP.cW(3);
    }
}

