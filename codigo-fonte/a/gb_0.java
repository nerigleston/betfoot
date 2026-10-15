package a;

import a.gx_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class gb_0
extends MouseAdapter {
    final /* synthetic */ gx_0 Kg;

    gb_0(gx_0 gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = gx_0.c(this.Kg).rowAtPoint(mouseEvent.getPoint());
        int n3 = gx_0.c(this.Kg).columnAtPoint(mouseEvent.getPoint());
        if (mouseEvent.getClickCount() == 2) {
            this.Kg.rQ();
        }
    }
}

