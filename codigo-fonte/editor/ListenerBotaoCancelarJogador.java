package editor;

import editor.JanelaEdicaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoCancelarJogador
implements ActionListener {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    ListenerBotaoCancelarJogador(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEdicaoJogador.b(this.Ut);
    }
}

