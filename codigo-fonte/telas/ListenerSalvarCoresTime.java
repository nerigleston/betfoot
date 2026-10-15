package telas;

import telas.PainelCoresTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSalvarCoresTime
implements ActionListener {
    final /* synthetic */ PainelCoresTime zy;

    ListenerSalvarCoresTime(PainelCoresTime bb2) {
        this.zy = bb2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCoresTime.a(this.zy);
        PainelCoresTime.b(this.zy).dispose();
    }
}

