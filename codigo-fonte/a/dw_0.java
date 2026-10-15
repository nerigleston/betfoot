package a;

import a.ds_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dw_0
implements ActionListener {
    final /* synthetic */ ds_0 FS;

    dw_0(ds_0 ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.FS.pM();
    }
}

