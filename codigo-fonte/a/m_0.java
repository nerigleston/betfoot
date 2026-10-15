package a;

import a.l_0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class m_0
implements ActionListener {
    final /* synthetic */ l_0 uJ;

    m_0(l_0 l_02) {
        this.uJ = l_02;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        l_0.a(this.uJ).dispose();
    }
}

