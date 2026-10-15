package editor;

import nucleo.UtilitariosTexto;
import editor.JanelaTransferenciaJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoCancelarTransferencia
implements ActionListener {
    final /* synthetic */ JanelaTransferenciaJogador VN;

    ListenerBotaoCancelarTransferencia(JanelaTransferenciaJogador ai2) {
        this.VN = ai2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        UtilitariosTexto.da().Uw.dispose();
    }
}

