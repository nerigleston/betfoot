package a;

import a.cd_0;
import java.util.TimerTask;

class ce_0
extends TimerTask {
    final /* synthetic */ cd_0 DI;

    ce_0(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void run() {
        cd_0.ph().cancel();
        cd_0.a(this.DI);
    }
}

