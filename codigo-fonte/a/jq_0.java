package a;

import a.jp_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class jq_0
implements ActionListener {
    final /* synthetic */ jp_0 Nz;

    jq_0(jp_0 jp_02) {
        this.Nz = jp_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jp_0.a(this.Nz).dispose();
    }
}

