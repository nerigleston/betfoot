package telas;

import telas.DialogoApelidoJunior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoApelido
implements ActionListener {
    final /* synthetic */ DialogoApelidoJunior uJ;

    ListenerFecharDialogoApelido(DialogoApelidoJunior l_02) {
        this.uJ = l_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoApelidoJunior.a(this.uJ).dispose();
    }
}

