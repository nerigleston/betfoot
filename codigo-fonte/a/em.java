package a;

import a.eg_0;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

class em
extends MouseAdapter {
    final /* synthetic */ eg_0 Iz;

    em(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = eg_0.c(this.Iz).rowAtPoint(mouseEvent.getPoint());
        int n3 = eg_0.c(this.Iz).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 >= 2) {
            this.Iz.qC();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
            Point point = mouseEvent.getPoint();
            int n2 = eg_0.c(this.Iz).rowAtPoint(point);
            ListSelectionModel listSelectionModel = eg_0.c(this.Iz).getSelectionModel();
            listSelectionModel.setSelectionInterval(n2, n2);
        }
    }
}

