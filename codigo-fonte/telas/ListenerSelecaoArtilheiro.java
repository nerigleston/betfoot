package telas;

import telas.PainelMelhoresArtilheiros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSelecaoArtilheiro
implements ActionListener {
    final /* synthetic */ PainelMelhoresArtilheiros vj;

    ListenerSelecaoArtilheiro(PainelMelhoresArtilheiros o_02) {
        this.vj = o_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelMelhoresArtilheiros.a(this.vj).getSelectedIndex() >= 0) {
            PainelMelhoresArtilheiros.b(this.vj, PainelMelhoresArtilheiros.a(this.vj).getSelectedIndex());
        }
    }
}

