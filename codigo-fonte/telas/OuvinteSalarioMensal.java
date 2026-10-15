package telas;

import telas.TelaConfiguracoesIniciais;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSalarioMensal
implements ActionListener {
    final /* synthetic */ TelaConfiguracoesIniciais MA;

    OuvinteSalarioMensal(TelaConfiguracoesIniciais hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.setSalarioMensal(TelaConfiguracoesIniciais.g(this.MA).isSelected());
        GerenciadorJogo.vM().setSalarioMensal(TelaConfiguracoesIniciais.g(this.MA).isSelected());
        GerenciadorJogo.vJ();
    }
}

