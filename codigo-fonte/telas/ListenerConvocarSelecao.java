package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConvocarSelecao
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerConvocarSelecao(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.v(this.Iz);
    }
}

