package editor;

import editor.JanelaEdicaoJogador;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class AcaoConfirmarJogador
extends AbstractAction {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    AcaoConfirmarJogador(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEdicaoJogador.a(this.Ut);
    }
}

