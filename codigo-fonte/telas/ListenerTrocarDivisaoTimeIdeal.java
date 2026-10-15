package telas;

import telas.DialogoMelhoresPorPosicao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerTrocarDivisaoTimeIdeal
implements ActionListener {
    final /* synthetic */ DialogoMelhoresPorPosicao vJ;

    ListenerTrocarDivisaoTimeIdeal(DialogoMelhoresPorPosicao h_02) {
        this.vJ = h_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (DialogoMelhoresPorPosicao.a(this.vJ).getItemCount() > 0) {
            DialogoMelhoresPorPosicao.b(this.vJ);
        }
    }
}

