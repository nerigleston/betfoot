package telas;

import telas.DialogoCarregarJogoSalvo;
import motor.GerenciadorJogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteCarregarJogoSalvoSelecionado
implements ActionListener {
    final /* synthetic */ DialogoCarregarJogoSalvo GR;

    OuvinteCarregarJogoSalvoSelecionado(DialogoCarregarJogoSalvo dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        GerenciadorJogo.c(DialogoCarregarJogoSalvo.d(this.GR), false);
        DialogoCarregarJogoSalvo.a(this.GR).dispose();
    }
}

