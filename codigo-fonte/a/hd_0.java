package a;

import a.hc_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hd_0
implements ActionListener {
    final /* synthetic */ hc_0 LD;

    hd_0(hc_0 hc_02) {
        this.LD = hc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (hc_0.a(this.LD).getItemCount() > 0) {
            hc_0.b(this.LD);
        }
    }
}

