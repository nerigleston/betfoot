package telas;

import telas.PainelPrincipalClube;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerAbrirComparativoTimes
extends MouseAdapter {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirComparativoTimes(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.Iz.rh();
    }
}

