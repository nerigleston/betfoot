package telas;

import telas.DialogoAposentadoriaJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerFecharDialogoAposentadoria
implements ActionListener {
    final /* synthetic */ DialogoAposentadoriaJogador Ns;

    ListenerFecharDialogoAposentadoria(DialogoAposentadoriaJogador ji_02) {
        this.Ns = ji_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DialogoAposentadoriaJogador.a(this.Ns).dispose();
    }
}

