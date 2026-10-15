package a;

import a.y_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class b_0
implements ActionListener {
    final /* synthetic */ y_0 vo;

    b_0(y_0 y_02) {
        this.vo = y_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        y_0.b(this.vo).dispose();
    }
}

