package telas;

import telas.TelaVenderJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAcaoVenda
implements ActionListener {
    final /* synthetic */ TelaVenderJogador No;

    ListenerAcaoVenda(TelaVenderJogador jc2) {
        this.No = jc2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaVenderJogador.c(this.No);
    }
}

