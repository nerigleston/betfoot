package editor;

import editor.JanelaEdicaoJogador;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class ListenerSliderCaracteristica
implements ChangeListener {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    ListenerSliderCaracteristica(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JanelaEdicaoJogador.g(this.Ut).setText(Integer.toString(JanelaEdicaoJogador.h(this.Ut).getValue()));
    }
}

