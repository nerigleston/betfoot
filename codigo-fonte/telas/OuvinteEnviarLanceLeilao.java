package telas;

import telas.PainelFichaJogador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class OuvinteEnviarLanceLeilao
extends MouseAdapter {
    final /* synthetic */ PainelFichaJogador Gn;

    OuvinteEnviarLanceLeilao(PainelFichaJogador dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        PainelFichaJogador.b(this.Gn);
    }
}

