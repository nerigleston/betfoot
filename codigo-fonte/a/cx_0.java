package a;

import a.cw_0;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cx_0
implements ActionListener {
    final /* synthetic */ cw_0 CX;

    cx_0(cw_0 cw_02) {
        this.CX = cw_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setUsaGrupoPadraoEstadual(cw_0.a(this.CX).isSelected());
        a.vM().setUsaGrupoPadraoEstadual(cw_0.a(this.CX).isSelected());
        a.vJ();
    }
}

