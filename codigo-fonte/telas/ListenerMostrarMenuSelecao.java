package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMostrarMenuSelecao
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerMostrarMenuSelecao(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.k(this.Iz).show(PainelPrincipalClube.l(this.Iz), 0, PainelPrincipalClube.l(this.Iz).getHeight());
    }
}

