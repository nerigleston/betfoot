package telas;

import telas.TelaTreinoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerDeixarAuxiliarDecidirTreino
implements ActionListener {
    final /* synthetic */ TelaTreinoJogador MZ;

    ListenerDeixarAuxiliarDecidirTreino(TelaTreinoJogador iQ2) {
        this.MZ = iQ2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        TelaTreinoJogador.b(this.MZ).M(TelaTreinoJogador.c(this.MZ).isSelected());
    }
}

