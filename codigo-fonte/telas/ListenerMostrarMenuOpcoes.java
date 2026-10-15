package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarMenuOpcoes
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerMostrarMenuOpcoes(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.Hy.show(PainelPrincipalClube.h(this.Iz), 0, PainelPrincipalClube.h(this.Iz).getHeight());
    }
}

