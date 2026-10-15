package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirAcademiaJuniores
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirAcademiaJuniores(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.qY();
    }
}

