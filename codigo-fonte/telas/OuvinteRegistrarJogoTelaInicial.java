package telas;

import telas.TelaInicial;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteRegistrarJogoTelaInicial
extends MouseAdapter {
    final /* synthetic */ TelaInicial Ke;

    OuvinteRegistrarJogoTelaInicial(TelaInicial gq2) {
        this.Ke = gq2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaInicial.e(this.Ke);
    }
}

