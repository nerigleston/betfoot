package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirCentralEmpregos
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirCentralEmpregos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.u(this.Iz);
    }
}

