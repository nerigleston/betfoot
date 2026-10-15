package a;

import a.dz_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class dd_0
extends MouseAdapter {
    final /* synthetic */ dz_0 Gn;

    dd_0(dz_0 dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        dz_0.c(this.Gn);
    }
}

