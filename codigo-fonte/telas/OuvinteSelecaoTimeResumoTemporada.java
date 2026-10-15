package telas;

import telas.PainelResumoTemporada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSelecaoTimeResumoTemporada
implements ActionListener {
    final /* synthetic */ PainelResumoTemporada yJ;

    OuvinteSelecaoTimeResumoTemporada(PainelResumoTemporada al_02) {
        this.yJ = al_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelResumoTemporada.b(this.yJ).getSelectedIndex() >= 0) {
            PainelResumoTemporada.b(this.yJ, false);
        }
    }
}

