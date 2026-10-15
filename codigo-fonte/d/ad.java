package d;

import best.n_0;
import d.ac;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class ad
implements ActionListener {
    final /* synthetic */ ac VG;

    ad(ac ac2) {
        this.VG = ac2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ac.a(this.VG).clear();
        if (!ac.b(this.VG)) {
            this.VG.xc();
        } else {
            this.VG.xd();
        }
        if (ac.a(this.VG).size() == 0) {
            n_0.da().wo();
            n_0.da().Uw.dispose();
        } else {
            JOptionPane.showMessageDialog(null, ac.a(this.VG).get(0), "", 0);
        }
    }
}

