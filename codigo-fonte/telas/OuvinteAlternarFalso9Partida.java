package telas;

import telas.PainelTaticaPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAlternarFalso9Partida
implements ActionListener {
    final /* synthetic */ PainelTaticaPartida DI;

    OuvinteAlternarFalso9Partida(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelTaticaPartida.f(this.DI);
    }
}

