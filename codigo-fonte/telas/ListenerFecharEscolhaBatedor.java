package telas;

import telas.PainelEscolhaBatedorPenalty;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharEscolhaBatedor
implements ActionListener {
    final /* synthetic */ PainelEscolhaBatedorPenalty JW;

    ListenerFecharEscolhaBatedor(PainelEscolhaBatedorPenalty gh_02) {
        this.JW = gh_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelEscolhaBatedorPenalty.a(this.JW).dispose();
    }
}

