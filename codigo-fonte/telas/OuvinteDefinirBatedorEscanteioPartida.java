package telas;

import telas.PainelTaticaPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteDefinirBatedorEscanteioPartida
implements ActionListener {
    final /* synthetic */ PainelTaticaPartida DI;

    OuvinteDefinirBatedorEscanteioPartida(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelTaticaPartida.e(this.DI);
    }
}

