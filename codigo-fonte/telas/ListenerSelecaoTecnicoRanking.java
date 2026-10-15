package telas;

import telas.PainelRankingTecnicos;
import nucleo.Campeonato;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoTecnicoRanking
implements ListSelectionListener {
    final /* synthetic */ PainelRankingTecnicos KE;

    ListenerSelecaoTecnicoRanking(PainelRankingTecnicos gX2) {
        this.KE = gX2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelRankingTecnicos.d(this.KE).getSelectedRow() >= 0) {
            int n2 = PainelRankingTecnicos.d(this.KE).convertRowIndexToModel(PainelRankingTecnicos.d(this.KE).getSelectedRow());
            PainelRankingTecnicos.a(this.KE, (Campeonato)PainelRankingTecnicos.e(this.KE).get(n2));
            this.KE.rV();
        }
    }
}

