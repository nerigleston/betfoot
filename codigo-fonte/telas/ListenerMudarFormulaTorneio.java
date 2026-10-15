package telas;

import telas.TelaCriarTorneioAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMudarFormulaTorneio
implements ActionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    ListenerMudarFormulaTorneio(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCriarTorneioAmistoso.f(this.afI);
    }
}

