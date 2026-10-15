package telas;

import telas.TelaEscalacao;
import components.GeradorIconeJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteDefinirCapitaoEscalacao
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    OuvinteDefinirCapitaoEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacao.b(this.Bq, ((GeradorIconeJogador)TelaEscalacao.a(this.Bq).get(TelaEscalacao.b(this.Bq))).x());
    }
}

