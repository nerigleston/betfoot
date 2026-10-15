package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerComprarJogador2
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerComprarJogador2(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.h(this.MV);
    }
}

