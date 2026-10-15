package telas;

import telas.PainelConfigFormatoLiga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAlterarNumeroRebaixados
implements ActionListener {
    final /* synthetic */ PainelConfigFormatoLiga GK;

    OuvinteAlterarNumeroRebaixados(PainelConfigFormatoLiga dK2) {
        this.GK = dK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConfigFormatoLiga.d(this.GK);
    }
}

