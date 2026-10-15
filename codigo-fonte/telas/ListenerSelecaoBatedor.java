package telas;

import telas.PainelEscolhaBatedorPenalty;
import tabelas.ModeloTabelaJogadoresCaracteristicas;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoBatedor
implements ListSelectionListener {
    final /* synthetic */ PainelEscolhaBatedorPenalty JW;

    ListenerSelecaoBatedor(PainelEscolhaBatedorPenalty gh_02) {
        this.JW = gh_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelEscolhaBatedorPenalty.c(this.JW).getSelectedRow() >= 0) {
            int n2 = PainelEscolhaBatedorPenalty.c(this.JW).convertRowIndexToModel(PainelEscolhaBatedorPenalty.c(this.JW).getSelectedRow());
            ((ModeloTabelaJogadoresCaracteristicas)PainelEscolhaBatedorPenalty.c(this.JW).getModel()).et(n2);
        }
    }
}

