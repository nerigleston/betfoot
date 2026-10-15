package telas;

import telas.PainelRankingClubes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharRankingClubes
implements ActionListener {
    final /* synthetic */ PainelRankingClubes KL;

    OuvinteFecharRankingClubes(PainelRankingClubes hc2) {
        this.KL = hc2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingClubes.a(this.KL).dispose();
    }
}

