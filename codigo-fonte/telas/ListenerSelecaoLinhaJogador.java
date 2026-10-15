package telas;

import telas.PainelPrincipalClube;
import tabelas.ModeloTabelaElencoTime;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoLinhaJogador
implements ListSelectionListener {
    final /* synthetic */ PainelPrincipalClube Iz;

    ListenerSelecaoLinhaJogador(PainelPrincipalClube eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelPrincipalClube.c(this.Iz).getSelectedRow() >= 0) {
            int n2 = PainelPrincipalClube.c(this.Iz).convertRowIndexToModel(PainelPrincipalClube.c(this.Iz).getSelectedRow());
            ((ModeloTabelaElencoTime)PainelPrincipalClube.c(this.Iz).getModel()).et(n2);
        }
    }
}

