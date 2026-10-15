package telas;

import telas.TelaChaveamentoCopa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerProximaRodadaChaveamento
extends MouseAdapter {
    final /* synthetic */ TelaChaveamentoCopa wq;

    ListenerProximaRodadaChaveamento(TelaChaveamentoCopa aa2) {
        this.wq = aa2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        TelaChaveamentoCopa.a(this.wq, TelaChaveamentoCopa.b(this.wq) + 1);
    }
}

