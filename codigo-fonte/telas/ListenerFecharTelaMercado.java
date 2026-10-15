package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharTelaMercado
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerFecharTelaMercado(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.a(this.MV).dispose();
    }
}

