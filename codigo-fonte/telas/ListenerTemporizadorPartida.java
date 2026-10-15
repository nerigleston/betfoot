package telas;

import telas.PainelPartidaAoVivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerTemporizadorPartida
implements ActionListener {
    final /* synthetic */ PainelPartidaAoVivo Hu;

    ListenerTemporizadorPartida(PainelPartidaAoVivo dV2) {
        this.Hu = dV2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Hu.qa();
    }
}

