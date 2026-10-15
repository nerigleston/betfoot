package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerJogarInternacionaisClubes
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    ListenerJogarInternacionaisClubes(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setJogaIntClubes(TelaConfiguracoesIniciais.c(this.MA).isSelected());
        GerenciadorJogo.vM().setJogaIntClubes(TelaConfiguracoesIniciais.c(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

