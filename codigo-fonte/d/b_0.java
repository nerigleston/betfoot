package d;

import d.ap;
import d.n_0;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

class b_0
extends MouseAdapter {
    final /* synthetic */ n_0 Vh;

    b_0(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = n_0.g(this.Vh).rowAtPoint(mouseEvent.getPoint());
        int n3 = n_0.g(this.Vh).columnAtPoint(mouseEvent.getPoint());
        int n4 = mouseEvent.getClickCount();
        if (n4 == 1 && n3 == 0) {
            int n5 = n_0.e(this.Vh) ? n_0.f(this.Vh).getNumeroTitulares() : n_0.f(this.Vh).getNumeroTitularesJuniores();
            int n6 = n_0.g(this.Vh).convertRowIndexToModel(n2);
            ((ap)n_0.g(this.Vh).getModel()).Z(n6, n5);
            this.Vh.wo();
            n_0.g(this.Vh).addNotify();
            if (n_0.e(this.Vh)) {
                n_0.m(this.Vh).setText(Integer.toString(n_0.f(this.Vh).getNumeroTitulares()));
            } else {
                n_0.m(this.Vh).setText(Integer.toString(n_0.f(this.Vh).getNumeroTitularesJuniores()));
            }
        } else if (n4 >= 2) {
            this.Vh.wC();
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if (SwingUtilities.isRightMouseButton(mouseEvent)) {
            Point point = mouseEvent.getPoint();
            int n2 = n_0.g(this.Vh).rowAtPoint(point);
            ListSelectionModel listSelectionModel = n_0.g(this.Vh).getSelectionModel();
            listSelectionModel.setSelectionInterval(n2, n2);
        }
    }
}

