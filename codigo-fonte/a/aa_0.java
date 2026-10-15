package a;

import a.ay_0;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class aa_0
implements ItemListener {
    final /* synthetic */ ay_0 yi;

    aa_0(ay_0 ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getStateChange() == 1 && !this.yi.wZ) {
            ay_0.d(this.yi, ay_0.c(this.yi).getSelectedIndex());
        }
    }
}

