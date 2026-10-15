package telas;

import telas.DialogoOpcoes;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerSelecionarCorPlacar
extends MouseAdapter {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerSelecionarCorPlacar(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        DialogoOpcoes.a(this.JH, 2);
    }
}

