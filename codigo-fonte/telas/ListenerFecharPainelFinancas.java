package telas;

import telas.PainelFinancas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharPainelFinancas
implements ActionListener {
    final /* synthetic */ PainelFinancas Ee;

    ListenerFecharPainelFinancas(PainelFinancas cW2) {
        this.Ee = cW2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelFinancas.a(this.Ee).dispose();
    }
}

