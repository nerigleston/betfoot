package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOpcaoVerEstaduaisAgrupados
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerOpcaoVerEstaduaisAgrupados(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setVerEstaduaisAgrupados(DialogoOpcoes.m(this.JH).isSelected());
        GerenciadorJogo.vJ();
    }
}

