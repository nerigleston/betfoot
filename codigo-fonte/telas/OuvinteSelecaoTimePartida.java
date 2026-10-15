package telas;

import telas.PainelPartidaAoVivo2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteSelecaoTimePartida
implements ActionListener {
    final /* synthetic */ PainelPartidaAoVivo2 Lt;

    OuvinteSelecaoTimePartida(PainelPartidaAoVivo2 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (PainelPartidaAoVivo2.b(this.Lt).getSelectedIndex() >= 0) {
            PainelPartidaAoVivo2.a(this.Lt, PainelPartidaAoVivo2.b(this.Lt).getSelectedIndex());
        }
    }
}

