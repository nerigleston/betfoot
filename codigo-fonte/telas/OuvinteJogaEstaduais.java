package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteJogaEstaduais
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    OuvinteJogaEstaduais(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setJogaEstadual(TelaConfiguracoesIniciais.e(this.MA).isSelected());
        GerenciadorJogo.vM().setJogaEstadual(TelaConfiguracoesIniciais.e(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

