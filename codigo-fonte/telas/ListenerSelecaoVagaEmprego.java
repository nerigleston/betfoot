package telas;

import telas.PainelCentralEmpregos;
import nucleo.ModeloTime;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoVagaEmprego
implements ListSelectionListener {
    final /* synthetic */ PainelCentralEmpregos aeO;

    ListenerSelecaoVagaEmprego(PainelCentralEmpregos gE2) {
        this.aeO = gE2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelCentralEmpregos.a(this.aeO).getSelectedRow() >= 0) {
            int n2 = PainelCentralEmpregos.a(this.aeO).convertRowIndexToModel(PainelCentralEmpregos.a(this.aeO).getSelectedRow());
            PainelCentralEmpregos.a(this.aeO, (ModeloTime)PainelCentralEmpregos.b(this.aeO).get(n2));
            PainelCentralEmpregos.c(this.aeO);
        }
    }
}

