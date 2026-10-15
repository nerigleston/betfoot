package telas;

import telas.PainelNumeracaoElenco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteEscolherNumeroElenco
implements ActionListener {
    final /* synthetic */ PainelNumeracaoElenco BW;

    OuvinteEscolherNumeroElenco(PainelNumeracaoElenco ce2) {
        this.BW = ce2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelNumeracaoElenco.b(this.BW);
    }
}

