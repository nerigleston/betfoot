package telas;

import telas.DialogoOpcoes;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOpcaoUsaCoresLista
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerOpcaoUsaCoresLista(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.vM().setUsaCoresLista(DialogoOpcoes.k(this.JH).isSelected());
        GerenciadorJogo.vJ();
        if (DialogoOpcoes.l(this.JH) != null) {
            DialogoOpcoes.l(this.JH).addNotify();
        }
    }
}

