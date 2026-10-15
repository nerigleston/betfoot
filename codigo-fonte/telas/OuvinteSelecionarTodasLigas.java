package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSelecionarTodasLigas
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    OuvinteSelecionarTodasLigas(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.bi();
        TelaConfiguracoesIniciais.a(this.MA).addNotify();
    }
}

