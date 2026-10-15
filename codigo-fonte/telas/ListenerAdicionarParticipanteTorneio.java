package telas;

import telas.TelaCriarTorneioAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAdicionarParticipanteTorneio
implements ActionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    ListenerAdicionarParticipanteTorneio(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCriarTorneioAmistoso.e(this.afI);
    }
}

