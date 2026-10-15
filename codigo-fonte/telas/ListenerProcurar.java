package telas;

import telas.PainelPrincipalClube;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerProcurar
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerProcurar(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (GerenciadorJogo.SR.isHabilidadeIndividual()) {
            PainelPrincipalClube.a(this.Iz, 2);
        } else {
            PainelPrincipalClube.a(this.Iz, 1);
        }
    }
}

