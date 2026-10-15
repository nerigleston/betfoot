package a;

import a.ay_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ab_0
extends MouseAdapter {
    final /* synthetic */ ay_0 yi;

    ab_0(ay_0 ay_02) {
        this.yi = ay_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        ay_0.a(this.yi, 1);
    }
}

