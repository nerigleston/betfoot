package telas;

import telas.DialogoMelhoresPorPosicao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerTrocarLigaTimeIdeal
implements ActionListener {
    final /* synthetic */ DialogoMelhoresPorPosicao vJ;

    ListenerTrocarLigaTimeIdeal(DialogoMelhoresPorPosicao h_02) {
        this.vJ = h_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoMelhoresPorPosicao.c(this.vJ);
    }
}

