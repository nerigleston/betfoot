package telas;

import telas.PainelPartidaAoVivo2;
import nucleo.GerenciadorTelas;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteTimeDaRodadaPartida
implements ActionListener {
    final /* synthetic */ PainelPartidaAoVivo2 Lt;

    OuvinteTimeDaRodadaPartida(PainelPartidaAoVivo2 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPartidaAoVivo2.e(this.Lt).setCursor(new Cursor(3));
        GerenciadorTelas.a(null, PainelPartidaAoVivo2.f(this.Lt), 0);
        PainelPartidaAoVivo2.e(this.Lt).setCursor(new Cursor(12));
    }
}

