package a;

import a.o_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class v_0
implements ActionListener {
    final /* synthetic */ o_0 vj;

    v_0(o_0 o_02) {
        this.vj = o_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (o_0.a(this.vj).getSelectedIndex() >= 0) {
            o_0.b(this.vj, o_0.a(this.vj).getSelectedIndex());
        }
    }
}

