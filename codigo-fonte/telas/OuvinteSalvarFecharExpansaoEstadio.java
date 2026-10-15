package telas;

import telas.DialogoExpansaoEstadio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSalvarFecharExpansaoEstadio
implements ActionListener {
    final /* synthetic */ DialogoExpansaoEstadio Cm;

    OuvinteSalvarFecharExpansaoEstadio(DialogoExpansaoEstadio cl_02) {
        this.Cm = cl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoExpansaoEstadio.a(this.Cm);
        DialogoExpansaoEstadio.b(this.Cm).dispose();
    }
}

