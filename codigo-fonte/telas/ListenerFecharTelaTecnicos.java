package telas;

import telas.TelaTecnicosHumanos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharTelaTecnicos
implements ActionListener {
    final /* synthetic */ TelaTecnicosHumanos ME;

    ListenerFecharTelaTecnicos(TelaTecnicosHumanos ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTecnicosHumanos.a(this.ME).dispose();
    }
}

