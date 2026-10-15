package telas;

import telas.TelaCampeoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoCampeoes
implements ActionListener {
    final /* synthetic */ TelaCampeoes vR;

    ListenerSelecaoCampeoes(TelaCampeoes r2) {
        this.vR = r2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaCampeoes.b(this.vR).getSelectedIndex() >= 0) {
            TelaCampeoes.b(this.vR, TelaCampeoes.b(this.vR).getSelectedIndex());
        }
    }
}

