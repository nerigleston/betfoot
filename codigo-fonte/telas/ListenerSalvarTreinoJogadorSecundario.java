package telas;

import telas.TelaTreinoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerSalvarTreinoJogadorSecundario
implements ActionListener {
    final /* synthetic */ TelaTreinoJogador MZ;

    ListenerSalvarTreinoJogadorSecundario(TelaTreinoJogador iQ2) {
        this.MZ = iQ2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTreinoJogador.d(this.MZ);
    }
}

