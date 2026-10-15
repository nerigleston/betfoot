package a;

import a.dn_0;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class dT
implements ListSelectionListener {
    final /* synthetic */ dn_0 GR;

    dT(dn_0 dn_02) {
        this.GR = dn_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && dn_0.e(this.GR).getSelectedRow() >= 0) {
            int n2 = dn_0.e(this.GR).convertRowIndexToModel(dn_0.e(this.GR).getSelectedRow());
            dn_0.a(this.GR, (String)dn_0.f(this.GR).get(n2));
            dn_0.g(this.GR);
        }
    }
}

