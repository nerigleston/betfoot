package telas;

import telas.PainelTaticaPartida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteSelecionarTimeCasaTaticas
extends MouseAdapter {
    final /* synthetic */ PainelTaticaPartida DI;

    OuvinteSelecionarTimeCasaTaticas(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelTaticaPartida.a(this.DI, 1);
    }
}

