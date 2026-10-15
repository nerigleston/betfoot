package telas;

import telas.PainelUltimasMovimentacoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharMovimentacoes
implements ActionListener {
    final /* synthetic */ PainelUltimasMovimentacoes LD;

    OuvinteFecharMovimentacoes(PainelUltimasMovimentacoes hc_02) {
        this.LD = hc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelUltimasMovimentacoes.c(this.LD).dispose();
    }
}

