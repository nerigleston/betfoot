package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoOpcaoTaticaA
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerSelecaoOpcaoTaticaA(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaEscalacao.d(this.Bq).getSelectedIndex() >= 0) {
            TelaEscalacao.e((TelaEscalacao)this.Bq).kj()[1] = TelaEscalacao.d(this.Bq).getSelectedIndex();
        }
    }
}

