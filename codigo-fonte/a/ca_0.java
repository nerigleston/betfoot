package a;

import a.cz_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ca_0
implements ActionListener {
    final /* synthetic */ cz_0 Da;

    ca_0(cz_0 cz_02) {
        this.Da = cz_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cz_0.a(this.Da).dispose();
    }
}

