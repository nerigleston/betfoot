package telas;

import telas.TelaInicial;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteCarregarJogoTelaInicial
extends MouseAdapter {
    final /* synthetic */ TelaInicial Ke;

    OuvinteCarregarJogoTelaInicial(TelaInicial gq2) {
        this.Ke = gq2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaInicial.f(this.Ke).setCursor(new Cursor(3));
        TelaInicial.g(this.Ke);
        TelaInicial.f(this.Ke).setCursor(new Cursor(12));
    }
}

