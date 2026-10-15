package telas;

import telas.PainelPartidaAoVivo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteCliqueListaPartida
extends MouseAdapter {
    final /* synthetic */ PainelPartidaAoVivo Hu;

    OuvinteCliqueListaPartida(PainelPartidaAoVivo dV2) {
        this.Hu = dV2;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (PainelPartidaAoVivo.c(this.Hu) >= 0) {
            PainelPartidaAoVivo.b(this.Hu, PainelPartidaAoVivo.c(this.Hu));
        }
    }
}

