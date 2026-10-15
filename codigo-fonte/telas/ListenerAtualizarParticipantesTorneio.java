package telas;

import telas.TelaCriarTorneioAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAtualizarParticipantesTorneio
implements ActionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    ListenerAtualizarParticipantesTorneio(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCriarTorneioAmistoso.a(this.afI);
    }
}

