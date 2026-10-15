package telas;

import telas.PainelNumeracaoElenco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteLimparTodosNumerosElenco
implements ActionListener {
    final /* synthetic */ PainelNumeracaoElenco BW;

    OuvinteLimparTodosNumerosElenco(PainelNumeracaoElenco ce2) {
        this.BW = ce2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelNumeracaoElenco.c(this.BW);
    }
}

