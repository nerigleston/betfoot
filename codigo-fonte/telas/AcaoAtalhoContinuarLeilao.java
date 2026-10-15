package telas;

import telas.PainelFichaJogador;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoAtalhoContinuarLeilao
extends AbstractAction {
    final /* synthetic */ PainelFichaJogador Gn;

    AcaoAtalhoContinuarLeilao(PainelFichaJogador dz_02) {
        this.Gn = dz_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelFichaJogador.a(this.Gn);
    }
}

