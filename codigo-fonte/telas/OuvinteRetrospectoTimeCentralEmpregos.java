package telas;

import telas.PainelCentralEmpregos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteRetrospectoTimeCentralEmpregos
implements ActionListener {
    final /* synthetic */ PainelCentralEmpregos aeO;

    OuvinteRetrospectoTimeCentralEmpregos(PainelCentralEmpregos gE2) {
        this.aeO = gE2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelCentralEmpregos.f(this.aeO) != null) {
            PainelCentralEmpregos.i(this.aeO);
        }
    }
}

