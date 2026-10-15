package a;

import a.iu_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iv
implements ActionListener {
    final /* synthetic */ iu_0 MI;

    iv(iu_0 iu_02) {
        this.MI = iu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        iu_0.a(this.MI).dispose();
    }
}

