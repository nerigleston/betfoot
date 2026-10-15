package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirJogadoresEmprestados
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirJogadoresEmprestados(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.t(this.Iz);
    }
}

