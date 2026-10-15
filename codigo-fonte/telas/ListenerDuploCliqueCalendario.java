package telas;

import telas.PainelCalendarioTime;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerDuploCliqueCalendario
extends MouseAdapter {
    final /* synthetic */ PainelCalendarioTime vO;

    ListenerDuploCliqueCalendario(PainelCalendarioTime l2) {
        this.vO = l2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.vO.mZ();
        }
    }
}

