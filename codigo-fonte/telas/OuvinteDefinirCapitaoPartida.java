package telas;

import telas.PainelTaticaPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteDefinirCapitaoPartida
implements ActionListener {
    final /* synthetic */ PainelTaticaPartida DI;

    OuvinteDefinirCapitaoPartida(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelTaticaPartida.d(this.DI);
    }
}

