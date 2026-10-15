package editor;

import editor.JanelaEdicaoJogador;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoCancelarJogador
extends AbstractAction {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    AcaoCancelarJogador(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEdicaoJogador.b(this.Ut);
    }
}

