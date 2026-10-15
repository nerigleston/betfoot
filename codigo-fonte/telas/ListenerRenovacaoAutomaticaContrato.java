package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerRenovacaoAutomaticaContrato
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerRenovacaoAutomaticaContrato(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setAutoRenovaContrato(DialogoOpcoes.g(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

