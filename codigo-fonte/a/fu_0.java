package a;

import a.eg_0;
import c.a;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class fu_0
extends AbstractAction {
    final /* synthetic */ eg_0 Iz;

    fu_0(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (a.SR.isHabilidadeIndividual()) {
            eg_0.a(this.Iz, 2);
        } else {
            eg_0.a(this.Iz, 1);
        }
    }
}

