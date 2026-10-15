package telas;

import telas.DialogoOpcoes;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerEscolhaCorPlacar0
extends MouseAdapter {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerEscolhaCorPlacar0(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        DialogoOpcoes.a(this.JH, 0);
    }
}

