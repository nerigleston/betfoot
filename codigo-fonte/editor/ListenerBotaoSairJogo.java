package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoSairJogo
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerBotaoSairJogo(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }
}

