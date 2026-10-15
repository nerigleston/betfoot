package telas;

import telas.TelaMelhoresTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerTrocarDivisaoMelhoresTemporada
implements ActionListener {
    final /* synthetic */ TelaMelhoresTemporada MI;

    ListenerTrocarDivisaoMelhoresTemporada(TelaMelhoresTemporada iu_02) {
        this.MI = iu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaMelhoresTemporada.b(this.MI).getItemCount() > 0) {
            TelaMelhoresTemporada.c(this.MI);
        }
    }
}

