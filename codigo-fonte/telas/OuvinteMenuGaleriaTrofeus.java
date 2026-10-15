package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteMenuGaleriaTrofeus
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    OuvinteMenuGaleriaTrofeus(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.r(this.Iz);
    }
}

