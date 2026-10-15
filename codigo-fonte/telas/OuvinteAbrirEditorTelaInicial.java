package telas;

import telas.TelaInicial;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteAbrirEditorTelaInicial
extends MouseAdapter {
    final /* synthetic */ TelaInicial Ke;

    OuvinteAbrirEditorTelaInicial(TelaInicial gq2) {
        this.Ke = gq2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaInicial.c(this.Ke).setCursor(new Cursor(3));
        TelaInicial.d(this.Ke);
        TelaInicial.c(this.Ke).setCursor(new Cursor(12));
    }
}

