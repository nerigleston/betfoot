package a;

import a.ay_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ai_0
implements ActionListener {
    final /* synthetic */ ay_0 yi;

    ai_0(ay_0 ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (ay_0.b(this.yi).getSelectedIndex() >= 0 && !this.yi.xa) {
            ay_0.c(this.yi, ay_0.b(this.yi).getSelectedIndex());
        }
    }
}

