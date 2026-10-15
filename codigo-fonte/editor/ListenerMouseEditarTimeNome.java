package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerMouseEditarTimeNome
extends MouseAdapter {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMouseEditarTimeNome(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.Vh.wA();
    }
}

