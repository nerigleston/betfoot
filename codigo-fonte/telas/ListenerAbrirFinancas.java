package telas;

import telas.PainelPrincipalClube;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerAbrirFinancas
extends MouseAdapter {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirFinancas(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelPrincipalClube.b(this.Iz);
    }
}

