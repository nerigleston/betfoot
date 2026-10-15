package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteMenuUltimasTrocasTecnicos
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    OuvinteMenuUltimasTrocasTecnicos(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.dp(1);
    }
}

