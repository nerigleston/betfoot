package a;

import a.ds_0;
import b.N;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class dt_0
implements ListSelectionListener {
    final /* synthetic */ ds_0 FS;

    dt_0(ds_0 ds_02) {
        this.FS = ds_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && ds_0.a(this.FS).getSelectedRow() >= 0) {
            int n2 = ds_0.a(this.FS).convertRowIndexToModel(ds_0.a(this.FS).getSelectedRow());
            ((N)ds_0.a(this.FS).getModel()).et(n2);
        }
    }
}

