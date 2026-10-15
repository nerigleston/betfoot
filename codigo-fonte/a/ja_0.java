package a;

import a.iX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ja_0
implements ActionListener {
    final /* synthetic */ iX Nj;

    ja_0(iX iX2) {
        this.Nj = iX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        iX.c(this.Nj);
    }
}

