package telas;

import telas.PainelMelhoresArtilheiros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFiltroArtilheiros1
implements ActionListener {
    final /* synthetic */ PainelMelhoresArtilheiros vj;

    ListenerFiltroArtilheiros1(PainelMelhoresArtilheiros o_02) {
        this.vj = o_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelMelhoresArtilheiros.a(this.vj, 1);
    }
}

