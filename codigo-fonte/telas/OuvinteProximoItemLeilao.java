package telas;

import telas.PainelFichaJogador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteProximoItemLeilao
extends MouseAdapter {
    final /* synthetic */ PainelFichaJogador Gn;

    OuvinteProximoItemLeilao(PainelFichaJogador dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelFichaJogador.d(this.Gn);
    }
}

