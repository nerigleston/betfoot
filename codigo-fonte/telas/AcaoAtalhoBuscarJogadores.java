package telas;

import telas.PainelPrincipalClube;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoBuscarJogadores
extends AbstractAction {
    final /* synthetic */ PainelPrincipalClube Iz;

    AcaoAtalhoBuscarJogadores(PainelPrincipalClube eg_02) {
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

