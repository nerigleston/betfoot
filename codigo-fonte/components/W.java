package components;

import components.v_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class W
extends MouseAdapter {
    final /* synthetic */ v_0 QV;

    W(v_0 v_02) {
        this.QV = v_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        v_0.a(this.QV);
    }
}

