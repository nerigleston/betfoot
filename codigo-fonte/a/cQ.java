package a;

import a.cd_0;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class cQ
extends MouseMotionAdapter {
    final /* synthetic */ cd_0 DI;

    cQ(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        cd_0.b(this.DI, mouseEvent, 0);
    }
}

