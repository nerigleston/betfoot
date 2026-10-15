package testes;

import nucleo.UtilitariosTexto;
import testes.JanelaMenuTeste;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerCarregarJogo
implements ActionListener {
    final /* synthetic */ JanelaMenuTeste Xb;

    ListenerCarregarJogo(JanelaMenuTeste h3) {
        this.Xb = h3;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        UtilitariosTexto.cX();
    }
}

