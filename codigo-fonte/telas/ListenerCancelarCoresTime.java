package telas;

import telas.PainelCoresTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerCancelarCoresTime
implements ActionListener {
    final /* synthetic */ PainelCoresTime zy;

    ListenerCancelarCoresTime(PainelCoresTime bb2) {
        this.zy = bb2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCoresTime.b(this.zy).dispose();
    }
}

