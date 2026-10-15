package components;

import components.PainelPlacarPartida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerCliquePainelPlacar
extends MouseAdapter {
    final /* synthetic */ PainelPlacarPartida QV;

    ListenerCliquePainelPlacar(PainelPlacarPartida v_02) {
        this.QV = v_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelPlacarPartida.a(this.QV);
    }
}

