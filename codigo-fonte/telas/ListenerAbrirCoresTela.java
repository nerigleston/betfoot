package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirCoresTela
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirCoresTela(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.q(this.Iz);
    }
}

