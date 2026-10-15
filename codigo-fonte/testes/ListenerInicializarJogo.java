package testes;

import nucleo.IniciadorCarreira;
import motor.GerenciadorJogo;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerInicializarJogo
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    ListenerInicializarJogo(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        IniciadorCarreira.dg();
        IniciadorCarreira.dh();
        GerenciadorJogo.SR.az();
    }
}

