package telas;

import telas.PainelRankingSelecoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharRankingSelecoes
implements ActionListener {
    final /* synthetic */ PainelRankingSelecoes afy;

    ListenerFecharRankingSelecoes(PainelRankingSelecoes jv2) {
        this.afy = jv2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingSelecoes.b(this.afy).dispose();
    }
}

