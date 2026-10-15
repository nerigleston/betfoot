package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMarcarSemEscudo
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMarcarSemEscudo(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEditorBetfoot.j(this.Vh);
    }
}

