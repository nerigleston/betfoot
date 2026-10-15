package d;

import d.f_0;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class k_0
implements ChangeListener {
    final /* synthetic */ f_0 Ut;

    k_0(f_0 f_02) {
        this.Ut = f_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        f_0.g(this.Ut).setText(Integer.toString(f_0.h(this.Ut).getValue()));
    }
}

