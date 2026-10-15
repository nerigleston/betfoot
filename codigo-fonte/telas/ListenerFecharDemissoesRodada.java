package telas;

import telas.PainelDemissoesRodada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDemissoesRodada
implements ActionListener {
    final /* synthetic */ PainelDemissoesRodada zW;

    ListenerFecharDemissoesRodada(PainelDemissoesRodada bl_02) {
        this.zW = bl_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelDemissoesRodada.a(this.zW).dispose();
    }
}

