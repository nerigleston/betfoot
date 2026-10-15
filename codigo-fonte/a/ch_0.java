package a;

import a.cd_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ch_0
extends MouseAdapter {
    final /* synthetic */ cd_0 DI;

    ch_0(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        cd_0.a(this.DI, 1);
    }
}

