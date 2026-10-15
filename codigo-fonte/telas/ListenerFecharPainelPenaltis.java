package telas;

import telas.PainelAnimacaoPenaltis;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharPainelPenaltis
implements ActionListener {
    final /* synthetic */ PainelAnimacaoPenaltis zT;

    ListenerFecharPainelPenaltis(PainelAnimacaoPenaltis bg_02) {
        this.zT = bg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelAnimacaoPenaltis.a(this.zT).dispose();
    }
}

