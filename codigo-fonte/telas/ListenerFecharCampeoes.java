package telas;

import telas.TelaCampeoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharCampeoes
implements ActionListener {
    final /* synthetic */ TelaCampeoes vR;

    ListenerFecharCampeoes(TelaCampeoes r2) {
        this.vR = r2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCampeoes.a(this.vR).dispose();
    }
}

