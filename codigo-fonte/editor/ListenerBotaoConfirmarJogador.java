package editor;

import editor.JanelaEdicaoJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoConfirmarJogador
implements ActionListener {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    ListenerBotaoConfirmarJogador(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEdicaoJogador.a(this.Ut);
    }
}

