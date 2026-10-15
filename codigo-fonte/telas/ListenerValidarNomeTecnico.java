package telas;

import telas.DialogoNegociacaoJogador;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class ListenerValidarNomeTecnico
implements DocumentListener {
    final /* synthetic */ DialogoNegociacaoJogador Da;

    ListenerValidarNomeTecnico(DialogoNegociacaoJogador cz_02) {
        this.Da = cz_02;
    }

    @Override
    public void changedUpdate(DocumentEvent documentEvent) {
        DialogoNegociacaoJogador.c(this.Da);
    }

    @Override
    public void insertUpdate(DocumentEvent documentEvent) {
        DialogoNegociacaoJogador.c(this.Da);
    }

    @Override
    public void removeUpdate(DocumentEvent documentEvent) {
        DialogoNegociacaoJogador.c(this.Da);
    }
}

