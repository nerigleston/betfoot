package telas;

import telas.PainelUltimasMovimentacoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFiltroTimeMovimentacoes
implements ActionListener {
    final /* synthetic */ PainelUltimasMovimentacoes LD;

    OuvinteFiltroTimeMovimentacoes(PainelUltimasMovimentacoes hc_02) {
        this.LD = hc_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelUltimasMovimentacoes.a(this.LD).getItemCount() > 0) {
            PainelUltimasMovimentacoes.b(this.LD);
        }
    }
}

