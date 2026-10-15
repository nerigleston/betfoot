package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirCalendario
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerAbrirCalendario(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.b(this.MV);
    }
}

