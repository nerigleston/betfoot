package editor;

import editor.JanelaEditorBetfoot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerVoltarInicio
implements ActionListener {
    final /* synthetic */ JanelaEditorBetfoot Vh;

    ListenerVoltarInicio(JanelaEditorBetfoot n_02) {
        this.Vh = n_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JanelaEditorBetfoot.a(this.Vh);
    }
}

