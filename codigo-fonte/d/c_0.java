package d;

import d.n_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class c_0
extends MouseAdapter {
    final /* synthetic */ n_0 Vh;

    c_0(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() >= 2 && n_0.f(this.Vh) != null) {
            this.Vh.wA();
        }
    }
}

