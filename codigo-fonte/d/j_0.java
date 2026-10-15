package d;

import best.F;
import best.aq;
import d.f_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class j_0
implements ActionListener {
    final /* synthetic */ f_0 Ut;

    j_0(f_0 f_02) {
        this.Ut = f_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        f_0.d(this.Ut).removeAllItems();
        f_0.e(this.Ut).removeAllItems();
        int[] nArray = F.at(f_0.f(this.Ut).getSelectedIndex());
        f_0.eH(f_0.f(this.Ut).getSelectedIndex());
        if (f_0.f(this.Ut).getSelectedIndex() == 0) {
            int n2 = 0;
            while (n2 <= 3) {
                f_0.d(this.Ut).addItem(aq.qM[n2]);
                f_0.e(this.Ut).addItem(aq.qM[n2]);
                ++n2;
            }
            f_0.d(this.Ut).setSelectedIndex(nArray[0]);
            f_0.e(this.Ut).setSelectedIndex(nArray[1]);
        } else {
            int n3 = 4;
            while (n3 < aq.qM.length) {
                f_0.d(this.Ut).addItem(aq.qM[n3]);
                f_0.e(this.Ut).addItem(aq.qM[n3]);
                ++n3;
            }
            f_0.d(this.Ut).setSelectedIndex(nArray[0] - 4);
            f_0.e(this.Ut).setSelectedIndex(nArray[1] - 4);
        }
    }
}

