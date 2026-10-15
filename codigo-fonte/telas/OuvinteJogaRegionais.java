package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteJogaRegionais
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    OuvinteJogaRegionais(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setJogaRegionais(TelaConfiguracoesIniciais.f(this.MA).isSelected());
        GerenciadorJogo.vM().setJogaRegionais(TelaConfiguracoesIniciais.f(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

