package telas;

import telas.TelaInicial;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteAbrirJogoTelaInicial
extends MouseAdapter {
    final /* synthetic */ TelaInicial Ke;

    OuvinteAbrirJogoTelaInicial(TelaInicial gq2) {
        this.Ke = gq2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaInicial.a(this.Ke).setCursor(new Cursor(3));
        TelaInicial.b(this.Ke);
        TelaInicial.a(this.Ke).setCursor(new Cursor(12));
    }
}

