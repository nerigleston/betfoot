package telas;

import telas.DialogoAposentadoriaJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerConfirmarAposentadoria
implements ActionListener {
    final /* synthetic */ DialogoAposentadoriaJogador Ns;

    ListenerConfirmarAposentadoria(DialogoAposentadoriaJogador ji_02) {
        this.Ns = ji_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Ns.qW();
    }
}

