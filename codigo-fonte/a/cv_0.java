package a;

import a.cu_0;
import best.aq;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class cv_0
implements ActionListener {
    final /* synthetic */ cu_0 CO;

    cv_0(cu_0 cu_02) {
        this.CO = cu_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int n2 = aq.sL[cu_0.a(this.CO).getSelectedIndex()][0];
        cu_0.a(this.CO, cu_0.a(this.CO).getSelectedIndex());
        cu_0.b(this.CO).J(cu_0.c(this.CO), n2);
        cu_0.b(this.CO).oJ();
    }
}

