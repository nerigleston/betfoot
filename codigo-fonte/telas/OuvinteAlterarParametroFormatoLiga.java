package telas;

import telas.PainelConfigFormatoLiga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAlterarParametroFormatoLiga
implements ActionListener {
    final /* synthetic */ PainelConfigFormatoLiga GK;

    OuvinteAlterarParametroFormatoLiga(PainelConfigFormatoLiga dK2) {
        this.GK = dK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConfigFormatoLiga.a(this.GK, (Integer)PainelConfigFormatoLiga.a(this.GK).getSelectedItem(), false);
    }
}

