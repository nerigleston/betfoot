package telas;

import telas.TelaVenderJogador;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class ListenerAtualizacaoPrecoVenda
implements DocumentListener {
    final /* synthetic */ TelaVenderJogador No;

    ListenerAtualizacaoPrecoVenda(TelaVenderJogador jc2) {
        this.No = jc2;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        TelaVenderJogador.a(this.No);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        TelaVenderJogador.a(this.No);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        TelaVenderJogador.a(this.No);
    }
}

