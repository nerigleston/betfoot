package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSonsEventos
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerSonsEventos(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setUsaSons(DialogoOpcoes.i(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

