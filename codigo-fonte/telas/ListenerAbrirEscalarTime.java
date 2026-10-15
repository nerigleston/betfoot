package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirEscalarTime
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirEscalarTime(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.qZ();
    }
}

