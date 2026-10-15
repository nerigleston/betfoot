package a;

import a.al_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ao_0
implements ActionListener {
    final /* synthetic */ al_0 yJ;

    ao_0(al_0 al_02) {
        this.yJ = al_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (al_0.b(this.yJ).getSelectedIndex() >= 0) {
            al_0.b(this.yJ, false);
        }
    }
}

