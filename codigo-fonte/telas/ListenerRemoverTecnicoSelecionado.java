package telas;

import telas.TelaTecnicosHumanos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerRemoverTecnicoSelecionado
implements ActionListener {
    final /* synthetic */ TelaTecnicosHumanos ME;

    ListenerRemoverTecnicoSelecionado(TelaTecnicosHumanos ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTecnicosHumanos.b(this.ME);
    }
}

