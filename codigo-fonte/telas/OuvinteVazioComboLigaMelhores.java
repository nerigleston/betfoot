package telas;

import telas.TelaMelhoresTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteVazioComboLigaMelhores
implements ActionListener {
    final /* synthetic */ TelaMelhoresTemporada MI;

    OuvinteVazioComboLigaMelhores(TelaMelhoresTemporada iu_02) {
        this.MI = iu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaMelhoresTemporada.a(this.MI, actionEvent);
    }
}

