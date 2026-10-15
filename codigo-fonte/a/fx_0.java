package a;

import a.fw_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class fx_0
implements ActionListener {
    final /* synthetic */ fw_0 IB;

    fx_0(fw_0 fw_02) {
        this.IB = fw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            fw_0.a(this.IB);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

