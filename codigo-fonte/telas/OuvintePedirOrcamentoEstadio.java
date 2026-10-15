package telas;

import telas.DialogoConstrucaoEstadio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvintePedirOrcamentoEstadio
implements ActionListener {
    final /* synthetic */ DialogoConstrucaoEstadio CE;

    OuvintePedirOrcamentoEstadio(DialogoConstrucaoEstadio cq_02) {
        this.CE = cq_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoConstrucaoEstadio.b(this.CE);
    }
}

