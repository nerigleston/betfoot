package a;

import a.dG;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class di_0
implements ActionListener {
    final /* synthetic */ dG Gu;

    di_0(dG dG2) {
        this.Gu = dG2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dG.a(this.Gu).dispose();
    }
}

