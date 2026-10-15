package telas;

import telas.PainelNegociacaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarOferta
implements ActionListener {
    final /* synthetic */ PainelNegociacaoJogador Ny;

    ListenerConfirmarOferta(PainelNegociacaoJogador jm_02) {
        this.Ny = jm_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelNegociacaoJogador.a(this.Ny);
    }
}

