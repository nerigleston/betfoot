package telas;

import telas.PainelOrdemBatedoresPenaltis;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSubirBatedor
implements ActionListener {
    final /* synthetic */ PainelOrdemBatedoresPenaltis vs;

    ListenerSubirBatedor(PainelOrdemBatedoresPenaltis c_02) {
        this.vs = c_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelOrdemBatedoresPenaltis.a(this.vs, -1);
    }
}

