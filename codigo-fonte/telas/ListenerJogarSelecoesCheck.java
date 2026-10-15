package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerJogarSelecoesCheck
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    ListenerJogarSelecoesCheck(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setJogaSelecoesAll(TelaConfiguracoesIniciais.d(this.MA).isSelected());
        GerenciadorJogo.vM().setJogaSelecoesAll(TelaConfiguracoesIniciais.d(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

