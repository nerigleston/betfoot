package telas;

import telas.TelaEscalacaoPadrao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSetarPadraoEscalacao
implements ActionListener {
    final /* synthetic */ TelaEscalacaoPadrao zt;

    ListenerSetarPadraoEscalacao(TelaEscalacaoPadrao ax_02) {
        this.zt = ax_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacaoPadrao.c(this.zt);
    }
}

