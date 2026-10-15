package telas;

import telas.TelaClassificacaoJogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoClassificacao2
implements ActionListener {
    final /* synthetic */ TelaClassificacaoJogos wT;

    ListenerBotaoClassificacao2(TelaClassificacaoJogos al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaClassificacaoJogos.b(this.wT, 2);
    }
}

