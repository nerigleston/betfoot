package telas;

import telas.PainelCalendarioTime;
import tabelas.ModeloTabelaPartidas;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoLinhaCalendario
implements ListSelectionListener {
    final /* synthetic */ PainelCalendarioTime vO;

    ListenerSelecaoLinhaCalendario(PainelCalendarioTime l2) {
        this.vO = l2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelCalendarioTime.c(this.vO).getSelectedRow() >= 0) {
            int n2 = PainelCalendarioTime.c(this.vO).convertRowIndexToModel(PainelCalendarioTime.c(this.vO).getSelectedRow());
            PainelCalendarioTime.a(this.vO, ((ModeloTabelaPartidas)PainelCalendarioTime.c(this.vO).getModel()).es(n2));
        }
    }
}

