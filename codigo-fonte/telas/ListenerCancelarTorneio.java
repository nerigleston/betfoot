package telas;

import telas.TelaCriarTorneioAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerCancelarTorneio
implements ActionListener {
    final /* synthetic */ TelaCriarTorneioAmistoso afI;

    ListenerCancelarTorneio(TelaCriarTorneioAmistoso jH2) {
        this.afI = jH2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCriarTorneioAmistoso.c(this.afI);
    }
}

