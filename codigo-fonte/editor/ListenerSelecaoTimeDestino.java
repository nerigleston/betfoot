package editor;

import editor.JanelaTransferenciaJogador;
import editor.ModeloTabelaTimes;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoTimeDestino
implements ListSelectionListener {
    final /* synthetic */ JanelaTransferenciaJogador VN;

    ListenerSelecaoTimeDestino(JanelaTransferenciaJogador ai2) {
        this.VN = ai2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && JanelaTransferenciaJogador.b(this.VN).getSelectedRow() >= 0) {
            int n2 = JanelaTransferenciaJogador.b(this.VN).convertRowIndexToModel(JanelaTransferenciaJogador.b(this.VN).getSelectedRow());
            ((ModeloTabelaTimes)JanelaTransferenciaJogador.b(this.VN).getModel()).eJ(n2);
            JanelaTransferenciaJogador.c(this.VN).setText("Transferir para " + JanelaTransferenciaJogador.d(this.VN).getNome());
            JanelaTransferenciaJogador.e(this.VN).setEnabled(true);
        }
    }
}

