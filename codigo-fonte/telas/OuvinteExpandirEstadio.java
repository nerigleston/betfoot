package telas;

import telas.DialogoExpansaoEstadio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteExpandirEstadio
implements ActionListener {
    final /* synthetic */ DialogoExpansaoEstadio Cm;

    OuvinteExpandirEstadio(DialogoExpansaoEstadio cl_02) {
        this.Cm = cl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Cm.oG();
    }
}

