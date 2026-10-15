package telas;

import telas.DialogoOpcoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirSeletorCores
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerAbrirSeletorCores(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoOpcoes.c(this.JH);
    }
}

