package a;

import a.eg_0;
import b.q_0;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class el
implements ListSelectionListener {
    final /* synthetic */ eg_0 Iz;

    el(eg_0 eg_02) {
        this.Iz = eg_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && eg_0.c(this.Iz).getSelectedRow() >= 0) {
            int n2 = eg_0.c(this.Iz).convertRowIndexToModel(eg_0.c(this.Iz).getSelectedRow());
            ((q_0)eg_0.c(this.Iz).getModel()).et(n2);
        }
    }
}

