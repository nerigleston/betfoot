package telas;

import telas.PainelCentralEmpregos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteEstatisticasCentralEmpregos
implements ActionListener {
    final /* synthetic */ PainelCentralEmpregos aeO;

    OuvinteEstatisticasCentralEmpregos(PainelCentralEmpregos gE2) {
        this.aeO = gE2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelCentralEmpregos.f(this.aeO) != null) {
            PainelCentralEmpregos.h(this.aeO);
        }
    }
}

