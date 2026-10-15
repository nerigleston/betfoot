package a;

import a.bl_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bm_0
implements ActionListener {
    final /* synthetic */ bl_0 zW;

    bm_0(bl_0 bl_02) {
        this.zW = bl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bl_0.a(this.zW).dispose();
    }
}

