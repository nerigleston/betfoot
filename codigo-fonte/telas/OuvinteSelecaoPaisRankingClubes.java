package telas;

import telas.PainelRankingClubes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSelecaoPaisRankingClubes
implements ActionListener {
    final /* synthetic */ PainelRankingClubes KL;

    OuvinteSelecaoPaisRankingClubes(PainelRankingClubes hc2) {
        this.KL = hc2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingClubes.c(this.KL);
    }
}

