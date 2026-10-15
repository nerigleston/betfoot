package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerAdicionarJogadorTime
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerAdicionarJogadorTime(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Vh.wp();
    }
}

