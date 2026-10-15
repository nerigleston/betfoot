package a;

import a.gh_0;
import java.util.TimerTask;

class gj_0
extends TimerTask {
    final /* synthetic */ gh_0 JW;

    gj_0(gh_0 gh_02) {
        this.JW = gh_02;
    }

    @Override
    public void run() {
        gh_0.rL().cancel();
        gh_0.b(this.JW);
    }
}

