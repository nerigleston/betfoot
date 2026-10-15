package a;

import a.hU;
import c.a;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ic_0
implements ActionListener {
    final /* synthetic */ hU MA;

    ic_0(hU hU2) {
        this.MA = hU2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        a.SR.setHabilidadeIndividual(hU.i(this.MA).isSelected());
        a.vM().setHabilidadeIndividual(hU.i(this.MA).isSelected());
        a.vJ();
    }
}

