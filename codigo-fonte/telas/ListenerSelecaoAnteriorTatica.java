package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoAnteriorTatica
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerSelecaoAnteriorTatica(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaEscalacao.c(this.Bq).getSelectedIndex() > 0) {
            TelaEscalacao.a(this.Bq, TelaEscalacao.c(this.Bq).getSelectedIndex() - 1);
        }
    }
}

