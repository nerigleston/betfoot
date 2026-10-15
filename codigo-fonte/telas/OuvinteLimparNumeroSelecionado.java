package telas;

import telas.PainelNumeracaoElenco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteLimparNumeroSelecionado
implements ActionListener {
    final /* synthetic */ PainelNumeracaoElenco BW;

    OuvinteLimparNumeroSelecionado(PainelNumeracaoElenco ce2) {
        this.BW = ce2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelNumeracaoElenco.e(this.BW);
    }
}

