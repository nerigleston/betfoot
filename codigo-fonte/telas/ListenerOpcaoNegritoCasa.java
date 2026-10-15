package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOpcaoNegritoCasa
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerOpcaoNegritoCasa(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setNegritoCasa(DialogoOpcoes.j(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

