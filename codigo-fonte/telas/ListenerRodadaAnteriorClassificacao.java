package telas;

import telas.TelaClassificacaoJogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerRodadaAnteriorClassificacao
implements ActionListener {
    final /* synthetic */ TelaClassificacaoJogos wT;

    ListenerRodadaAnteriorClassificacao(TelaClassificacaoJogos al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaClassificacaoJogos.c(this.wT).isEnabled()) {
            TelaClassificacaoJogos.a(this.wT, TelaClassificacaoJogos.d(this.wT) - 1, null, null);
        }
    }
}

