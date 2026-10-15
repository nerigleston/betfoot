package telas;

import telas.PainelConfigFormatoLiga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAtualizarFormatoDivisao
implements ActionListener {
    final /* synthetic */ PainelConfigFormatoLiga GK;

    OuvinteAtualizarFormatoDivisao(PainelConfigFormatoLiga dK2) {
        this.GK = dK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConfigFormatoLiga.e(this.GK);
    }
}

