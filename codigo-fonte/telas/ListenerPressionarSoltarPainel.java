package telas;

import telas.PainelTesteCampoEscalacao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerPressionarSoltarPainel
extends MouseAdapter {
    final /* synthetic */ PainelTesteCampoEscalacao Ax;

    ListenerPressionarSoltarPainel(PainelTesteCampoEscalacao bu2) {
        this.Ax = bu2;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        PainelTesteCampoEscalacao.a(this.Ax, mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        PainelTesteCampoEscalacao.b(this.Ax, mouseEvent);
    }
}

