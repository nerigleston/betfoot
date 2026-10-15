package telas;

import telas.PainelBuscaJogadores;
import tabelas.ModeloTabelaMercadoJogadores;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoBuscaJogadores
implements ListSelectionListener {
    final /* synthetic */ PainelBuscaJogadores Kg;

    ListenerSelecaoBuscaJogadores(PainelBuscaJogadores gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelBuscaJogadores.c(this.Kg).getSelectedRow() >= 0) {
            int n2 = PainelBuscaJogadores.c(this.Kg).convertRowIndexToModel(PainelBuscaJogadores.c(this.Kg).getSelectedRow());
            ((ModeloTabelaMercadoJogadores)PainelBuscaJogadores.c(this.Kg).getModel()).et(n2);
        }
    }
}

