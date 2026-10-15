package telas;

import telas.PainelPrincipalClube;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerAbrirCentralMensagens
extends MouseAdapter {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirCentralMensagens(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.Iz.rm();
    }
}

