package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirRetrospectoTime
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerAbrirRetrospectoTime(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPrincipalClube.s(this.Iz);
    }
}

