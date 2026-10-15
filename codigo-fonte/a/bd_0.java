package a;

import a.bz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

class bd_0
implements ActionListener {
    final /* synthetic */ bz Bq;

    bd_0(bz bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/aicons/alpha3.png"));
        bz.b(this.Bq, true);
        bz.i(this.Bq).dispose();
    }
}

