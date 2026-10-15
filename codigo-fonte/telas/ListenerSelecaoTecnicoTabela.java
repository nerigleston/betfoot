package telas;

import telas.TelaTecnicosHumanos;
import nucleo.Campeonato;
import motor.GerenciadorJogo;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListenerSelecaoTecnicoTabela
implements ListSelectionListener {
    final /* synthetic */ TelaTecnicosHumanos ME;

    ListenerSelecaoTecnicoTabela(TelaTecnicosHumanos ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && TelaTecnicosHumanos.d(this.ME).getSelectedRow() >= 0) {
            int n2 = TelaTecnicosHumanos.d(this.ME).convertRowIndexToModel(TelaTecnicosHumanos.d(this.ME).getSelectedRow());
            TelaTecnicosHumanos.a(this.ME, (Campeonato)GerenciadorJogo.SR.M().get(n2));
        }
    }
}

