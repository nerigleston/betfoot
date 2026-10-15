package telas;

import telas.TelaEscalacao;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteCheckEscalacaoPadrao
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    OuvinteCheckEscalacaoPadrao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.f(TelaEscalacao.j(this.Bq).isSelected());
    }
}

