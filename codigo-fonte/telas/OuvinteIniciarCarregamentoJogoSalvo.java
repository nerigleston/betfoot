package telas;

import telas.DialogoCarregarJogoSalvo;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteIniciarCarregamentoJogoSalvo
implements ActionListener {
    final /* synthetic */ DialogoCarregarJogoSalvo GR;

    OuvinteIniciarCarregamentoJogoSalvo(DialogoCarregarJogoSalvo dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoCarregarJogoSalvo.a(this.GR).setCursor(new Cursor(3));
        DialogoCarregarJogoSalvo.b(this.GR);
    }
}

