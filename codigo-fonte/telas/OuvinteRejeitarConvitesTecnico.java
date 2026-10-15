package telas;

import telas.PainelConvitesTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteRejeitarConvitesTecnico
implements ActionListener {
    final /* synthetic */ PainelConvitesTecnico Kz;

    OuvinteRejeitarConvitesTecnico(PainelConvitesTecnico gO2) {
        this.Kz = gO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConvitesTecnico.b(this.Kz).dispose();
    }
}

