package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerProporContrato
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerProporContrato(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.qS();
    }
}

