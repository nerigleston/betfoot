package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ik_0
implements ActionListener {
    final /* synthetic */ hU MA;

    ik_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setJogaSelecoesAll(hU.d(this.MA).isSelected());
        a.vM().setJogaSelecoesAll(hU.d(this.MA).isSelected());
        a.vJ();
    }
}

