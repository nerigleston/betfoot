package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerHistoricoJogador
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerHistoricoJogador(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.qC();
    }
}

