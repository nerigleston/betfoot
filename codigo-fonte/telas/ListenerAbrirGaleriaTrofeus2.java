package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirGaleriaTrofeus2
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerAbrirGaleriaTrofeus2(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.d(this.MV);
    }
}

