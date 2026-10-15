package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerUsarGruposCopa2026
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    ListenerUsarGruposCopa2026(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setUsarGruposReaisCopa(TelaConfiguracoesIniciais.h(this.MA).isSelected());
        GerenciadorJogo.vM().setUsarGruposReaisCopa(TelaConfiguracoesIniciais.h(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

