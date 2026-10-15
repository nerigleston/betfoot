package telas;

import telas.PainelRankingSelecoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirCalendarioSelecao2
implements ActionListener {
    final /* synthetic */ PainelRankingSelecoes afy;

    ListenerAbrirCalendarioSelecao2(PainelRankingSelecoes jv2) {
        this.afy = jv2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingSelecoes.c(this.afy);
    }
}

