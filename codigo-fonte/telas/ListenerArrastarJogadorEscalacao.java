package telas;

import telas.TelaEscalacao;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class ListenerArrastarJogadorEscalacao
extends MouseMotionAdapter {
    final /* synthetic */ TelaEscalacao Bq;

    ListenerArrastarJogadorEscalacao(TelaEscalacao bz2) {
        this.Bq = bz2;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        TelaEscalacao.d(this.Bq, mouseEvent);
    }
}

