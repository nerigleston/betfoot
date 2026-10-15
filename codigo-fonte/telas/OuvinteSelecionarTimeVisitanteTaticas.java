package telas;

import telas.PainelTaticaPartida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteSelecionarTimeVisitanteTaticas
extends MouseAdapter {
    final /* synthetic */ PainelTaticaPartida DI;

    OuvinteSelecionarTimeVisitanteTaticas(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelTaticaPartida.a(this.DI, 2);
    }
}

