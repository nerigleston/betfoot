package telas;

import telas.DialogoCarregarJogoSalvo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteExcluirJogoSalvo
implements ActionListener {
    final /* synthetic */ DialogoCarregarJogoSalvo GR;

    OuvinteExcluirJogoSalvo(DialogoCarregarJogoSalvo dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoCarregarJogoSalvo.c(this.GR);
    }
}

