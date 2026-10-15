package a;

import a.ax_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ba_0
extends MouseAdapter {
    final /* synthetic */ ax_0 zt;

    ba_0(ax_0 ax_02) {
        this.zt = ax_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        ax_0.a(this.zt, mouseEvent.getComponent());
    }
}

