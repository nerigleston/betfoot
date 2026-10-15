package telas;

import telas.TelaCampeoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoCampeoes1
implements ActionListener {
    final /* synthetic */ TelaCampeoes vR;

    ListenerBotaoCampeoes1(TelaCampeoes r2) {
        this.vR = r2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaCampeoes.a(this.vR, 1);
    }
}

