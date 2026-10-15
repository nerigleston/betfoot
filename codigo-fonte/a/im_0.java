package a;

import a.il_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class im_0
implements ActionListener {
    final /* synthetic */ il_0 MB;

    im_0(il_0 il_02) {
        this.MB = il_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        il_0.a(this.MB);
    }
}

