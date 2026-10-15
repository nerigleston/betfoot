package a;

import a.hk_0;
import best.s_0;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hv_0
implements ActionListener {
    final /* synthetic */ hk_0 Lt;

    hv_0(hk_0 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        hk_0.d(this.Lt).setCursor(new Cursor(3));
        s_0.a(null);
        hk_0.d(this.Lt).setCursor(new Cursor(12));
    }
}

