package telas;

import telas.PainelFimTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteIniciarNovoAno
implements ActionListener {
    final /* synthetic */ PainelFimTemporada DV;

    OuvinteIniciarNovoAno(PainelFimTemporada cR2) {
        this.DV = cR2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.DV.pn();
    }
}

