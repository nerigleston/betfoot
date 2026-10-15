package telas;

import telas.PainelOrdemBatedoresPenaltis;
import telas.PainelPartidaAoVivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerJogarDisputaPenaltis
implements ActionListener {
    final /* synthetic */ PainelOrdemBatedoresPenaltis vs;

    ListenerJogarDisputaPenaltis(PainelOrdemBatedoresPenaltis c_02) {
        this.vs = c_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPartidaAoVivo.a(PainelOrdemBatedoresPenaltis.a(this.vs), PainelOrdemBatedoresPenaltis.b(this.vs));
        PainelOrdemBatedoresPenaltis.c(this.vs).dispose();
    }
}

