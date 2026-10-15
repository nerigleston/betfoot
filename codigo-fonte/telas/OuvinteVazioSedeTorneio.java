package telas;

import telas.TelaCriarTorneioAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteVazioSedeTorneio
implements ActionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    OuvinteVazioSedeTorneio(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCriarTorneioAmistoso.b(this.afI, actionEvent);
    }
}

