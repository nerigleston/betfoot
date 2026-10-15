package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerMarcarSemCamisa
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerMarcarSemCamisa(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEditorBetfoot.k(this.Vh);
    }
}

