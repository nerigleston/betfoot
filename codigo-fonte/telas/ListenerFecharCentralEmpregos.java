package telas;

import telas.PainelCentralEmpregos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharCentralEmpregos
implements ActionListener {
    final /* synthetic */ PainelCentralEmpregos aeO;

    ListenerFecharCentralEmpregos(PainelCentralEmpregos gE2) {
        this.aeO = gE2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCentralEmpregos.e(this.aeO).dispose();
    }
}

