package telas;

import telas.DialogoMarcarAmistoso2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerProporAmistoso2
implements ActionListener {
    final /* synthetic */ DialogoMarcarAmistoso2 uy;

    ListenerProporAmistoso2(DialogoMarcarAmistoso2 h3) {
        this.uy = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoMarcarAmistoso2.b(this.uy);
    }
}

