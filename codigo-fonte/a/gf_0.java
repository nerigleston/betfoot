package a;

import a.gb;
import java.util.TimerTask;

class gf_0
extends TimerTask {
    final /* synthetic */ gb JV;

    gf_0(gb gb2) {
        this.JV = gb2;
    }

    @Override
    public void run() {
        gb.a(this.JV).cancel();
        gb.c(this.JV);
    }
}

