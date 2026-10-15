package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirTransferencias
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerAbrirTransferencias(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.c(this.MV);
    }
}

