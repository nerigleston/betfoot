package telas;

import telas.TelaGerenciamentoClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirRetrospectoTime2
implements ActionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerAbrirRetrospectoTime2(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciamentoClube.e(this.MV);
    }
}

