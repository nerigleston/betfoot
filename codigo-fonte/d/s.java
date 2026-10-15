package d;

import d.ap;
import d.n_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class s
extends MouseAdapter {
    final /* synthetic */ n_0 Vh;

    s(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = n_0.g(this.Vh).columnAtPoint(mouseEvent.getPoint());
        String string = n_0.g(this.Vh).getColumnName(n2);
        if (n2 == 0) {
            ((ap)n_0.g(this.Vh).getModel()).i(0, false);
            n_0.g(this.Vh).addNotify();
        } else if (n2 == 2) {
            ((ap)n_0.g(this.Vh).getModel()).i(2, false);
            n_0.g(this.Vh).addNotify();
        } else if (n2 == 3) {
            ((ap)n_0.g(this.Vh).getModel()).i(3, false);
            n_0.g(this.Vh).addNotify();
        } else if (n2 == 5) {
            ((ap)n_0.g(this.Vh).getModel()).i(5, false);
            n_0.g(this.Vh).addNotify();
        }
    }
}

