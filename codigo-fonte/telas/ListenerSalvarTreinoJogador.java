package telas;

import telas.TelaTreinoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSalvarTreinoJogador
implements ActionListener {
    final /* synthetic */ TelaTreinoJogador MZ;

    ListenerSalvarTreinoJogador(TelaTreinoJogador iQ2) {
        this.MZ = iQ2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTreinoJogador.d(this.MZ);
    }
}

