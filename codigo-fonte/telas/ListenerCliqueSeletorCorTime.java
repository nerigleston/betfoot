package telas;

import telas.PainelCoresTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerCliqueSeletorCorTime
extends MouseAdapter {
    final /* synthetic */ PainelCoresTime zy;

    ListenerCliqueSeletorCorTime(PainelCoresTime bb2) {
        this.zy = bb2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelCoresTime.a(this.zy, mouseEvent.getComponent());
    }
}

