package telas;

import telas.DialogoOpcoes;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerSelecionarTemaCor4
extends MouseAdapter {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerSelecionarTemaCor4(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        DialogoOpcoes.b(this.JH, 4);
    }
}

