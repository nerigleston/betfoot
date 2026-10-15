package telas;

import telas.PainelRankingTecnicos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirGaleriaTrofeusTecnico
implements ActionListener {
    final /* synthetic */ PainelRankingTecnicos KE;

    ListenerAbrirGaleriaTrofeusTecnico(PainelRankingTecnicos gX2) {
        this.KE = gX2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelRankingTecnicos.c(this.KE);
    }
}

