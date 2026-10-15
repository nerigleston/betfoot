package components;

import components.PainelCancelarEmprestimo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarCancelamento
implements ActionListener {
    final /* synthetic */ PainelCancelarEmprestimo Qo;

    ListenerConfirmarCancelamento(PainelCancelarEmprestimo h_02) {
        this.Qo = h_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelCancelarEmprestimo.a(this.Qo);
    }
}

