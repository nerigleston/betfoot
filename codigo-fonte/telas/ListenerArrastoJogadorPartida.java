package telas;

import telas.PainelTaticaPartida;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class ListenerArrastoJogadorPartida
extends MouseMotionAdapter {
    final /* synthetic */ PainelTaticaPartida DI;

    ListenerArrastoJogadorPartida(PainelTaticaPartida cd_02) {
        this.DI = cd_02;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        PainelTaticaPartida.b(this.DI, mouseEvent, 0);
    }
}

