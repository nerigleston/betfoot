package telas;

import telas.TelaInicial;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteSairTelaInicial
extends MouseAdapter {
    final /* synthetic */ TelaInicial Ke;

    OuvinteSairTelaInicial(TelaInicial gq2) {
        this.Ke = gq2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.exit(0);
    }
}

