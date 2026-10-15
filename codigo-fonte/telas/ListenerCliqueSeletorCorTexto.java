package telas;

import telas.PainelCoresTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerCliqueSeletorCorTexto
extends MouseAdapter {
    final /* synthetic */ PainelCoresTime zy;

    ListenerCliqueSeletorCorTexto(PainelCoresTime bb2) {
        this.zy = bb2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelCoresTime.a(this.zy, mouseEvent.getComponent());
    }
}

