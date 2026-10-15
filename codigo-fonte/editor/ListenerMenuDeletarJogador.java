package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMenuDeletarJogador
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMenuDeletarJogador(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Vh.wB();
    }
}

