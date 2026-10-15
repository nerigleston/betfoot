package telas;

import telas.PainelBuscaJogadores;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class ListenerFecharBuscaJogadores
extends AbstractAction {
    final /* synthetic */ PainelBuscaJogadores Kg;

    ListenerFecharBuscaJogadores(PainelBuscaJogadores gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        PainelBuscaJogadores.d(this.Kg).dispose();
    }
}

