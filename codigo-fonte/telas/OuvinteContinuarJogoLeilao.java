package telas;

import telas.PainelFichaJogador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteContinuarJogoLeilao
extends MouseAdapter {
    final /* synthetic */ PainelFichaJogador Gn;

    OuvinteContinuarJogoLeilao(PainelFichaJogador dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelFichaJogador.a(this.Gn);
    }
}

