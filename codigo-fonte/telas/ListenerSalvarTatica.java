package telas;

import telas.TelaGerenciarTaticas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSalvarTatica
implements ActionListener {
    final /* synthetic */ TelaGerenciarTaticas MB;

    ListenerSalvarTatica(TelaGerenciarTaticas il_02) {
        this.MB = il_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciarTaticas.a(this.MB);
    }
}

