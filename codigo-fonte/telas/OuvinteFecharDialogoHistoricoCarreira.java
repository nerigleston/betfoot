package telas;

import telas.PainelHistoricoCarreiraJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoHistoricoCarreira
implements ActionListener {
    final /* synthetic */ PainelHistoricoCarreiraJogador Fm;

    OuvinteFecharDialogoHistoricoCarreira(PainelHistoricoCarreiraJogador dk_02) {
        this.Fm = dk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelHistoricoCarreiraJogador.a(this.Fm).dispose();
    }
}

