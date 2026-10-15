package telas;

import telas.PainelCentralMensagens;
import tabelas.ModeloTabelaMensagens;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoJogadorMensagem
implements ListSelectionListener {
    final /* synthetic */ PainelCentralMensagens Ae;

    ListenerSelecaoJogadorMensagem(PainelCentralMensagens bn_02) {
        this.Ae = bn_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelCentralMensagens.b(this.Ae).getSelectedRow() >= 0) {
            int n2 = PainelCentralMensagens.b(this.Ae).convertRowIndexToModel(PainelCentralMensagens.b(this.Ae).getSelectedRow());
            PainelCentralMensagens.a(this.Ae, ((ModeloTabelaMensagens)PainelCentralMensagens.b(this.Ae).getModel()).ew(n2));
        }
    }
}

