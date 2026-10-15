package telas;

import telas.DialogoMarcarAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoAmistoso
implements ActionListener {
    final /* synthetic */ DialogoMarcarAmistoso ux;

    ListenerFecharDialogoAmistoso(DialogoMarcarAmistoso d2) {
        this.ux = d2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoMarcarAmistoso.a(this.ux).dispose();
    }
}

