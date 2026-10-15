package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerUsarCorPlacar
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerUsarCorPlacar(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setUsaCorPlacar(DialogoOpcoes.h(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

