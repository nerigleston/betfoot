package editor;

import nucleo.UtilitariosTexto;
import editor.JanelaTransferenciaJogador;
import editor.ModeloTabelaTimes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoBuscarTimeTransferencia
implements ActionListener {
    final /* synthetic */ JanelaTransferenciaJogador VN;

    ListenerBotaoBuscarTimeTransferencia(JanelaTransferenciaJogador ai2) {
        this.VN = ai2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!JanelaTransferenciaJogador.a(this.VN).getText().isEmpty()) {
            ((ModeloTabelaTimes)JanelaTransferenciaJogador.b(this.VN).getModel()).aj(UtilitariosTexto.f(JanelaTransferenciaJogador.a(this.VN).getText()));
        }
    }
}

