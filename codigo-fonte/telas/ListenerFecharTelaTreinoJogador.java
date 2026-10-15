package telas;

import telas.TelaTreinoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharTelaTreinoJogador
implements ActionListener {
    final /* synthetic */ TelaTreinoJogador MZ;

    ListenerFecharTelaTreinoJogador(TelaTreinoJogador iQ2) {
        this.MZ = iQ2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTreinoJogador.a(this.MZ).dispose();
    }
}

