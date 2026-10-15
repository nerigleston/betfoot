package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarMenuTecnicos
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerMostrarMenuTecnicos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.Hz.show(PainelPrincipalClube.m(this.Iz), 0, PainelPrincipalClube.m(this.Iz).getHeight());
    }
}

