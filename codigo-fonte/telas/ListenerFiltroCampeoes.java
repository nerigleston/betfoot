package telas;

import telas.TelaCampeoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFiltroCampeoes
implements ActionListener {
    final /* synthetic */ TelaCampeoes vR;

    ListenerFiltroCampeoes(TelaCampeoes r2) {
        this.vR = r2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaCampeoes.c(this.vR).getSelectedIndex() >= 0) {
            TelaCampeoes.d(this.vR);
        }
    }
}

