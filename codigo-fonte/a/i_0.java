package a;

import a.h_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class i_0
implements ActionListener {
    final /* synthetic */ h_0 vJ;

    i_0(h_0 h_02) {
        this.vJ = h_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (h_0.a(this.vJ).getItemCount() > 0) {
            h_0.b(this.vJ);
        }
    }
}

