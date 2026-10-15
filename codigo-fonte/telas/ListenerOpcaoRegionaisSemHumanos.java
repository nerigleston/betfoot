package telas;

import telas.DialogoOpcoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOpcaoRegionaisSemHumanos
implements ActionListener {
    final /* synthetic */ DialogoOpcoes JH;

    ListenerOpcaoRegionaisSemHumanos(DialogoOpcoes fB2) {
        this.JH = fB2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoOpcoes.d(this.JH);
    }
}

