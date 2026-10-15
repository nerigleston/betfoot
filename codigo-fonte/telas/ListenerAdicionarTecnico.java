package telas;

import telas.TelaTecnicosHumanos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAdicionarTecnico
implements ActionListener {
    final /* synthetic */ TelaTecnicosHumanos ME;

    ListenerAdicionarTecnico(TelaTecnicosHumanos ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTecnicosHumanos.c(this.ME);
    }
}

