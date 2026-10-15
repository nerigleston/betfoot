package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirRankingTecnicos
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirRankingTecnicos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.ro();
    }
}

