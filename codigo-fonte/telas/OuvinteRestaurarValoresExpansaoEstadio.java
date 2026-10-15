package telas;

import telas.DialogoExpansaoEstadio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteRestaurarValoresExpansaoEstadio
implements ActionListener {
    final /* synthetic */ DialogoExpansaoEstadio Cm;

    OuvinteRestaurarValoresExpansaoEstadio(DialogoExpansaoEstadio cl_02) {
        this.Cm = cl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoExpansaoEstadio.d(this.Cm);
    }
}

