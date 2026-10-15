package a;

import a.eg_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ek_0
extends MouseAdapter {
    final /* synthetic */ eg_0 Iz;

    ek_0(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.Iz.rm();
    }
}

