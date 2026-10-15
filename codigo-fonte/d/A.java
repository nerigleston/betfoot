package d;

import d.ap;
import d.n_0;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class A
implements ListSelectionListener {
    final /* synthetic */ n_0 Vh;

    A(n_0 n_02) {
        this.Vh = n_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && n_0.g(this.Vh).getSelectedRow() >= 0) {
            int n2 = n_0.g(this.Vh).convertRowIndexToModel(n_0.g(this.Vh).getSelectedRow());
            ((ap)n_0.g(this.Vh).getModel()).et(n2);
        }
    }
}

