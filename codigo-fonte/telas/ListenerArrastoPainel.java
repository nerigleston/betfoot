package telas;

import telas.PainelTesteCampoEscalacao;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class ListenerArrastoPainel
extends MouseMotionAdapter {
    final /* synthetic */ PainelTesteCampoEscalacao Ax;

    ListenerArrastoPainel(PainelTesteCampoEscalacao bu2) {
        this.Ax = bu2;
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        PainelTesteCampoEscalacao.c(this.Ax, mouseEvent);
    }
}

