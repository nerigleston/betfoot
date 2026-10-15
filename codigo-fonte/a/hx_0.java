package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class hx_0
implements ActionListener {
    final /* synthetic */ hU MA;

    hx_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setJogaRegionais(hU.f(this.MA).isSelected());
        a.vM().setJogaRegionais(hU.f(this.MA).isSelected());
        a.vJ();
    }
}

