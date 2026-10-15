package d;

import best.n_0;
import d.f_0;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class i_0
implements ItemListener {
    final /* synthetic */ f_0 Ut;

    i_0(f_0 f_02) {
        this.Ut = f_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        n_0.da().aM(f_0.c(this.Ut).isSelected());
    }
}

