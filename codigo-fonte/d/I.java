package d;

import d.n_0;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class I
extends MouseAdapter {
    final /* synthetic */ n_0 Vh;

    I(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.Vh.wA();
    }
}

