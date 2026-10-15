package a;

import a.bv_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cd
implements ActionListener {
    final /* synthetic */ bv_0 BP;

    cd(bv_0 bv_02) {
        this.BP = bv_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        bv_0.b(this.BP);
    }
}

