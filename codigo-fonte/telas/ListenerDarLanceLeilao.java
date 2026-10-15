package telas;

import telas.TelaLeilaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerDarLanceLeilao
implements ActionListener {
    final /* synthetic */ TelaLeilaoJogador Nj;

    ListenerDarLanceLeilao(TelaLeilaoJogador iX2) {
        this.Nj = iX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaLeilaoJogador.b(this.Nj);
    }
}

