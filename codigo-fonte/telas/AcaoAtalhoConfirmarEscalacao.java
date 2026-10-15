package telas;

import telas.TelaEscalacao;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoConfirmarEscalacao
extends AbstractAction {
    final /* synthetic */ TelaEscalacao Bq;

    AcaoAtalhoConfirmarEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Bq.oh();
    }
}

