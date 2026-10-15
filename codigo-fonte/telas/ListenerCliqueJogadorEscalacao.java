package telas;

import telas.TelaEscalacao;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerCliqueJogadorEscalacao
extends MouseAdapter {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerCliqueJogadorEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        TelaEscalacao.b(this.Bq, mouseEvent);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        TelaEscalacao.c(this.Bq, mouseEvent);
    }
}

