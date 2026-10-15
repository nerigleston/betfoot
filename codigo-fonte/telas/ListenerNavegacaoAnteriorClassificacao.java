package telas;

import telas.TelaClassificacaoJogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerNavegacaoAnteriorClassificacao
implements ActionListener {
    final /* synthetic */ TelaClassificacaoJogos wT;

    ListenerNavegacaoAnteriorClassificacao(TelaClassificacaoJogos al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaClassificacaoJogos.c(this.wT, -1);
    }
}

