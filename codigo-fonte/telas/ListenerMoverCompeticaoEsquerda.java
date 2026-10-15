package telas;

import telas.DialogoOpcoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMoverCompeticaoEsquerda
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerMoverCompeticaoEsquerda(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoOpcoes.c(this.JH, 0);
    }
}

