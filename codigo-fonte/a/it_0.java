package a;

import a.ip_0;
import best.al;
import c.a;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class it_0
implements ListSelectionListener {
    final /* synthetic */ ip_0 ME;

    it_0(ip_0 ip_02) {
        this.ME = ip_02;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        if (!listSelectionEvent.getValueIsAdjusting() && ip_0.d(this.ME).getSelectedRow() >= 0) {
            int n2 = ip_0.d(this.ME).convertRowIndexToModel(ip_0.d(this.ME).getSelectedRow());
            ip_0.a(this.ME, (al)a.SR.M().get(n2));
        }
    }
}

