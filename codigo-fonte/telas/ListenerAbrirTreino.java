package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirTreino
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirTreino(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.o(this.Iz);
    }
}

