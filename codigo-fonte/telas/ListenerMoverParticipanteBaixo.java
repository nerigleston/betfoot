package telas;

import telas.TelaCriarTorneioAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMoverParticipanteBaixo
implements ActionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    ListenerMoverParticipanteBaixo(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCriarTorneioAmistoso.a(this.afI, 0);
    }
}

