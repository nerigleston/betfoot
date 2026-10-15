package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarMenuAgenda
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerMostrarMenuAgenda(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.i(this.Iz).show(PainelPrincipalClube.j(this.Iz), 0, PainelPrincipalClube.j(this.Iz).getHeight());
    }
}

