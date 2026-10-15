package telas;

import telas.TelaVenderJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerModoVendaFixarPreco
implements ActionListener {
    final /* synthetic */ TelaVenderJogador No;

    ListenerModoVendaFixarPreco(TelaVenderJogador jc2) {
        this.No = jc2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaVenderJogador.a(this.No, 2);
    }
}

