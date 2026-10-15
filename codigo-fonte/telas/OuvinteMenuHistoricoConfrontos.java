package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteMenuHistoricoConfrontos
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    OuvinteMenuHistoricoConfrontos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.rh();
    }
}

