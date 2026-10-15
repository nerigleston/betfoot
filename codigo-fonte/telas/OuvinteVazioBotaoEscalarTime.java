package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteVazioBotaoEscalarTime
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    OuvinteVazioBotaoEscalarTime(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.b(this.Iz, actionEvent);
    }
}

