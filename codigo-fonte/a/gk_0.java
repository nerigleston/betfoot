package a;

import a.gh_0;
import b.B;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class gk_0
implements ListSelectionListener {
    final /* synthetic */ gh_0 JW;

    gk_0(gh_0 gh_02) {
        this.JW = gh_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && gh_0.c(this.JW).getSelectedRow() >= 0) {
            int n2 = gh_0.c(this.JW).convertRowIndexToModel(gh_0.c(this.JW).getSelectedRow());
            ((B)gh_0.c(this.JW).getModel()).et(n2);
        }
    }
}

