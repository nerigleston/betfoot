package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ListenerMouseDuploCliqueTime
extends MouseAdapter {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMouseDuploCliqueTime(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() >= 2 && JanelaEditorBetfoot.f(this.Vh) != null) {
            this.Vh.wA();
        }
    }
}

