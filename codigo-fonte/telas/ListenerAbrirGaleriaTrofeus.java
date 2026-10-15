package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirGaleriaTrofeus
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirGaleriaTrofeus(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.r(this.Iz);
    }
}

