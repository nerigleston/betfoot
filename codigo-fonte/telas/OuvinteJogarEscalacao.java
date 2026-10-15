package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteJogarEscalacao
implements ActionListener {
    final /* synthetic */ TelaEscalacao Bq;

    OuvinteJogarEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Bq.oh();
    }
}

