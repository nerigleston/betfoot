package telas;

import telas.PainelBuscaJogadores;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerProcurarJogadores
extends AbstractAction {
    final /* synthetic */ PainelBuscaJogadores Kg;

    ListenerProcurarJogadores(PainelBuscaJogadores gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Kg.rQ();
    }
}

