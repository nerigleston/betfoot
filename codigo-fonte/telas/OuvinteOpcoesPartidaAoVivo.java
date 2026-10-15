package telas;

import telas.PainelPartidaAoVivo2;
import nucleo.GerenciadorTelas;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteOpcoesPartidaAoVivo
implements ActionListener {
    final /* synthetic */ PainelPartidaAoVivo2 Lt;

    OuvinteOpcoesPartidaAoVivo(PainelPartidaAoVivo2 hk_02) {
        this.Lt = hk_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelPartidaAoVivo2.d(this.Lt).setCursor(new Cursor(3));
        GerenciadorTelas.a(null);
        PainelPartidaAoVivo2.d(this.Lt).setCursor(new Cursor(12));
    }
}

