package telas;

import telas.TelaGerenciamentoClube;
import tabelas.ModeloTabelaJogadoresDetalhado;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoJogadorTabela
implements ListSelectionListener {
    final /* synthetic */ TelaGerenciamentoClube MV;

    ListenerSelecaoJogadorTabela(TelaGerenciamentoClube iA2) {
        this.MV = iA2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && TelaGerenciamentoClube.k(this.MV).getSelectedRow() >= 0) {
            int n2 = TelaGerenciamentoClube.k(this.MV).convertRowIndexToModel(TelaGerenciamentoClube.k(this.MV).getSelectedRow());
            ((ModeloTabelaJogadoresDetalhado)TelaGerenciamentoClube.k(this.MV).getModel()).et(n2);
        }
    }
}

