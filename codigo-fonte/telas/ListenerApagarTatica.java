package telas;

import telas.TelaGerenciarTaticas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerApagarTatica
implements ActionListener {
    final /* synthetic */ TelaGerenciarTaticas MB;

    ListenerApagarTatica(TelaGerenciarTaticas il_02) {
        this.MB = il_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaGerenciarTaticas.c(this.MB);
    }
}

