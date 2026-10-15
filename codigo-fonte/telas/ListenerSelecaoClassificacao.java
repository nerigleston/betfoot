package telas;

import telas.TelaClassificacaoJogos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoClassificacao
implements ActionListener {
    final /* synthetic */ TelaClassificacaoJogos wT;

    ListenerSelecaoClassificacao(TelaClassificacaoJogos al2) {
        this.wT = al2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaClassificacaoJogos.a(this.wT).getSelectedIndex() >= 0) {
            TelaClassificacaoJogos.a(this.wT, TelaClassificacaoJogos.a(this.wT).getSelectedIndex());
        }
    }
}

