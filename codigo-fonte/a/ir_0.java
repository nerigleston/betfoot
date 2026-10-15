package a;

import a.ip_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ir_0
implements ActionListener {
    final /* synthetic */ ip_0 ME;

    ir_0(ip_0 ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ip_0.b(this.ME);
    }
}

