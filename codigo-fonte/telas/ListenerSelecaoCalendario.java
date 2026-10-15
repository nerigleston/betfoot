package telas;

import telas.PainelCalendarioTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoCalendario
implements ActionListener {
    final /* synthetic */ PainelCalendarioTime vO;

    ListenerSelecaoCalendario(PainelCalendarioTime l2) {
        this.vO = l2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelCalendarioTime.b(this.vO).getSelectedIndex() >= 0) {
            PainelCalendarioTime.a(this.vO, PainelCalendarioTime.b(this.vO).getSelectedIndex());
        }
    }
}

