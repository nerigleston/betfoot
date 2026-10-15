package d;

import d.ay;
import d.n_0;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class q_0
implements ListSelectionListener {
    final /* synthetic */ n_0 Vh;

    q_0(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && this.Vh.Vg.getSelectedRow() >= 0) {
            n_0.a(this.Vh, true);
            int n2 = this.Vh.Vg.convertRowIndexToModel(this.Vh.Vg.getSelectedRow());
            ((ay)this.Vh.Vg.getModel()).et(n2);
            n_0.g(this.Vh).addNotify();
        }
    }
}

