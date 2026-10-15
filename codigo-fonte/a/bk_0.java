package a;

import a.bg_0;
import java.util.TimerTask;

class bk_0
extends TimerTask {
    final /* synthetic */ bg_0 zT;

    bk_0(bg_0 bg_02) {
        this.zT = bg_02;
    }

    @Override
    public void run() {
        bg_0.b(this.zT).cancel();
        bg_0.c(this.zT);
    }
}

