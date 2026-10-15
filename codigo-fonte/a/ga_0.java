package a;

import a.gx_0;
import b.d_0;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ga_0
implements ListSelectionListener {
    final /* synthetic */ gx_0 Kg;

    ga_0(gx_0 gx_02) {
        this.Kg = gx_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && gx_0.c(this.Kg).getSelectedRow() >= 0) {
            int n2 = gx_0.c(this.Kg).convertRowIndexToModel(gx_0.c(this.Kg).getSelectedRow());
            ((d_0)gx_0.c(this.Kg).getModel()).et(n2);
        }
    }
}

