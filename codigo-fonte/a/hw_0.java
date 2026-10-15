package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hw_0
implements ActionListener {
    final /* synthetic */ hU MA;

    hw_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setJogaEstadual(hU.e(this.MA).isSelected());
        a.vM().setJogaEstadual(hU.e(this.MA).isSelected());
        a.vJ();
    }
}

