package testes;

import motor.GerenciadorJogo;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerPassarDia
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    ListenerPassarDia(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.SR.V();
    }
}

