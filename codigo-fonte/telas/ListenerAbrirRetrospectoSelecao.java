package telas;

import telas.PainelRankingSelecoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirRetrospectoSelecao
implements ActionListener {
    final /* synthetic */ PainelRankingSelecoes afy;

    ListenerAbrirRetrospectoSelecao(PainelRankingSelecoes jv2) {
        this.afy = jv2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingSelecoes.e(this.afy);
    }
}

