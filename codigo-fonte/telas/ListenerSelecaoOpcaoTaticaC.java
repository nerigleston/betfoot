package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoOpcaoTaticaC
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerSelecaoOpcaoTaticaC(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (TelaEscalacao.g(this.Bq).getSelectedIndex() >= 0) {
            TelaEscalacao.e((TelaEscalacao)this.Bq).kj()[3] = TelaEscalacao.g(this.Bq).getSelectedIndex();
        }
    }
}

