package telas;

import telas.TelaLeilaoJogador;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class ListenerValidarValorLeilao
implements DocumentListener {
    final /* synthetic */ TelaLeilaoJogador Nj;

    ListenerValidarValorLeilao(TelaLeilaoJogador iX2) {
        this.Nj = iX2;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        TelaLeilaoJogador.d(this.Nj);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        TelaLeilaoJogador.d(this.Nj);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        TelaLeilaoJogador.d(this.Nj);
    }
}

