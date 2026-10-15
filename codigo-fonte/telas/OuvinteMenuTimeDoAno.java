package telas;

import telas.PainelPrincipalClube;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteMenuTimeDoAno
implements ActionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    OuvinteMenuTimeDoAno(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Iz.do_1(1);
    }
}

