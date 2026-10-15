package a;

import a.bn_0;
import b.u_0;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class br_0
implements ListSelectionListener {
    final /* synthetic */ bn_0 Ae;

    br_0(bn_0 bn_02) {
        this.Ae = bn_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && bn_0.b(this.Ae).getSelectedRow() >= 0) {
            int n2 = bn_0.b(this.Ae).convertRowIndexToModel(bn_0.b(this.Ae).getSelectedRow());
            bn_0.a(this.Ae, ((u_0)bn_0.b(this.Ae).getModel()).ew(n2));
        }
    }
}

