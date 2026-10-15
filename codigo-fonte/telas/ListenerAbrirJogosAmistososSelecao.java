package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirJogosAmistososSelecao
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirJogosAmistososSelecao(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.rf();
    }
}

