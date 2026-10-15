package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerApagarTime
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerApagarTime(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Vh.wz();
    }
}

