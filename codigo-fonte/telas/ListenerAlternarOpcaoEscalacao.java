package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAlternarOpcaoEscalacao
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerAlternarOpcaoEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacao.a(this.Bq, !TelaEscalacao.h(this.Bq));
        this.Bq.oe();
    }
}

