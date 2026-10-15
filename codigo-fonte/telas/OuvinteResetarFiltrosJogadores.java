package telas;

import telas.PainelBuscaJogadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteResetarFiltrosJogadores
implements ActionListener {
    final /* synthetic */ PainelBuscaJogadores Kg;

    OuvinteResetarFiltrosJogadores(PainelBuscaJogadores gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelBuscaJogadores.b(this.Kg);
    }
}

