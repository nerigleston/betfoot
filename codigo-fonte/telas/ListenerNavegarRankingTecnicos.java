package telas;

import telas.PainelRankingTecnicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerNavegarRankingTecnicos
implements ActionListener {
    final /* synthetic */ PainelRankingTecnicos KE;

    ListenerNavegarRankingTecnicos(PainelRankingTecnicos gX2) {
        this.KE = gX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingTecnicos.a(this.KE);
    }
}

