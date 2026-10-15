package telas;

import telas.PainelRankingSelecoes;
import components.ItemRankingTime;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoRankingSelecoes
implements ListSelectionListener {
    final /* synthetic */ PainelRankingSelecoes afy;

    ListenerSelecaoRankingSelecoes(PainelRankingSelecoes jv2) {
        this.afy = jv2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelRankingSelecoes.f(this.afy).getSelectedRow() >= 0) {
            int n2 = PainelRankingSelecoes.f(this.afy).convertRowIndexToModel(PainelRankingSelecoes.f(this.afy).getSelectedRow());
            PainelRankingSelecoes.a(this.afy, ((ItemRankingTime)PainelRankingSelecoes.g(this.afy).get(n2)).fg());
        }
    }
}

