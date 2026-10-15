package editor;

import modelos.ModeloJogador2;
import nucleo.UtilitariosTexto;
import editor.JanelaTransferenciaJogador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ListenerBotaoConfirmarTransferencia
implements ActionListener {
    final /* synthetic */ JanelaTransferenciaJogador VN;

    ListenerBotaoConfirmarTransferencia(JanelaTransferenciaJogador ai2) {
        this.VN = ai2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (JanelaTransferenciaJogador.b(this.VN).getSelectedRow() >= 0) {
            if (JanelaTransferenciaJogador.d(this.VN).getJogadores().size() >= 30) {
                JanelaTransferenciaJogador.c(this.VN).setText("O time de destino n\u00e3o tem vaga");
            } else {
                if (UtilitariosTexto.da().wL() != null && UtilitariosTexto.da().wK() && UtilitariosTexto.da().wI() != JanelaTransferenciaJogador.d(this.VN)) {
                    JanelaTransferenciaJogador.d(this.VN).getJogadores().add(UtilitariosTexto.da().wL());
                    UtilitariosTexto.da().wI().getJogadores().remove(UtilitariosTexto.da().wL());
                } else {
                    JanelaTransferenciaJogador.c(this.VN).setText("N\u00e3o foi poss\u00edvel transferir");
                }
                UtilitariosTexto.da().a((ModeloJogador2)null);
                UtilitariosTexto.da().wJ().setRowSelectionInterval(0, 0);
                UtilitariosTexto.da().wJ().addNotify();
                UtilitariosTexto.da().Uw.dispose();
                UtilitariosTexto.da().c(JanelaTransferenciaJogador.d(this.VN));
            }
        }
    }
}

