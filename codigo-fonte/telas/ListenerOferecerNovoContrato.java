package telas;

import telas.DialogoNovoContrato;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerOferecerNovoContrato
implements ActionListener {
    final /* synthetic */ DialogoNovoContrato IF;

    ListenerOferecerNovoContrato(DialogoNovoContrato fy_02) {
        this.IF = fy_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoNovoContrato.b(this.IF);
    }
}

