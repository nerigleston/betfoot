package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerTeclaEscFecharTela
extends AbstractAction {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerTeclaEscFecharTela(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.a(this.MV).dispose();
    }
}

