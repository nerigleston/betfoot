package telas;

import telas.PainelPartidaAoVivo2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteEstatisticasPartidaAoVivo
implements ActionListener {
    final /* synthetic */ PainelPartidaAoVivo2 Lt;

    OuvinteEstatisticasPartidaAoVivo(PainelPartidaAoVivo2 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPartidaAoVivo2.c(this.Lt);
    }
}

