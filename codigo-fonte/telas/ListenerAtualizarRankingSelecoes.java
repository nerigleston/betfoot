package telas;

import telas.PainelRankingSelecoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAtualizarRankingSelecoes
implements ActionListener {
    final /* synthetic */ PainelRankingSelecoes afy;

    ListenerAtualizarRankingSelecoes(PainelRankingSelecoes jv2) {
        this.afy = jv2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingSelecoes.a(this.afy);
    }
}

