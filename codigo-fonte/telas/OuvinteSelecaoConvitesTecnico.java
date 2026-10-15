package telas;

import telas.PainelConvitesTecnico;
import nucleo.ModeloTime;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class OuvinteSelecaoConvitesTecnico
implements ListSelectionListener {
    final /* synthetic */ PainelConvitesTecnico Kz;

    OuvinteSelecaoConvitesTecnico(PainelConvitesTecnico gO2) {
        this.Kz = gO2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && PainelConvitesTecnico.f(this.Kz).getSelectedRow() >= 0) {
            int n2 = PainelConvitesTecnico.f(this.Kz).convertRowIndexToModel(PainelConvitesTecnico.f(this.Kz).getSelectedRow());
            PainelConvitesTecnico.a(this.Kz, (ModeloTime)PainelConvitesTecnico.g(this.Kz).get(n2));
            PainelConvitesTecnico.h(this.Kz);
        }
    }
}

