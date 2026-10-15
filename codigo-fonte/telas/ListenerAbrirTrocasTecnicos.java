package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirTrocasTecnicos
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirTrocasTecnicos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.dp(0);
    }
}

