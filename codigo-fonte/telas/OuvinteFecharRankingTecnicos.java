package telas;

import telas.PainelRankingTecnicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharRankingTecnicos
implements ActionListener {
    final /* synthetic */ PainelRankingTecnicos KE;

    OuvinteFecharRankingTecnicos(PainelRankingTecnicos gX2) {
        this.KE = gX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingTecnicos.b(this.KE).dispose();
    }
}

