package telas;

import telas.PainelPrincipalClube;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerAbrirTimeAdversarioEscudo
extends MouseAdapter {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirTimeAdversarioEscudo(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.Iz.G(PainelPrincipalClube.p(this.Iz));
    }
}

