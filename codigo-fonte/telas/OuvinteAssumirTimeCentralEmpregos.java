package telas;

import telas.PainelCentralEmpregos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteAssumirTimeCentralEmpregos
implements ActionListener {
    final /* synthetic */ PainelCentralEmpregos aeO;

    OuvinteAssumirTimeCentralEmpregos(PainelCentralEmpregos gE2) {
        this.aeO = gE2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCentralEmpregos.d(this.aeO);
    }
}

