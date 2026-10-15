package a;

import a.gO;
import best.ah;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class gu_0
implements ListSelectionListener {
    final /* synthetic */ gO Kz;

    gu_0(gO gO2) {
        this.Kz = gO2;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && gO.f(this.Kz).getSelectedRow() >= 0) {
            int n2 = gO.f(this.Kz).convertRowIndexToModel(gO.f(this.Kz).getSelectedRow());
            gO.a(this.Kz, (ah)gO.g(this.Kz).get(n2));
            gO.h(this.Kz);
        }
    }
}

