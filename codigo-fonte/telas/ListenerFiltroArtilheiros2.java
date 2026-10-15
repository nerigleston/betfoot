package telas;

import telas.PainelMelhoresArtilheiros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFiltroArtilheiros2
implements ActionListener {
    final /* synthetic */ PainelMelhoresArtilheiros vj;

    ListenerFiltroArtilheiros2(PainelMelhoresArtilheiros o_02) {
        this.vj = o_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelMelhoresArtilheiros.a(this.vj, 2);
    }
}

