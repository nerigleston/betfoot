package telas;

import telas.TelaVenderJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoVenda
implements ActionListener {
    final /* synthetic */ TelaVenderJogador No;

    ListenerFecharDialogoVenda(TelaVenderJogador jc2) {
        this.No = jc2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaVenderJogador.b(this.No).dispose();
    }
}

