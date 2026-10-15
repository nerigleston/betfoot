package telas;

import telas.TelaEscalacao;
import components.GeradorIconeJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAlternarFalso9Escalacao
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    OuvinteAlternarFalso9Escalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacao.d(this.Bq, ((GeradorIconeJogador)TelaEscalacao.a(this.Bq).get(TelaEscalacao.b(this.Bq))).x());
    }
}

