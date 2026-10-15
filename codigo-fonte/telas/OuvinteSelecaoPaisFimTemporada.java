package telas;

import telas.PainelFimTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSelecaoPaisFimTemporada
implements ActionListener {
    final /* synthetic */ PainelFimTemporada DV;

    OuvinteSelecaoPaisFimTemporada(PainelFimTemporada cR2) {
        this.DV = cR2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelFimTemporada.a(this.DV);
    }
}

