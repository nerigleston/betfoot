package a;

import a.gb;
import java.util.TimerTask;

class ge_0
extends TimerTask {
    final /* synthetic */ gb JV;

    ge_0(gb gb2) {
        this.JV = gb2;
    }

    @Override
    public void run() {
        gb.a(this.JV).cancel();
        gb.b(this.JV);
    }
}

