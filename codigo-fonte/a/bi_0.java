package a;

import a.bg_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class bi_0
implements ActionListener {
    final /* synthetic */ bg_0 zT;

    bi_0(bg_0 bg_02) {
        this.zT = bg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bg_0.a(this.zT).dispose();
    }
}

