package d;

import d.ap;
import d.n_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

class r_0
implements ActionListener {
    final /* synthetic */ n_0 Vh;

    r_0(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        n_0.b(this.Vh).setIcon(new ImageIcon(this.getClass().getResource("/aicons/greencheck.png")));
        n_0.c(this.Vh).setIcon(null);
        n_0.d(this.Vh).setText("");
        if (!n_0.e(this.Vh)) {
            n_0.a(this.Vh, true);
            ap ap2 = new ap();
            best.n_0.da().wJ().setModel(ap2);
            best.n_0.da().wH();
            if (n_0.f(this.Vh).getJogadores().size() > 0) {
                best.n_0.da().wJ().setRowSelectionInterval(0, 0);
            }
            this.Vh.wq();
            n_0.g(this.Vh).addNotify();
        }
    }
}

