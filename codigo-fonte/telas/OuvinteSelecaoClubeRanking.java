package telas;

import telas.PainelRankingClubes;
import components.ItemRankingTime;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class OuvinteSelecaoClubeRanking
implements ListSelectionListener {
    final /* synthetic */ PainelRankingClubes KL;

    OuvinteSelecaoClubeRanking(PainelRankingClubes hc2) {
        this.KL = hc2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelRankingClubes.e(this.KL).getSelectedRow() >= 0) {
            int n2 = PainelRankingClubes.e(this.KL).convertRowIndexToModel(PainelRankingClubes.e(this.KL).getSelectedRow());
            PainelRankingClubes.a(this.KL, ((ItemRankingTime)PainelRankingClubes.f(this.KL).get(n2)).fg());
            PainelRankingClubes.g(this.KL);
        }
    }
}

