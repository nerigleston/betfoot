package telas;

import telas.PainelCentralEmpregos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFiltrarTimes
implements ActionListener {
    final /* synthetic */ PainelCentralEmpregos aeO;

    ListenerFiltrarTimes(PainelCentralEmpregos gE2) {
        this.aeO = gE2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCentralEmpregos.a(this.aeO, 0);
    }
}

