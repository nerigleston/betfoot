package telas;

import telas.DialogoApelidoJunior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarApelido
implements ActionListener {
    final /* synthetic */ DialogoApelidoJunior uJ;

    ListenerConfirmarApelido(DialogoApelidoJunior l_02) {
        this.uJ = l_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoApelidoJunior.b(this.uJ);
    }
}

