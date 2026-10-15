package a;

import a.ip_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iq_0
implements ActionListener {
    final /* synthetic */ ip_0 ME;

    iq_0(ip_0 ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ip_0.a(this.ME).dispose();
    }
}

