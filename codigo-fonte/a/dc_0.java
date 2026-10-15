package a;

import a.dz_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class dc_0
extends MouseAdapter {
    final /* synthetic */ dz_0 Gn;

    dc_0(dz_0 dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        dz_0.b(this.Gn);
    }
}

