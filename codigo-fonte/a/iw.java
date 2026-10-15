package a;

import a.iu_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class iw
implements ActionListener {
    final /* synthetic */ iu_0 MI;

    iw(iu_0 iu_02) {
        this.MI = iu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (iu_0.b(this.MI).getItemCount() > 0) {
            iu_0.c(this.MI);
        }
    }
}

