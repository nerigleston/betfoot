package telas;

import telas.DialogoOpcoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMudancaComboOpcoes
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerMudancaComboOpcoes(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoOpcoes.b(this.JH, actionEvent.getSource());
    }
}

