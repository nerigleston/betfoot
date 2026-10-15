package d;

import d.ay;
import d.x_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ab
implements ActionListener {
    final /* synthetic */ x_0 Vm;

    ab(x_0 x_02) {
        this.Vm = x_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n2 = this.Vm.table.getSelectedRow();
        ((ay)this.Vm.table.getModel()).removeRow(n2);
        this.Vm.table.addNotify();
    }
}

