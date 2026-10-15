package a;

import a.cq_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ct_0
implements ActionListener {
    final /* synthetic */ cq_0 CE;

    ct_0(cq_0 cq_02) {
        this.CE = cq_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cq_0.c(this.CE);
    }
}

