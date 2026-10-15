package telas;

import telas.TelaLeilaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharTelaLeilao
implements ActionListener {
    final /* synthetic */ TelaLeilaoJogador Nj;

    ListenerFecharTelaLeilao(TelaLeilaoJogador iX2) {
        this.Nj = iX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaLeilaoJogador.a(this.Nj).dispose();
    }
}

