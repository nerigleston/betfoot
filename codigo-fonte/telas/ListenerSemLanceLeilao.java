package telas;

import telas.TelaLeilaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSemLanceLeilao
implements ActionListener {
    final /* synthetic */ TelaLeilaoJogador Nj;

    ListenerSemLanceLeilao(TelaLeilaoJogador iX2) {
        this.Nj = iX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaLeilaoJogador.c(this.Nj);
    }
}

