package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAlternarEmprestimo
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAlternarEmprestimo(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.g(this.Iz);
    }
}

