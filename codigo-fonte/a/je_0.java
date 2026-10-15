package a;

import a.gX;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class je_0
implements ActionListener {
    final /* synthetic */ gX KE;

    je_0(gX gX2) {
        this.KE = gX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        gX.c(this.KE);
    }
}

