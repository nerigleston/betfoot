package telas;

import telas.PainelMelhoresArtilheiros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteMelhoresDeSempreArtilheiros
implements ActionListener {
    final /* synthetic */ PainelMelhoresArtilheiros vj;

    OuvinteMelhoresDeSempreArtilheiros(PainelMelhoresArtilheiros o_02) {
        this.vj = o_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelMelhoresArtilheiros.c(this.vj);
    }
}

