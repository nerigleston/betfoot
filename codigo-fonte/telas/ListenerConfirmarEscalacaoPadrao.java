package telas;

import telas.TelaEscalacaoPadrao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarEscalacaoPadrao
implements ActionListener {
    final /* synthetic */ TelaEscalacaoPadrao zt;

    ListenerConfirmarEscalacaoPadrao(TelaEscalacaoPadrao ax_02) {
        this.zt = ax_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaEscalacaoPadrao.a(this.zt);
        TelaEscalacaoPadrao.b(this.zt).dispose();
    }
}

