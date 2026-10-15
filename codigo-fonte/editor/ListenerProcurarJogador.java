package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerProcurarJogador
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerProcurarJogador(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEditorBetfoot.i(this.Vh);
    }
}

