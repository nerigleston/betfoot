package telas;

import telas.PainelBuscaJogadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OuvinteProcurarJogadores
implements ActionListener {
    final /* synthetic */ PainelBuscaJogadores Kg;

    OuvinteProcurarJogadores(PainelBuscaJogadores gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelBuscaJogadores.a(this.Kg);
    }
}

