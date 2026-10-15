package telas;

import telas.DialogoConstrucaoEstadio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteConfirmarExpansaoEstadio
implements ActionListener {
    final /* synthetic */ DialogoConstrucaoEstadio CE;

    OuvinteConfirmarExpansaoEstadio(DialogoConstrucaoEstadio cq_02) {
        this.CE = cq_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoConstrucaoEstadio.c(this.CE);
    }
}

