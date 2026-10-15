package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerEmprestarJogador
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerEmprestarJogador(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.g(this.MV);
    }
}

