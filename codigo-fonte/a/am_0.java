package a;

import a.al_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class am_0
implements ActionListener {
    final /* synthetic */ al_0 yJ;

    am_0(al_0 al_02) {
        this.yJ = al_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        al_0.a(this.yJ).dispose();
    }
}

