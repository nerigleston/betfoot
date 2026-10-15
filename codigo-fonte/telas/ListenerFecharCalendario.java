package telas;

import telas.PainelCalendarioTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharCalendario
implements ActionListener {
    final /* synthetic */ PainelCalendarioTime vO;

    ListenerFecharCalendario(PainelCalendarioTime l2) {
        this.vO = l2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCalendarioTime.a(this.vO).dispose();
    }
}

