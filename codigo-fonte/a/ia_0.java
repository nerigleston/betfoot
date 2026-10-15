package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ia_0
implements ActionListener {
    final /* synthetic */ hU MA;

    ia_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setUsarGruposReaisCopa(hU.h(this.MA).isSelected());
        a.vM().setUsarGruposReaisCopa(hU.h(this.MA).isSelected());
        a.vJ();
    }
}

