package a;

import a.ax_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class aY
implements ActionListener {
    final /* synthetic */ ax_0 zt;

    aY(ax_0 ax_02) {
        this.zt = ax_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ax_0.a(this.zt);
        ax_0.b(this.zt).dispose();
    }
}

