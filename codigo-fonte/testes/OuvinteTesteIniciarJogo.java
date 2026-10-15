package testes;

import nucleo.IniciadorCarreira;
import nucleo.GerenciadorTelas;
import motor.GerenciadorJogo;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteTesteIniciarJogo
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    OuvinteTesteIniciarJogo(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new GerenciadorJogo();
        IniciadorCarreira.dd();
        new GerenciadorTelas(true);
    }
}

