package telas;

import telas.PainelFinancas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerPegarEmprestimo
implements ActionListener {
    final /* synthetic */ PainelFinancas Ee;

    ListenerPegarEmprestimo(PainelFinancas cW2) {
        this.Ee = cW2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelFinancas.a(this.Ee, 1);
    }
}

