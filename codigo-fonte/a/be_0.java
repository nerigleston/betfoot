package a;

import a.bz;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class be_0
implements ActionListener {
    final /* synthetic */ bz Bq;

    be_0(bz bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.f(bz.j(this.Bq).isSelected());
    }
}

