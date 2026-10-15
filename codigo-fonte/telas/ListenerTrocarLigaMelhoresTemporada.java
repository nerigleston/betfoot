package telas;

import telas.TelaMelhoresTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerTrocarLigaMelhoresTemporada
implements ActionListener {
    final /* synthetic */ TelaMelhoresTemporada MI;

    ListenerTrocarLigaMelhoresTemporada(TelaMelhoresTemporada iu_02) {
        this.MI = iu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaMelhoresTemporada.d(this.MI);
    }
}

