package telas;

import telas.PainelConfigFormatoLiga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteTipoFormatoDivisao
implements ActionListener {
    final /* synthetic */ PainelConfigFormatoLiga GK;

    OuvinteTipoFormatoDivisao(PainelConfigFormatoLiga dK2) {
        this.GK = dK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.GK.AG();
    }
}

