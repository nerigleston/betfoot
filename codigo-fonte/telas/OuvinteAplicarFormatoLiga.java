package telas;

import telas.PainelConfigFormatoLiga;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAplicarFormatoLiga
implements ActionListener {
    final /* synthetic */ PainelConfigFormatoLiga GK;

    OuvinteAplicarFormatoLiga(PainelConfigFormatoLiga dK2) {
        this.GK = dK2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.GK.di((Integer)PainelConfigFormatoLiga.a(this.GK).getSelectedItem());
        PainelConfigFormatoLiga.b(this.GK).J(PainelConfigFormatoLiga.c(this.GK), (Integer)PainelConfigFormatoLiga.a(this.GK).getSelectedItem());
        PainelConfigFormatoLiga.b(this.GK).oJ();
    }
}

