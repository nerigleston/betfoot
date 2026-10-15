package telas;

import telas.PainelRankingSelecoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirGaleriaTrofeusSelecao
implements ActionListener {
    final /* synthetic */ PainelRankingSelecoes afy;

    ListenerAbrirGaleriaTrofeusSelecao(PainelRankingSelecoes jv2) {
        this.afy = jv2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingSelecoes.d(this.afy);
    }
}

