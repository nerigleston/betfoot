package a;

import a.ay_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ag_0
implements ActionListener {
    final /* synthetic */ ay_0 yi;

    ag_0(ay_0 ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ay_0.b(this.yi, 3);
    }
}

