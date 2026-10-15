package components;

import components.h_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class J
implements ActionListener {
    final /* synthetic */ h_0 Qo;

    J(h_0 h_02) {
        this.Qo = h_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        h_0.b(this.Qo);
    }
}

