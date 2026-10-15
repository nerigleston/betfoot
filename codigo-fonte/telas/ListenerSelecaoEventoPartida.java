package telas;

import telas.PainelPartidaAoVivo;
import components.ItemPartidaAoVivo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerSelecaoEventoPartida
extends MouseAdapter {
    final /* synthetic */ PainelPartidaAoVivo Hu;

    ListenerSelecaoEventoPartida(PainelPartidaAoVivo dV2) {
        this.Hu = dV2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        int n2 = PainelPartidaAoVivo.b(this.Hu).rowAtPoint(mouseEvent.getPoint());
        if (n2 >= 0 && ((ItemPartidaAoVivo)PainelPartidaAoVivo.qo().get(n2)).tR() != null) {
            PainelPartidaAoVivo.b(this.Hu, n2);
        }
    }
}

