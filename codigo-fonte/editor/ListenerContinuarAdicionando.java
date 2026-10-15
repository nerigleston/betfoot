package editor;

import nucleo.UtilitariosTexto;
import editor.JanelaEdicaoJogador;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ListenerContinuarAdicionando
implements ItemListener {
    final /* synthetic */ JanelaEdicaoJogador Ut;

    ListenerContinuarAdicionando(JanelaEdicaoJogador f_02) {
        this.Ut = f_02;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        UtilitariosTexto.da().aM(JanelaEdicaoJogador.c(this.Ut).isSelected());
    }
}

