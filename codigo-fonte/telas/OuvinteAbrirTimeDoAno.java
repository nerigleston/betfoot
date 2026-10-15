package telas;

import telas.PainelFimTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAbrirTimeDoAno
implements ActionListener {
    final /* synthetic */ PainelFimTemporada DV;

    OuvinteAbrirTimeDoAno(PainelFimTemporada cR2) {
        this.DV = cR2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.DV.pm();
    }
}

