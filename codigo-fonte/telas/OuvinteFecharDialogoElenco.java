package telas;

import telas.PainelNumeracaoElenco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharDialogoElenco
implements ActionListener {
    final /* synthetic */ PainelNumeracaoElenco BW;

    OuvinteFecharDialogoElenco(PainelNumeracaoElenco ce2) {
        this.BW = ce2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelNumeracaoElenco.a(this.BW).dispose();
    }
}

