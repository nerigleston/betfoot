package telas;

import telas.PainelNumeracaoElenco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteNumeracaoAutomaticaElenco
implements ActionListener {
    final /* synthetic */ PainelNumeracaoElenco BW;

    OuvinteNumeracaoAutomaticaElenco(PainelNumeracaoElenco ce2) {
        this.BW = ce2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelNumeracaoElenco.d(this.BW);
    }
}

