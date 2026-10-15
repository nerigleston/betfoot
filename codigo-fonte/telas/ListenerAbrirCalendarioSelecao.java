package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirCalendarioSelecao
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirCalendarioSelecao(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.ad(true);
    }
}

