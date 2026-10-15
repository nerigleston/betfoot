package components;

import components.y_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class z_0
extends MouseAdapter {
    final /* synthetic */ y_0 QX;

    z_0(y_0 y_02) {
        this.QX = y_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        y_0.a(this.QX, mouseEvent);
    }
}

