package telas;

import telas.DialogoConfigCampeonatosEstaduais;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteResetarConfigEstadual
implements ActionListener {
    final /* synthetic */ DialogoConfigCampeonatosEstaduais CX;

    OuvinteResetarConfigEstadual(DialogoConfigCampeonatosEstaduais cw_02) {
        this.CX = cw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.CX.nH();
    }
}

