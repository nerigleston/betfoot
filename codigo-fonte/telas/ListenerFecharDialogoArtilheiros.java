package telas;

import telas.PainelMelhoresArtilheiros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoArtilheiros
implements ActionListener {
    final /* synthetic */ PainelMelhoresArtilheiros vj;

    ListenerFecharDialogoArtilheiros(PainelMelhoresArtilheiros o_02) {
        this.vj = o_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelMelhoresArtilheiros.b(this.vj).dispose();
    }
}

