package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFazerOfertaJogador
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerFazerOfertaJogador(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.i(this.MV);
    }
}

