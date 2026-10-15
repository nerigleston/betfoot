package a;

import a.cd_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

class cP
extends MouseAdapter {
    final /* synthetic */ cd_0 DI;

    cP(cd_0 cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
            cd_0.a(this.DI, mouseEvent);
        }
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            cd_0.b(this.DI, mouseEvent);
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
            cd_0.a(this.DI, mouseEvent, 0);
        }
    }
}

