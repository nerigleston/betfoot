package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoOpcaoTaticaB
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerSelecaoOpcaoTaticaB(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaEscalacao.f(this.Bq).getSelectedIndex() >= 0) {
            TelaEscalacao.e((TelaEscalacao)this.Bq).kj()[2] = TelaEscalacao.f(this.Bq).getSelectedIndex();
        }
    }
}

