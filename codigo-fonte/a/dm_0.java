package a;

import a.dK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dm_0
implements ActionListener {
    final /* synthetic */ dK GK;

    dm_0(dK dK2) {
        this.GK = dK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dK.a(this.GK, (Integer)dK.a(this.GK).getSelectedItem(), false);
    }
}

