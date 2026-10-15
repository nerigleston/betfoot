package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoJogadoresDuplicados
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerBotaoJogadoresDuplicados(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEditorBetfoot.l(this.Vh);
    }
}

