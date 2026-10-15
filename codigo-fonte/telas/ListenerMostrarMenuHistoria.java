package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarMenuHistoria
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerMostrarMenuHistoria(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.HA.show(PainelPrincipalClube.n(this.Iz), 0, PainelPrincipalClube.n(this.Iz).getHeight());
    }
}

