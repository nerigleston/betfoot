package telas;

import telas.DialogoOpcoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharOpcoes
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerFecharOpcoes(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoOpcoes.a(this.JH);
        DialogoOpcoes.b(this.JH).dispose();
    }
}

