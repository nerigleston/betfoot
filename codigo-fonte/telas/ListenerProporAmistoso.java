package telas;

import telas.DialogoMarcarAmistoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerProporAmistoso
implements ActionListener {
    final /* synthetic */ DialogoMarcarAmistoso ux;

    ListenerProporAmistoso(DialogoMarcarAmistoso d2) {
        this.ux = d2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoMarcarAmistoso.b(this.ux);
    }
}

