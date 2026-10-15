package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteVazioBotaoAgenda
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    OuvinteVazioBotaoAgenda(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.a(this.Iz, actionEvent);
    }
}

