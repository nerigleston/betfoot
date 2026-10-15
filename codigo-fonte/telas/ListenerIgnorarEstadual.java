package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerIgnorarEstadual
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerIgnorarEstadual(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setIgnoraEstadual(DialogoOpcoes.o(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

