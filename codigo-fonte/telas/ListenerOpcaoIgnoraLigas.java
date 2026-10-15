package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOpcaoIgnoraLigas
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerOpcaoIgnoraLigas(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setIgnoraLigas(DialogoOpcoes.n(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

