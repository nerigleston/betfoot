package a;

import a.aa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class aj_0
implements ActionListener {
    final /* synthetic */ aa wq;

    aj_0(aa aa2) {
        this.wq = aa2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        aa.d(this.wq, 1);
    }
}

