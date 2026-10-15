package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hy_0
implements ActionListener {
    final /* synthetic */ hU MA;

    hy_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setSalarioMensal(hU.g(this.MA).isSelected());
        a.vM().setSalarioMensal(hU.g(this.MA).isSelected());
        a.vJ();
    }
}

