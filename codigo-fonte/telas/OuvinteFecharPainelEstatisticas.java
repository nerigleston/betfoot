package telas;

import telas.PainelEstatisticasPartida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteFecharPainelEstatisticas
implements ActionListener {
    final /* synthetic */ PainelEstatisticasPartida FK;

    OuvinteFecharPainelEstatisticas(PainelEstatisticasPartida dq2) {
        this.FK = dq2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelEstatisticasPartida.a(this.FK).dispose();
    }
}

