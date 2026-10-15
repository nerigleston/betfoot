package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAbrirDialogoJogador
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerAbrirDialogoJogador(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Vh.wy();
    }
}

