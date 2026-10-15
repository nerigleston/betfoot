package telas;

import telas.TelaClassificacaoJogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoClassificacao0
implements ActionListener {
    final /* synthetic */ TelaClassificacaoJogos wT;

    ListenerBotaoClassificacao0(TelaClassificacaoJogos al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaClassificacaoJogos.b(this.wT, 0);
    }
}

