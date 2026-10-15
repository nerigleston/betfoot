package telas;

import telas.TelaEscalacao;
import components.GeradorIconeJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerEscalarJogadorSelecionado
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerEscalarJogadorSelecionado(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacao.a(this.Bq, ((GeradorIconeJogador)TelaEscalacao.a(this.Bq).get(TelaEscalacao.b(this.Bq))).x());
    }
}

