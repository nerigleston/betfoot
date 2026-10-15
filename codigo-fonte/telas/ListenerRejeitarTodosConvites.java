package telas;

import telas.PainelConvitesTecnico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerRejeitarTodosConvites
implements ActionListener {
    final /* synthetic */ PainelConvitesTecnico Kz;

    ListenerRejeitarTodosConvites(PainelConvitesTecnico gO2) {
        this.Kz = gO2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelConvitesTecnico.a(this.Kz);
        PainelConvitesTecnico.b(this.Kz).dispose();
    }
}

