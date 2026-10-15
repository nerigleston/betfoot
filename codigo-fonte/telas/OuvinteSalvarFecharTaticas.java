package telas;

import telas.PainelTaticaPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSalvarFecharTaticas
implements ActionListener {
    final /* synthetic */ PainelTaticaPartida DI;

    OuvinteSalvarFecharTaticas(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelTaticaPartida.b(this.DI);
    }
}

