package telas;

import telas.TelaEscalacaoPadrao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteCliqueCorPosicao
extends MouseAdapter {
    final /* synthetic */ TelaEscalacaoPadrao zt;

    OuvinteCliqueCorPosicao(TelaEscalacaoPadrao ax_02) {
        this.zt = ax_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaEscalacaoPadrao.a(this.zt, mouseEvent.getComponent());
    }
}

