package a;

import a.hk_0;
import c.a;
import java.util.TimerTask;

class ho_0
extends TimerTask {
    final /* synthetic */ hk_0 Lt;

    ho_0(hk_0 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void run() {
        hk_0.ph().cancel();
        a.SR.ax();
    }
}

