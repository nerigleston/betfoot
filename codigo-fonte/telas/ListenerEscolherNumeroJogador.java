package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerEscolherNumeroJogador
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerEscolherNumeroJogador(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.d(this.Iz);
    }
}

