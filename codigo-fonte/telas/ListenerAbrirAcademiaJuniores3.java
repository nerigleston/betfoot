package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirAcademiaJuniores3
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerAbrirAcademiaJuniores3(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.MV.qY();
    }
}

