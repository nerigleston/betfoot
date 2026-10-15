package telas;

import telas.TelaChaveamentoCopa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerFaseAnteriorChaveamento
extends MouseAdapter {
    final /* synthetic */ TelaChaveamentoCopa wq;

    ListenerFaseAnteriorChaveamento(TelaChaveamentoCopa aa2) {
        this.wq = aa2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaChaveamentoCopa.b(this.wq, TelaChaveamentoCopa.c(this.wq) - 1);
    }
}

