package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerHabilidadeIndividualCheck
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    ListenerHabilidadeIndividualCheck(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setHabilidadeIndividual(TelaConfiguracoesIniciais.i(this.MA).isSelected());
        GerenciadorJogo.vM().setHabilidadeIndividual(TelaConfiguracoesIniciais.i(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

